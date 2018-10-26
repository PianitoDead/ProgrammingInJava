/*
Un atleta utiliza un pulsómetro para sus entrenamientos. El pulsómetro
almacena las pulsaciones cada 15 segundos, durante un tiempo máximo de
2 horas. Escribir un programa para almacenar en un archivo los datos del
pulsómetro del atleta, de tal forma que el primer registro contenga la fecha,
hora y tiempo en minutos de entrenamiento, a continuación los datos del
pulsómetro por parejas: tiempo, pulsaciones.
 */
package pulsometro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author FRANK
 */
public class Pulsometro {
    //variables globalees
    //Colores que se usaran 
    static String black = "\033[30m";
    static String red = "\033[31m";
    static String green = "\033[32m";
    static String yellow = "\033[33m";
    static String blue = "\033[34m";
    static String purple = "\033[35m";
    static String cyan = "\033[36m";
    static String white = "\033[37m";
    static String reset = "\u001B[0m";
    //ruta
    static String ruta = "D:\\pulsometro.txt";//en donde se creara el archivo
    //variables 
    public static Scanner leer;
    public static String fecha, Resp, hora;
    public static int TiempoE, edad, pulsaciones = 0, pulsacionest = 0, tiempo = 0;

    public static void main(String[] args) {
        // codigo logico
        leer = new Scanner(System.in);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("====== PULSOMETRO ======");
        System.out.println("        by Frank        ");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.print(green + "Ingrese la fecha de  hoy:");
        fecha = leer.nextLine();
        System.out.print(yellow + "Ingrese la hora:");
        hora = leer.nextLine();
        System.out.print(blue + "¿Cuánto tiempo va a querer ejercitarse?(1-2):");
        TiempoE = leer.nextInt();
        Tiempo(TiempoE);
        Archivo(fecha, hora, tiempo, pulsaciones, pulsacionest);
        System.out.println("¿Desea abrir el archivo?(S/N)");
        Resp = leer.next();
        if(Resp.toUpperCase().equals("N") == false){
            Leer(ruta);
        }
    }
    //verifica el tiempo y calcula pulsaciones 
    public static void Tiempo(int TiempoE) {
        if (TiempoE <= 2) {
            switch (TiempoE) {
                case 1:
                    System.out.print("Ingrese su edad:");
                    edad = leer.nextInt();
                    pulsaciones = ((220 - edad) / 15);//calcula las pulsaciones por segundos
                    pulsacionest = pulsaciones * 3600;
                    tiempo = TiempoE * 60;
                    break;
                case 2:
                    System.out.print("Ingrese su edad:");
                    edad = leer.nextInt();
                    pulsaciones = ((220 - edad) / 15);//calcula las pulsaciones por segundos
                    pulsacionest = pulsaciones * 7200;
                    tiempo = TiempoE * 60;
                    break;
            }
            /*
            System.out.print("Ingrese su edad:");
            edad = leer.nextInt();
            pulsaciones = ((220 - edad) / 15);//calcula las pulsaciones por segundos
            pulsacionest = pulsaciones * 7185;
            tiempo = TiempoE * 60;
             */
        } else {
            System.out.println(red + "Error,el tiempo maximo de ejercicio es de 2 horas");

        }
    }
    //crea el documento con los datos ingresados
    public static void Archivo(String fecha, String hora, int tiempo, int pulsaciones, int pulsacionest) {
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
            escribir.write(blue + "La hora es:" + hora + espacio + espacio + "El tiempo que ha transcurrido es:" + tiempo + "minutos" + espacio + espacio + "La fecha es:" + fecha + espacio + espacio + " Sus pulsaciones cada 15 segundos son:" + pulsaciones + espacio + espacio + " Sus pulsaciones totales son:" + pulsacionest);

            //Cerramos la conexion
            escribir.close();
        } //Si existe un problema al escribir cae aqui
        catch (IOException e) {
            System.out.println(red + "Error al escribir" + e);
        }
        /*
        //leer archivo
        //Leer lo que esta dentro del texto
        //Creamos un String que va a contener todo el texto del archivo
        String texto = "";
        try {
            //Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector = new FileReader(ruta);

            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido = new BufferedReader(lector);

            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            while ((texto = contenido.readLine()) != null) {
                System.out.println(texto);
            }
        } //Si se causa un error al leer cae aqui
        catch (Exception e) {
            System.out.println(red + "Error al leer" + e);
        }
         */
    }
    //Abre el documento
    public static void Leer(String ruta) {
        //leer archivo
        //Leer lo que esta dentro del texto
        //Creamos un String que va a contener todo el texto del archivo
        String texto = "";
        try {
            //Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector = new FileReader(ruta);

            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido = new BufferedReader(lector);

            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            while ((texto = contenido.readLine()) != null) {
                System.out.println(texto);
            }
        } //Si se causa un error al leer cae aqui
        catch (Exception e) {
            System.out.println(red + "Error al leer" + e);
        }
    }

}
