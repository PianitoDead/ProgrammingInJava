package teclados;

/* En una tienda de accesorios de computadoras, el precio de venta unitario de los
Teclados es el mismo para cualquier marca, sin embargo, el descuento varía de acuerdo
a la marca y se establece en la siguiente tabla. Determinar el importe a pagar por la
cantidad de teclados comprados en una sola marca, considerando que no se paga
impuestos. Mostrar el importe bruto, descuento y el importe a pagar.
*/
import java.util.Scanner;
public class Teclados {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int A;
         double B = 0, descuento, costo;
         System.out.println("Selecione 1-4 que teclado desea comprar.");
         System.out.println("1- Microsoft");
         System.out.println("2- Genius");
         System.out.println("3- Logitech");
         System.out.println("4- HP");
         A = in.nextInt();
         switch(A){                                    
                 case 1:
                 System.out.println("Usted eligio: Microsoft. ");
                 System.out.println("Procederemos a que ingrese el costo unitario.");
                 System.out.println("Ingrese el precio: ");
                 B = in.nextDouble();
                 System.out.println("Procesando...");
                 System.out.println("El precio es: " + B + " .");
                 descuento = B * 0.10;
                         System.out.println("Su Descuento es de: " + descuento + " .");
                         costo = B - descuento;
                         System.out.println("El costo total es de: " + costo + " .");
                         System.out.println("Gracias por comprar vuelva pronto...");break;
                      
                                 
             case 2:
                 System.out.println("Usted eligio: Genius. ");
                 System.out.println("Procederemos a que ingrese el costo unitario.");
                 System.out.println("Ingrese el precio: ");
                 B = in.nextDouble();
                 System.out.println("Procesando...");
                 System.out.println("El precio es: " + B + " .");
                 descuento = B * 0.15;
                         System.out.println("Su Descuento es de: " + descuento + " .");
                         costo = B - descuento;
                         System.out.println("El costo total es de: " + costo + " .");
                         System.out.println("Gracias por comprar vuelva pronto...");break;
                 
             case 3:
                 System.out.println("Usted eligio: Logitech. ");
                 System.out.println("Procederemos a que ingrese el costo unitario.");
                 System.out.println("Ingrese el precio: ");
                 B = in.nextDouble();
                 System.out.println("Procesando...");
                 System.out.println("El precio es: " + B + " .");
                 descuento = B * 0.20;
                         System.out.println("Su Descuento es de: " + descuento + " .");
                         costo = B - descuento;
                         System.out.println("El costo total es de: " + costo + " .");
                         System.out.println("Gracias por comprar vuelva pronto...");break;
                 
             case 4:
                 System.out.println("Usted eligio: HP. ");
                 System.out.println("Procederemos a que ingrese el costo unitario.");
                 System.out.println("Ingrese el precio: ");
                 B = in.nextDouble();
                 System.out.println("Procesando...");
                 System.out.println("El precio es: " + B + " .");
                 descuento = B * 0.25;
                         System.out.println("Su Descuento es de: " + descuento + " .");
                         costo = B - descuento;
                         System.out.println("El costo total es de: " + costo + " .");
                         System.out.println("Gracias por comprar vuelva pronto...");break;
                         
             default :
                 System.out.println("Error");
                  }     
                                            }
                      }