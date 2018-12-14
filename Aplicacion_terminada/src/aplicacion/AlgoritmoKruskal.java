package aplicacion;

//Implementación del Algoritmo voraz de Kruskal.
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AlgoritmoKruskal {

    @SuppressWarnings("unchecked")

    public Grafo aplicarKruskal(Grafo grafo) {
        Grafo árbol = new Grafo();
        ArrayList<String> nodos = grafo.getNombres();

        for (int j = 0; j < nodos.size(); j++) {
            árbol.ingresarNodo(nodos.get(j));
        }

        ArrayList<Arco> L = (ArrayList<Arco>) grafo.getAristas().clone();

        Arco pro = L.get(0);
        árbol.adicionarEnlace(pro.getInicial(), pro.getTerminal(), pro.getPeso());
        L.remove(pro);

        while (L.size() != 0) {
            pro = L.get(0);

            if (HayCiclo(árbol, pro, árbol.getNodo(pro.getTerminal()), pro.getTerminal()) == false) {
                árbol.adicionarEnlace(pro.getInicial(), pro.getTerminal(), pro.getPeso());
            }

            L.remove(pro);
        }
        JOptionPane.showMessageDialog(null, "Hay  " + nodos.size() + " Nodos en el grafo");
        JOptionPane.showMessageDialog(null, "\n Las Aristas recorridas sin aplicar el metodo Kruskal "
                + "son : \n" + "\n" +grafo.aristas );
      JOptionPane.showMessageDialog(null, "\n Las Aristas recorridas aplicando el metodo Kruskal "
                + "son : \n" + "\n" +árbol.aristas);
      
        return árbol;
    }

    public boolean HayCiclo(Grafo g, Arco aVerificar, Nodo terminal, String N) {
        ArrayList<Enlace> aux = terminal.getEnlaces();

        if (aux.size() == 0) {
            return false;
        }

        if (terminal.existeEnlace(aVerificar.getInicial()) != -1) {
            return true;
        }

        for (int i = 0; i < aux.size(); i++) {
            Enlace nodo = aux.get(i);

            if (nodo.getDestino().equals(N) == false) {
                if (HayCiclo(g, aVerificar, g.getNodo(nodo.getDestino()), terminal.getNombre())) {

                    return true;
                }

            }
        }
        
        
          
        return false;

    }
 
            
}
