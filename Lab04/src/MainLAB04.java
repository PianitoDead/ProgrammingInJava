import java.util.Scanner;

public class MainLAB04 {
    
    
     public static void main (String [] args){
         
         Scanner in = new Scanner(System.in);
         
         String Nombre, DNI; int Edad, Hora; double Paga;
         
         Persona P1 = new Persona();
         
         Empleado E1 = new Empleado ();
         
        /* System.out.println("Registro de la Persona.");
         
         System.out.println("\nIngrese su Nombre: ");
         
         Nombre = in.next();
         
         System.out.println("\nIngrese su DNI: ");
         
         DNI = in.next();
         
         System.out.println("\nIngrese su Edad: ");
         
         Edad = in.nextInt();
         
         //Setters de Persona.
         
         P1.setDNI(DNI); P1.setEdad(Edad); P1.setNombre(Nombre);
         
         //Datos.
         
         System.out.println("\nDatos de la Persona: " + P1.MostrarPersona());*/
         
         //*****************************Empleado*****************************
         
         System.out.println("\nDatos de Empleado.");
         
         System.out.println("Ingrese su Nombre: ");
         
         Nombre = in.next();
         
         System.out.println("\nIngrese su DNI: ");
         
         DNI = in.next();
         
         System.out.println("\nIngrese su Edad: ");
         
         Edad = in.nextInt();
         
         System.out.println("\nIngrese Paga: ");
         
         Paga = in.nextDouble();
         
         System.out.println("Ingrese Horas de Trabajo: ");
         
         Hora = in.nextInt();
         
         //Setters de Empleado.
         
         E1.setNombre(Nombre); E1.setDNI(DNI); E1.setEdad(Edad); E1.setPaga(Paga); E1.setHoras(Hora);
         
         //Datos de Empleado.
         
         System.out.println("\nDatos de Empleado: "+ E1.MostrarDatos());
         
         E1.MostrarSueldo();
         
     }
    
    
}


//Ramirez Ruiz, Francisco. Fernandez Ramos, JeanCarlos