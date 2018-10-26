package seccion11;
import java.util.Scanner;
public class Seccion11 {
    static Scanner in;
    static Persona [] Amigos;
    public static void main(String[] args) {
        in = new Scanner(System.in);
                //Obj Leer
        //Crear Array de Objetos
                    Amigos = new Persona[2];
                    int Op;
        do{
            //Opciones del usuario
            Menu();
            Op = in.nextInt();
            switch(Op){
                case 1:
                    //Pregunta 1. Ingreso de datos
                    Ingresar();
                    break;
                case 2:
                    //Pregunta 2. Mostrar el listado de amigos
                    Listar();
                    break;
                case 3:
                    //Pregunta 3. Buscar un Nombre
                    Buscar();
                    break;
                case 4:
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while(Op != 4);
    }
        public static void Ingresar(){
        //Ingresar Datos:            
            //Problema 1. Preparar el Objeto (Instanciar)
            String N, A, T;
            for (int i=0; i < Amigos.length; i++){
                System.out.println("*Amigo N° " + (i+i)+ " *");
            System.out.println("Nombres: ");
            N = in.next();
            System.out.println("Apellidos: ");
            A = in.next();
            System.out.println("Telefono: ");
            T = in.next();
            //Crear objetos y asignar datos.
            Amigos [i] = new Persona(N, A, T);
            }         
            System.out.println("--Fin de listado--");
        }
        
        public static void Listar(){
            //Pregunta 2. Mostrar el Listado.
            System.out.println("** Listado de Amigos **");
            for (int i=0; i < Amigos.length; i++){
                System.out.println("Nombre: " + Amigos[i].getNombres());
                System.out.println("Apellidos: " + Amigos[i].getApeliidos());
                System.out.println("Telefono: " + Amigos[i].getTelefono());
            }
                System.out.println("--Fin de Listado--");
        }
        
        public static void Buscar(){
            String N;
            //Pregunta 3. Buscar un nombre
            boolean Encontrado = false;
            System.out.println("Busqueda.");
        System.out.println("Nombre a Buscar: ");
        N = in.next();
        for(int i=0; i<Amigos.length; i++){
            if(Amigos[i].getNombres().equals(N)){
                System.out.println("Amigo Encontrado: ");
                System.out.println("Nombre: " + Amigos[i].getNombres());
                System.out.println("Apellidos: " + Amigos[i].getApeliidos());
                System.out.println("Telefono: " + Amigos[i].getTelefono());                
                Encontrado = true;//Cambiar el valor de busqueda
                break;//Cancerlar Busqueda              
                   }
        }
        
        if(Encontrado == false)
            System.out.println("Amigo no Encontrado.");
    }
        
        public static void Menu(){
            System.out.println("\n** MENU DE OPCIONES **");
        System.out.println("1. Ingresar");
        System.out.println("2. Listar");
        System.out.println("3. Buscar");
        System.out.println("4. Salir");
        System.out.println("Elija opcion: ");
        }
}
    
