package valores.ingresados.pkg5.array;
import java.util.Scanner;
public class ValoresIngresados5Array {  
    public static void main(String[] args) {
        String [] Codigo = new String [10];
        String [] Apellido = new String [10];
        double [] Puntaje = new double [10];
        double Mayor;
        int i;
        Scanner in = new Scanner(System.in);
         // 1. Registro
         for (i = 0; i< Codigo.length; i++){
             System.out.println("Participante N° " +(i+1));
             System.out.println("Código: ");
             Codigo [i] = in.next();
             System.out.println("Apellido: ");
             Apellido[i] = in.next();
             System.out.println("Puntaje: ");
             Puntaje[i] = in.nextDouble();
         }
         // 2. Ganadores: Mayor Puntaje, Mostrar datos de los Ganadores.
         Mayor = Puntaje[0];
         for (i = 0; i < Puntaje.length;i++){
             if(Mayor < Puntaje[i]){
                 Mayor = Puntaje[i];
             }
         }
         System.out.println("Ganadores: ");
         for (i=0; i < Puntaje.length; i++){
             if (Puntaje[i] == Mayor){
                 System.out.println("Codigo: " + Codigo[i]);
                 System.out.println("Apellido: " + Apellido[i]);
                 System.out.println("Puntaje: " + Puntaje[i]);
             }
         }
         }
    
}

