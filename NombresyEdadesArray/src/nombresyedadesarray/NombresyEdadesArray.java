package nombresyedadesarray;
import java.util.Scanner;
public class NombresyEdadesArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] Nombre = new String[22];
        int [] Edad = new int[2];
        for (int i = 0; i< Edad.length; i++){
             System.out.println("Nombre N° " +(i+1));
             System.out.println("Ingrese Nombre: ");
             Nombre [i] = in.next();
             System.out.println("Ingrese Edad: ");
             Edad[i] = in.nextInt();  
         }
        int Menor = Edad[0];
         for(int i=1; i<=Edad.length -1; i++){
             if (Edad[i] < Menor)
                 Menor = Edad[i];
         }
         System.out.println("Edad menor ingresada y nombres ingresados: ");
         System.out.println("La edad menor es: " + Menor);
        for (int i=0; i < Edad.length; i++){
            System.out.println("Alumno: " + Nombre[i]);
        }
    }
    }    


