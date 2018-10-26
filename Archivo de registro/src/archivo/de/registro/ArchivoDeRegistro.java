//Ramirez Ruiz Francisco de Dios. Ejercicio N°18. Psdta: La parte de crear un fichero con la informacion no lo logra hacer dado que se me congelaba y no avanzaba el proyecto cuando te una parte te pedia un scanner, busque por internet encontre algunos pero no logre complenderlos.
package archivo.de.registro;

import java.util.*;

import java.io.*;

public class ArchivoDeRegistro {

    //variables globales 
    static double A1 = 0, A2 = 0, A3 = 0, A4 = 0;
    static int A = 0, B = 0, C = 0, D = 0;
    static Scanner in;
    static String Nombre;
    static String ruta = "D:\\Prueba.txt";
    static String  N1,N2,N3,N4;

    public static void main(String[] args) {

        in = new Scanner(System.in);

        System.out.println("Aplicacion que permite guardar un registro de notas de los alumnos de UPGA.");

        System.out.println("Las notas se manejaran por apartados(4), los cuales cada nota debe ser del 1 hasta 25 para poder ser valido");

        System.out.println("Ingrese Nombre del alumno:");

        Nombre = in.next();
        do {
            System.out.println("Ingrese nota del primer apartado ");

            A1 = in.nextDouble();

            if (A1 <= 25) {

                System.out.println("La nota del apartado 1 se registro correctamente.");

                A++;
            } else {
                System.out.println("Ingrese un numero entre el 1 al 25. Error.");
            }
        } while (A == 0);

        do {
            System.out.println("Ingrese nota del segundo apartado ");

            A2 = in.nextDouble();

            if (A2 <= 25) {

                System.out.println("La nota del apartado 2 se registro correctamente.");

                B++;
            } else {

                System.out.println("Ingrese un numero entre el 1 al 25. Error.");

            }
        } while (B == 0);

        do {
            System.out.println("Ingrese nota del tercer apartado ");

            A3 = in.nextDouble();

            if (A3 <= 25) {
                System.out.println("La nota del apartado 3 se registro correctamente.");

                C++;
            } else {

                System.out.println("Ingrese un numero entre el 1 al 25. Error.");
            }
        } while (C == 0);

        do {
            System.out.println("Ingrese nota del cuarto apartado ");

            A4 = in.nextDouble();

            if (A4 <= 25) {

                System.out.println("La nota del apartado 4 se registro correctamente.");

                D++;
            } else {

                System.out.println("Ingrese un numero entre el 1 al 25. Error.");

            }
        } while (D == 0);

        System.out.println("Las notas que tuvo el alumnno: " + Nombre + " fueron las siguientes:");

        System.out.println("Nota 1: " + A1);

        System.out.println("Nota 2: " + A2);

        System.out.println("Nota 3: " + A3);

        System.out.println("Nota 4: " + A4);
        System.out.println("La nota final es: " + Promedios(A1, A2, A3, A4));
        N1 = Double.toString( A1);
        N2 = Double.toString( A2);
        N3 = Double.toString( A3);
        N4 = Double.toString( A4);
        
        Archivo(N1,N2,N3,N4);       
        
    }
    
    public static double Promedios(double A1, double A2, double A3, double A4) {
        double Promedios = 1;
        Promedios = (A1 + A2 + A3 + A4) / 4;
        return Promedios;
    }
    public static void Archivo(String A1,String A2,String A3,String A4){
    
        //creacion del documento
        String espacio = " "
                + " "
                + " "
                + " ";
        try {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo = new File(ruta);

            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter escribir = new FileWriter(archivo, true);

            //Escribimos en el archivo con el metodo write 
            escribir.write(A1+A2+A3+A4);

            //Cerramos la conexion
            escribir.close();
        } //Si existe un problema al escribir cae aqui
        catch (IOException e) {
            System.out.println( "Error al escribir" + e);
        }
    }
}
