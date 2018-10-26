package dos.numeros.par.o.impar;

import java.util.Scanner;
public class DosNumerosParOImpar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A, B;
        System.out.println("Aplicacion que permite ingresar dos numeros y permite saber si los dos son pares o impares.");
        System.out.println("Ingrese el primer numero: ");
            A = in.nextInt();
        System.out.println("Ingrese el Segundo Numero: ");
            B = in.nextInt();
            
        if(A%2==0)
            System.out.println("El Numero: " + A + " es PAR.");
        else
            System.out.println("El Numero: " + A + " es IMPAR.");
        
        if(B%2==0)
            System.out.println("El Numero: " + B + " es PAR.");
        else
            System.out.println("El Numero: " + B + " es IMPAR.");
                                            }    
                                }   

