import java.util.Scanner;
public class Ejemplo01 {

    public static void main (String [] arg){        
        Scanner in = new Scanner (System.in);
        
        Persona Per1 = new Persona ();
        //Ingreso de Atributos
        System.out.println("Ingrese Dni: ");
        Per1.setDni(in.nextLine());
        
        System.out.println("Ingrese Nombre: ");
        Per1.setNombres(in.nextLine());
        
        System.out.println("Ingrese Apellidos: ");
        Per1.setApellidos(in.nextLine());
        
        System.out.println("Ingrese Edad: ");
        Per1.setEdad(in.nextInt());
        //---------------------------------------
        //Mostrar Atributos de Objeto
        
        System.out.println("Datos de Persona.");
        
        System.out.println("Dni: " + Per1.getDni()+
                            "\nNombres: " + Per1.getNombres()+
                            "\nApellidos: " + Per1.getApellidos() +
                            "\nEdad: " + Per1.getEdad());
    }    
    }
