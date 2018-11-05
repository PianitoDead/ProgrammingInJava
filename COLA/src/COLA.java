
import javax.swing.JOptionPane;

public class COLA {

    class Nodo {
        int info;
        Nodo sig;
    }
    Nodo frente, fin;
    
    COLA(){
        
        frente = null;
        
        fin= null;
    }
    
    public void insertar (){
        
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Datos: "));
                
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
        
        JOptionPane.showMessageDialog(null, "Listado de datos de las colas: " );  
        
        if(aux==null){
            
            JOptionPane.showMessageDialog(null, "Cola esta Vacia." );    
            
        }while (aux!=null) {
            
          cola = cola + " - " + aux.info;
                        
            aux=aux.sig;    
            
        }JOptionPane.showMessageDialog(null, "\n La cola es: " + cola);
    }
     
     public void MayorMenor (){
         
         Nodo aux  = frente;
         
         int mayor = 0, menor;
         
         menor  = aux.info;
         
         while(aux!=null){
             
             if (aux.info > mayor)
                 
                 mayor = aux.info;
             
             if (aux.info < menor)
                 
                 menor = aux.info;
             
             aux = aux.sig;
             
         }JOptionPane.showMessageDialog(null, ""
                 
                 + "\n El mayor es: " + mayor
                 +"\n El menor es: " + menor);
                      }
     
     public void SumaPromedio (){
         
         Nodo aux = frente;
         
         int suma = 0, cont = 0;
         
         double prom;
         
         while (aux!=null){
             
             suma = suma + aux.info;
             
             aux = aux.sig;
             
             cont ++;
         }
         
         prom = suma/cont;
         
         JOptionPane.showMessageDialog(null, ""
                 + "\n La suma es: " + suma
                 + "\n El promedio es: " + prom);
     }
}
