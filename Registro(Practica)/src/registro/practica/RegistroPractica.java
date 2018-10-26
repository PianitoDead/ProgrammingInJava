package registro.practica;

import java.util.Scanner;
public class RegistroPractica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int X;
        
        System.out.println("Eliga la categoria en la que se desea registrar: ");
        System.out.println("1. Persona. ");
        System.out.println("2. Trabajador de la UCV. ");
        System.out.println("3. Profesor de la UCV. ");
        System.out.println("4. Empleado de la UCV.");
        X = in.nextInt();
        switch(X){
        
        case 1:
                
            //PersonaUCV
            PersonaUCV P1 = new PersonaUCV ();
            int DNI, T01, T02, Final;
            String N, A1, A2;
            System.out.println("Eligio Persona.");
            System.out.println("Ingrese su DNI: ");
            DNI = in.nextInt();
            System.out.println("Ingrese su Nombre: ");
            N = in.next();
            System.out.println("Ingrese su Apellido Paterno: ");
            A1 = in.next();
            System.out.println("Ingrese su Apellido Materno: ");
            A2 = in.next();
            System.out.println("Ingrese la Calificacion del Taller 01: ");
            T01 = in.nextInt();
            System.out.println("Ingrese la Calificacion del Taller 02: ");
            T02 = in.nextInt();
            Final = (T01 + T02) / 2;
            P1.setDni(DNI);
            P1.setNombre(N);
            P1.setApellido(A1);
            P1.setApellido(A2);
            P1.setTaller1(T01);
            P1.setTaller2(T02);
            System.out.println("Usted es: " + N + " " + A1 + " " + A2 + ". Con Numero de DNI: " + DNI);
            System.out.println("Obtuvo: " + T01 + " de nota en el Taller01 y: " + T02 + " en el Taller02. " );
            System.out.println("Su Promedio Final es: " + Final);break;
            
            case 2:
            
            //TrabajadorUCV
            TrabajadorUCV P2 = new TrabajadorUCV ();
            int Dni, Taller01, Taller02, Final_Nota, Año;
            String Nombre, Apellido1, Apellido2;
                System.out.println("Eligio Trabajador.");
            System.out.println("Ingrese su DNI: ");
            Dni = in.nextInt();
            System.out.println("Ingrese su Nombre: ");
            Nombre = in.next();
            System.out.println("Ingrese su Apellido Paterno: ");
            Apellido1 = in.next();
            System.out.println("Ingrese su Apellido Materno: ");
            Apellido2 = in.next();
            System.out.println("Ingrese su año de ingreso: ");
            Año = in.nextInt();
            System.out.println("Ingrese la Calificacion del Taller 01: ");
            Taller01 = in.nextInt();
            System.out.println("Ingrese la Calificacion del Taller 02: ");
            Taller02 = in.nextInt();
            Final_Nota = (Taller01 + Taller02) / 2;
            P2.setDni(Dni);
            P2.setNombre(Nombre);
            P2.setApellido(Apellido1);
            P2.setApellido(Apellido2);
            P2.setAño(Año);
            P2.setTaller1(Taller01);
            P2.setTaller2(Taller02);
            P2.setFinal(Final_Nota);
            System.out.println("Usted es: " + Nombre + " " + Apellido1 + " " + Apellido2 + ". Con Numero de DNI: " + Dni + "Registrado el año: " + Año);
            System.out.println("Obtuvo: " + Taller01 + " de nota en el Taller01 y: " + Taller02 + " en el Taller02. " );
            System.out.println("Su Promedio Final es: " + Final_Nota);break;
            
            case 3:
            //Profesor UCV
            Participante_Profesor P3 = new Participante_Profesor ();
            int DNi, Tall01, Tall02, Final_note, Ano;
            String Nombr, Apellid1, Apellid2, Titulo;
            System.out.println("Eligio Profesor.");
            System.out.println("Ingrese su DNI: ");
            DNi = in.nextInt();
            System.out.println("Ingrese su Nombre: ");
            Nombr = in.next();
            System.out.println("Ingrese su Apellido Paterno: ");
            Apellid1 = in.next();
            System.out.println("Ingrese su Apellido Materno: ");
            Apellid2 = in.next();
            System.out.println("Ingrese su año de ingreso: ");
            Ano = in.nextInt();
            System.out.println("Ingrese el Titulo que posee: ");
            Titulo = in.next();
            System.out.println("Ingrese la Calificacion del Taller 01: ");
            Tall01 = in.nextInt();
            System.out.println("Ingrese la Calificacion del Taller 02: ");
            Tall02 = in.nextInt();
            Final_note = (Tall01 + Tall02) / 2;
            P3.setDni(DNi);
            P3.setNombre(Nombr);
            P3.setApellido(Apellid1);
            P3.setApellido(Apellid2);
            P3.setAño(Ano);
            P3.setTitulo(Titulo);
            P3.setTaller1(Tall01);
            P3.setTaller2(Tall02);
            P3.setFinal(Final_note);
            System.out.println("Usted es: " + Nombr + " " + Apellid1 + " " + Apellid2 + ". Con Numero de DNI: " + DNi + "Registrado el año: " + Ano + " el cual posee el Titulo: " + Titulo);
            System.out.println("Obtuvo: " + Tall01 + " de nota en el Taller01 y: " + Tall02 + " en el Taller02. " );
            System.out.println("Su Promedio Final es: " + Final_note);break;
            
            case 4: 
                // Empelado de la UCV
                Participante_Empleado P4 = new Participante_Empleado ();
                
                
                
                        
                
                
            
            default: 
            System.out.println("No eligio a nadie. 404.");
            
            
    }
    }
}
