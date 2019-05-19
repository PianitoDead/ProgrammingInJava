import java.util.Scanner;

public class Main {
    
    public static void main (String [] args){
        
        Scanner in = new Scanner(System.in);
        
        String Patente, Marca;
        
        int Asientos, Carga;
        
        Autobus Auto1 = new Autobus();
        
        Camion Cam1 = new Camion();
        
        System.out.println("Datos del Autobus");
        
        System.out.println("Ingrese Serie: ");
        
        Patente = in.next();
        
        System.out.println("\nIngrese Marca: ");
        
        Marca = in.next();
        
        System.out.println("\nIngrese N° de Asientos: ");
        
        Asientos = in.nextInt();
        
        Auto1.setAsientos(Asientos); Auto1.setMarca(Marca); Auto1.setPatente(Patente);
        
        System.out.println("\nDatos del AutoBus: " + Auto1.MostrarAutoBus());
        
        //-------------------------------------------------------
        
        System.out.println("\nDatos del Camion");
        
        System.out.println("Ingrese Serie: ");
        
        Patente = in.next();
        
        System.out.println("\nIngrese Marca: ");
        
        Marca = in.next();
        
        System.out.println("\nIngrese N° de Carga: ");
        
        Carga = in.nextInt();
        
        Cam1.setCarga(Carga); Cam1.setMarca(Marca); Cam1.setPatente(Patente);
        
        System.out.println("\nDatos del Camion: " +Cam1.MostarCamion());        
    }
    
}

