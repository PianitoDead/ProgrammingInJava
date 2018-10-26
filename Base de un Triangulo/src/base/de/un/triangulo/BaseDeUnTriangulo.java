package base.de.un.triangulo;
/*Desarrolle el programa en Java que permita calcular el área de un triángulo en función
de su base y su altura.
*/

import java.util.Scanner;
public class BaseDeUnTriangulo {
    public static void main(String[] args) {
        
        System.out.println("Aplicacion para calcular la base de un Triangulo. ");
       Scanner in = new Scanner(System.in);
        double altura, area, base;
        System.out.println("Ingrese la altura del triangulo: ");
        altura = in.nextDouble();
        System.out.println("Ingrese la base del triangulo: ");
        base = in.nextDouble();
        area=base*altura/2;
        System.out.println("El Valor de area es: " + area);
                                            }
                               }
