import javax.swing.*;

public class PrincipalCapicua {   

public static void main (String [] args){
        
        Pilas pila1 = new Pilas ();
        
        int Op;
        
        do{
           Op = Integer.parseInt(JOptionPane.showInputDialog("\n Menu: \n"
            
            + "1. Ingresa el numero. \n"
            
                + "2. Mostrar Datos de los numeros ingresados. \n"
            
                    + "3. Quitar el ultimo numero. \n"
                   
                        + "4. Determinar si el numero es o no capicua. \n"
            
                            + "0. Salir. \n"
            
                             + "Ingrese una Opcion: "));
           
           switch(Op){
               
               case 1 : pila1.push();break;
               
               case 2 : pila1.imprimir();break;
               
               case 3 : JOptionPane.showMessageDialog(null, "Sacamos a:  " + pila1.pop());break;
               
               case 4 : pila1.Capicua();break;
               
               case 0 : JOptionPane.showMessageDialog(null, "Gracias por su cordial atencion. \n"
                       + "Intengrantes: \n"
                       + "Rodriguez Oviedo, Cesar Andre. \n"
                       + "Ramirez Ruiz, Francisco de Dios. " );break;
           }
            
        }while(Op !=0);
    }    
}
