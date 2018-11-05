
import javax.swing.JOptionPane;

public class Principal {
    
    public static void main (String [] args){
        
        COLA2 nueva = new COLA2 ();
        
        int Op;
        
        do{
           Op = Integer.parseInt(JOptionPane.showInputDialog("\n Menu Cola: \n"
            
            + "1. Simulacion de Cola. \n"
            
                + "2. Mostrar Cola. \n"
                   
                        + "0. Salir. \n"
            
                            + "Ingrese una Opcion: "));
           
           switch(Op){
               
               case 1 : nueva.Simulacion();break;
               
               case 2 : nueva.imprimir();break;
                             
               case 0 : JOptionPane.showMessageDialog(null, "Adios. ");break;
               
               default : JOptionPane.showMessageDialog(null, "Error: 404. ");break; 
           }
            
        }while(Op !=0);
    }    
}
