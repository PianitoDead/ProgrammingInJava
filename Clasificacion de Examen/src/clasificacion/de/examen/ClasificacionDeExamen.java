package clasificacion.de.examen;

import java.util.Scanner;
public class ClasificacionDeExamen {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
              int A;
                
        System.out.println("Aplicacion para calcular la clasificacion de una nota de examen. ");
        System.out.println("Ingrese la nota del examen: ");
        A = Leer.nextInt();
            if (A < 10){
                System.out.println("Suspenso.");
            }
            else if (A >=10 && A < 14){
                System.out.println("Aprobado.");
            }
            else if (A >=14 && A < 18){
                System.out.println("Notable.");
            }
            else if (A >=18 && A < 20){
                System.out.println("Sobresaliente.");
                            }
                
           else if (A >=20){
                System.out.println("Excelente.");
            }
                                
          }
    }
