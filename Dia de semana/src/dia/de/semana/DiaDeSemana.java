package dia.de.semana;

import java.util.Scanner;
public class DiaDeSemana {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int dia;
        System.out.println("Aplicacion que determina dia por un numero. ");
        System.out.println("Ingrese un numero desde el 0 hasta el 6: ");
        dia = in.nextInt();
                    
        switch (dia){
                      
            case 0 :
                System.out.println("Usted ingreso el numero: " + dia + " y selecciono el dia:");
                System.out.println("Domingo");break;
                
            case 1:
                System.out.println("Usted ingreso el numero: " + dia + " y selecciono el dia:");
                System.out.println("Lunes.");break;
            
            case 2:
                System.out.println("Usted ingreso el numero: " + dia + " y selecciono el dia:");
                System.out.println("Martes.");break;
        
            case 3:
                System.out.println("Usted ingreso el numero: " + dia + " y selecciono el dia:");
                System.out.println("Miercoles.");break;
                        
            case 4:
                System.out.println("Usted ingreso el numero: " + dia + " y selecciono el dia:");
                System.out.println("Jueves.");break;
            
            case 5:
                System.out.println("Usted ingreso el numero: " + dia + " y selecciono el dia:");
                System.out.println("Viernes.");break;
                
            case 6:
                System.out.println("Usted ingreso el numero: " + dia + " y selecciono el dia:");
                System.out.println("Sabado.");break;
        
            default:
                System.out.println("Usted ingreso el numero: " + dia + " y ese numero no esta registrado en nuestra base:");
                System.out.println("Error 404.");
        }
    }
    
}
