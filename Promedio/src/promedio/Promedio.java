package promedio;
/*Calcular el promedio de un alumno en función a 03 evaluaciones parciales. Cada
evaluación parcial tiene un peso ponderado de 0.2, 0.3 y 0.5 respectivamente. 
*/

import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) {
        System.out.println("Aplicacion para calcular el promedio de un alumno en funcion a sus 3 evaluaciones.");
        Scanner in = new Scanner(System.in);
        double nota1, nota2, nota3, promedio;
        System.out.println("Ingrese la primera nota: ");
        nota1 = in.nextDouble();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = in.nextDouble();
        System.out.println("Ingrese la tercera nota: ");
        nota3 = in.nextDouble();
        promedio=(nota1*0.2+nota2*0.3+nota3*0.5);
        if(promedio<10)
            System.out.println("Estas Reprobado");
        else
            System.out.println("!Felicidades Aprobastes :3 ");
        System.out.println("Nota final: " + promedio);
    }
    
}
