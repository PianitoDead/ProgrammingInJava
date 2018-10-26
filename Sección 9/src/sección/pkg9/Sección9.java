//En el método principal (main)
//Crar Objetos
package sección.pkg9;
import java.util.Scanner;
public class Sección9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Programador P1 = new Programador ();
        String C, N;
        System.out.println("Codigo: ");
        C = in.next();
        System.out.println("Nombre: ");
        N = in.next();
        P1.setCodigo(C);
        P1.setNombre(N);
        System.out.println("Apellido: ");
        P1.setNombre(in.next());
        System.out.println("Nivel: ");
        P1.setNivel(in.nextInt());
        P1.calcularSueldo();
        System.out.println("Sueldo: " + P1.getSueldo());               
    }
    
}
