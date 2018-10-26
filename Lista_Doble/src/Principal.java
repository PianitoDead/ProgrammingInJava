import javax.swing.JOptionPane;
public class Principal {
    public static void main (String [] args){
    Lista_doble nueva = new Lista_doble();
    int op;
    do{
    op = Integer.parseInt(JOptionPane.showInputDialog("\n Menu: \n"
            
            + "1. Crear un Nodo \n"
            
                + "2. Mostrar Lista \n"
            
                    + "3. Mostrar el ultimo \n"
            
                         + "4. Eliminar Siguiente \n"
            
                                 + "5. Eliminar al Final \n"
            
                                     + "6. Buscar un Nodo \n"
            
                                         + "7. Suma y Promedio \n"
            
                                             + "8. Mayor y Menor \n"
            
                                                 + "0. Salir\n"
            
                                                     + "Ingrese una Opcion: "));
    
    switch(op){
        
    case 1: nueva.insertar();break;
        
        case 2: nueva.mostrar1();break;
        
             case 3: nueva.mostrarUltimo();break;
        
                 case 4: nueva.eliminarSiguiente();break;
        
                    case 5: nueva.eliminar();break;
        
                        case 6: nueva.buscar();break;
        
                            case 7: nueva.promedio();break;
        
                                case 8: nueva.MayorMenor();break;      
    }
}while (op!=0);
    }
                    }   
