package menu.de.acciones;

import java.util.Scanner;
public class MenuDeAcciones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //...
        int Opcion;
        do {
            //Menu
            MENU();
            Opcion = in.nextInt();
            switch(Opcion){
                case 1:
                    System.out.println("Registrar.");break; 
                    case 2:
                    System.out.println("Eliminar.");break;
                        case 3:
                        System.out.println("Modificar.");break;
                            case 4:
                            System.out.println("Buscar.");break;
                                case 5:
                                System.out.println("Listar.");break;
                                    case 6:
                                    System.out.println("Adios.");break;
                                        default:
                                        System.out.println("Error 404.");break;
            }
            System.out.println("Usted eligio la Opcion: " + Opcion);
        }while(Opcion != 6);
        System.out.println("Adios :D");
    }
    public static void MENU(){
        System.out.println("** Opciones **");
            System.out.println("1. Registrar.");
            System.out.println("2. Eliminar.");
            System.out.println("3. Modificar.");
            System.out.println("4. Buscar");
            System.out.println("5. Listar.");
            System.out.println("6. Salir.");
            System.out.println("Elija Opcion.");
    }
        
    
}
