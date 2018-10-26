package columnas;
import java.util.Scanner;
public class Columnas {

    
    public static void main(String[] args) {
      Scanner Leer = new Scanner(System.in);
       int LimiteHor = 500;
       int LimiteVer = 50;
       int LimiteTotal = 25000;
       int NumBol, NumFila, NumColumna;
       //Ingreso
       System.out.println("Ingrese Numero de Boleto: ");
        NumBol = Leer .nextInt();
        if (NumBol >= 1 && NumBol <=25000){
            NumFila = NumBol / LimiteHor;
            NumColumna = NumBol / LimiteHor;
            //Correcion
            if(NumBol % LimiteHor != 0){
                NumFila = NumFila + 1;
            }
            else{
                NumColumna = LimiteHor;
            }
            
        }
        else{
            System.out.println("Boleto no Valido.");
    }
    
}

}