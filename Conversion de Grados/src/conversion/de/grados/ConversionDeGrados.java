package conversion.de.grados;

import java.util.Scanner;
public class ConversionDeGrados {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        double Cº, Fº, Kº, Rº;
        int temp;                
        System.out.println("Aplicacion para convertir Grados Celsius a Fahrenheit, Kelvin y Rankine.");
        System.out.println("Ingrese la cantidad que desea convertir: ");
        Cº= Leer.nextDouble();
        System.out.println("Ahora selecione a que temperatura desea convertir: " + Cº + " Grados Celsius.");
        System.out.println("1. G. Fahrenheit");
        System.out.println("2. G. Kelvin");
        System.out.println("3. G. Rankine");
        temp = Leer.nextInt();
        switch (temp){
            
            case 1:
                System.out.println("Usted Selecciono convertir " + Cº + " Grados Celsius a G. Fahrenheit.");
                Fº = (9 * Cº / 5) + 32;
                        System.out.println("Convirtiendo...");
                System.out.println("La conversion fue todo un exito " + Cº + " Grados Celsius a G. Fahrenheit es igual a: " + Fº); break;
                
            case 2:
                System.out.println("Usted Selecciono convertir " + Cº + " Grados Celsius a G. Kelvin.");
                Kº = (Cº + 273.15);
                        System.out.println("Convirtiendo...");
                System.out.println("La conversion fue todo un exito " + Cº + " Grados Celsius a G. Kelvin es igual a: " + Kº); break;
                
            case 3: 
                System.out.println("Usted Selecciono convertir " + Cº + " Grados Celsius a G. Rankine.");
                Rº = (9 * Cº / 5) + 491.67;
                        System.out.println("Convirtiendo...");
                System.out.println("La conversion fue todo un exito " + Cº + " Grados Celsius a G. Rankine es igual a: " + Rº); break;
                
            default :
                System.out.println("Lo sentimos pero hubo un error intente nuevamente. Gracias :D "); break;
                    }
    }
    
}
