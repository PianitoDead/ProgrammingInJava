
import javax.swing.JOptionPane;

public class Principal {
    
public static void main (String [] args){
        
        COLA cola1 = new COLA ();
        
        int Op;
        
        do{
           Op = Integer.parseInt(JOptionPane.showInputDialog("\n Menu: \n"
            
            + "1. Ingresa el numero. \n"
            
                + "2. Mostrar Datos. \n"
            
                    + "3. Quitar el ultimo numero. \n"                   
                    
                        + "4. Mayor o Menor de Cola \n"
                   
                            + "5. Suma y Promedio de Cola \n"
                   
                            + "0. Salir. \n"
            
                             + "Ingrese una Opcion: "));
           
           switch(Op){
               
               case 1 : cola1.insertar();break;
               
               case 2 : cola1.imprimir();break;
               
               case 3 : JOptionPane.showMessageDialog(null, "Sacamos a:  " + cola1.eliminar());break; 
               
               case 4 : cola1.MayorMenor();break;
               
               case 5 : cola1.SumaPromedio();break;
               
               case 0 : JOptionPane.showMessageDialog(null, "Adios. ");break;
               
               default : JOptionPane.showMessageDialog(null, "Error: 404. ");break; 
           }
            
        }while(Op !=0);
    }    
}