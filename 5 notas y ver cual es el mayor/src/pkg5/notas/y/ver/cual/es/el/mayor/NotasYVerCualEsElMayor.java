package pkg5.notas.y.ver.cual.es.el.mayor;

import java.util.Scanner;
public class NotasYVerCualEsElMayor {   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, Mayor;
        System.out.println("Ingrese el numero: ");
        N = in.nextInt();
        Mayor = N;
        for(int i=1; i < 4; i++){
            System.out.println("Ingrese el numero: ");
            N = in.nextInt();
            if (N > Mayor){
                Mayor = N;
               
            }
        }
        System.out.println("El Mayor numero es: " + Mayor);
    }
    
}
