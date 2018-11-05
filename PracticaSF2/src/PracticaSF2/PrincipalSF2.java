package PracticaSF2;

import javax.swing.*;

public class PrincipalSF2 {
    public static void main (String [] args){
        SimpleSF2 Lista1 = new SimpleSF2();
    int op;    
    do{
        op = Integer.parseInt(JOptionPane.showInputDialog("\n Menu lista: \n"
        + "1.- Ingresar Apellido. \n"
        + "2.- Mostar Apellidos.\n"
        + "3.- Eliminar Apellido.\n"
        + "4.- Buscar Apellido.\n"
                + "5.- Apellido.\n"
        + "0.- Salir\n"
                            ));
        
        switch(op){
            case 1: Lista1.InsertarApellido();;break;
            case 2: Lista1.Mostrar();break;
            case 3: Lista1.Eliminar();break;
            case 4: Lista1.Buscar();break;
            case 5: Lista1.Comparacion();break;
            
        }
        
    }while (op!=0);
}

    
}
