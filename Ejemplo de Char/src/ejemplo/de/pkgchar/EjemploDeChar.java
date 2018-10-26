package ejemplo.de.pkgchar;

import java.util.Scanner;
public class EjemploDeChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char A;
        System.out.println("Ingrese una letra: A o B ");
        A = in.next().charAt(0);
       switch(A){
           case 'A':
               System.out.println("ingreso la letra: " + A);break;
               
           case 'B':
               System.out.println("ingreso la letra: " + A);break;
           default:
               System.out.println("ERROR 404.");break;
                
    }
    
}
