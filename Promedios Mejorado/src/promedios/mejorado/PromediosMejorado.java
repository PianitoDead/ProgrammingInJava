package promedios.mejorado;
import java.util.Scanner;
public class PromediosMejorado {
    public static void main(String[] args) {
        double PROM1 = 0, PROM2 = 0, PROM3 = 0, PROM_FINAL, PC, IF1, IF2, IF3, EP1, EP2, EF, TR, X;       
        Scanner in = new Scanner(System.in);
        int Op;        
        do {
            
        System.out.println("SELECCIONE: ");
                System.out.println("1. Registro de Primera unidad.");
                System.out.println("2. Registro de Segunda unidad.");
                System.out.println("3. Registro de Tercera unidad.");
                System.out.println("4. Registro Final.");
                System.out.println("5. Salir.");
        Op = in.nextInt();
        switch(Op){
            
            case 1: 
                    System.out.println("** Unidad 1 **");
                    System.out.println("Ingrese nota de practica calificada: ");
                    PC = in.nextDouble();
                    System.out.println("Ingrese nota de Informe: ");
                    IF1 = in.nextDouble();
                    System.out.println("Ingrese nota de examen Parcial: ");
                    EP1 = in.nextDouble();
                    PROM1 = (0.30 * PC + 0.30 * IF1 + 0.40 * EP1);
                    System.out.println("Sus notas de la primera unidad son:  ");
                    System.out.println("Practica Calificada:" +PC);
                    System.out.println("Informe: " +IF1);
                    System.out.println("Examen Parcial 1: " +EP1);
                    System.out.println("Su Promedio de la Unidad 1 es de: " + PROM1);
                    System.out.println("** Fin Unidad 1 **");break;
                
            case 2: 
                    System.out.println("** Unidad 2 **");
                    System.out.println("Ingrese nota de Trabajos: ");
                    TR = in.nextDouble();
                    System.out.println("Ingrese nota de Informe: ");
                    IF2 = in.nextDouble();
                    System.out.println("Ingrese nota de examen Parcial: ");
                    EP2 = in.nextDouble();
                    PROM2 = (0.30 * TR + 0.30 * IF2 + 0.40 * EP2);
                    System.out.println("Sus notas de la Segunda unidad son:  ");
                    System.out.println("Trabajos: " +TR);
                    System.out.println("Informe: " +IF2);
                    System.out.println("Examen Parcial 2: " +EP2);
                    System.out.println("Su Promedio de la Unidad 2 es de: " + PROM2);
                    System.out.println("** Fin Unidad 2 **");break;
                
            case 3: 
                    System.out.println("** Unidad 3 **");
                    System.out.println("Ingrese nota de X: ");
                    X = in.nextDouble();
                    System.out.println("Ingrese nota de Informe: ");
                    IF3 = in.nextDouble();
                    System.out.println("Ingrese nota de examen Final: ");
                    EF = in.nextDouble();
                    PROM3 = (0.25 * X + 0.25 * IF3 + 0.50 * EF);
                    System.out.println("Sus notas de la Tercera unidad son:  ");
                    System.out.println("X:" +X);
                    System.out.println("Informe: " +IF3);
                    System.out.println("Examen Final: " +EF);
                    System.out.println("Su Promedio de la Unidad 3 es de: " + PROM3);
                    System.out.println("** Fin Unidad 3 **");break;
                
            case 4: 
                    System.out.println("Calculando el Promedio Final. ");
                    PROM_FINAL =(PROM1 * 0.2 + PROM2 * 0.3 + PROM3 * 0.5);
                    if(PROM_FINAL<10.5)
                        System.out.println("Estas Reprobado");
                    else if(PROM_FINAL >= 10.5  )
                            System.out.println("Estas Aprobado");
                            
                    System.out.println("Promedio Final: " + PROM_FINAL);break;
                    
            case 5: 
                    System.out.println("Hasta luego. ");break;
                    
            default:
                    System.out.println("Error 404");break;
    }
        }while(Op !=5);
    }               
                       }
    

