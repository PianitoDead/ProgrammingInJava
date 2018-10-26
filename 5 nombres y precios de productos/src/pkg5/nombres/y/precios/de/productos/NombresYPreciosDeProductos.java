package pkg5.nombres.y.precios.de.productos;
import java.util.Scanner;
public class NombresYPreciosDeProductos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] Producto = new String[5];
        double [] Precio = new double[5];
        for (int i=0; i< Producto.length; i++){
            System.out.println("Nombre del Producto: ");
            Producto [i] = in.next();
            System.out.println("Ingrese el Precio: ");
            Precio [i] = in.nextDouble();
        }
        double Menor = Precio [0];
        int POS = 0;
        for(int i=1; i< Precio.length; i++){
            if(Precio [i] < Menor){
                Menor = Precio[i];
                POS = i;
            }
        }
        System.out.println("Producto barato: " + Producto[POS]);
        System.out.println("Precio es: " + Precio[POS]);
                    }
    }
