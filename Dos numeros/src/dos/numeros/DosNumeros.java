package dos.numeros;

import java.util.Scanner;
public class DosNumeros {   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A, B;
        System.out.println("Aplicacion para ingresar dos numeros y detectar si el primer numero se pueda dividir entre el segundo.");
        System.out.println("Ingrese el Primero n�mero: ");
        A = in.nextInt();
        System.out.println("Ingrese el Segundo n�mero: ");
        B = in.nextInt();
        if (A % B == 0)
            System.out.println("El n�mero: " + A + " si divisible por: " + B + " .");
        else 
            System.out.println("El n�mero: " + A + " no es divisible por: " + B + " .");
    }
    
}
