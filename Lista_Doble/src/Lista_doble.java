import javax.swing.JOptionPane;
public class Lista_doble {
    public class Nodo {
	int info;
	Nodo siguiente, anterior;   } 	
Nodo primero, ultimo;

    public void insertar(){         
       
    int dato;
    
    dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Dato: "));
    
    if (primero==null){   
        
        primero=new Nodo();
        
        primero.info=dato;
        
        ultimo=primero;   
    }
    
    else {  
        
    Nodo temp=new Nodo();
    
    ultimo.siguiente=temp;
    
    temp.info=dato;
    
    temp.anterior=ultimo;
    
    ultimo=temp;
    }
}

    public void eliminarSiguiente(){
        
      if(ultimo.siguiente==null){
          
             ultimo=null;
             
             primero=null;         
             
        } 
      else { 
          
          Nodo copia = ultimo;
          
          ultimo=copia.siguiente;
          
          ultimo.anterior=null;
          }
        }
    
    public void eliminar(){     //Elimina al Final     
        
      if(ultimo.anterior==null){
          
             ultimo=null;
             
             primero=null;         
             
        } 
      else { 
          
          Nodo copia = ultimo;
          
          ultimo=copia.anterior;
          
          ultimo.siguiente=null;
          }
        }
        public void buscar(){
        
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Dato: "));

        
        if (primero != null){
            
	    Nodo aux = primero;
            
                   int cont = 0;  
                   
                   while (aux != null){
                       
                if (aux.info == dato )
                    
                        cont++;
                
                aux = aux.siguiente;
                               }   
                   
        if (cont > 0)
            
            JOptionPane.showMessageDialog(null, dato + " Si esta en la lista." );
        
        else
            
            JOptionPane.showMessageDialog(null, dato + " No esta en la lista." );     
                  }    
        }
        
        public void mostrar1 ( ){
            
            String lista = "";
            
        Nodo aux=primero;

        while(aux!=null){  

            //System.out.print(aux.info + "->" );

            lista = lista + aux.info + " => ";

            aux=aux.siguiente;
    }      
        JOptionPane.showMessageDialog(null, "Lista es: \n" + lista );    
  }    
        public void mostrarUltimo ( ){
            
            String lista = "";
            
        Nodo aux=ultimo;

        while(aux!=null){  

            //System.out.print(aux.info + "->" );

            lista = lista + aux.info + " . ";

            aux=aux.siguiente;
    }      
        JOptionPane.showMessageDialog(null, "El Ultimo es: \n" + lista );    
  }
        public void promedio(){
            
        Nodo aux;   aux=primero;
        
        int cont=0, acum=0,prom=0;
        
        while(aux!=null){
            
                acum=acum+aux.info;    	cont++;
                
                aux=aux.siguiente;
                        }
        prom=acum/cont;
                
        JOptionPane.showMessageDialog(null, "El Total es:: \n" + acum );    

        
        JOptionPane.showMessageDialog(null, "El Promedio es:: \n" + prom );    

        
        }
        public void MayorMenor(){  
            
        Nodo aux=primero; 
        
        int Mayor=0,Menor;
        
        Menor=aux.info;
         
         while(aux!=null){
             
             if(aux.info>Mayor)
                 
                 Mayor=aux.info;
             
             if(aux.info<Menor)
                 
                 Menor=aux.info;
             
             aux=aux.siguiente;       
         }
         
        JOptionPane.showMessageDialog(null, "El Mayor es:: \n" + Mayor );    
        
        JOptionPane.showMessageDialog(null, "El Menor es:: \n" + Menor );    
         }



}
