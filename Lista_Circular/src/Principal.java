import javax.swing.*;
public class Principal {
    public static void main (String [] args){
    Lista_Circular nueva = new Lista_Circular();
    int op;
    do{
    op = Integer.parseInt(JOptionPane.showInputDialog("\n Menu: \n"
            
            + "1. Crear un Nodo \n"
            
                + "2. Mostrar Lista \n"
            
                    + "3. Eliminar un Nodo \n"
                                              
                        + "4. Buscar Nodo \n"
                                                     
                             + "0. Salir\n"
            
                                 + "Ingrese una Opcion: "));
    
    switch(op){
        
    case 1: nueva.insertar2();break;
        
        case 2: nueva.mostrar1();break;
        
             case 3: nueva.eliminar();break;
        
                 case 4: nueva.buscar();break;
    }
}while (op!=0);
    }
}
