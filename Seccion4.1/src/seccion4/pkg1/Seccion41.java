package seccion4.pkg1;

import java.util.Scanner;
import java.io.*;

public class Seccion41 {
    static RandonAccessFile fichero;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        int numero;        
        fichero = New RandomAccessFile("D:\\ARCHIVOS\\numeros.dat" , "rw");
        try {
        fichero = New RandomAccessFile("D:\\ARCHIVOS\\numeros.dat" , "rw");
        mostrarFichero(); //muestra el contenido original del fichero
        System.out.print("Introduce un número para añadir al final del fichero: ");
        numero = in.nextInt(); //se lee el entero a añadir en el fichero
        fichero.seek(fichero.length()); //nos situamos al final del fichero
        fichero.writeInt(numero);   //se escribe el entero
        mostrarFichero();//muestra el el fichero después de añadir el número
            }catch(FileNotFoundException ex){
                System.out.println(ex.getMessage());
            }catch(IOException ex){
                System.out.println(ex.getMessage());
                                    }finally{
            try{
                if (fichero !=null){
                   
                }
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }        
    }
    
    public static void mostrarFichero() {
        int n;
        try {
            fichero.seek(0); //nos situamos al principio
            while (true) {
                n = fichero.readInt();  //se lee  un entero del fichero
                System.out.println(n);  //se muestra en pantalla
            }
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }    
    }
    }
    

