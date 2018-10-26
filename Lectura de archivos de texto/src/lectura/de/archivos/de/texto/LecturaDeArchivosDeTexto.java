package lectura.de.archivos.de.texto;
import java.io.*;
public class LecturaDeArchivosDeTexto {
    public static void main(String[] args) {
File archivo;           FileReader fr;            BufferedReader br;
String ruta="C:\\Users\\franc\\Documents\\NetBeansProjects\\Archivo de registro.txt";
try{
            archivo=new File(ruta);
            fr=new FileReader(archivo);
            br=new BufferedReader(fr);
            String linea;           
            while((linea=br.readLine())!=null){
               System.out.println(linea);
            }
            br.close();               fr.close();            
        }catch(Exception e){
            System.out.println("Error  de Lectura" +e);
        }
    }
}

