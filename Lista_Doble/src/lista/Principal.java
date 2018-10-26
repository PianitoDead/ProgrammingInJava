package lista;

import java.util.Scanner;

public class Principal {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        Lista Lista1 = new Lista();
    int op;    
    do{
        System.out.println("\n Menu lista: \n"
        + "1.- Crear Nodo. \n"
        + "2.- Mostar Lista.\n"
        + "3.- Eliminar Nodo.\n"
        + "4.- Buscar Nodo.\n"
        + "5.- Calcular la suma y promedio.\n"
        + "6.- Hallar el mayor o menor.\n"
        + "7.- Numeros Primos \n"
        + "8.- Numeros aleatorios\n"
        + "9.- Salir\n"
                            );
        op = in.nextInt();
        switch(op){
            case 1: Lista1.InsertarNodo();;break;
            case 2: Lista1.Mostrar();break;
            case 3: Lista1.Eliminar();break;
            case 4: Lista1.Buscar();break;
            case 5: Lista1.Promedio();break;
            case 6: Lista1.MayoroMenor();break;
            case 7: Lista1.ContarPrimos();break;
            case 8: Lista1.NumerosAleatorios();break;
        }
        
    }while (op!=9);
}
}
