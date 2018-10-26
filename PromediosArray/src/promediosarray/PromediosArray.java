package promediosarray;
import java.util.Scanner;
public class PromediosArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X;
        System.out.println("Eliga que alumno desea registar: 1 o 2");
        X = in.nextInt();
        switch (X){
                case 1 :
                
       
        Alumno A1 = new Alumno();
       String Curso;
       System.out.println("Apellidos: ");
       A1.setApellido(in.next());
       System.out.println("Nombre: ");
       A1.setNombre(in.next());
        System.out.println("Curso: ");
        Curso = in.next();
       System.out.println("Parcial1: ");
       A1.setParcial1(in.nextDouble());
       System.out.println("Parcial2: ");
       A1.setParcial2(in.nextDouble());
       System.out.println("Parcial3: ");
       A1.setParcial3(in.nextDouble());
       System.out.println("Datos: ");
        System.out.println("Apellidos: " + A1.getApellido());
        System.out.println("Nombre: " + A1.getNombre());
        System.out.println("Curso: " + Curso);
        System.out.println("Parcial N1: " + A1.getParcial1());
        System.out.println("Parcial N2: " + A1.getParcial2());
        System.out.println("Parcial N3: " + A1.getParcial3());
        System.out.println("Promedio Final: " + A1.getPromedio());break;
        
            case 2:
         Alumno A2 = new Alumno();
       String Curs;
       System.out.println("Apellidos: ");
       A2.setApellido(in.next());
       System.out.println("Nombre: ");
       A2.setNombre(in.next());
        System.out.println("Curso: ");
        Curs = in.next();
       System.out.println("Parcial1: ");
       A2.setParcial1(in.nextDouble());
       System.out.println("Parcial2: ");
       A2.setParcial2(in.nextDouble());
       System.out.println("Parcial3: ");
       A2.setParcial3(in.nextDouble());
       System.out.println("Datos: ");
        System.out.println("Apellidos: " + A2.getApellido());
        System.out.println("Nombre: " + A2.getNombre());
        System.out.println("Curso: " + Curs);
        System.out.println("Parcial N1: " + A2.getParcial1());
        System.out.println("Parcial N2: " + A2.getParcial2());
        System.out.println("Parcial N3: " + A2.getParcial3());
        System.out.println("Promedio Final: " + A2.getPromedio());break;  
        
            default: 
                System.out.println("Error 404.");break;
        }
    
       
    }
    
}
