package seccion_4;
import java.util.Scanner;
import java.io.*;
public class Seccion_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int Op;
            
            do{
                System.out.println("Menu de Archivos");
                System.out.println("1. Crear Archivo");
                System.out.println("2. Escribe Archivo");
                System.out.println("3. Leer Archivo");
                System.out.println("4. Salir");
                System.out.println("Ingrese Opcion: ");
                Op = in.nextInt();
                switch (Op){
                    case 1: CrearArchivo(); break;
                    case 2: EscribeArchivo(); break;
                    case 3: LeerArchivo (); break;
                }
            }while(Op!=4);
    }
    
    public static void CrearArchivo (){
        Scanner in = new Scanner(System.in);
        String ruta = "D:\\";
        System.out.println("Ingrese el nombre del archivo: ");
        String Nombre = in.nextLine();
        Nombre = Nombre + ".txt";
        ruta = ruta + Nombre;
        try{
            File archivo = new File (ruta);
            if (archivo.createNewFile()){
                System.out.println("Archivo Creado satisfactoriamente. ");
            }
        }catch(IOException e){
            System.out.println("Error de Creacion. " +e);
        }
    }
    
    public static void LeerArchivo (){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese ruta - Nombre del archivo");
        String Nombre = in.nextLine();
        File archivo;
        FileReader fr;
        BufferedReader br;
        try{
            archivo = new File (Nombre);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine())!=null){
                System.out.println(linea);                
            }
            br.close();
            fr.close();
                        
        }catch(IOException e){
            System.out.println("Error de Lectura. " +e);
        }
    }
    
    public static void EscribeArchivo (){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese ruta - Nombre del archivo");
        String Nombre = in.nextLine();
        Nombre = Nombre+".txt";
        
        File archivo;
        FileWriter fw;
        BufferedWriter bw;
        PrintWriter wr;
        
        try{
            archivo = new File (Nombre);
            fw = new FileWriter (archivo);
            bw = new BufferedWriter(fw);
            wr = new PrintWriter (bw);
            wr.write("Esta es primera linea de codigo");
            wr.append("\nEsta es la segunda linea de codigo");
            wr.close();
            bw.close();
            fw.close();
            }catch(IOException e){
            System.out.println("Error de Escritura. " +e);
        }
    }
   
}
