package programa.que.detecta.si.es.vocal;

import java.util.Scanner;
public class ProgramaQueDetectaSiEsVocal {    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char A;
        System.out.println("Aplicacion que dice si es vocal.");
        System.out.println("Ingrese una letra: ");
        A = in.next().charAt(0);
        switch(A){
           case 'A':
               System.out.println("Ingreso la vocal: " + A);break;
               
           case 'E':
               System.out.println("Ingreso la vocal: " + A);break;
               
           case 'I':
               System.out.println("Ingreso la vocal: " + A);break;
               
           case 'O':
               System.out.println("Ingreso la vocal: " + A);break;
               
           case 'U':
               System.out.println("Ingreso la vocal: " + A);break;
               
           case 'a':
               System.out.println("Ingreso la vocal: " + A);break;
               
           case 'e':
               System.out.println("Ingreso la vocal: " + A);break;
               
           case 'i':
               System.out.println("Ingreso la vocal: " + A);break;
               
           case 'o':
               System.out.println("Ingreso la vocal: " + A);break;
               
           case 'u':
               System.out.println("Ingreso la vocal: " + A);break;
               
           default:
               System.out.println("La letra: " + A + " no corresponde a ninguna vocal. ERROR 404.");break;
                }        
                                             }    
                                            }
