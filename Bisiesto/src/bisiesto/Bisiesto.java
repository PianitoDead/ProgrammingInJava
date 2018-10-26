package bisiesto;

/* Un a�o es bisiesto si es m�ltiplo de 4, pero no de 100, pero s� de 400. (Ejemplos: 1984
es bisiesto, 2000 es bisiesto, 1800 no es bisiesto). Realice el programa en Java que
permita determinar si un a�o introducido desde el teclado es bisiesto o no. 
*/
import java.util.Scanner;
public class Bisiesto {
    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
        int ano;
        System.out.println("Aplicacion que determina si un a�o es bisiesto o no.");
        System.out.print("Ingrese el a�o: ");
        ano = in.nextInt();
        if(((ano%4==0)&&(ano%100!=0))||ano%400==0)
            System.out.println("El a�o: " +ano+ " es Bisiesto.");
        else
            System.out.println("El a�o: " +ano+ " no es Bisiesto.");
    }
    
}
