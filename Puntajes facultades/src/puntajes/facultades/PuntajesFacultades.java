package puntajes.facultades;

import java.util.Scanner;
public class PuntajesFacultades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int punt;
        System.out.println("Aplicacion para determinar puntajes de entrada o a las cuales podrias entrar.");
        System.out.println("Ingrese puntaje: ");
        punt = in.nextInt();
        System.out.println("El puntaje ingresado es: " + punt + (" , procedere a establecer la carrera que tienes o las que posiblemente puedas elegir."));
        if (punt <= 60 ){            
         System.out.println("Tu puntaje es de: " + punt + " , y tu carrera es Arquitectura. !Felicidades¡");
                        }
        else if (punt >60 && punt <= 70){
                System.out.println("Tu puntaje es de: " + punt + " , y tu carrera es Administracion. !Felicidades¡");
                System.out.println("Tambien puedes elegir: Arquitectura.");
                                            }
        else if (punt >70 && punt <=80){
            System.out.println("Tu puntaje es de: " + punt + " , y tu carrera es Industrial. !Felicidades¡");
            System.out.println("Tambien puedes elegir: Administracion o Arquitectura.");
                                        }
        else if (punt > 80 && punt <= 90){
            System.out.println("Tu puntaje es de: " + punt + " , y tu carrera es Electronica. !Felicidades¡");
            System.out.println("Tambien puedes elegir: Industrial, administracion o arquitectura.");
                                            }
        else if (punt >90 && punt <= 100){
            System.out.println("Tu puntaje es de: " + punt + " , y tu carrera es Sistemas. !Felicidades¡");
            System.out.println("Tambien puedes elegir: Eletronica, industrial, administracion o arquitectura.");
                                            }
        else
            System.out.println("El puntaje ingresado debe ser menor o igual que 100. Error 404.");
            
                                            }
                                }
    

