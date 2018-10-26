import javax.swing.JOptionPane;
public class Lista_Circular {
    
public class Nodo {
    
	int info;
        
	Nodo siguiente, anterior;  
} 	

Nodo primero, ultimo;

    public void insertar2( ){
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Dato: "));
        
        if(primero==null){
            
            Nodo nuevo= new Nodo();
            
            nuevo.info=dato;
            
            primero=nuevo;
            
            ultimo=nuevo;
            
            nuevo.siguiente=nuevo;
            
            nuevo.anterior=nuevo;
         }
        else { 
            
            Nodo nuevo=new Nodo();
            
            nuevo.info=dato;
            
            ultimo.siguiente=nuevo;  
            
            nuevo.anterior=ultimo;
            
            primero.anterior=nuevo;
            
            nuevo.siguiente=primero;
            
            ultimo=nuevo;
      }
    }
    
    public void mostrar1( ){  
        
        String lista = "";
        
        Nodo aux=primero;
        
        if(aux!=null){
            
            do{ 
                
                lista = lista + " <= " +aux.info;
                
                aux=aux.siguiente;    
                
            }while(aux!=primero);
            
                JOptionPane.showMessageDialog(null, "Lista es: \n" + lista );    

        }else
                       
            JOptionPane.showMessageDialog(null, "Lista esta vacia: \n" + lista );    

  }
    
    public void eliminar(){         
       
       if(ultimo==null){
          
             ultimo=primero=null;
             
        } 
      else { 
          
          Nodo copia = ultimo;
          
          ultimo=copia.anterior;
          
          ultimo.siguiente=null;
          }
                 }

    public void buscar(){
        
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Dato: "));

        
        if (primero != null){
            
	    Nodo aux = primero;
            
                   int cont = 0;  
                   
                   do{
                                         
                if (aux.info == dato )
                    
                        cont++;
                
                aux = aux.siguiente;
                      }while(aux !=primero);
                   
        if (cont > 0)
            
            JOptionPane.showMessageDialog(null, dato + " Si esta en la lista." );
        
        else
            
            JOptionPane.showMessageDialog(null, dato + " No esta en la lista." );     
                  }    
        }


    
}
