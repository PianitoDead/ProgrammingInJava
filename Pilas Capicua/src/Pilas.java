
import javax.swing.JOptionPane;

public class Pilas {
    
    //Se crea el Nodo
    
    class Nodo {
        
	int info;
        
	Nodo sig;
        
	}
            Nodo raiz;
			
	
            //Luego se Creara la Pila
            
    public Pilas (){
        
        raiz = null;

                        }
    //Se crear el metodo para ingresar y guardar los datos 
    
    
        public void push (){
        
		Nodo nuevo;
                
		int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero: ")); //Se Ingresa Los numeros 
                
		nuevo = new Nodo();
                
		nuevo.info = x; //Y se guarda en el nodo
                
		if(raiz==null){ //Si no existe valor ingresado se creara a partir de este momento
                    
			raiz = nuevo;
                        
		}
			else{ //Si ya existe valor en el nodo lo siguiente tomara del anterior digito ingresado 
                    
			nuevo.sig = raiz; 
                        
			raiz = nuevo;
                        
			}
					}
        
        //Se crea el metodo para eliminar
    
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
    
    //Se muestran los numeros ingresados por el usuario
    
    public void imprimir (){ //Muestra los valores ingresados por le usuario
        
        Nodo temp = raiz; //Creamos un temp para poder tener la informacion que el usuario ingreso 
        
        String pila = ""; //Se crea el String para evitar Pop Ups adicionales(JOPtionPane)
        
        while (temp !=null){
            
            pila = pila+temp.info+"\n";
            
            temp = temp.sig;
            
        }JOptionPane.showMessageDialog(null, "Los numeros son: \n" + pila); // Se muestra la informacion que el usuario ingreso
    }
    
    public void Capicua (){ 
       
        Nodo temp = raiz;
                                //Se vuelve a hacer lo de imprimir 
        String Numero = "";
        
        Numero = Numero + temp.info+"\n";   
        
        //Aqui se determinara si es capicua o no 
        
        if(raiz.info%10==(raiz.info-raiz.info%10)/10) //Para Decenas
            
        JOptionPane.showMessageDialog(null, "El numero : " + Numero+  " Es Capicua:" );
        
        else if (raiz.info%10==(raiz.info-raiz.info%10)/100) //Para Centenas
            
            JOptionPane.showMessageDialog(null, "El numero : " + Numero+  " Es Capicua:" );
        
        else if (raiz.info%10==(raiz.info-raiz.info%10)/1000) //Para Millares
            
            JOptionPane.showMessageDialog(null, "El numero : " + Numero+  " Es Capicua:" );
        
        else //Si no es muestra e mensaje siguiente
            
            JOptionPane.showMessageDialog(null, "El numero : " + Numero+  " No es capicua:" );
        
    }
}

