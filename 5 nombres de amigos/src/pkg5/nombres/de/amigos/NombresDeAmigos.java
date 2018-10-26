package pkg5.nombres.de.amigos;

import java.util.Scanner;
public class NombresDeAmigos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] Amigo = new String[5];
        String Nombre;
        for(int i=0; i<Amigo.length; i++){
            System.out.println("Nombre: ");
            Amigo [i] = in.next();            
        }
        System.out.println("Busqueda.");
        System.out.println("Nombre a Buscar: ");
        Nombre = in.next();
        boolean Encontrado = false;
        for(int i=0; i<Amigo.length; i++){
            if(Amigo[i].equals(Nombre)){
                System.out.println("¡Eureka!");
                Encontrado = true;
                break;              
                   }
        }
        if(Encontrado == false)
            System.out.println("PIÑA xD");
    }
    
}
