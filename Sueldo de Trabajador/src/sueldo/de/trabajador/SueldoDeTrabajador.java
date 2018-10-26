package sueldo.de.trabajador;
import java.util.Scanner;
public class SueldoDeTrabajador {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       //En el metodo Principal
       //Objeto
       Trabajador T1 = new Trabajador();
       System.out.println("DNI: ");
       T1.setDNI(in.next());
       System.out.println("Nombre: ");
       T1.setNombre(in.next());
       System.out.println("Apellidos: ");
       T1.setApellido(in.next());
       System.out.println("Numero de ventas: ");
       T1.setN_Ventas(in.nextInt());
       System.out.println("Sueldo: ");
       T1.setSueldo(in.nextDouble());
       T1.calcularSueldo();
       System.out.println("Sueldo: " +T1.getSueldo());
       
   }
    
}
