import java.util.Scanner;
public class Proyecto02 {
    public static void main (String [] args){
        Scanner in =new Scanner(System.in);
         
        String Texto1;
        System.out.println("Ingrese el texto Para imprimir: ");
        Texto1= in.nextLine();
        Documento Doc1= new Documento (Texto1);        
        Impresora Imp1 = new Impresora();
        Imp1.Imprimir(Doc1);
    }
}
