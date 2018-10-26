package registro;

import java.util.Scanner;

import java.io.*;

public class Registro {
    
   public static void main(String[] args) {
       
       Scanner in = new Scanner(System.in);
       
       double A1=0; 
               double A2=0;
                       double A3=0;
                               double A4=0;
                                       
       
       int A = 0, B = 0, C = 0, D = 0;       
       String Nombre; 
       
       String ruta="C:\\Users\\franc\\Documents\\NetBeansProjects\\Archivo de registro.txt";
       
        try{
                    File archivo=new File(ruta);        
                       
       
       if(archivo.createNewFile()){
            System.out.println("Archivo Creado");
        }
       
       
       System.out.println("Aplicacion que permite guardar un registro de notas de los alumnos de UPGA.");
       
        System.out.println("Las notas se manejaran por apartados(4), los cuales cada nota debe ser del 1 hasta 25 para poder ser valido");
       
       System.out.println("Ingrese Nombre del alumno:");
       
       Nombre = in.next();
             
       
       do{
                          System.out.println("Ingrese nota del primer apartado ");
                          
                          
           A1 = in.nextDouble();
           
           if(A1 <=25){
               
           System.out.println("La nota del apartado 1 se registro correctamente.");
           
            A++;
       }
           
       else {
           System.out.println("Ingrese un numero entre el 1 al 25. Error.");
       }
    }while(A==0);
       
       
       do{
                           System.out.println("Ingrese nota del segundo apartado ");
                           
           A2 = in.nextDouble();
       
           if(A2 <=25){
               
           System.out.println("La nota del apartado 2 se registro correctamente.");
           
           B++;
       }
       else {
               
           System.out.println("Ingrese un numero entre el 1 al 25. Error.");
           
       }
           }while(B==0);
       
       do{
                     System.out.println("Ingrese nota del tercer apartado ");
                     
           A3 = in.nextDouble();
           
           if(A3 <=25){
           System.out.println("La nota del apartado 3 se registro correctamente.");
           
           C++;           
       }
       else {
               
           System.out.println("Ingrese un numero entre el 1 al 25. Error.");
       }
           }while(C==0);
       
       do{
                     System.out.println("Ingrese nota del cuarto apartado ");
                     
           A4 = in.nextDouble();
           
           if(A4 <=25){
               
           System.out.println("La nota del apartado 4 se registro correctamente.");
           
           D++;
                  }
       else {
               
           System.out.println("Ingrese un numero entre el 1 al 25. Error.");
           
       }
           }while(D==0);
       
       
           System.out.println("Las notas que tuvo el alumnno: " + Nombre + " fueron las siguientes:");
           
            System.out.println("Nota 1: " + A1);
            
                System.out.println("Nota 2: " + A2);
                
                    System.out.println("Nota 3: " + A3);
                    
                        System.out.println("Nota 4: " + A4);
                        
           System.out.println("La nota final es: " +Promedios(A1,A2,A3,A4));  
           
   }catch(IOException e){
           System.out.println("Error de Creacion" + e);
           
    }
      
   }
    
   public static double Promedios (double A1, double A2, double A3, double A4) {
         double Promedios = 1;
        Promedios = (A1 + A2 + A3 + A4)/4; 
        return Promedios;
   }      
}


