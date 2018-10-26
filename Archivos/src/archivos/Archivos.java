package archivos;
import java.io.File;
import java.io.IOException;
public class Archivos {
    public static void main(String[] args) {
    String ruta="C:\\Users\\franc\\Documents\\NetBeansProjects\\archivo.txt";
try{
    File archivo=new File(ruta);
  if(archivo.createNewFile()){
        System.out.println("Archivo creado.");
    }
}catch(IOException f){
    System.out.println("Error de creacion. " +f);
}
            }
         }
