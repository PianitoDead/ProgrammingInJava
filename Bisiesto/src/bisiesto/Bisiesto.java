package bisiesto;

/* Un año es bisiesto si es múltiplo de 4, pero no de 100, pero sí de 400. (Ejemplos: 1984
es bisiesto, 2000 es bisiesto, 1800 no es bisiesto). Realice el programa en Java que
permita determinar si un año introducido desde el teclado es bisiesto o no. 
*/
import java.util.Scanner;
public class Bisiesto {
    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
        int ano;
        System.out.println("Aplicacion que determina si un año es bisiesto o no.");
        System.out.print("Ingrese el año: ");
        ano = in.nextInt();
        if(((ano%4==0)&&(ano%100!=0))||ano%400==0)
            System.out.println("El año: " +ano+ " es Bisiesto.");
        else
            System.out.println("El año: " +ano+ " no es Bisiesto.");
    }
    
}
