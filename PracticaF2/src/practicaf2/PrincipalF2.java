package practicaf2;

import javax.swing.*;

public class PrincipalF2 {
    
  public static void main (String [] args){
    PracticaF2 nueva = new PracticaF2();
    int op;
    do{
    op = Integer.parseInt(JOptionPane.showInputDialog("\n Menu: \n"
            
            + "1. Ingresar Notas \n"
            
                + "2. Mostrar Notas \n"
            
                    + "3. Eliminar  Nota \n"
            
                            + "4. Buscar  Notas \n"
            
                                     + "5. Promedio de Notas \n"
            
                                            + "0. Salir\n"
            
                                                     + "Ingrese una Opcion: "));
    
    switch(op){
        
    case 1: nueva.insertar2();break;
        
        case 2: nueva.mostrar1();break;
        
             case 3: nueva.eliminar();break;
        
                 case 4: nueva.buscar();break;
        
                    case 5: nueva.promedio();break;
                      
                    
        
                        
        
                                
    }
}while (op!=0);
    }
                    }     

