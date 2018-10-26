package ejemplo01;

import java.util.Scanner;
import java.io.*;

public class Ejemplo01 {
public static File archiv;
public static String nombre ;
public static  FileInputStream  fps;
public static DataInputStream  dos;
//array ;


    public static void main(String[] args) throws FileNotFoundException {
    Scanner leer = new Scanner (System.in);
        System.out.println("ingrese nombre");
        nombre=leer.next();
    crear();
        System.out.println("ingrese lo que desee");
    escritura(leer.next());
    }
    public static void crear(){
    try{
    File archiv=new File(nombre);
    if(archiv.createNewFile()){
        System.out.println("archivo creado ");
    }
    }catch(IOException e){
        System.out.println("error de creacion"); 
    }
    }
    
    public static void escritura (String escr){
    try{
    FileOutputStream  fps=new FileOutputStream (nombre);
    DataOutputStream  dos=new DataOutputStream (fps);
        System.out.println("ingrese lo que desea");
        dos.writeChars(escr);
    
    }catch(IOException e){
        System.out.println("error de escritura");
    }
    }
    
    public static void lectura(){
    int n;
    //cont =0;
    FileInputStream  fps=null;
    DataInputStream  dos=null; 
     try{
     fps=new FileInputStream (nombre);
     dos=new DataInputStream (fps);
     
     while (true){
       n=fps.read();
       //aray[cont++] = n 
     }
        
    
    }catch(IOException e){
        System.out.println("error de lectura");
    }   
    }
    
    public static void cifrado(){
        /*tienes que agrarrar cada caracter 
          y cifrarlo de bits a letras */
    }
    
}
