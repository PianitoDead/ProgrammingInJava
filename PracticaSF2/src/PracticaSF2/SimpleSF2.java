package PracticaSF2;

import javax.swing.*;

public class SimpleSF2 {

    class Nodo {

        String info;
        Nodo enlace;
    }
    Nodo cab;

    public void InsertarApellido() {
        String N;

        N = (JOptionPane.showInputDialog("Ingrese Apellido: "));

        if (cab == null) {
            cab = new Nodo();
            cab.info = N;
            cab.enlace = null;
        } else {
            Nodo temp = new Nodo();
            temp.info = N;
            temp.enlace = cab;
            cab = temp;
        }
    }

    public void Mostrar() {
        Nodo aux = cab;
        while (aux != null) {
            JOptionPane.showMessageDialog(null, aux.info + "-> ");
            aux = aux.enlace;
        }
    }

    public void Eliminar() {
        if (cab.enlace == null) {
            cab = null;
        } else {
            Nodo copia = cab;
            Nodo aux = null;
            while (copia.enlace != null) {
                aux = copia;
                copia = copia.enlace;
            }
            aux.enlace = copia.enlace;
        }
    }

    public void Buscar() {

        String Dato;
        int Band = 0;

        Dato = (JOptionPane.showInputDialog("Ingrese Apellido: "));

        Nodo aux = cab;
        while (aux != null) {
            if (aux.info == Dato) {
                Band = 1;
            }
            aux = aux.enlace;
        }
        if (Band == 1) {
            JOptionPane.showMessageDialog(null, "Si esta en la lista.");
        } else {
            JOptionPane.showMessageDialog(null, "No esta en la lista.");
        }
    }

    public void Comparacion(){
       
   String cadena1 = "";
        String cadena2 = "";
        if (cadena1.equals(cadena2)) {
//Ambas cadenas son iguales (no es el caso)
        }
        {
//Ambas cadenas son iguales (es el caso)
        }
    
    }
    public void InsertarNodo2(String N) {
        if (cab == null) {
            cab = new Nodo();
            cab.info = N;
            cab.enlace = null;
        } else {
            Nodo temp = new Nodo();
            temp.info = N;
            temp.enlace = cab;
            cab = temp;
        }
    }

}
