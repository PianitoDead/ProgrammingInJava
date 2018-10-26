package clasificacion.segun.el.monton.anterior;
import java.util.Scanner;
public class ClasificacionSegunElMontonAnterior {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] DNI = new String [2];
        double [] Monto = new double [2];    
        String [] Clasificacion = new String[2];
        // 1. Registro
         for (int i = 0; i< Monto.length; i++){
             System.out.println("Cliente N° " +(i+1));
             System.out.println("Ingrese DNI: ");
             DNI [i] = in.next();
             System.out.println("Ingrese el monto de compra del año anterior: ");
             Monto[i] = in.nextDouble();  
         }
         // 2. Clasificación del monto
            
         for(int i = 0; i < Monto.length; i++)
            if (Monto[i] >= 0 && Monto[i] <=500){
                Clasificacion[i] = "BABY";         
                }
            else if (Monto[i] >500 && Monto[i] <=1000){
                Clasificacion[i] = "PLATINIUM";
                }
            else if (Monto[i]>1000 && Monto[i] <=2000){
                        Clasificacion[i] = "GOLD";
                    }  
            else if (Monto[i] >=2000){
                        Clasificacion[i] = "DIAMOND";
                    }
         //Mostrar
         System.out.println("Clasificacion: ");
        for (int i=0; i < DNI.length; i++){
            System.out.println("DNI N°: " + DNI[i]);
            System.out.println("Monto del año anterior: " + Monto[i]);
        System.out.println("Su clasificacion es: " +Clasificacion[i]);
    }
    }
}

                 
        
    
    

