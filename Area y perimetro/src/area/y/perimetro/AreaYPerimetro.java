package area.y.perimetro;

import java.util.Scanner;
public class AreaYPerimetro {
        public static void main(String[] args) {
         Scanner Leer = new Scanner(System.in);
        double A, B, C , AREA, PERIMETRO, S;
        System.out.println("Ingrese lado 1: ");
        A = Leer.nextDouble();
        System.out.println("Ingrese lado 2: ");
        B = Leer.nextDouble();
        System.out.println("Ingrese lado 3: ");
        C = Leer.nextDouble();
        //Proceso
        if ((A + B) > C && (A + C) > B && (B + C) > A){
            S = (A +B + C)/2;
                    AREA =  Math.sqrt(S * (S - A) * (S - B) * (S -C));
                    PERIMETRO = A + B + C;
                    System.out.println("Area= " + AREA);
                    System.out.println("Perimetro= " + PERIMETRO);
                                                        }
        else {
            System.out.println("No es Triangulo.");
        }
    }
    
}
