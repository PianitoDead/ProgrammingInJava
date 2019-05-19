import java.util.*;
public class Proyecto1 {
    
    public static void main (String [] args){
        
        Scanner in = new Scanner(System.in);
        
        String Marca; int P,V;
        EquipoSonido Objeto1,Objeto2,Objeto3;
        
        Objeto1 = new EquipoSonido();
        System.out.println("Datos Objeto2");
        System.out.println("Ingrese Marca2: ");        
        Marca = in.nextLine();
        
        Objeto2 = new EquipoSonido (Marca);
        
        System.out.println("Datos Objeto3");
        Marca = in.nextLine();
        System.out.println("Datos Potencia3");
        P = in.nextInt();
        System.out.println("Ingrese VOltaje3");
        V = in.nextInt();
        
        Objeto3 = new EquipoSonido (Marca, P,V);
        
        
        
        
    }
    
}
