package mayor.o.menor;

import java.util.Scanner;
public class MayorOMenor {
    
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int N, r;
        //Ingreso
        System.out.println("Ingrese un Número: ");
        N = Leer.nextInt();
        //Proceso
        r = N % 2;
        //Salida
        if (r ==0){
            System.out.println("El numero ingresado es PAR");
        }
        else {
            System.out.println("El número ingresado es IMPAR");
            }
        }
    }
