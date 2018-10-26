package division.entera.recursividad;

import java.util.Scanner;

public class DivisionEnteraRecursividad {
          
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
                       
        int A = 0, B = 0;
        
        System.out.println("Division entera por medio de metodo recursivo.");
        
        System.out.println("Ingrese Dividendo: ");
        
        A = in.nextInt();
        
        System.out.println("Ingrese Divisor: ");
        
        B = in.nextInt();
        
        System.out.println(+ A + " / " + B + " es: " + Cociente (A, B) + " con Residuo de: " + Residuo(A,B));
        
    }
    
    public static double Cociente (double A, double B){
        
        double Cociente = 1;
        
        Cociente = A / B ;
        
        return Cociente = Math.round(Cociente * 100) / 100d;
    }
    
    public static double Residuo (double A, double B){
        
        double Residuo = 1;
        
        Residuo = A % B ;
        
        return Residuo;
        
    }  
    
}
