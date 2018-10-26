package unidades.y.decenas;

import java.util.Scanner;
public class UnidadesYDecenas {
       public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int A, unidad, decena;
           System.out.println("Aplicacion que te permite ingresar un numero entero de 2 cifras y poder saber las unidades y decenas de dicho núnero.");
           System.out.println("Ingrese el número entero de 2 cifras: ");
           A = in.nextInt();
           unidad = A % 10;
           decena = (A % 100 - unidad)/10;
           System.out.println("El numero que ingreso fue: " + A + " de las cuales su unidad y decena son:");
           System.out.println("Unidad: " + unidad);
           System.out.println("Decena: " + decena);
           System.out.println("Gracias por usa la aplicacion.");
           
       }
    
}
