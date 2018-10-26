package lista2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lista2 Lista1 = new Lista2();
        int op, Op;
        do {
            System.out.println("\n Menu lista: \n"
                    + "1.- Crear Nodo. \n"
                    + "2.- Mostar Lista.\n"
                    + "3.- Eliminar Nodo.\n"
                    + "4.- Buscar Nodo.\n"
                    + "5.- Contadores.\n"
                    + "6.- Salir. \n"
            );
            op = in.nextInt();
            switch (op) {
                case 1:
                    Lista1.InsertarNodo();
                    break;
                case 2:
                    Lista1.Mostrar();
                    break;
                case 3:
                    Lista1.Eliminar();
                    break;
                case 4:
                    Lista1.Buscar();
                    break;
                case 5:
                    do {
                        System.out.println("\n Menu lista: \n"
                                + "1.- Contador de Vocales. \n"
                                + "2.- Contador de Letras.\n"
                                + "3.- Regresar. \n"
                        );
                        Op =  in.nextInt();

                        switch (Op) {
                            case 1:
                                Lista1.ContadordeVocales();
                                break;
                            case 2:
                                Lista1.ContadordeLetras();
                                break;
                            default: 
                                System.out.println("Error xD");
                        }
                    } while (Op != 3);
                    break;
                default:
                    System.out.println("Opcion Incorrecta.");
            }
        } while (op != 6);
    }
}
