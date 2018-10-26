package descuento.restaurante;
/*Un restaurante ofrece un descuento del 10% para consumos de hasta S/. 50.00, un
descuento de 20% para consumos mayores y para ambos casos aplica un impuesto del
15%. Determinar el importe a pagar por lo consumido, mostrando todos los importes.
*/

import java.util.Scanner;
public class DescuentoRestaurante {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double costo, descuento, precio, impuesto = 0, total;
        System.out.println("Aplicacion para calcular el descuento de lo consumido en un restaurante.");
        System.out.println("Ingrese el precio: ");
        precio = in.nextDouble();
        descuento=0;
        if(precio<=50)
            descuento=precio*0.10;
        if(precio>50)
            descuento=precio*0.20;
        if(precio<1000)
            impuesto=precio*0.15;
        costo=precio-descuento;
        System.out.println("Valor ingresado de precio: " +precio);
        System.out.println("Valor con el descuento: " + descuento);
        System.out.println("Valor total del costo: " + costo);
        total = costo + impuesto;
        System.out.println("Valor del Impuesto: " + impuesto);
        System.out.println("Valor Total de compra: " + total);
                                            }
                                       }
