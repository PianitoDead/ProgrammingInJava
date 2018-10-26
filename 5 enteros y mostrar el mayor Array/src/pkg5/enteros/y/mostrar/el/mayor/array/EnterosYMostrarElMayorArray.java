package pkg5.enteros.y.mostrar.el.mayor.array;
import java.util.Scanner;
public class EnterosYMostrarElMayorArray {
     public static void main(String[] args) {
         int N[] = new int[10];
         Scanner Leer = new Scanner(System.in);
         for(int i=0; i<=9; i++){   //Ingresar
         System.out.println("Ingrese numero: ");
         N[i] = Leer.nextInt();
         }
         int Mayor = N[0];
         for(int i=1; i<=N.length -1; i++){
             if (N[i] > Mayor)
                 Mayor = N[i];
         }
         System.out.println("El mayor es: " +Mayor);
         
    }
    
}
