package seccion13;
import java.util.ArrayList;
import java.util.Scanner;
public class Seccion13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Creamos el ArrayList
        ArrayList <Persona> oMisAmigos = new ArrayList();
        //Creamos un objecto temporal
        Persona tempAmigo = new Persona ();
        //Agregar un Amigo a la Coleccion
        tempAmigo = new Persona(); //Limpiando
        System.out.println("DNI: ");
        tempAmigo.setDNI(in.next());
        System.out.println("Nombre: ");
        tempAmigo.setNombre(in.next());
        System.out.println("Telefono: ");
        tempAmigo.setTelefono(in.next());        
        oMisAmigos.add(tempAmigo);
        //Fin Agregar
        //Recuperar datos de un elemento de la coleccion
        //Limpiamos el obj Aux
        tempAmigo = new Persona();
        //Extraemos el elemento de la primera posicion
        tempAmigo = oMisAmigos.get(0);
        //mostramos la info 
        System.out.println("**Informacion almacenada**");
        System.out.println("DNI: " + tempAmigo.getDNI());
        System.out.println("Nombre: " + tempAmigo.getNombre());
        System.out.println("Telefono: " + tempAmigo.getTelefono());
        System.out.println("------------");
               
    }
    
}
