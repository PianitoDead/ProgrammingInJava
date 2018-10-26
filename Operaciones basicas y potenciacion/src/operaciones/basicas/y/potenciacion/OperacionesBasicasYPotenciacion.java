package operaciones.basicas.y.potenciacion;

import java.util.Scanner;
public class OperacionesBasicasYPotenciacion {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int A, B, C, ope_mat;
        double D, E, F;
        System.out.println("Aplicacion para resolver operaciones de: Suma, resta, multiplicacion, division y potenciacion.");
        System.out.println("Eliga del 1 hasta el 5 la operacion que quiere hacer: ");
        System.out.println("1. Suma.");
        System.out.println("2. Resta.");
        System.out.println("3. Multiplicacion.");
        System.out.println("4. Division.");
        System.out.println("5. Potenciacion.");
            ope_mat = in.nextInt();
       switch(ope_mat){
           
           case 1:
               System.out.println("Usted eligio: " + ope_mat + " lo cual es: Suma.");
               System.out.println("Ingrese el Primer Sumando: ");
                A = in.nextInt();
               System.out.println("Ingrese el Segundo Sumando: ");
                B = in.nextInt();
               System.out.println("Calculando el resultado...");
                    C = A + B;
               System.out.println(A + " + " + B + " = "  + C + " . Gracias...");break;
               
           case 2:
               System.out.println("Usted eligio: " + ope_mat + " lo cual es: Resta.");
               System.out.println("Ingrese el Minuendo: ");
                A = in.nextInt();
               System.out.println("Ingrese el Sustraendo: ");
                B = in.nextInt();
               System.out.println("Calculando el resultado...");
                    C = A - B;
               System.out.println(A + " - " + B + " = "  + C + " . Gracias...");break;
               
            case 3:
               System.out.println("Usted eligio: " + ope_mat + " lo cual es: Multiplicacion.");
               System.out.println("Ingrese el Multiplicando: ");
                A = in.nextInt();
               System.out.println("Ingrese el Multiplicador: ");
                B = in.nextInt();
               System.out.println("Calculando el resultado...");
                    C = A * B;
               System.out.println(A + " * " + B + " = "  + C + " . Gracias...");break;
               
            case 4:
               System.out.println("Usted eligio: " + ope_mat + " lo cual es: Division.");
               System.out.println("Ingrese el Dividendo: ");
                D = in.nextInt();
               System.out.println("Ingrese el Divisor: ");
                E = in.nextInt();
               System.out.println("Calculando el resultado...");
                    F = D / E;
               System.out.println(D + " / " + E + " = "  + F + " . Gracias...");break;
               
            case 5:
               System.out.println("Usted eligio: " + ope_mat + " lo cual es: Potenciacion.");
               System.out.println("Ingrese la Base: ");
                D = in.nextInt();
               System.out.println("Ingrese el Exponente: ");
                E = in.nextInt();
               System.out.println("Calculando el resultado...");
                    F = Math.pow(D, E);
               System.out.println(D + " elevado a la " + E + " es igual "  + F + " . Gracias...");break;
               
            default :
                System.out.println("Error 404.");break;
                        }
           }
    }
