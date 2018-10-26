package capicúa;
/*Diseñe un programa en Java que lea un número de tres cifras y determine si es igual al
revés del número.
*/

import java.util.Scanner;
public class Capicúa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        System.out.println("Aplicacion para saber si un numero es capicua solo 3 cifras. ");
        System.out.println("Ingrese numero solo 3 cifras: ");
        numero = in.nextInt();
        System.out.println("Analizando...");
        
        if(numero%10==(numero-numero%10)/10) 
            System.out.println(numero+ " es Capicúa.");
        
        else if (numero%10==(numero-numero%10)/100)
            System.out.println(numero+ " es Capicúa.");
        
        else
            System.out.println(numero+ " no es capicúa.");
                                            }
                    }
