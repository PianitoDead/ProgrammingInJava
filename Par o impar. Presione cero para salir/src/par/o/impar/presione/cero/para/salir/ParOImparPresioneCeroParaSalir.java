package par.o.impar.presione.cero.para.salir;

import java.util.Scanner;
public class ParOImparPresioneCeroParaSalir {    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n;
        for(;;){
            
          System.out.println("ingresar numero ");
        n = in.nextInt();
        if(n==0){
            break;
        }
            if(n%2==0){
            System.out.println("Es Par");
            }else{System.out.println("Es Impar");
            }
        }
    }  
}
      

