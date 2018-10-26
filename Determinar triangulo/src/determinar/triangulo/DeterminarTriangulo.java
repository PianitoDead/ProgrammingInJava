package determinar.triangulo;

import java.util.Scanner;
public class DeterminarTriangulo {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        double A, B, C;
        //Entrada
        System.out.println("Ingrese lado 1: ");
        A = Leer.nextDouble();
        System.out.println("Ingrese lado 2: ");
        B = Leer.nextDouble();
        System.out.println("Ingrese lado 3: ");
        C = Leer.nextDouble();
        //Proceso
        if ((A + B) > C && (A + C) > B && (B + C) > A){
            if(A == B && A == C){
                System.out.println("Triangulo Equilatero.");
            }
            else if (A == B || A == C || B == C){
                System.out.println("Triangulo Isósceles");
             
            }
            else {
                System.out.println("Traingulo Escaleno");
            }
        }
        else {
            System.out.println("No es Triangulo.");
        }
    }
    
}
