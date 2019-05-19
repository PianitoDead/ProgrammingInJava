import java.util.Scanner;

public class Main {   
    
    public static void main (String [] args){
        
     Scanner in = new Scanner(System.in);   
     
     String RUT, Nombre, RolUCV;
     
     Alumno Al1 = new Alumno();
     
     //Sin ingreso de datos.
     
        System.out.println(Al1.QuienSoy());
     
     //Con ingreso de datos.
     
        System.out.println("Ingrese RUT: ");
        
        RUT = in.next();
        
        System.out.println("Ingrese Nombre: ");
        
        Nombre = in.next();
        
        System.out.println("Ingrese su rol en la UCV: ");
        
        RolUCV = in.next();
        
        Al1.setRUT(RUT);
        
        Al1.setNombre(Nombre);
        
        Al1.setRolUCV(RolUCV);
        
        System.out.println("Datos del alummno: " + Al1.QuienSoy());
        
        
        
     
    }
    
    
}
