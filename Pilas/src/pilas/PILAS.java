package pilas;

import javax.swing.*;

public class PILAS {
    
    class Nodo {
        
	int info;
        
	Nodo sig;
        
	}
            Nodo raiz;
			
	
    public PILAS (){
        
        raiz = null;

                        }
        public void push (){
        
		Nodo nuevo;
                
		int x;
                
		x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato: "));
                
		nuevo = new Nodo();
                
		nuevo.info = x;
                
		if(raiz==null){
                    
			raiz = nuevo;
                        
		}
			else{
                    
			nuevo.sig = raiz;
                        
			raiz = nuevo;
                        
			}
					}
    
    public int pop () {
        
		if (raiz!=null){
                    
		int informacion = raiz.info;
                
		raiz = raiz.sig;
                
		return informacion;
                
		}
		else{
                    
		return -1;
		
		}
	}
    
    public void imprimir (){
        
        Nodo temp = raiz;
        
        String pila = "";
        
        while (temp !=null){
            
            pila = pila+temp.info+"\n";
            
            temp = temp.sig;
            
        }JOptionPane.showMessageDialog(null, "La pila es: \n" + pila);
    }
}	