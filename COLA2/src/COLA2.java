
import javax.swing.JOptionPane;

public class COLA2 {

class Nodo {
        int info;
        Nodo sig;
    }
    Nodo frente, fin;
    
    COLA2(){
        
        frente = null;
        
        fin= null;
    }    
    
    public void insertar (int dato){
                
        Nodo nuevo;
        
        nuevo = new Nodo ();
        
        nuevo.info = dato;
        
        nuevo.sig = null;
        
        if (vacia()) {
            
            frente = nuevo;
            fin = nuevo;
            
        } else {
            
            fin.sig = nuevo;
            fin = nuevo;    
        }
    }
    
    public boolean vacia (){
        
        if(frente == null)
            
            return true;
        else
            
            return false;
    }
    
    public int eliminar ( ){ 
        
        int informacion = -1;
        
        if (!vacia ()){ 
            
            informacion = frente.info;
            
        }if (frente == fin){
                
                frente = null;
                fin = null;
                
            } else {
                
                frente = frente.sig;    
            }
            
            return informacion;
       }
    
    public void imprimir() {
         
        Nodo aux=frente;
        
        String cola = "";
        
                
        if(aux==null){
            
            JOptionPane.showMessageDialog(null, "Cola Vacia." );    
            
        }while (aux!=null) {
            
          cola = cola + aux.info + " <= ";
                        
            aux=aux.sig;    
            
        }JOptionPane.showMessageDialog(null, "\n La cola es: " + cola);
    }
    
    public int Cantidad(){
        
        int cant = 0;
        
        Nodo reco = frente;
        
        while (reco!=null){
            
            cant++;
            
            reco = reco.sig;
            
        }
        
        return cant;
    }
    
    public void Simulacion () {
        
        int estado = 0;    
        
        int llegada = 2 + (int) (Math.random () * 2);
        
        int salida = -1;
         
	int cantAtendidas = 0;
        
        COLA2 cola = new COLA2 ();
        
        for (int minuto = 0 ; minuto < 600 ; minuto++) {
            if (llegada == minuto){    
                
                if (estado==0) {
                   
                    estado=1;
                    
                    salida=minuto+2+(int)(Math.random()*3);
                    
                } else {
                    
                    cola.insertar(minuto);             
                }
                
                llegada=minuto+2+(int)(Math.random()*2);              
            }
            
            if (salida == minuto){   
                
                estado=0;
                
                cantAtendidas++;
                
                if (!cola.vacia()) {
                    
                    cola.eliminar();  
                     
                    estado=1;
                    
                    salida=minuto+2+(int)(Math.random()*3);
                    
                    }         }
        }
        
        JOptionPane.showInputDialog(null, "\n Resultados de la simuulacion:"
            
            + "\n Clientes Atendidos: " + cantAtendidas
                
                + "\n Cliente en la cola = " + cola.Cantidad()
        
                        + "\n Minuto de llegada = " + cola.eliminar());
            
                                
    }


}
