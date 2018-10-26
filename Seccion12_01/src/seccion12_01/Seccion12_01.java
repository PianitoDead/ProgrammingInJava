package seccion12_01;
import java.util.Scanner;
public class Seccion12_01 {
    static Scanner in;
    static Alumno[] oAlumnos;
    static int Count, N;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        oAlumnos = new Alumno [28];
        N = oAlumnos.length;
        Count = 0;
        int Op;
        do{
            Op = Menu();
            switch(Op){
                case 1:
                    //Pregunta 1. Registro de datos
                    Registrar();
                    break;
                case 2:
                    //Pregunta 2. Mostrar el listado de alumnos
                    Listar();
                    break;
                case 3:
                    //Pregunta 3. Buscar un Nombre
                    BuscarAlumno();
                    break;
                case 4:
                    //Pregunta 4. Modificar los datos
                    Modificar();
                    break;
                case 5:
                    //Pregunta 5. Salir
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        
        }while(Op !=5);
    }
    
    public static int Menu (){
        System.out.println("\n** MENU DE OPCIONES **");
        System.out.println("1. Ingresar");
        System.out.println("2. Listar");
        System.out.println("3. Buscar");
        System.out.println("4. Modificar");
        System.out.println("5. Salir");
        System.out.println("Elija opcion: ");
        return in.nextInt();
    }
    public static void Registrar(){
        if (Count < N) { //Si hay Cupo
            oAlumnos [Count] = new Alumno ();
            System.out.println("** Registrar Alumnos **");
            System.out.println("Nombre: ");
            oAlumnos[Count].setN(in.next());
            System.out.println("Apellido Paterno: ");
            oAlumnos[Count].setAP(in.next());
            System.out.println("Apellido Materno: ");
            oAlumnos[Count].setAM(in.next());
            System.out.println("Nota 1: ");
            oAlumnos[Count].setNU1(in.nextDouble());
            System.out.println("Nota 2: ");
            oAlumnos[Count].setNU2(in.nextDouble());
            System.out.println("Nota 3: ");
            oAlumnos[Count].setNU3(in.nextDouble());
            oAlumnos[Count].calcularPromedio();
            Count++;
                 }
        else{
            System.out.println("Ya no hay cupos en el curso.");
        }
    }
    public static void Listar(){
        if(Count > 0) {
            for(int i=0; i<Count; i++){
                System.out.println("Nombre: " +oAlumnos [i].getN());
                System.out.println("Apellido Parterno: " +oAlumnos [i].getAP());
                System.out.println("Apellido Materno: " +oAlumnos [i].getAM());
                System.out.println("Nota 1: " +oAlumnos [i].getNU1());
                System.out.println("Nota 2: " +oAlumnos [i].getNU2());
                System.out.println("Nota 3: " +oAlumnos [i].getNU3());
                System.out.println("Promedio: " +oAlumnos [i].getPROM());
            }
        }
            else {
                    System.out.println("** No hay alumnos registrados **");
                    }
        }
    public static int Buscar(String Nom, String ApeP){
        int pos = -1;
        for (int i=0; i<Count;i++){
            if (oAlumnos [i].getN().equals(Nom) && oAlumnos[i].getAP().equals(ApeP)) {
                pos = i;
                break;
            }
        }
                return pos;
    }
    public static void BuscarAlumno(){
                    if(Count > 0){
                        int pos;
                        String Nom, Ape;
                        System.out.println("**Buscar Alumno **");
                        System.out.println("Nombre: ");
                        Nom = in.next();
                        System.out.println("Apellido: ");
                        Ape = in.next();
                        pos = Buscar (Nom, Ape);
                        if (pos > -1) {
                            System.out.println("Nombre: " + oAlumnos[pos].getN());
                            System.out.println("Apellido Parterno: " +oAlumnos [pos].getAP());
                            System.out.println("Apellido Materno: " +oAlumnos [pos].getAM());
                            System.out.println("Nota 1: " +oAlumnos [pos].getNU1());
                            System.out.println("Nota 2: " +oAlumnos [pos].getNU2());
                            System.out.println("Nota 3: " +oAlumnos [pos].getNU3());
                            System.out.println("Promedio: " +oAlumnos [pos].getPROM());
                            
                        }
                        else {
                            System.out.println("* Alumno no encontrado *");
                            
                        }
                        
                       
                    }
                    else{
                        System.out.println("No hay alumnos Registrados");
                    }
}
    public static void Modificar(){
        if (Count > 0 ){
            String Nom, Ape;
            int pos;
            System.out.println("** Modificar Alumno **");
            System.out.println("Nombre: ");
            Nom = in.next();
            System.out.println("Apellido: ");
            Ape = in.next();
            pos = Buscar (Nom, Ape);
            if (pos > -1) {
                        System.out.println("Datos Actuales: ");
                            System.out.println("Nombre: " + oAlumnos[pos].getN());
                            System.out.println("Apellido Parterno: " +oAlumnos [pos].getAP());
                            System.out.println("Apellido Materno: " +oAlumnos [pos].getAM());
                            System.out.println("Nota 1: " +oAlumnos [pos].getNU1());
                            System.out.println("Nota 2: " +oAlumnos [pos].getNU2());
                            System.out.println("Nota 3: " +oAlumnos [pos].getNU3());
                            System.out.println("Promedio: " +oAlumnos [pos].getPROM());
                            System.out.println("Deseas modificar los datos S/N: ");
                            if (in.next().toUpperCase().equals("S")){
                                System.out.println("Nombre: ");
                                oAlumnos[pos].setN(in.next());
                                System.out.println("Apellido Paterno: ");
                                oAlumnos[pos].setAP(in.next());
                                System.out.println("Apellido Materno: ");
                                oAlumnos[pos].setAM(in.next());
                                System.out.println("Nota 1: ");
                                oAlumnos[pos].setNU1(in.nextDouble());
                                System.out.println("Nota 2: ");
                                oAlumnos[pos].setNU2(in.nextDouble());
                                System.out.println("Nota 3: ");
                                oAlumnos[pos].setNU3(in.nextDouble());
                                oAlumnos[pos].calcularPromedio();                               
                            }                                
            
        }
        else {
            System.out.println("** No se encontro **");
        }
    }
        else{
                        System.out.println("No hay alumnos Registrados");
                    }
        
        
    }
    }