package pilas;

import javax.swing.*;

public class Principal {
    
    public static void main (String [] args){
        
        PILAS pila1 = new PILAS ();
        
        int Op;
        
        do{
           Op = Integer.parseInt(JOptionPane.showInputDialog("\n Menu Pila: \n"
            
            + "1. Ingresar Datos \n"
            
                + "2. Mostrar Datos Pila \n"
            
                    + "3. Quitar Datos Pila \n"
            
                        + "0. Salir\n"
            
                             + "Ingrese una Opcion: "));
           
           switch(Op){
               
               case 1 : pila1.push();break;
               
               case 2 : pila1.imprimir();break;
               
               case 3 : JOptionPane.showMessageDialog(null, "Sacar " + pila1.pop());break;
           }
            
        }while(Op !=0);
    }    
}
