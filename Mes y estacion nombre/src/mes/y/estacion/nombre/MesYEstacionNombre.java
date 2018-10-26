package mes.y.estacion.nombre;
/*Determinar el nombre correspondiente a un número de mes y además la estación a la
que pertenece, considerando 3 meses completos por estación.
1, 2, 3: Estación= Verano.
4, 5, 6: Estación= Otoño.
7, 8, 9: Estación=Invierno
10, 11, 12: Estación=Primavera
*/
import java.util.Scanner;
public class MesYEstacionNombre {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Algoritmo: 
Entradas:  
número de mes (NumMes) 
Salidas:  nombre del mes (NombreMes)
estacion
Ingresar número de mes: NumMes
Determinar estación:
        En CASO que NumMes SEA:  
1, 2, 3:  
estacion= “Verano”   
4, 5, 6:  
estacion= “Otoño”  
7, 8, 9:  
estacion= “Invierno”  
10, 11, 12: 
estacion= “Primavera”  
SINO  
estacion= “Desconocida”  
FIN del CASO 
Determinar nombre del mes: 
En CASO que NumMes SEA:  
1: NombreMes= “Enero”
2:  NombreMes= “Febrero”
3:  NombreMes= “Marzo” 
4:  NombreMes= “Abril”
5:  NombreMes= “Mayo”
6:  NombreMes= “Junio” 
7:  NombreMes= “Julio”
8:  NombreMes= “Agosto”
9:  NombreMes= “Setiembre” 
10:  NombreMes= “Octubre”
11:  NombreMes= “Noviembre”
12:  NombreMes= “Diciembre” 
SINO  
NombreMes= “Desconocido”  
FIN del CASO 
Esccribir: NombreMes, estacion 
*/
        int numMes;
        System.out.println("Aplicacion que determina el mes y la estacion. ");
        System.out.println("Ingrese el numero del mes: ");
        numMes = in.nextInt();
        
        System.out.print("Eligio el mes: ");
              
        switch (numMes){
                       
            case 1:
                System.out.println("Enero.");break;
            
            case 2:
                System.out.println("Febrero.");break;
        
            case 3:
                System.out.println("Marzo.");break;
                        
            case 4:
                System.out.println("Abril.");break;
            
            case 5:
                System.out.println("Mayo.");break;
        
            case 6:
                System.out.println("Junio.");break;
        
            case 7:
                System.out.println("Julio.");break;
        
            case 8:
                System.out.println("Agosto.");break;
        
            case 9:
                System.out.println("Septiembre.");break;
        
            case 10:
                System.out.println("Octubre.");break;
        
            case 11:
                System.out.println("Noviembre.");break;
                
            case 12:
                System.out.println("Diciembre.");break;
            
            default:
                System.out.println("Error");
        }
       
        System.out.print("Con la estacion: ");
        
        switch(numMes){
          
            case 1:
                System.out.println("Verano");break;
            
            case 2:
                System.out.println("Verano.");break;
        
            case 3:
                System.out.println("Verano.");break;
                        
            case 4:
                System.out.println("Otoño.");break;
            
            case 5:
                System.out.println("Otoño.");break;
        
            case 6:
                System.out.println("Otoño.");break;
        
            case 7:
                System.out.println("Invierno.");break;
        
            case 8:
                System.out.println("Invierno.");break;
        
            case 9:
                System.out.println("Invierno.");break;
        
            case 10:
                System.out.println("Primavera.");break;
        
            case 11:
                System.out.println("Primavera.");break;
                
            case 12:
                System.out.println("Primavera.");break;
                
            default:
                System.out.println("Error");
                         }
                                       
                }
    }
