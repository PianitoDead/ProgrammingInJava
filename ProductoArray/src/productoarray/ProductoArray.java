package productoarray;
import java.util.Scanner;
public class ProductoArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner Leer = new Scanner(System.in);
       String [] Producto = new String [2];
       double [] Precio   = new double [2];
       double [] Des      = new double [2];
       double [] IGV      = new double [2];
       
       for(int i=0; i< Producto.length; i++){
           System.out.print("ingrese de Producto: ");
           Producto[i] = Leer.next();
           
           System.out.print("Precio: ");
           Precio[i] = Leer.nextDouble();  
       }
    
        }
       }
    
    

