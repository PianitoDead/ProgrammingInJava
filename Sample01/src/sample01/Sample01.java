package sample01;

import java.util.Scanner;

public class Sample01 {
    public static void main(String[] args) {
 System.out.println("Hola Mundo");
        System.out.println("Aprendiendo JAVA");
        System.out.println("Aplicaión para multiplicar:");
        System.out.println("Solo Ingrese los digitos A y B y listo el sistema hara el trabajo.");
        // Declaracion de variable
        int A, B, C;
        //Ingreso de datos
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese Valor de A");
        //Asignacion
        A = Leer.nextInt();
        System.out.println("Ingrese Valor de B");
        B = Leer.nextInt();
        C = A * B;
        System.out.println("A * B = " + C);
        System.out.println(A + " * B = " + C);
        System.out.println(A + " * " + B + " = " + C);
                   }  
}
