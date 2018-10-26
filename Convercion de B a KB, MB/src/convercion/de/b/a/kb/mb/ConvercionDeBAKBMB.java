package convercion.de.b.a.kb.mb;
/*
Diseñe un programa en Java que convierta un valor en bytes a Kilobytes y Megabytes.

*/
import java.util.Scanner;
public class ConvercionDeBAKBMB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double B, K, M; 
        int val_elec;
        System.out.println("Aplicacion para convertir: Bytes a Kilobytes o Megabytes.");
        System.out.println("Ingrese la cantidad de Bytes a convertir: ");
        B = in.nextDouble();
        System.out.println("Usted desea convertir: " + B + " .");
        System.out.println("Ahora eliga a que valor lo desea convertir: ");
        System.out.println("1. Bytes a Kilobytes.");
        System.out.println("2. Bytes a Megabytes.");
        val_elec = in.nextInt();
        switch(val_elec){
            
            case 1:
                System.out.println("Eligio convertir: " + B + " a Kilobytes.");
                System.out.println("Convitiendo, espere un momento...");
                K = B / 1024;
                System.out.println("La conversion fue realizada con exito el resultado es:" + K + " Kilobytes.");break;              
                                
            case 2:
                System.out.println("Eligio convertir: " + B + " a Megabytes.");
                System.out.println("Convirtiendo, espere un momento...");
                M = B / 1048.576;
                System.out.println("La conversion fue realizada con exito el resultado es:" + M + " Megabytes.");break;
                
            default :
                System.out.println("Error 404.");break;
        }
    }
    
}
