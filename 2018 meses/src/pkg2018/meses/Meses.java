package pkg2018.meses;

import java.util.Scanner;
public class Meses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Mes;
        System.out.println("Aplicacion para ingresar un mes del 2018 y que te salga cuantos dias tiene dicho mes.");
        System.out.println("Ingrese el número del Mes: ");
        Mes = in.nextInt();
        switch(Mes){
            
            case 1: 
                System.out.println("Usted eligio: " + Mes + " y corresponde al mes de Enero el cual tiene 31 dias los cuales comienzan: ");
                System.out.println("El 1 de enero fue lunes.");
                System.out.println("Y el 31 de enero fue miercoles.");break;
                
            case 2:
                System.out.println("Usted eligio: " + Mes + " y corresponde al mes de Febrero el cual tiene 28 dias los cuales comienzan: ");
                System.out.println("El 1 de febrero fue jueves.");
                System.out.println("Y el 28 de febrero fue miercoles.");break;
             
            case 3:
                System.out.println("Usted eligio: " + Mes + " y corresponde al mes de marzo el cual tiene 31 dias los cuales comienzan: ");
                System.out.println("El 1 de marzo fue jueves.");
                System.out.println("Y el 31 de marzo fue sabado.");break;
                
            case 4: 
                System.out.println("Usted eligio: " + Mes + " y corresponde al mes de abril el cual tiene 30 dias los cuales comienzan: ");
                System.out.println("El 1 de abril fue domingo.");
                System.out.println("Y el 30 de abril fue lunes.");break;
                
            case 5: 
                System.out.println("Usted eligio: " + Mes + " y corresponde al mes de mayo el cual tiene 31 dias los cuales comienzan: ");
                System.out.println("El 1 de mayo fue martes.");
                System.out.println("Y el 31 de mayo fue jueves.");break;
                
            case 6:
                System.out.println("Usted eligio: " + Mes + " y corresponde al mes de junio el cual tiene 30 dias los cuales comienzan: ");
                System.out.println("El 1 de junio fue viernes.");
                System.out.println("Y el 31 de junio fue sabado.");break;
                
            case 7:
                System.out.println("Usted eligio: " + Mes + " y corresponde al mes de julio el cual tiene 31 dias los cuales comienzan: ");
                System.out.println("El 1 de julio fue domingo.");
                System.out.println("Y el 31 de julio fue martes.");break;
                
            case 8:
                System.out.println("Usted eligio: " + Mes + " y corresponde al mes de agosto el cual tiene 31 dias los cuales comienzan: ");
                System.out.println("El 1 de agosto fue miercoles.");
                System.out.println("Y el 31 de agosto fue viernes.");break;
                
            case 9:
                System.out.println("Usted eligio: " + Mes + " y corresponde al mes de septiembre el cual tiene 30 dias los cuales comienzan: ");
                System.out.println("El 1 de septiembre fue sabado.");
                System.out.println("Y el 30 de septiembre fue domingo.");break;
                
            case 10:
                System.out.println("Usted eligio: " + Mes + " y corresponde al mes de octubre el cual tiene 31 dias los cuales comienzan: ");
                System.out.println("El 1 de octubre fue lunes.");
                System.out.println("Y el 31 de octubre fue miercoles.");break;
                
            case 11:
                System.out.println("Usted eligio: " + Mes + " y corresponde al mes de noviembre el cual tiene 30 dias los cuales comienzan: ");
                System.out.println("El 1 de noviembre fue jueves.");
                System.out.println("Y el 30 de noviembre fue viernes.");break;
                
            case 12:
                System.out.println("Usted eligio: " + Mes + " y corresponde al mes de diciembre el cual tiene 31 dias los cuales comienzan: ");
                System.out.println("El 1 de diciembre fue sabado.");
                System.out.println("Y el 31 de diciembre fue lunes.");break;
                
            default:
                    System.out.println("El mes ingresado no es valido. Error 404");break;             
                          }
                          
                          System.out.println("Gracias por usar la aplicacion. ");
                
    }
    
}
