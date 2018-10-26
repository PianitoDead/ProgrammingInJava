package sueldo.anual;

import java.util.Scanner;
public class SueldoAnual {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ano;
        double nuevo_sueldo;
        System.out.println("Aplicacion para calcular el nuevo sueldo de un trabajador que gana 40000 soles anuales.");
        System.out.println("Ingrese la cantidad de años: ");
        ano = in.nextInt();
        
            if (ano <= 0){
                System.out.println("Usted no lleva ningun año en nuestra empresa.");
                System.out.println("Por lo tanto nu sueldo no aumenta en nada.");
                        }
            else if (ano <= 3){
                nuevo_sueldo = (40000 * 0.03) + 40000;
                System.out.println("Usted lleva menos 3 años en nuestra empresa por lo tanto su sueldo aumentara un 3%."); 
                System.out.println("Su nuevo sueldo es de: S/" + nuevo_sueldo + " .");
                System.out.println("Su sueldo aumento en un 3% lo cual es: S/1200. ");
                            }
            else if (ano > 3 && ano <= 5){
                nuevo_sueldo = (40000 * 0.05) + 400000;
                System.out.println("Usted lleva menos de 5 años pero mas de 3 en nuestra empresa por lo tanto su sueldo aumentara un 5%.");
                System.out.println("Su nuevo sueldo es de: S/" + nuevo_sueldo + " .");
                System.out.println("Su sueldo aumento en un 5% lo cual es: S/2000.  ");
                                            }
            else if (ano > 5 && ano < 10){
                nuevo_sueldo = (40000 * 0.07) + 40000;
                System.out.println("Usted lleva menos de 10 años pero mas de 5 en nuestra empresa por lo tanto su sueldo aumentara un 7%.");
                System.out.println("Su nuevo sueldo es de: S/" + nuevo_sueldo + " .");
                System.out.println("Su sueldo aumento en un 7% lo cual es: S/2800.  ");
                                            }
            
            else if (ano >= 10){
                nuevo_sueldo = (40000 * 0.1) + 40000;
                System.out.println("Usted lleva mas de 10 años en nuestra empresa por lo tanto su sueldo aumentara un 10%.");
                System.out.println("Su nuevo sueldo es de: S/" + nuevo_sueldo + " .");
                System.out.println("Su sueldo aumento en un 10% lo cual es: S/4000.  ");
                                }        
                                                  }    
                            }