package Formularios;
/**
 *
 * @author PianitoDead
 */
import java.util.Scanner;

import Clases.Estadisticas;

public class Test {
            
        static Estadisticas Stats;
        
        static Scanner in;
              
        public static void main(String[] args) {     
            
        in = new Scanner(System.in);
        
        Stats = new Estadisticas();               
                       
        int Op;     
                        
        do {                               
                Op=Menu();
                 
         switch(Op){ 
            
            case 1: 
                    System.out.println("** Estadisticas **");                    
                    Estadisticas();
                    System.out.println("***********");
                    Orbes_Num();
                    System.out.println("*/*/*/*");
                    Eleccion_Hab();
                    System.out.println("*/*/*/*/*/*/*/*/*/*/*/*");
                    System.out.println("A continuacion se le mostrará las estadisticas de su mutante: ");
                    Mostrar_Stats_SM();
                    System.out.println("**********");
                    break;
                
            case 2: 
                    System.out.println("** Simulación de Orbes **");
                    Simulacion();break;
                    
            case 3: 
                    
                    Mostrar_Stats_CM();break;
                
            case 4: 
                  
                    break;
                    
            case 5: 
                    System.out.println("Hasta luego: " + System.getProperty("user.name"));break;
                    
            default:
                    System.out.println("Error 404");break;
    }
         }while(Op!=5);             
    }
   
        public static int Menu(){
            
                System.out.println("");
                System.out.println("Mutants Genetic Gladiator: ");
                System.out.println("1. Ingrese estadisticas del Mutante.");
                System.out.println("2. Simulación de Orbes.");
                System.out.println("3. Mostrar nuevas estadisticas modificadas(Si no hubo modificación se mostraran en valor 0).");
                System.out.println("4. Registro Final.");
                System.out.println("5. Salir.");
                System.out.println("");
                return in.nextInt();
                
        }
        
        public static void Estadisticas(){
            
            System.out.println("Ingrese el nombre del mutante: ");   
            
            Stats.setNombre(in.next());   
            
            do{
                
            System.out.println("Ingrese la vida: ");
            
            Stats.setVida(in.nextInt());
            
            if(Stats.getVida()==0){
                
                System.out.println("Error, no se debe de ingresar un valor 0. ");
                
            }}while(Stats.getVida()!=0 ==false);
            
            do{
            
            System.out.println("Ingrese el Primer ataque(Daño completo): ");
            
            Stats.setDaño_1(in.nextInt());
            
            if(Stats.getDaño_1()==0){
                
                System.out.println("Error, no se debe de ingresar un valor 0. ");
                
            }}while(Stats.getDaño_1()!=0 ==false);
            
            do{
                
            System.out.println("Ingrese el Segundo ataque(Daño completo): ");
             
            Stats.setDaño_2(in.nextInt());
            
            if(Stats.getDaño_2()==0){
                
                System.out.println("Error, no se debe de ingresar un valor 0. ");
                
            }}while(Stats.getDaño_2()!=0 ==false);
            
            do{
            
            System.out.println("Ingrese el daño y/o número de la Habilidad por defecto del primer ataque: ");
            
            Stats.setHabilidad_Heredada_1(in.nextInt());
            
            if(Stats.getHabilidad_Heredada_1()==0){
                
                System.out.println("Error, no se debe de ingresar un valor 0. ");
                
            }}while(Stats.getHabilidad_Heredada_1()!=0 ==false);
            
            do{
                
            System.out.println("Ingrese el daño y/o número de la Habilidad por defecto del segundo ataque: ");
            
            Stats.setHabilidad_Heredada_2(in.nextInt());
            
            if(Stats.getHabilidad_Heredada_2()==0){
                
                System.out.println("Error, no se debe de ingresar un valor 0. ");
                
            }}while(Stats.getHabilidad_Heredada_2()!=0 ==false);
            
            do{
                
            System.out.println("Ingrese la Velocidad entre 1 y 15(Use comas para los decimales)");
            
            Stats.setVelocidad(in.nextDouble()); 
            
            if(Stats.getVelocidad()==0.0){
                
                System.out.println("Error, debe de ingresar una velocidad entre 1 y 15. ");
                
            }}while((Stats.getVelocidad() == 1 == false) && (Stats.getVelocidad() <= 15 == false));
        }
                
        public static void Mostrar_Stats_SM(){
            
            System.out.println("");
            
            System.out.println("Nombre: " + Stats.getNombre());
            
            System.out.println("Primer Ataque: " + Stats.getDaño_1());
            
            System.out.println("Segundo Ataque: " + Stats.getDaño_2());
            
            System.out.println("Vida: " + Stats.getVida());
            
            System.out.println("Habilidad(Primer ataque): " + Stats.getHabilidad_Heredada_1());
            
            System.out.println("Habilidad(Segundo ataque): " + Stats.getHabilidad_Heredada_2());
            
            System.out.println("Velocidad: " + Stats.getVelocidad());   
            
            System.out.println("Número de Orbes: " + Stats.getNum_Orbes());
            
            System.out.println("Habilidad del Mutante: " + Stats.getHab_Nombre());
        }
        
        public static void Orbes_Num(){
            
            int Op_Num;
            
            do{            
                System.out.println("");
                System.out.println("++ ¿Cuantas casillas de orbes tiene tu mutante? ++");
                System.out.println("1. 1 Casilla sin Orbe especial. ");
                System.out.println("2. 1 Casilla con Orbe especial. ");
                System.out.println("3. 2 Casillas con orbe especial. ");
                System.out.println("4. 3 Casillas con orbe especial. ");
                System.out.println("Elija Opcion: ");
                Op_Num = in.nextInt();
                    
                switch(Op_Num){
                
                        case 1:
                            
                           Stats.setNum_Orbes(Op_Num);break;
                            
                        case 2:
                            
                            Stats.setNum_Orbes(Op_Num);break;
                            
                        case 3: 
                            
                            Stats.setNum_Orbes(Op_Num);break;
                            
                        case 4:
                            
                            Stats.setNum_Orbes(Op_Num);break;
                            
                        default:
                            System.out.println("Opcion Incorrecta. Ingrese el número correcto de casillas.");break;              
                                                                       
                            }
                    
            }while(Op_Num!=1 && Op_Num!=2 && Op_Num!=3 && Op_Num!=4);
            
        }
        
        public static void Eleccion_Hab(){
            
            int Elec_Hab; String Name;
            
            do{            
                System.out.println("");
                System.out.println("*/*/*/*/* ¿Cual es la Habilidad predeterminada? */*/*/*/*/");
                System.out.println("******************************************");
                System.out.println("1. Absorción de Vida. ");
                System.out.println("2. Debilitamiento. ");
                System.out.println("3. Escudo.");
                System.out.println("4. Fortalecimiento.");
                System.out.println("5. Herida.");
                System.out.println("6. Respuesta.");
                System.out.println("/////////////////////////////////////////");
                System.out.println("Por favor elija una opcion: ");
                System.out.println("");
                Elec_Hab = in.nextInt();
                    
                switch(Elec_Hab){
                
                        case 1:
                            
                           Stats.setNum_Hab(Elec_Hab);break;
                            
                        case 2:
                            
                            Stats.setNum_Hab(Elec_Hab);break;
                            
                        case 3: 
                            
                            Stats.setNum_Hab(Elec_Hab);break;
                            
                        case 4:
                            
                            Stats.setNum_Hab(Elec_Hab);break;
                            
                        case 5: 
                            
                            Stats.setNum_Hab(Elec_Hab);break;
                            
                        case 6:
                            
                            Stats.setNum_Hab(Elec_Hab);break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, eliga una habilidad");break;              
                                                                       
                            }
                    
            }while(Elec_Hab!=1 && Elec_Hab!=2 && Elec_Hab!=3 && Elec_Hab!=4 && Elec_Hab!=5 && Elec_Hab!=6);                
            
            if(Elec_Hab == 1){
                
                Name = "Absorción de Vida";
                
                Stats.setHab_Nombre(Name);
                
            }if(Elec_Hab == 2){
                
                Name = "Debilitamiento";
                
                Stats.setHab_Nombre(Name);
                
            }if(Elec_Hab == 3){
                
                Name = "Escudo";
                
                Stats.setHab_Nombre(Name);
                
            }if(Elec_Hab == 4){
                
                Name = "Fortalecimiento";
                
                Stats.setHab_Nombre(Name);
                
            }if(Elec_Hab == 5){
                
                Name = "Herida";
                
                Stats.setHab_Nombre(Name);
                
            }if(Elec_Hab == 6){
                
                Name = "Respuesta";
                
                Stats.setHab_Nombre(Name);                
            }
            
        }
        
        public static void Mostrar_Stats_CM(){
            
            if(Stats.getNum_Orbes()==1){
                        
            System.out.println("Nombre: " + Stats.getNombre());
            
            System.out.println("Primer Ataque(Base): " + Stats.getDaño_1()+ " Con Orbes: " + Stats.getDaño_1_Porcentaje() + " Total: " + Stats.getDaño_Orbe_1());
            
            System.out.println("Segundo Ataque(Base): " + Stats.getDaño_2()+ " Con Orbes: " + Stats.getDaño_2_Porcentaje() + " Total: " + Stats.getDaño_Orbe_2());
            
            System.out.println("Vida(Base): " + Stats.getVida() + " Con Orbes: " + Stats.getPorc_Vida() + " Total: " + Stats.getVida_Orbe());
            
            System.out.println("Habilidad Primaria(Primer Ataque Base): " + Stats.getHabilidad_Heredada_1() +
                    " Con Orbes: " + Stats.getHabilidad_Her_Porc() + " Total: " + Stats.getHabilidad_Her_Orbe());
            
            System.out.println("Habilidad Primaria(Segundo Ataque Base): " + Stats.getHabilidad_Heredada_2() + " Con Orbes: "+ Stats.getHabilidad_Her_Porc_2() + " Total: " + Stats.getHabilidad_Her_Orbe_2());
                        
            System.out.println("Velocidad: " + Stats.getVelocidad() + ". No dispone de orbe especial.");
            
        }else{
            
            System.out.println("Si a elegido previamente un orbe especial de habilidad se mostraran valores pero si no es asi pues saldra en 0");
                
            System.out.println("Nombre: " + Stats.getNombre());
            
            System.out.println("Primer Ataque(Base): " + Stats.getDaño_1()+ 
                    " Con Orbes: " + (Stats.getDaño_1_Porcentaje() + Stats.getDaño_1_Porcentaje_2()));
            
                    if ((Stats.getDaño_1_Porcentaje() >= 1) && (Stats.getDaño_1_Porcentaje_2() >= 1)){
                        
                        System.out.println("Total(Ambas casillas): " + ((Stats.getDaño_1_Porcentaje() * 2) + Stats.getDaño_1()));           
                        
                    }else if ((Stats.getDaño_1_Porcentaje() >= 1)){
                        
                        System.out.println("Total(1era casilla): " + (Stats.getDaño_Orbe_1()));
                        
                    }else if (Stats.getDaño_1_Porcentaje_2 () >=1){
                        
                        System.out.println("Total(2da casilla): " + (Stats.getDaño_Orbe_1_2()));                       
                                           
                    }else {
                        System.out.println("Total: 0");
                    }
                    
            System.out.println("Segundo Ataque(Base): " + Stats.getDaño_2()+ 
                    " Con Orbes: " + (Stats.getDaño_2_Porcentaje() + Stats.getDaño_2_Porcentaje_2()));
            
                    if ((Stats.getDaño_2_Porcentaje() >= 1) && (Stats.getDaño_2_Porcentaje_2() >= 1)){
                        
                        System.out.println("Total(Ambas casillas): " + ((Stats.getDaño_2_Porcentaje() * 2) + Stats.getDaño_2()));           
                        
                    }else if ((Stats.getDaño_2_Porcentaje() >= 1)){
                        
                        System.out.println("Total(1era casilla): " + (Stats.getDaño_Orbe_2()));
                        
                    }else if (Stats.getDaño_2_Porcentaje_2 () >=1){
                        
                        System.out.println("Total(2da casilla): " + (Stats.getDaño_Orbe_2_2()));                       
                                           
                    }else {
                        System.out.println("Total: 0");
                    }
            
            System.out.println("Vida(Base): " + Stats.getVida() + 
                    " Con Orbes: " + (Stats.getPorc_Vida() + Stats.getPorc_Vida_2()) + 
                    " Total: " + (Stats.getVida_Orbe() + Stats.getVida_Orbe_2()));
            
            System.out.println("Habilidad Primaria(Primera Habilidad Predeterminada): " + Stats.getHabilidad_Heredada_1() + 
                    " Con Orbes: " + (Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Her_Porc1_2()) + 
                    " Total: " + (Stats.getHabilidad_Her_Orbe() + Stats.getHabilidad_Her_Orbe1_2()));
            
            System.out.println("Habilidad Primaria(Segunda Habilidad Predeterminada): " + Stats.getHabilidad_Heredada_2() + 
                    " Con Orbes: "+ (Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Her_Porc2_2()) + 
                    " Total: " + (Stats.getHabilidad_Her_Orbe_2() + Stats.getHabilidad_Her_Orbe2_2()));
            
            System.out.println("Habilidad Especial(Primera Habilidad Secundaria): "  +Stats.getHabilidad_Secundaria() + 
                    " Con Orbes: " + (Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Sec_Porc1_2()) + 
                    " Total: " + (Stats.getHabilidad_Sec_Orbe()+ Stats.getHabilidad_Sec_Orbe_2()));
            
            System.out.println("Habilidad Especial(Segunda Habilidad Secundaria): " + Stats.getHabilidad_Secundaria_2() + 
                    " Con Orbes: " + (Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Sec_Porc2_2()) + 
                    " Total: " + (Stats.getHabilidad_Sec_Orbe_2() + Stats.getHabilidad_Sec_Orbe2_2()));
                        //Verificar la suma total de hab sec 2
            System.out.println("Velocidad: " + Stats.getVelocidad() + " Con Orbes: " + Stats.getVel_Porc() + " Total: " + Stats.getVelocidad_Orbe());
            }
        }
        
        public static void Simulacion(){
            
            int Op_Num;
                  
                  Op_Num = Stats.getNum_Orbes();

                  switch(Op_Num){

                          case 1:
                                                          
                              Eleccion_Orbes_1();break;

                          case 2:

                              Simulacion_1_CS();break;

                          case 3: 

                              Simulacion_3_Orbes();break;

                          case 4:

                              Simulacion_4_Orbes();break;
                              
                              }
        }      
        
        public static void Eleccion_Orbes_1(){
            
            int Opc;
            
            if(Stats.getNum_Orbes()==1){
                System.out.println("*/*/*/*/* Eliga un Orbe */*/*/*/*/");
            }else{
                System.out.println("*/*/*/*/* Eliga un Orbe para la primera casilla */*/*/*/*/");
            }            
            do{
                
            System.out.println("******************************************");
            System.out.println("1. De Estadistica. ");
            System.out.println("2. De Habilidad. ");
            System.out.println("3. Atras.");
            System.out.println("/////////////////////////////////////////");
            System.out.println("Por favor elija una opcion: ");
            Opc = in.nextInt();
            
            switch(Opc){
                
                case 1:
                    
                    System.out.println("");
                    
                    Orbe_Estadistica();break;
                    
                case 2:
                    
                    System.out.println("");
                    
                    if(Stats.getNum_Orbes()==1){
                        Orbe_Habilidad_Heredada();
                    }else{
                        Orbe_Habilidad();
                    }break;
                    
                case 3: 
                    
                    System.out.println("");break;
                    
                 default:
                            System.out.println("Opcion Incorrecta.");break;
            }                        
            }while(Opc!=3);
            
        } 
        
        public static void Simulacion_1_CS(){
            
            int Op_Simulacion_1_CS;
            
            do{            
                System.out.println("++ Orbes para 1 casilla con orbe especial ++");
                System.out.println("1. Orbe para la primera casilla. ");
                System.out.println("2. Orbe especial");
                System.out.println("3. Salir. ");
                System.out.println("Elija Opcion: ");
                Op_Simulacion_1_CS = in.nextInt();
                    
                switch(Op_Simulacion_1_CS){
                
                        case 1:
                            
                           Eleccion_Orbes_1();break;
                           
                        case 2:
                            
                            Eleccion_Especial();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta");break;            
                                                                       
                            }
                    
            }while(Op_Simulacion_1_CS!=3);
        }
                        
        public static void Simulacion_4_Orbes(){
            
            int Op_Simulacion_Heroicos;
            
            do{            
                System.out.println("++ Orbes para 4 casillas ++");
                System.out.println("1. Orbes para la primera casilla. ");
                System.out.println("2. Orbes para la segunda casilla. ");
                System.out.println("3. Orbes para la tercera casilla. ");
                System.out.println("4. Orbes para la casilla especial. ");
                System.out.println("5. Salir. ");
                System.out.println("Elija Opcion: ");
                Op_Simulacion_Heroicos = in.nextInt();
                    
                switch(Op_Simulacion_Heroicos){
                
                        case 1:
                            
                           Eleccion_Orbes_1();break;
                            
                        /*case 2:
                            
                            Eleccion_Orbes_2();break;
                            
                        case 3: 
                            
                            Eleccion_Orbes_3();break;
                            
                        case 4:
                            
                            Eleccion_Especial();break;*/
                            
                        default:
                            System.out.println("Opcion Incorrecta");break;              
                                                                       
                            }
                    
            }while(Op_Simulacion_Heroicos!=4);
        }        
        //Para 1 casilla y/o CS o SS a partir de aqui:                      
        public static void Orbe_Estadistica(){
            
            int Op_Ob_Est;
            
            char Rpt = 0 ;
            
            do{
            
            System.out.println("*/*/*/*/* Eliga un Orbe */*/*/*/*/");
            System.out.println("******************************************");
            System.out.println("1. De Ataque. ");
            System.out.println("2. De Vida. ");
            System.out.println("3. Atras.");
            System.out.println("/////////////////////////////////////////");
            System.out.println("Por favor elija una opcion: ");
            Op_Ob_Est = in.nextInt();
            
            switch(Op_Ob_Est){
                
                case 1:
                    
                    if(Stats.getVida_Orbe()>=1 || Stats.getDaño_Orbe_1()>=1 || Stats.getHabilidad_Her_Orbe()>=1 || Stats.getHabilidad_Sec_Orbe()>=1){                 
                      
                        System.out.println("Tiene un orbe. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe(0); Stats.setDaño_Orbe_1(0); Stats.setDaño_Orbe_2(0); 
                                    Stats.setHabilidad_Her_Orbe(0); Stats.setHabilidad_Her_Orbe_2(0); 
                                    Stats.setDaño_1_Porcentaje(0);  Stats.setDaño_2_Porcentaje(0);  
                                    Stats.setPorc_Vida(0); Stats.setHabilidad_Her_Porc(0); Stats.setHabilidad_Her_Porc_2(0);
                                    Stats.setHabilidad_Sec_Porc(0); Stats.setHabilidad_Sec_Porc_2(0);
                                    Stats.setHabilidad_Heredada_1(Stats.getHabilidad_Heredada_1() - Stats.getHab_Porc_Att_1());
                                    Stats.setHabilidad_Heredada_2(Stats.getHabilidad_Heredada_2() - Stats.getHab_Porc_Att_2());
                                    System.out.println("Eliminado.");                                                                                                         
                                    Orbe_Ataque();                 
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe()==0 || Stats.getDaño_Orbe_1() == 0 || Stats.getDaño_Orbe_1() == 0 || Stats.getHabilidad_Her_Orbe() == 0 || Stats.getHabilidad_Sec_Orbe() ==0){
                                    Orbe_Ataque();
                                }break;                  
                                        
                case 2:
                    
                    if(Stats.getVida_Orbe()>=1 || Stats.getDaño_Orbe_1()>=1 || Stats.getHabilidad_Her_Orbe()>=1 || Stats.getHabilidad_Sec_Orbe()>=1){                 
                      
                        System.out.println("Tiene un orbe. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe(0); Stats.setDaño_Orbe_1(0); Stats.setDaño_Orbe_2(0); 
                                    Stats.setHabilidad_Her_Orbe(0); Stats.setHabilidad_Her_Orbe_2(0); 
                                    Stats.setDaño_1_Porcentaje(0);  Stats.setDaño_2_Porcentaje(0);  
                                    Stats.setPorc_Vida(0); Stats.setHabilidad_Her_Porc(0); Stats.setHabilidad_Her_Porc_2(0);
                                    Stats.setHabilidad_Sec_Porc(0); Stats.setHabilidad_Sec_Porc_2(0);
                                    Stats.setHabilidad_Heredada_1(Stats.getHabilidad_Heredada_1() - Stats.getHab_Porc_Att_1());
                                    Stats.setHabilidad_Heredada_2(Stats.getHabilidad_Heredada_2() - Stats.getHab_Porc_Att_2());
                                    System.out.println("Eliminado.");                                                                                                         
                                    Orbe_Vida();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe()==0 || Stats.getDaño_Orbe_1() == 0 || Stats.getDaño_Orbe_1() == 0 || Stats.getHabilidad_Her_Orbe() == 0 || Stats.getHabilidad_Sec_Orbe() ==0){
                                    Orbe_Vida();
                                }break;
                                
                case 3:
                    
                    break;
                    
                case 4:
                    
                    Mostrar_Stats_CM();
                    break;
                    
                default:
                            System.out.println("Opcion Incorrecta"); break; 
            }                        
            }while(Op_Ob_Est!=3);
        }
        
        public static void Orbe_Ataque(){
            
            int Op_Ataque;            
          
            do{            
                System.out.println("");
                System.out.println("/*/*/*/*/*Ataque*/*/*/*/*/*");
                System.out.println("++ Elija que Orbe de Ataque prefiere ++");
                System.out.println("1. Nivel 0(2%). ");
                System.out.println("2. Nivel 1(5%). ");
                System.out.println("3. Nivel 2(10%). ");
                System.out.println("4. Nivel 3(12%). ");
                System.out.println("5. Nivel 4(14%). ");
                System.out.println("6. Nivel 5(16%). ");
                System.out.println("7. Quitar Orbe. ");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Ataque = in.nextInt();
                    
                switch(Op_Ataque){
                
                        case 1:                           
                                                                                                               
                            //Para el primer Ataque.

                                Stats.setDaño_1_Porcentaje(((Stats.getDaño_1()*2)/100));                              
                                
                                Stats.setDaño_Orbe_1(Stats.getDaño_1() + Stats.getDaño_1_Porcentaje());
                                
                                Stats.setHab_Porc_Att_1((Stats.getHabilidad_Heredada_1() * 2)/100);
                                
                                Stats.setHabilidad_Heredada_1(Stats.getHabilidad_Heredada_1() + Stats.getHab_Porc_Att_1());

                                //Para el segundo Ataque.

                                Stats.setDaño_2_Porcentaje(((Stats.getDaño_2()*2)/100));

                                Stats.setDaño_Orbe_2(Stats.getDaño_2_Porcentaje() + Stats.getDaño_2());
                                
                                Stats.setHab_Porc_Att_2((Stats.getHabilidad_Heredada_2()*2)/100);
                                
                                Stats.setHabilidad_Heredada_2(Stats.getHabilidad_Heredada_2() + Stats.getHab_Porc_Att_2());

                                System.out.println("Se coloco Ataque nivel 0.");break;
                            
                        case 2:
                            
                            Stats.setDaño_1_Porcentaje(((Stats.getDaño_1()*5)/100));                                
                                
                            Stats.setDaño_Orbe_1(Stats.getDaño_1() + Stats.getDaño_1_Porcentaje());
                            
                            Stats.setHab_Porc_Att_1((Stats.getHabilidad_Heredada_1()*5)/100);
                                
                            Stats.setHabilidad_Heredada_1(Stats.getHabilidad_Heredada_1() + Stats.getHab_Porc_Att_1());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setDaño_2_Porcentaje(((Stats.getDaño_2()*5)/100));

                            Stats.setDaño_Orbe_2(Stats.getDaño_2_Porcentaje() + Stats.getDaño_2());
                            
                            Stats.setHab_Porc_Att_2((Stats.getHabilidad_Heredada_2()*5)/100);
                                
                            Stats.setHabilidad_Heredada_2(Stats.getHabilidad_Heredada_2() + Stats.getHab_Porc_Att_2());
                                
                            System.out.println("Se coloco Ataque nivel 1.");break;
                            
                        case 3: 
                            
                            Stats.setDaño_1_Porcentaje(((Stats.getDaño_1()*10)/100));                                
                                
                            Stats.setDaño_Orbe_1(Stats.getDaño_1() + Stats.getDaño_1_Porcentaje());
                            
                            Stats.setHab_Porc_Att_1((Stats.getHabilidad_Heredada_1()*10)/100);
                                
                            Stats.setHabilidad_Heredada_1(Stats.getHabilidad_Heredada_1() + Stats.getHab_Porc_Att_1());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setDaño_2_Porcentaje(((Stats.getDaño_2()*10)/100));

                            Stats.setDaño_Orbe_2(Stats.getDaño_2_Porcentaje() + Stats.getDaño_2());
                            
                            Stats.setHab_Porc_Att_2((Stats.getHabilidad_Heredada_2()*10)/100);
                                
                            Stats.setHabilidad_Heredada_2(Stats.getHabilidad_Heredada_2() + Stats.getHab_Porc_Att_2());
                            
                            System.out.println("Se coloco Ataque nivel 2.");break;
                            
                        case 4:
                            
                            Stats.setDaño_1_Porcentaje(((Stats.getDaño_1()*12)/100));                                
                                

                            Stats.setDaño_Orbe_1(Stats.getDaño_1() + Stats.getDaño_1_Porcentaje());
                            
                            Stats.setHab_Porc_Att_1((Stats.getHabilidad_Heredada_1()*12)/100);
                                
                            Stats.setHabilidad_Heredada_1(Stats.getHabilidad_Heredada_1() + Stats.getHab_Porc_Att_1());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setDaño_2_Porcentaje(((Stats.getDaño_2()*12)/100));

                            Stats.setDaño_Orbe_2(Stats.getDaño_2_Porcentaje() + Stats.getDaño_2());
                            
                            Stats.setHab_Porc_Att_2((Stats.getHabilidad_Heredada_2()*12)/100);
                                
                            Stats.setHabilidad_Heredada_2(Stats.getHabilidad_Heredada_2() + Stats.getHab_Porc_Att_2());
                            
                            System.out.println("Se coloco Ataque nivel 3.");break;
                            
                        case 5:
                            
                            Stats.setDaño_1_Porcentaje(((Stats.getDaño_1()*14)/100));                                
                                

                            Stats.setDaño_Orbe_1(Stats.getDaño_1() + Stats.getDaño_1_Porcentaje());
                            
                            Stats.setHab_Porc_Att_1((Stats.getHabilidad_Heredada_1()*14)/100);
                                
                            Stats.setHabilidad_Heredada_1(Stats.getHabilidad_Heredada_1() + Stats.getHab_Porc_Att_1());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setDaño_2_Porcentaje(((Stats.getDaño_2()*14)/100));

                            Stats.setDaño_Orbe_2(Stats.getDaño_2_Porcentaje() + Stats.getDaño_2());
                            
                            Stats.setHab_Porc_Att_2((Stats.getHabilidad_Heredada_2()*14)/100);
                                
                            Stats.setHabilidad_Heredada_2(Stats.getHabilidad_Heredada_2() + Stats.getHab_Porc_Att_2());
                            
                            System.out.println("Se coloco Ataque nivel 4.");break;
                            
                        case 6: 
                            
                            Stats.setDaño_1_Porcentaje(((Stats.getDaño_1()*16)/100));                               
                                
                            Stats.setDaño_Orbe_1(Stats.getDaño_1() + Stats.getDaño_1_Porcentaje());
                            
                            Stats.setHab_Porc_Att_1((Stats.getHabilidad_Heredada_1()*16)/100);
                                
                            Stats.setHabilidad_Heredada_1(Stats.getHabilidad_Heredada_1() + Stats.getHab_Porc_Att_1());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setDaño_2_Porcentaje(((Stats.getDaño_2()*16)/100));

                            Stats.setDaño_Orbe_2(Stats.getDaño_2_Porcentaje() + Stats.getDaño_2());
                            
                            Stats.setHab_Porc_Att_2((Stats.getHabilidad_Heredada_2()*16)/100);
                                
                            Stats.setHabilidad_Heredada_2(Stats.getHabilidad_Heredada_2() + Stats.getHab_Porc_Att_2());
                            
                            System.out.println("Se coloco Ataque nivel 5.");break;
                        
                        case 7: 
                            
                            if(Stats.getDaño_Orbe_1() > Stats.getDaño_1()){
                                
                                Stats.setDaño_Orbe_1(0);        Stats.setDaño_1_Porcentaje(0);           
                                
                                Stats.setDaño_Orbe_2(0);        Stats.setDaño_2_Porcentaje(0);
                                
                                Stats.setHabilidad_Heredada_1(Stats.getHabilidad_Heredada_1() - Stats.getHab_Porc_Att_1());
                                
                                Stats.setHabilidad_Heredada_2(Stats.getHabilidad_Heredada_2() - Stats.getHab_Porc_Att_2());
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe.");
                            }break;
                            
                        case 8:
                            
                            break;
                            
                        default:
                            
                            System.out.println("Opcion Incorrecta, no ha elegido ningun orbe de ataque.");break;              
                                                                       
                            }
            }while(Op_Ataque!=8);
        }
        
        public static void Orbe_Vida(){
            
            int Op_Vida;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Vida prefiere ++");
                System.out.println("1. Nivel 0(5%). ");
                System.out.println("2. Nivel 1(10%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(20%). ");
                System.out.println("5. Nivel 4(25%). ");
                System.out.println("6. Nivel 5(30%). ");
                System.out.println("7. Eliminar Orbe. ");
                System.out.println("8. Atras.");
                System.out.println("Elija Opcion: ");
                Op_Vida = in.nextInt();
                    
                switch(Op_Vida){
                
                        case 1:
                                                        
                            Stats.setPorc_Vida((Stats.getVida()*5)/100);
                            
                            Stats.setVida_Orbe(Stats.getPorc_Vida() + Stats.getVida());
                            
                            System.out.println("Se coloco Vida nivel 0.");break;
                            
                        case 2:
                       
                            Stats.setPorc_Vida((Stats.getVida()*10)/100);
                            
                            Stats.setVida_Orbe(Stats.getPorc_Vida() + Stats.getVida());
                            
                            System.out.println("Se coloco Vida nivel 1.");break;
                            
                        case 3: 
                            
                            Stats.setPorc_Vida((Stats.getVida()*15)/100);
                            
                            Stats.setVida_Orbe(Stats.getPorc_Vida() + Stats.getVida());
                            
                            System.out.println("Se coloco Vida nivel 2.");break;                            
                            
                        case 4:
                            
                            Stats.setPorc_Vida((Stats.getVida()*20)/100);
                            
                            Stats.setVida_Orbe(Stats.getPorc_Vida() + Stats.getVida());
                            
                            System.out.println("Se coloco Vida nivel 3.");break;                            
                            
                        case 5:
                            
                            Stats.setPorc_Vida((Stats.getVida()*25)/100);
                            
                            Stats.setVida_Orbe(Stats.getPorc_Vida() + Stats.getVida());
                            
                            System.out.println("Se coloco Vida nivel 4.");break;                            
                            
                        case 6: 
                            
                            Stats.setPorc_Vida((Stats.getVida()*30)/100);
                            
                            Stats.setVida_Orbe(Stats.getPorc_Vida() + Stats.getVida());
                            
                            System.out.println("Se coloco Vida nivel 5.");break;                            
                        
                        case 7: 
                            
                            if(Stats.getVida_Orbe() > Stats.getVida()){
                                
                                Stats.setVida_Orbe(0); Stats.setPorc_Vida(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun orbe de Vida.");
                            }break;
                            
                        case 8:
                            
                            break;                                
                            
                        default:
                            System.out.println("Opcion Incorrecta, no ha elegido ningun orbe de vida.");break;      
                            
                            }   
                
                    }while(Op_Vida!=8);
        }
        
        public static void Orbe_Habilidad(){
            
            int Opc;            
          
            do{
                
            System.out.println("******************************************");
            System.out.println("1. Para Habilidad Primaria. ");
            System.out.println("2. Para Habilidad Secundaria. ");
            System.out.println("3. Atras.");
            System.out.println("/////////////////////////////////////////");
            System.out.println("Por favor elija una opcion: ");
            Opc = in.nextInt();
            
            switch(Opc){
                
                case 1:
                    
                    System.out.println("");
                    
                    Orbe_Habilidad_Heredada();break;
                    
                case 2:
                    
                    System.out.println("");
                    
                    Orbe_Habilidad_Secundaria();break;
                    
                case 3: 
                    
                    break;
                    
                case 4:
                    
                    Mostrar_Stats_CM();break;
                    
                default:
                            System.out.println("Opcion Incorrecta.");break;
            }                        
            }while(Opc!=3);
            
        }
        
        public static void Orbe_Habilidad_Heredada(){
            
            int Opc_Hab;
            
            char Rpt = 0 ;
            
                Opc_Hab = Stats.getNum_Hab();
                
            
            switch(Opc_Hab){
                
                case 1:
                    
                    if(Stats.getVida_Orbe()>=1 || Stats.getDaño_Orbe_1()>=1 || Stats.getHabilidad_Her_Orbe()>=1 || Stats.getHabilidad_Sec_Orbe()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe(0); Stats.setDaño_Orbe_1(0); Stats.setDaño_Orbe_2(0); 
                                    Stats.setHabilidad_Her_Orbe(0); Stats.setHabilidad_Her_Orbe_2(0); 
                                    Stats.setDaño_1_Porcentaje(0);  Stats.setDaño_2_Porcentaje(0);  
                                    Stats.setPorc_Vida(0); Stats.setHabilidad_Her_Porc(0); Stats.setHabilidad_Her_Porc_2(0);
                                    Stats.setHabilidad_Sec_Porc(0); Stats.setHabilidad_Sec_Porc_2(0);
                                    Stats.setHabilidad_Sec_Orbe(0); Stats.setHabilidad_Sec_Orbe_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Abs_Pred();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe()==0 || Stats.getDaño_Orbe_1() == 0 || Stats.getDaño_Orbe_1() == 0 || Stats.getHabilidad_Her_Orbe() == 0 || Stats.getHabilidad_Sec_Orbe() ==0){
                                    Hab_Abs_Pred();
                                }break;      
                    
                case 2:
                    
                    if(Stats.getVida_Orbe()>=1 || Stats.getDaño_Orbe_1()>=1 || Stats.getHabilidad_Her_Orbe()>=1 || Stats.getHabilidad_Sec_Orbe()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe(0); Stats.setDaño_Orbe_1(0); Stats.setDaño_Orbe_2(0); 
                                    Stats.setHabilidad_Her_Orbe(0); Stats.setHabilidad_Her_Orbe_2(0); 
                                    Stats.setDaño_1_Porcentaje(0);  Stats.setDaño_2_Porcentaje(0);  
                                    Stats.setPorc_Vida(0); Stats.setHabilidad_Her_Porc(0); Stats.setHabilidad_Her_Porc_2(0);
                                    Stats.setHabilidad_Sec_Porc(0); Stats.setHabilidad_Sec_Porc_2(0);
                                    Stats.setHabilidad_Sec_Orbe(0); Stats.setHabilidad_Sec_Orbe_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Deb_Pred();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe()==0 || Stats.getDaño_Orbe_1() == 0 || Stats.getDaño_Orbe_1() == 0 || Stats.getHabilidad_Her_Orbe() == 0 || Stats.getHabilidad_Sec_Orbe() ==0){
                                    Hab_Deb_Pred();
                                }break;
                    
                case 3:
                    
                    if(Stats.getVida_Orbe()>=1 || Stats.getDaño_Orbe_1()>=1 || Stats.getHabilidad_Her_Orbe()>=1 || Stats.getHabilidad_Sec_Orbe()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe(0); Stats.setDaño_Orbe_1(0); Stats.setDaño_Orbe_2(0); 
                                    Stats.setHabilidad_Her_Orbe(0); Stats.setHabilidad_Her_Orbe_2(0); 
                                    Stats.setDaño_1_Porcentaje(0);  Stats.setDaño_2_Porcentaje(0);  
                                    Stats.setPorc_Vida(0); Stats.setHabilidad_Her_Porc(0); Stats.setHabilidad_Her_Porc_2(0);
                                    Stats.setHabilidad_Sec_Porc(0); Stats.setHabilidad_Sec_Porc_2(0);
                                    Stats.setHabilidad_Sec_Orbe(0); Stats.setHabilidad_Sec_Orbe_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Esc_Pred();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe()==0 || Stats.getDaño_Orbe_1() == 0 || Stats.getDaño_Orbe_1() == 0 || Stats.getHabilidad_Her_Orbe() == 0 || Stats.getHabilidad_Sec_Orbe() ==0){
                                    Hab_Esc_Pred();
                                }break;
                    
                case 4:
                    
                    if(Stats.getVida_Orbe()>=1 || Stats.getDaño_Orbe_1()>=1 || Stats.getHabilidad_Her_Orbe()>=1 || Stats.getHabilidad_Sec_Orbe()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe(0); Stats.setDaño_Orbe_1(0); Stats.setDaño_Orbe_2(0); 
                                    Stats.setHabilidad_Her_Orbe(0); Stats.setHabilidad_Her_Orbe_2(0); 
                                    Stats.setDaño_1_Porcentaje(0);  Stats.setDaño_2_Porcentaje(0);  
                                    Stats.setPorc_Vida(0); Stats.setHabilidad_Her_Porc(0); Stats.setHabilidad_Her_Porc_2(0);
                                    Stats.setHabilidad_Sec_Porc(0); Stats.setHabilidad_Sec_Porc_2(0);
                                    Stats.setHabilidad_Sec_Orbe(0); Stats.setHabilidad_Sec_Orbe_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Forta_Pred();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe()==0 || Stats.getDaño_Orbe_1() == 0 || Stats.getDaño_Orbe_1() == 0 || Stats.getHabilidad_Her_Orbe() == 0 || Stats.getHabilidad_Sec_Orbe() ==0){
                                    Hab_Forta_Pred();
                                }break;
                    
                case 5: 
                    
                    if(Stats.getVida_Orbe()>=1 || Stats.getDaño_Orbe_1()>=1 || Stats.getHabilidad_Her_Orbe()>=1 || Stats.getHabilidad_Sec_Orbe()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe(0); Stats.setDaño_Orbe_1(0); Stats.setDaño_Orbe_2(0); 
                                    Stats.setHabilidad_Her_Orbe(0); Stats.setHabilidad_Her_Orbe_2(0); 
                                    Stats.setDaño_1_Porcentaje(0);  Stats.setDaño_2_Porcentaje(0);  
                                    Stats.setPorc_Vida(0); Stats.setHabilidad_Her_Porc(0); Stats.setHabilidad_Her_Porc_2(0);
                                    Stats.setHabilidad_Sec_Porc(0); Stats.setHabilidad_Sec_Porc_2(0);
                                    Stats.setHabilidad_Sec_Orbe(0); Stats.setHabilidad_Sec_Orbe_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Her_Pred();   
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe()==0 || Stats.getDaño_Orbe_1() == 0 || Stats.getDaño_Orbe_1() == 0 || Stats.getHabilidad_Her_Orbe() == 0 || Stats.getHabilidad_Sec_Orbe() ==0){
                                     Hab_Her_Pred();
                                }break;
                    
                case 6:
                    
                    if(Stats.getVida_Orbe()>=1 || Stats.getDaño_Orbe_1()>=1 || Stats.getHabilidad_Her_Orbe()>=1 || Stats.getHabilidad_Sec_Orbe()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe(0); Stats.setDaño_Orbe_1(0); Stats.setDaño_Orbe_2(0); 
                                    Stats.setHabilidad_Her_Orbe(0); Stats.setHabilidad_Her_Orbe_2(0); 
                                    Stats.setDaño_1_Porcentaje(0);  Stats.setDaño_2_Porcentaje(0);  
                                    Stats.setPorc_Vida(0); Stats.setHabilidad_Her_Porc(0); Stats.setHabilidad_Her_Porc_2(0);
                                    Stats.setHabilidad_Sec_Porc(0); Stats.setHabilidad_Sec_Porc_2(0);
                                    Stats.setHabilidad_Sec_Orbe(0); Stats.setHabilidad_Sec_Orbe_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Res_Pred();  
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe()==0 || Stats.getDaño_Orbe_1() == 0 || Stats.getDaño_Orbe_1() == 0 || Stats.getHabilidad_Her_Orbe() == 0 || Stats.getHabilidad_Sec_Orbe() ==0){
                                     Hab_Res_Pred();
                                }break;
            }            
        }
        //Orbes Predeterminados o Heredados a partir de aquí:
        public static void Hab_Abs_Pred(){
            
            int Op_Absorcion;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Absorción prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(25%). ");
                System.out.println("6. Nivel 5(28%). ");
                System.out.println("7. Quitar Orbe. ");
                System.out.println("8. Atras.");
                System.out.println("Elija Opcion: ");
                Op_Absorcion = in.nextInt();
                    
                switch(Op_Absorcion){
                
                        case 1:
                            
                            //Para el primer Ataque.
                            
                            //if(Stats.getDaño_Orbe_1() == 0){                               
                                                        
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*3)/100);
                            /*}else if(Stats.getDaño_Orbe_1() >0){
                                
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_Orbe_1()*3)/100);
                            }*/
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 0.");                            
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*25)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*25)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*28)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*28)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Her_Orbe() > Stats.getHabilidad_Heredada_1()){
                                
                                Stats.setHabilidad_Her_Orbe(0);     Stats.setHabilidad_Her_Porc(0);
                                
                                Stats.setHabilidad_Her_Orbe_2(0);   Stats.setHabilidad_Her_Porc_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Absorción.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Absorción.");
                            }break;                           
                            
                        case 8: 
                            
                            break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe de escoger un orbe de Absorcion.");break;                                                                       
                            }
                
            }while(Op_Absorcion!=8);
            
        }
        
        public static void Hab_Deb_Pred(){
            
            int Op_Debilitamiento;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Debilitamiento prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");
                System.out.println("7. Quitar Orbe. ");
                System.out.println("8. Atras.");
                System.out.println("Elija Opcion: ");
                Op_Debilitamiento = in.nextInt();
                    
                switch(Op_Debilitamiento){
                
                        case 1:
                            
                            //Para el primer Ataque.
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*22)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*22)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*24)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*24)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Her_Orbe() > Stats.getHabilidad_Heredada_1()){
                                
                                Stats.setHabilidad_Her_Orbe(0);     Stats.setHabilidad_Her_Porc(0);
                                
                                Stats.setHabilidad_Her_Orbe_2(0);   Stats.setHabilidad_Her_Porc_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Debilitamiento.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Debilitamiento.");
                            }break;                            
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe de elegir un orbe de Debilitamiento.");break;
                                                                       
                            }
                
            }while(Op_Debilitamiento!=8);
        }
        
        public static void Hab_Esc_Pred(){
            
            int Op_Escudo;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Escudo prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");
                System.out.println("7. Quitar Orbe. ");
                System.out.println("8. Atras.");
                System.out.println("Elija Opcion: ");
                Op_Escudo = in.nextInt();
                    
                switch(Op_Escudo){
                
                        case 1:
                            
                            //Para el primer Ataque.
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*22)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*22)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*24)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*24)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Her_Orbe() > Stats.getHabilidad_Heredada_1()){
                                
                                Stats.setHabilidad_Her_Orbe(0);     Stats.setHabilidad_Her_Porc(0);
                                
                                Stats.setHabilidad_Her_Orbe_2(0);   Stats.setHabilidad_Her_Porc_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Escudo.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Escudo.");
                            }break;
                            
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, eliga un orbe de escudo.");break;
                                                                       
                            }                                    
            }while(Op_Escudo!=8);
        }
        
        public static void Hab_Forta_Pred(){
            
            int Op_Fortalecimiento;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Fortalecimiento prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");
                System.out.println("7. Quitar Orbe");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Fortalecimiento = in.nextInt();
                    
                switch(Op_Fortalecimiento){
                
                        case 1:
                            
                            //Para el primer Ataque.
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*22)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*22)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*24)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*24)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Her_Orbe() > Stats.getHabilidad_Heredada_1()){
                                
                                Stats.setHabilidad_Her_Orbe(0);     Stats.setHabilidad_Her_Porc(0);
                                
                                Stats.setHabilidad_Her_Orbe_2(0);   Stats.setHabilidad_Her_Porc_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Fortalecimiento.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Fortalecimiento.");
                            }break;
                            
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe de elegir un orbe de Fortalecimiento.");break;                                                                       
                            }
            }while(Op_Fortalecimiento!=8);
        }
        
        public static void Hab_Her_Pred(){
            
            int Op_Herida;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Herida prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");
                System.out.println("7. Quitar Orbe.");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Herida = in.nextInt();
                    
                switch(Op_Herida){
                
                        case 1:
                            
                            //Para el primer Ataque.
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1()); 
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1()); 
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*22)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1()); 
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*22)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*24)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1()); 
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*24)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Her_Orbe() > Stats.getHabilidad_Heredada_1()){
                                
                                Stats.setHabilidad_Her_Orbe(0);     Stats.setHabilidad_Her_Porc(0);
                                
                                Stats.setHabilidad_Her_Orbe_2(0);   Stats.setHabilidad_Her_Porc_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Herida.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Herida.");
                            }break;
                            
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe elegir un orbe de Herida.");break;                                                                       
                            }
            }while(Op_Herida!=8);
        }
        
        public static void Hab_Res_Pred(){
            
            int Op_Respuesta;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Respuesta prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(17%). ");
                System.out.println("5. Nivel 4(18%). ");
                System.out.println("6. Nivel 5(19%). ");
                System.out.println("7. Quitar Orbe.");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Respuesta = in.nextInt();
                    
                switch(Op_Respuesta){
                
                        case 1:
                            
                            //Para el primer Ataque.
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());   
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1()); 
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*17)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1()); 
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*17)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*18)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1()); 
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*18)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Her_Porc((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1()); 
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Her_Orbe() > Stats.getHabilidad_Heredada_1()){
                                
                                Stats.setHabilidad_Her_Orbe(0);     Stats.setHabilidad_Her_Porc(0);
                                
                                Stats.setHabilidad_Her_Orbe_2(0);   Stats.setHabilidad_Her_Porc_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Respuesta.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Respuesta.");
                            }break;
                        
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe elegir un orbe de Respuesta");break;
                                                                       
                            }
            }while(Op_Respuesta!=8);
        }
        //Habilidad secundaria a partir de aqui:
        public static void Orbe_Habilidad_Secundaria(){
            
            int Opc_Hab_Sec;  char Rpt =0;
                        
                Opc_Hab_Sec = Stats.getNum_Hab_Sec();
                            
            switch(Opc_Hab_Sec){
                
               case 1:
                   
                   if(Stats.getVida_Orbe()>=1 || Stats.getDaño_Orbe_1()>=1 || Stats.getHabilidad_Her_Orbe()>=1 || Stats.getHabilidad_Sec_Orbe()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe(0); Stats.setDaño_Orbe_1(0); Stats.setDaño_Orbe_2(0); 
                                    Stats.setHabilidad_Her_Orbe(0); Stats.setHabilidad_Her_Orbe_2(0); 
                                    Stats.setDaño_1_Porcentaje(0);  Stats.setDaño_2_Porcentaje(0);  
                                    Stats.setPorc_Vida(0); Stats.setHabilidad_Her_Porc(0); Stats.setHabilidad_Her_Porc_2(0);
                                    Stats.setHabilidad_Sec_Porc(0); Stats.setHabilidad_Sec_Porc_2(0);
                                    Stats.setHabilidad_Sec_Orbe(0); Stats.setHabilidad_Sec_Orbe_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Abs_Sec();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe()==0 || Stats.getDaño_Orbe_1() == 0 || Stats.getDaño_Orbe_1() == 0 || Stats.getHabilidad_Her_Orbe() == 0 || Stats.getHabilidad_Sec_Orbe() ==0){
                                    Hab_Abs_Sec();
                                }break;                    
                    
                case 2:
                    
                    if(Stats.getVida_Orbe()>=1 || Stats.getDaño_Orbe_1()>=1 || Stats.getHabilidad_Her_Orbe()>=1 || Stats.getHabilidad_Sec_Orbe()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe(0); Stats.setDaño_Orbe_1(0); Stats.setDaño_Orbe_2(0); 
                                    Stats.setHabilidad_Her_Orbe(0); Stats.setHabilidad_Her_Orbe_2(0); 
                                    Stats.setDaño_1_Porcentaje(0);  Stats.setDaño_2_Porcentaje(0);  
                                    Stats.setPorc_Vida(0); Stats.setHabilidad_Her_Porc(0); Stats.setHabilidad_Her_Porc_2(0);
                                    Stats.setHabilidad_Sec_Porc(0); Stats.setHabilidad_Sec_Porc_2(0);
                                    Stats.setHabilidad_Sec_Orbe(0); Stats.setHabilidad_Sec_Orbe_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Deb_Sec();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe()==0 || Stats.getDaño_Orbe_1() == 0 || Stats.getDaño_Orbe_1() == 0 || Stats.getHabilidad_Her_Orbe() == 0 || Stats.getHabilidad_Sec_Orbe() ==0){
                                    Hab_Deb_Sec();
                                }break;
                    
                case 3:
                    
                    if(Stats.getVida_Orbe()>=1 || Stats.getDaño_Orbe_1()>=1 || Stats.getHabilidad_Her_Orbe()>=1 || Stats.getHabilidad_Sec_Orbe()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe(0); Stats.setDaño_Orbe_1(0); Stats.setDaño_Orbe_2(0); 
                                    Stats.setHabilidad_Her_Orbe(0); Stats.setHabilidad_Her_Orbe_2(0); 
                                    Stats.setDaño_1_Porcentaje(0);  Stats.setDaño_2_Porcentaje(0);  
                                    Stats.setPorc_Vida(0); Stats.setHabilidad_Her_Porc(0); Stats.setHabilidad_Her_Porc_2(0);
                                    Stats.setHabilidad_Sec_Porc(0); Stats.setHabilidad_Sec_Porc_2(0);
                                    Stats.setHabilidad_Sec_Orbe(0); Stats.setHabilidad_Sec_Orbe_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Esc_Sec();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe()==0 || Stats.getDaño_Orbe_1() == 0 || Stats.getDaño_Orbe_1() == 0 || Stats.getHabilidad_Her_Orbe() == 0 || Stats.getHabilidad_Sec_Orbe() ==0){
                                    Hab_Esc_Sec();
                                }break;
                    
                case 4:
                    
                    if(Stats.getVida_Orbe()>=1 || Stats.getDaño_Orbe_1()>=1 || Stats.getHabilidad_Her_Orbe()>=1 || Stats.getHabilidad_Sec_Orbe()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe(0); Stats.setDaño_Orbe_1(0); Stats.setDaño_Orbe_2(0); 
                                    Stats.setHabilidad_Her_Orbe(0); Stats.setHabilidad_Her_Orbe_2(0); 
                                    Stats.setDaño_1_Porcentaje(0);  Stats.setDaño_2_Porcentaje(0);  
                                    Stats.setPorc_Vida(0); Stats.setHabilidad_Her_Porc(0); Stats.setHabilidad_Her_Porc_2(0);
                                    Stats.setHabilidad_Sec_Porc(0); Stats.setHabilidad_Sec_Porc_2(0);
                                    Stats.setHabilidad_Sec_Orbe(0); Stats.setHabilidad_Sec_Orbe_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Forta_Sec();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe()==0 || Stats.getDaño_Orbe_1() == 0 || Stats.getDaño_Orbe_1() == 0 || Stats.getHabilidad_Her_Orbe() == 0 || Stats.getHabilidad_Sec_Orbe() ==0){
                                    Hab_Forta_Sec();
                                }break;
                    
                case 5: 
                    
                    if(Stats.getVida_Orbe()>=1 || Stats.getDaño_Orbe_1()>=1 || Stats.getHabilidad_Her_Orbe()>=1 || Stats.getHabilidad_Sec_Orbe()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe(0); Stats.setDaño_Orbe_1(0); Stats.setDaño_Orbe_2(0); 
                                    Stats.setHabilidad_Her_Orbe(0); Stats.setHabilidad_Her_Orbe_2(0); 
                                    Stats.setDaño_1_Porcentaje(0);  Stats.setDaño_2_Porcentaje(0);  
                                    Stats.setPorc_Vida(0); Stats.setHabilidad_Her_Porc(0); Stats.setHabilidad_Her_Porc_2(0);
                                    Stats.setHabilidad_Sec_Porc(0); Stats.setHabilidad_Sec_Porc_2(0);
                                    Stats.setHabilidad_Sec_Orbe(0); Stats.setHabilidad_Sec_Orbe_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Her_Sec();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe()==0 || Stats.getDaño_Orbe_1() == 0 || Stats.getDaño_Orbe_1() == 0 || Stats.getHabilidad_Her_Orbe() == 0 || Stats.getHabilidad_Sec_Orbe() ==0){
                                    Hab_Her_Sec();
                                }break;
                    
                case 6:
                    
                    if(Stats.getVida_Orbe()>=1 || Stats.getDaño_Orbe_1()>=1 || Stats.getHabilidad_Her_Orbe()>=1 || Stats.getHabilidad_Sec_Orbe()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe(0); Stats.setDaño_Orbe_1(0); Stats.setDaño_Orbe_2(0); 
                                    Stats.setHabilidad_Her_Orbe(0); Stats.setHabilidad_Her_Orbe_2(0); 
                                    Stats.setDaño_1_Porcentaje(0);  Stats.setDaño_2_Porcentaje(0);  
                                    Stats.setPorc_Vida(0); Stats.setHabilidad_Her_Porc(0); Stats.setHabilidad_Her_Porc_2(0);
                                    Stats.setHabilidad_Sec_Porc(0); Stats.setHabilidad_Sec_Porc_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Rep_Sec();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe()==0 || Stats.getDaño_Orbe_1() == 0 || Stats.getDaño_Orbe_1() == 0 || Stats.getHabilidad_Her_Orbe() == 0 || Stats.getHabilidad_Sec_Orbe() ==0){
                                    Hab_Rep_Sec();
                                }break;
                                
                /*case 7:
                    
                    System.out.println("Tiene un Orbe de velocidad, no es posible añadir atributos adicionales. ERROR 405.");break;*/
                    
                default:
                    
                    System.out.println("No ha elegido ningun orbe de especial. ERROR 404.");break;
            }            
        }   
        
        public static void Hab_Abs_Sec(){
            
            int Op_Absorcion;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Absorción prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(25%). ");
                System.out.println("6. Nivel 5(28%). ");
                System.out.println("7. Quitar Orbe. ");
                System.out.println("8. Atras.");
                System.out.println("Elija Opcion: ");
                Op_Absorcion = in.nextInt();
                    
                switch(Op_Absorcion){
                
                        case 1:
                            
                            //Para el primer Ataque.
                                                        
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 0.");                            
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*25)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*25)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*28)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*28)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Sec_Orbe() > Stats.getHabilidad_Secundaria()){
                                
                                Stats.setHabilidad_Sec_Orbe(0);     Stats.setHabilidad_Sec_Porc(0);
                                
                                Stats.setHabilidad_Sec_Orbe_2(0);   Stats.setHabilidad_Sec_Porc_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Absorción.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Absorción.");
                            }break;                           
                            
                        case 8: 
                            
                            break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe de escoger un orbe de Absorcion.");break;                                                                       
                            }
                
            }while(Op_Absorcion!=8);
            
        }
        
        public static void Hab_Deb_Sec(){
            
            int Op_Debilitamiento;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Debilitamiento prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");
                System.out.println("7. Quitar Orbe. ");
                System.out.println("8. Atras.");
                System.out.println("Elija Opcion: ");
                Op_Debilitamiento = in.nextInt();
                    
                switch(Op_Debilitamiento){
                
                        case 1:
                            
                            //Para el primer Ataque.
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*22)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*22)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*24)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*24)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Sec_Orbe() > Stats.getHabilidad_Secundaria()){
                                
                                Stats.setHabilidad_Sec_Orbe(0);     Stats.setHabilidad_Sec_Porc(0);
                                
                                Stats.setHabilidad_Sec_Orbe_2(0);   Stats.setHabilidad_Sec_Porc_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Debilitamiento.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Debilitamiento.");
                            }break;                            
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe de elegir un orbe de Debilitamiento.");break;
                                                                       
                            }
                
            }while(Op_Debilitamiento!=8);
        }
        
        public static void Hab_Esc_Sec(){
            
            int Op_Escudo;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Escudo prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");
                System.out.println("7. Quitar Orbe. ");
                System.out.println("8. Atras.");
                System.out.println("Elija Opcion: ");
                Op_Escudo = in.nextInt();
                    
                switch(Op_Escudo){
                
                        case 1:
                            
                            //Para el primer Ataque.
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());                            
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());                           
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());                            
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());                            
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*22)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*22)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());                            
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*24)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*24)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());                            
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Sec_Orbe() > Stats.getHabilidad_Secundaria()){
                                
                                Stats.setHabilidad_Sec_Orbe(0);     Stats.setHabilidad_Sec_Porc(0);
                                
                                Stats.setHabilidad_Sec_Orbe_2(0);   Stats.setHabilidad_Sec_Porc_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Escudo.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Escudo.");
                            }break;
                            
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, eliga un orbe de escudo.");break;
                                                                       
                            }                                    
            }while(Op_Escudo!=8);
        }
        
        public static void Hab_Forta_Sec(){
            
            int Op_Fortalecimiento;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Fortalecimiento prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");
                System.out.println("7. Quitar Orbe");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Fortalecimiento = in.nextInt();
                    
                switch(Op_Fortalecimiento){
                
                        case 1:
                            
                            //Para el primer Ataque.
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*22)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*22)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*24)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*24)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Sec_Orbe() > Stats.getHabilidad_Secundaria()){
                                
                                Stats.setHabilidad_Sec_Orbe(0);     Stats.setHabilidad_Sec_Porc(0);
                                
                                Stats.setHabilidad_Sec_Orbe_2(0);   Stats.setHabilidad_Sec_Porc_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Fortalecimiento.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Fortalecimiento.");
                            }break;
                            
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe de elegir un orbe de Fortalecimiento.");break;                                                                       
                            }
            }while(Op_Fortalecimiento!=8);
        }
        
        public static void Hab_Her_Sec(){
            
            int Op_Herida;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Herida prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");
                System.out.println("7. Quitar Orbe.");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Herida = in.nextInt();
                    
                switch(Op_Herida){
                
                        case 1:
                            
                            //Para el primer Ataque.
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*22)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*22)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*24)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*24)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Sec_Orbe() > Stats.getHabilidad_Secundaria()){
                                
                                Stats.setHabilidad_Sec_Orbe(0);     Stats.setHabilidad_Sec_Porc(0);
                                
                                Stats.setHabilidad_Sec_Orbe_2(0);   Stats.setHabilidad_Sec_Porc_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Herida.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Herida.");
                            }break;
                            
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe elegir un orbe de Herida.");break;                                                                       
                            }
            }while(Op_Herida!=8);
        }
        
        public static void Hab_Rep_Sec(){
            
            int Op_Respuesta;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Respuesta prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(17%). ");
                System.out.println("5. Nivel 4(18%). ");
                System.out.println("6. Nivel 5(19%). ");
                System.out.println("7. Quitar Orbe.");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Respuesta = in.nextInt();
                    
                switch(Op_Respuesta){
                
                        case 1:
                            
                            //Para el primer Ataque.
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*17)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*17)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*18)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*18)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Sec_Porc((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe(Stats.getHabilidad_Sec_Porc() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe_2(Stats.getHabilidad_Sec_Porc_2() + Stats.getHabilidad_Secundaria_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Sec_Orbe() > Stats.getHabilidad_Secundaria()){
                                
                                Stats.setHabilidad_Sec_Orbe(0);     Stats.setHabilidad_Sec_Porc(0);
                                
                                Stats.setHabilidad_Sec_Orbe_2(0);   Stats.setHabilidad_Sec_Porc_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Respuesta.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Respuesta.");
                            }break;
                        
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe elegir un orbe de Respuesta");break;
                                                                       
                            }
            }while(Op_Respuesta!=8);
        }
        //Para 2 casilla a partir de aqui:
        public static void Simulacion_3_Orbes(){
            
            int Op_Simulacion_3;
            
            do{            
                System.out.println("++ Orbes para 3 casillas ++");
                System.out.println("1. Orbe para la primera casilla. ");
                System.out.println("2. Orbe para la segunda casilla.");
                System.out.println("3. Orbe especial");
                System.out.println("4. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Simulacion_3 = in.nextInt();
                    
                switch(Op_Simulacion_3){
                
                        case 1:
                            
                           Eleccion_Orbes_1();break;
                           
                        case 2:
                            
                            Eleccion_Orbes_2();break;
                           
                        case 3:
                            
                            Eleccion_Especial();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta");              
                                                                       
                            }
                    
            }while(Op_Simulacion_3!=4);
        }
        
        public static void Eleccion_Orbes_2(){
            
            int Opc;
                        
            do{                
            System.out.println("*/*/*/*/* Eliga un Orbe para la segunda casilla */*/*/*/*/");    
            System.out.println("******************************************");
            System.out.println("1. De Estadistica. ");
            System.out.println("2. De Habilidad. ");
            System.out.println("3. Atras.");
            System.out.println("/////////////////////////////////////////");
            System.out.println("Por favor elija una opcion: ");
            Opc = in.nextInt();
            
            switch(Opc){
                
                case 1:
                    
                    System.out.println("");
                    
                    Orbe_Estadistica_2();break;
                    
                case 2:
                    
                    System.out.println("");                    
                    
                    Orbe_Habilidad_2();
                    
                    break;
                    
                case 3: 
                    
                    System.out.println("");break;
                    
                 default:
                            System.out.println("Opcion Incorrecta.");break;
            }                        
            }while(Opc!=3);
            
        }
        
        public static void Orbe_Estadistica_2(){
            
            int Op_Ob_Est;
            
            char Rpt = 0 ;
            
            do{
            
            System.out.println("*/*/*/*/* Eliga un Orbe */*/*/*/*/");
            System.out.println("******************************************");
            System.out.println("1. De Ataque. ");
            System.out.println("2. De Vida. ");
            System.out.println("3. Atras.");
            System.out.println("/////////////////////////////////////////");
            System.out.println("Por favor elija una opcion: ");
            Op_Ob_Est = in.nextInt();
            
            switch(Op_Ob_Est){
                
                case 1:
                    
                    if(Stats.getVida_Orbe_2()>=1 || Stats.getDaño_Orbe_1_2()>=1 || Stats.getHabilidad_Her_Orbe1_2()>=1 || Stats.getHabilidad_Sec_Orbe1_2()>=1){
                      
                        System.out.println("Tiene un orbe. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe_2(0); Stats.setDaño_Orbe_1_2(0); Stats.setDaño_Orbe_2_2(0); 
                                    Stats.setHabilidad_Her_Orbe1_2(0); Stats.setHabilidad_Her_Orbe2_2(0); 
                                    Stats.setDaño_1_Porcentaje_2(0);  Stats.setDaño_2_Porcentaje_2(0);  
                                    Stats.setPorc_Vida_2(0); Stats.setHabilidad_Her_Porc1_2(0); Stats.setHabilidad_Her_Porc2_2(0);
                                    Stats.setHabilidad_Sec_Porc1_2(0); Stats.setHabilidad_Sec_Porc2_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Orbe_Ataque_2();                 
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe_2()==0 || Stats.getDaño_Orbe_1_2() == 0 || Stats.getHabilidad_Her_Orbe1_2() == 0 || Stats.getHabilidad_Sec_Orbe1_2() ==0){
                                    Orbe_Ataque_2();
                                }break;                  
                                        
                case 2:
                    
                    if(Stats.getVida_Orbe_2()>=1 || Stats.getDaño_Orbe_1_2()>=1 || Stats.getHabilidad_Her_Orbe1_2()>=1 || Stats.getHabilidad_Sec_Orbe1_2()>=1){
                      
                        System.out.println("Tiene un orbe. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe_2(0); Stats.setDaño_Orbe_1_2(0); Stats.setDaño_Orbe_2_2(0); 
                                    Stats.setHabilidad_Her_Orbe1_2(0); Stats.setHabilidad_Her_Orbe2_2(0); 
                                    Stats.setDaño_1_Porcentaje_2(0);  Stats.setDaño_2_Porcentaje_2(0);  
                                    Stats.setPorc_Vida_2(0); Stats.setHabilidad_Her_Porc1_2(0); Stats.setHabilidad_Her_Porc2_2(0);
                                    Stats.setHabilidad_Sec_Porc1_2(0); Stats.setHabilidad_Sec_Porc2_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Orbe_Vida_2();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe_2()==0 || Stats.getDaño_Orbe_1_2() == 0 || Stats.getHabilidad_Her_Orbe1_2() == 0 || Stats.getHabilidad_Sec_Orbe1_2() ==0){
                                    Orbe_Vida_2();
                                }break;
                                
                case 3:
                    
                    break;
                    
                case 4:
                    
                    Mostrar_Stats_CM();
                    break;
                    
                default:
                            System.out.println("Opcion Incorrecta"); break; 
            }                        
            }while(Op_Ob_Est!=3);
        }
        //Colocar habilidad heredada_1_2 y 2_2
        public static void Orbe_Ataque_2(){
            
            int Op_Ataque;            
          
            do{            
                System.out.println("");
                System.out.println("/*/*/*/*/*Ataque*/*/*/*/*/*");
                System.out.println("++ Elija que Orbe de Ataque prefiere ++");
                System.out.println("1. Nivel 0(2%). ");
                System.out.println("2. Nivel 1(5%). ");
                System.out.println("3. Nivel 2(10%). ");
                System.out.println("4. Nivel 3(12%). ");
                System.out.println("5. Nivel 4(14%). ");
                System.out.println("6. Nivel 5(16%). ");
                System.out.println("7. Quitar Orbe. ");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Ataque = in.nextInt();
                    
                switch(Op_Ataque){
                
                        case 1:                           
                                                                                                               
                            //Para el primer Ataque.

                                Stats.setDaño_1_Porcentaje_2(((Stats.getDaño_1()*2)/100));                              
                                
                                Stats.setDaño_Orbe_1_2(Stats.getDaño_1() + Stats.getDaño_1_Porcentaje_2());

                                //Para el segundo Ataque.

                                Stats.setDaño_2_Porcentaje_2(((Stats.getDaño_2()*2)/100));

                                Stats.setDaño_Orbe_2_2(Stats.getDaño_2_Porcentaje_2() + Stats.getDaño_2());

                                System.out.println("Se coloco Ataque nivel 0.");break;
                            
                        case 2:
                            
                            Stats.setDaño_1_Porcentaje_2(((Stats.getDaño_1()*5)/100));                                
                                
                            Stats.setDaño_Orbe_1_2(Stats.getDaño_1() + Stats.getDaño_1_Porcentaje_2());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setDaño_2_Porcentaje_2(((Stats.getDaño_2()*5)/100));

                            Stats.setDaño_Orbe_2_2(Stats.getDaño_2_Porcentaje_2() + Stats.getDaño_2());
                                
                            System.out.println("Se coloco Ataque nivel 1.");break;
                            
                        case 3: 
                            
                            Stats.setDaño_1_Porcentaje_2(((Stats.getDaño_1()*10)/100));                                
                                
                            Stats.setDaño_Orbe_1_2(Stats.getDaño_1() + Stats.getDaño_1_Porcentaje_2());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setDaño_2_Porcentaje_2(((Stats.getDaño_2()*10)/100));

                            Stats.setDaño_Orbe_2_2(Stats.getDaño_2_Porcentaje_2() + Stats.getDaño_2());
                            
                            System.out.println("Se coloco Ataque nivel 2.");break;
                            
                        case 4:
                            
                            Stats.setDaño_1_Porcentaje_2(((Stats.getDaño_1()*12)/100));                                
                                

                            Stats.setDaño_Orbe_1_2(Stats.getDaño_1() + Stats.getDaño_1_Porcentaje_2());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setDaño_2_Porcentaje_2(((Stats.getDaño_2()*12)/100));

                            Stats.setDaño_Orbe_2_2(Stats.getDaño_2_Porcentaje_2() + Stats.getDaño_2());
                            
                            System.out.println("Se coloco Ataque nivel 3.");break;
                            
                        case 5:
                            
                            Stats.setDaño_1_Porcentaje_2(((Stats.getDaño_1()*14)/100));                                
                                

                            Stats.setDaño_Orbe_1_2(Stats.getDaño_1() + Stats.getDaño_1_Porcentaje_2());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setDaño_2_Porcentaje_2(((Stats.getDaño_2()*14)/100));

                            Stats.setDaño_Orbe_2_2(Stats.getDaño_2_Porcentaje_2() + Stats.getDaño_2());
                            
                            System.out.println("Se coloco Ataque nivel 4.");break;
                            
                        case 6: 
                            
                            Stats.setDaño_1_Porcentaje_2(((Stats.getDaño_1()*16)/100));                                
                                
                            Stats.setDaño_Orbe_1_2(Stats.getDaño_1() + Stats.getDaño_1_Porcentaje_2());
                            
                            Stats.setHab_Porc_Att_1((Stats.getHabilidad_Heredada_1()*2)/100);
                                
                            Stats.setHabilidad_Heredada_1(Stats.getHabilidad_Heredada_1() + Stats.getHab_Porc_Att_1());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setDaño_2_Porcentaje_2(((Stats.getDaño_2()*16)/100));

                            Stats.setDaño_Orbe_2_2(Stats.getDaño_2_Porcentaje_2() + Stats.getDaño_2());
                            
                            System.out.println("Se coloco Ataque nivel 5.");break;
                        
                        case 7: 
                            
                            if(Stats.getDaño_Orbe_1_2() > Stats.getDaño_1()){
                                
                                Stats.setDaño_Orbe_1_2(0);        Stats.setDaño_1_Porcentaje_2(0);           
                                
                                Stats.setDaño_Orbe_2_2(0);        Stats.setDaño_2_Porcentaje_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe.");
                            }break;
                            
                        case 8:
                            
                            break;
                            
                        default:
                            
                            System.out.println("Opcion Incorrecta, no ha elegido ningun orbe de ataque.");break;              
                                                                       
                            }
            }while(Op_Ataque!=8);
        }
        
        public static void Orbe_Vida_2(){
            
            int Op_Vida;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Vida prefiere ++");
                System.out.println("1. Nivel 0(5%). ");
                System.out.println("2. Nivel 1(10%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(20%). ");
                System.out.println("5. Nivel 4(25%). ");
                System.out.println("6. Nivel 5(30%). ");
                System.out.println("7. Eliminar Orbe. ");
                System.out.println("8. Atras.");
                System.out.println("Elija Opcion: ");
                Op_Vida = in.nextInt();
                    
                switch(Op_Vida){
                
                        case 1:
                                                        
                            Stats.setPorc_Vida_2((Stats.getVida()*5)/100);
                            
                            Stats.setVida_Orbe_2(Stats.getPorc_Vida_2() + Stats.getVida());
                            
                            System.out.println("Se coloco Vida nivel 0.");break;
                            
                        case 2:
                       
                            Stats.setPorc_Vida_2((Stats.getVida()*10)/100);
                            
                            Stats.setVida_Orbe_2(Stats.getPorc_Vida_2() + Stats.getVida());
                            
                            System.out.println("Se coloco Vida nivel 1.");break;
                            
                        case 3: 
                            
                            Stats.setPorc_Vida_2((Stats.getVida()*15)/100);
                            
                            Stats.setVida_Orbe_2(Stats.getPorc_Vida_2() + Stats.getVida());
                            
                            System.out.println("Se coloco Vida nivel 2.");break;                            
                            
                        case 4:
                            
                            Stats.setPorc_Vida_2((Stats.getVida()*20)/100);
                            
                            Stats.setVida_Orbe_2(Stats.getPorc_Vida_2() + Stats.getVida());
                            
                            System.out.println("Se coloco Vida nivel 3.");break;                            
                            
                        case 5:
                            
                            Stats.setPorc_Vida_2((Stats.getVida()*25)/100);
                            
                            Stats.setVida_Orbe_2(Stats.getPorc_Vida_2() + Stats.getVida());
                            
                            System.out.println("Se coloco Vida nivel 4.");break;                            
                            
                        case 6: 
                            
                            Stats.setPorc_Vida_2((Stats.getVida()*30)/100);
                            
                            Stats.setVida_Orbe_2(Stats.getPorc_Vida_2() + Stats.getVida());
                            
                            System.out.println("Se coloco Vida nivel 5.");break;                            
                        
                        case 7: 
                            
                            if(Stats.getVida_Orbe_2() > Stats.getVida()){
                                
                                Stats.setVida_Orbe_2(0); Stats.setPorc_Vida_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun orbe de Vida.");
                            }break;
                            
                        case 8:
                            
                            break;                                
                            
                        default:
                            System.out.println("Opcion Incorrecta, no ha elegido ningun orbe de vida.");break;      
                            
                            }   
                
                    }while(Op_Vida!=8);
        }
        
        public static void Orbe_Habilidad_2(){
            
            int Opc;            
          
            do{
                
            System.out.println("******************************************");
            System.out.println("1. Para Habilidad Primaria. ");
            System.out.println("2. Para Habilidad Secundaria. ");
            System.out.println("3. Atras.");
            System.out.println("/////////////////////////////////////////");
            System.out.println("Por favor elija una opcion: ");
            Opc = in.nextInt();
            
            switch(Opc){
                
                case 1:
                    
                    System.out.println("");
                    
                    Orbe_Habilidad_Heredada_2();break;
                    
                case 2:
                    
                    System.out.println("");
                    
                    Orbe_Habilidad_Secundaria_2();break;
                    
                case 3: 
                    
                    break;
                    
                case 4:
                    
                    Mostrar_Stats_CM();break;
                    
                default:
                            System.out.println("Opcion Incorrecta.");break;
            }                        
            }while(Opc!=3);
            
        }
        
        public static void Orbe_Habilidad_Heredada_2(){
            
            int Opc_Hab;
            
            char Rpt = 0 ;
            
                Opc_Hab = Stats.getNum_Hab();
                
            
            switch(Opc_Hab){
                
                case 1:
                    
                    if(Stats.getVida_Orbe_2()>=1 || Stats.getDaño_Orbe_1_2()>=1 || Stats.getHabilidad_Her_Orbe1_2()>=1 || Stats.getHabilidad_Sec_Orbe1_2()>=1){
                      
                        System.out.println("Tiene un orbe. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe_2(0); Stats.setDaño_Orbe_1_2(0); Stats.setDaño_Orbe_2_2(0); 
                                    Stats.setHabilidad_Her_Orbe1_2(0); Stats.setHabilidad_Her_Orbe2_2(0); 
                                    Stats.setDaño_1_Porcentaje_2(0);  Stats.setDaño_2_Porcentaje_2(0);  
                                    Stats.setPorc_Vida_2(0); Stats.setHabilidad_Her_Porc1_2(0); Stats.setHabilidad_Her_Porc2_2(0);
                                    Stats.setHabilidad_Sec_Porc1_2(0); Stats.setHabilidad_Sec_Porc2_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Abs_Pred_2();           
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe_2()==0 || Stats.getDaño_Orbe_1_2() == 0 || Stats.getHabilidad_Her_Orbe1_2() == 0 || Stats.getHabilidad_Sec_Orbe1_2() ==0){
                                    Hab_Abs_Pred_2();
                                }break; 
                                
                case 2:
                    
                    if(Stats.getVida_Orbe_2()>=1 || Stats.getDaño_Orbe_1_2()>=1 || Stats.getHabilidad_Her_Orbe1_2()>=1 || Stats.getHabilidad_Sec_Orbe1_2()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe_2(0); Stats.setDaño_Orbe_1_2(0); Stats.setDaño_Orbe_2_2(0); 
                                    Stats.setHabilidad_Her_Orbe1_2(0); Stats.setHabilidad_Her_Orbe2_2(0); 
                                    Stats.setDaño_1_Porcentaje_2(0);  Stats.setDaño_2_Porcentaje_2(0);  
                                    Stats.setPorc_Vida_2(0); Stats.setHabilidad_Her_Porc1_2(0); Stats.setHabilidad_Her_Porc2_2(0);
                                    Stats.setHabilidad_Sec_Porc1_2(0); Stats.setHabilidad_Sec_Porc2_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Deb_Pred_2();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe_2()==0 || Stats.getDaño_Orbe_1_2() == 0 || Stats.getHabilidad_Her_Orbe1_2() == 0 || Stats.getHabilidad_Sec_Orbe1_2() ==0){
                                    Hab_Deb_Pred_2();
                                }break;
                    
                case 3:
                    
                    if(Stats.getVida_Orbe_2()>=1 || Stats.getDaño_Orbe_1_2()>=1 || Stats.getHabilidad_Her_Orbe1_2()>=1 || Stats.getHabilidad_Sec_Orbe1_2()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe_2(0); Stats.setDaño_Orbe_1_2(0); Stats.setDaño_Orbe_2_2(0); 
                                    Stats.setHabilidad_Her_Orbe1_2(0); Stats.setHabilidad_Her_Orbe2_2(0); 
                                    Stats.setDaño_1_Porcentaje_2(0);  Stats.setDaño_2_Porcentaje_2(0);  
                                    Stats.setPorc_Vida_2(0); Stats.setHabilidad_Her_Porc1_2(0); Stats.setHabilidad_Her_Porc2_2(0);
                                    Stats.setHabilidad_Sec_Porc1_2(0); Stats.setHabilidad_Sec_Porc2_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Esc_Pred_2();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe_2()==0 || Stats.getDaño_Orbe_1_2() == 0 || Stats.getHabilidad_Her_Orbe1_2() == 0 || Stats.getHabilidad_Sec_Orbe1_2() ==0){
                                    Hab_Esc_Pred_2();
                                }break;
                    
                case 4:
                    
                    if(Stats.getVida_Orbe_2()>=1 || Stats.getDaño_Orbe_1_2()>=1 || Stats.getHabilidad_Her_Orbe1_2()>=1 || Stats.getHabilidad_Sec_Orbe1_2()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe_2(0); Stats.setDaño_Orbe_1_2(0); Stats.setDaño_Orbe_2_2(0); 
                                    Stats.setHabilidad_Her_Orbe1_2(0); Stats.setHabilidad_Her_Orbe2_2(0); 
                                    Stats.setDaño_1_Porcentaje_2(0);  Stats.setDaño_2_Porcentaje_2(0);  
                                    Stats.setPorc_Vida_2(0); Stats.setHabilidad_Her_Porc1_2(0); Stats.setHabilidad_Her_Porc2_2(0);
                                    Stats.setHabilidad_Sec_Porc1_2(0); Stats.setHabilidad_Sec_Porc2_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Forta_Pred_2();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe_2()==0 || Stats.getDaño_Orbe_1_2() == 0 || Stats.getHabilidad_Her_Orbe1_2() == 0 || Stats.getHabilidad_Sec_Orbe1_2() ==0){
                                    Hab_Forta_Pred_2();
                                }break;
                    
                case 5: 
                    
                    if(Stats.getVida_Orbe_2()>=1 || Stats.getDaño_Orbe_1_2()>=1 || Stats.getHabilidad_Her_Orbe1_2()>=1 || Stats.getHabilidad_Sec_Orbe1_2()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe_2(0); Stats.setDaño_Orbe_1_2(0); Stats.setDaño_Orbe_2_2(0); 
                                    Stats.setHabilidad_Her_Orbe1_2(0); Stats.setHabilidad_Her_Orbe2_2(0); 
                                    Stats.setDaño_1_Porcentaje_2(0);  Stats.setDaño_2_Porcentaje_2(0);  
                                    Stats.setPorc_Vida_2(0); Stats.setHabilidad_Her_Porc1_2(0); Stats.setHabilidad_Her_Porc2_2(0);
                                    Stats.setHabilidad_Sec_Porc1_2(0); Stats.setHabilidad_Sec_Porc2_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Her_Pred_2();   
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe_2()==0 || Stats.getDaño_Orbe_1_2() == 0 || Stats.getHabilidad_Her_Orbe1_2() == 0 || Stats.getHabilidad_Sec_Orbe1_2() ==0){
                                     Hab_Her_Pred_2();
                                }break;
                    
                case 6:
                    
                    if(Stats.getVida_Orbe_2()>=1 || Stats.getDaño_Orbe_1_2()>=1 || Stats.getHabilidad_Her_Orbe1_2()>=1 || Stats.getHabilidad_Sec_Orbe1_2()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe_2(0); Stats.setDaño_Orbe_1_2(0); Stats.setDaño_Orbe_2_2(0); 
                                    Stats.setHabilidad_Her_Orbe1_2(0); Stats.setHabilidad_Her_Orbe2_2(0); 
                                    Stats.setDaño_1_Porcentaje_2(0);  Stats.setDaño_2_Porcentaje_2(0);  
                                    Stats.setPorc_Vida_2(0); Stats.setHabilidad_Her_Porc1_2(0); Stats.setHabilidad_Her_Porc2_2(0);
                                    Stats.setHabilidad_Sec_Porc1_2(0); Stats.setHabilidad_Sec_Porc2_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Res_Pred_2();  
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe_2()==0 || Stats.getDaño_Orbe_1_2() == 0 || Stats.getHabilidad_Her_Orbe1_2() == 0 || Stats.getHabilidad_Sec_Orbe1_2() ==0){
                                     Hab_Res_Pred_2();
                                }break;
            }            
        }
        
        public static void Hab_Abs_Pred_2(){
            
            int Op_Absorcion;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Absorción prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(25%). ");
                System.out.println("6. Nivel 5(28%). ");
                System.out.println("7. Quitar Orbe. ");
                System.out.println("8. Atras.");
                System.out.println("Elija Opcion: ");
                Op_Absorcion = in.nextInt();
                    
                switch(Op_Absorcion){
                
                        case 1:
                            
                            //Para el primer Ataque.
                                                        
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 0.");                            
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*25)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*25)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*28)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc_2((Stats.getDaño_2()*28)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Her_Orbe1_2() > Stats.getHabilidad_Heredada_1()){
                                
                                Stats.setHabilidad_Her_Orbe1_2(0);     Stats.setHabilidad_Her_Porc1_2(0);
                                
                                Stats.setHabilidad_Her_Orbe2_2(0);   Stats.setHabilidad_Her_Porc_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Absorción.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Absorción.");
                            }break;                           
                            
                        case 8: 
                            
                            break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe de escoger un orbe de Absorcion.");break;                                                                       
                            }
                
            }while(Op_Absorcion!=8);
            
        }
        
        public static void Hab_Deb_Pred_2(){
            
            int Op_Debilitamiento;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Debilitamiento prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");
                System.out.println("7. Quitar Orbe. ");
                System.out.println("8. Atras.");
                System.out.println("Elija Opcion: ");
                Op_Debilitamiento = in.nextInt();
                    
                switch(Op_Debilitamiento){
                
                        case 1:
                            
                            //Para el primer Ataque.
                                                        
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*22)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*22)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*24)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*24)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Her_Orbe1_2() > Stats.getHabilidad_Heredada_1()){
                                
                                Stats.setHabilidad_Her_Orbe1_2(0);     Stats.setHabilidad_Her_Porc1_2(0);
                                
                                Stats.setHabilidad_Her_Orbe2_2(0);   Stats.setHabilidad_Her_Porc2_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Debilitamiento.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Debilitamiento.");
                            }break;                            
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe de elegir un orbe de Debilitamiento.");break;
                                                                       
                            }
                
            }while(Op_Debilitamiento!=8);
        }
        
        public static void Hab_Esc_Pred_2(){
            
            int Op_Escudo;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Escudo prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");
                System.out.println("7. Quitar Orbe. ");
                System.out.println("8. Atras.");
                System.out.println("Elija Opcion: ");
                Op_Escudo = in.nextInt();
                    
                switch(Op_Escudo){
                
                        case 1:
                            
                            //Para el primer Ataque.
                                                        
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());                         
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());                         
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());                         
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());                         
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*22)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*22)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());                         
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*24)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*24)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());                         
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Her_Orbe1_2() > Stats.getHabilidad_Heredada_1()){
                                
                                Stats.setHabilidad_Her_Orbe1_2(0);      Stats.setHabilidad_Her_Porc1_2(0);
                                
                                Stats.setHabilidad_Her_Orbe2_2(0);      Stats.setHabilidad_Her_Orbe2_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Escudo.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Escudo.");
                            }break;
                            
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, eliga un orbe de escudo.");break;
                                                                       
                            }                                    
            }while(Op_Escudo!=8);
        }
        
        public static void Hab_Forta_Pred_2(){
            
            int Op_Fortalecimiento;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Fortalecimiento prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");
                System.out.println("7. Quitar Orbe");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Fortalecimiento = in.nextInt();
                    
                switch(Op_Fortalecimiento){
                
                        case 1:
                            
                            //Para el primer Ataque.
                                                        
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*22)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*22)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*24)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*24)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Her_Orbe1_2() > Stats.getHabilidad_Heredada_1()){
                                
                                Stats.setHabilidad_Her_Orbe1_2(0);      Stats.setHabilidad_Her_Porc1_2(0);
                                
                                Stats.setHabilidad_Her_Orbe2_2(0);      Stats.setHabilidad_Her_Orbe2_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Fortalecimiento.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Fortalecimiento.");
                            }break;
                            
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe de elegir un orbe de Fortalecimiento.");break;                                                                       
                            }
            }while(Op_Fortalecimiento!=8);
        }
        
        public static void Hab_Her_Pred_2(){
            
            int Op_Herida;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Herida prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");
                System.out.println("7. Quitar Orbe.");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Herida = in.nextInt();
                    
                switch(Op_Herida){
                
                        case 1:
                            
                            //Para el primer Ataque.
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*22)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*22)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*24)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*24)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Her_Orbe1_2() > Stats.getHabilidad_Heredada_1()){
                                
                                Stats.setHabilidad_Her_Orbe1_2(0);      Stats.setHabilidad_Her_Porc1_2(0);
                                
                                Stats.setHabilidad_Her_Orbe2_2(0);      Stats.setHabilidad_Her_Orbe2_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Herida.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Herida.");
                            }break;
                            
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe elegir un orbe de Herida.");break;                                                                       
                            }
            }while(Op_Herida!=8);
        }
        
        public static void Hab_Res_Pred_2(){
            
            int Op_Respuesta;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Respuesta prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(17%). ");
                System.out.println("5. Nivel 4(18%). ");
                System.out.println("6. Nivel 5(19%). ");
                System.out.println("7. Quitar Orbe.");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Respuesta = in.nextInt();
                    
                switch(Op_Respuesta){
                
                        case 1:
                            
                            //Para el primer Ataque.
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*17)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*17)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*18)/100);
                            
                            Stats.setHabilidad_Her_Orbe1_2(Stats.getHabilidad_Her_Porc1_2() + Stats.getHabilidad_Heredada_1());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*18)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Her_Porc1_2((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe(Stats.getHabilidad_Her_Porc() + Stats.getHabilidad_Heredada_1()); 
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Her_Porc2_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Her_Orbe2_2(Stats.getHabilidad_Her_Porc_2() + Stats.getHabilidad_Heredada_2());
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Her_Orbe1_2() > Stats.getHabilidad_Heredada_1()){
                                
                                Stats.setHabilidad_Her_Orbe1_2(0);      Stats.setHabilidad_Her_Porc1_2(0);
                                
                                Stats.setHabilidad_Her_Orbe2_2(0);      Stats.setHabilidad_Her_Orbe2_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Respuesta.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Respuesta.");
                            }break;
                        
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe elegir un orbe de Respuesta");break;
                                                                       
                            }
            }while(Op_Respuesta!=8);
        }
        
        public static void Orbe_Habilidad_Secundaria_2(){
            
            int Opc_Hab_Sec;  char Rpt =0;
                        
                Opc_Hab_Sec = Stats.getNum_Hab_Sec();
                            
            switch(Opc_Hab_Sec){
                
               case 1:
                   
                   if(Stats.getVida_Orbe_2()>=1 || Stats.getDaño_Orbe_1_2()>=1 || Stats.getHabilidad_Her_Orbe1_2()>=1 || Stats.getHabilidad_Sec_Orbe1_2()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe_2(0); Stats.setDaño_Orbe_1_2(0); Stats.setDaño_Orbe_2_2(0); 
                                    Stats.setHabilidad_Her_Orbe1_2(0); Stats.setHabilidad_Her_Orbe2_2(0); 
                                    Stats.setDaño_1_Porcentaje_2(0);  Stats.setDaño_2_Porcentaje_2(0);  
                                    Stats.setPorc_Vida_2(0); Stats.setHabilidad_Her_Porc1_2(0); Stats.setHabilidad_Her_Porc2_2(0);
                                    Stats.setHabilidad_Sec_Porc1_2(0); Stats.setHabilidad_Sec_Porc2_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Abs_Sec_2();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe_2()==0 || Stats.getDaño_Orbe_1_2() == 0 || Stats.getHabilidad_Her_Orbe1_2() == 0 || Stats.getHabilidad_Sec_Orbe1_2() ==0){
                                    Hab_Abs_Sec_2();
                                }break;                    
                    
                case 2:
                    
                    if(Stats.getVida_Orbe_2()>=1 || Stats.getDaño_Orbe_1_2()>=1 || Stats.getHabilidad_Her_Orbe1_2()>=1 || Stats.getHabilidad_Sec_Orbe1_2()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe_2(0); Stats.setDaño_Orbe_1_2(0); Stats.setDaño_Orbe_2_2(0); 
                                    Stats.setHabilidad_Her_Orbe1_2(0); Stats.setHabilidad_Her_Orbe2_2(0); 
                                    Stats.setDaño_1_Porcentaje_2(0);  Stats.setDaño_2_Porcentaje_2(0);  
                                    Stats.setPorc_Vida_2(0); Stats.setHabilidad_Her_Porc1_2(0); Stats.setHabilidad_Her_Porc2_2(0);
                                    Stats.setHabilidad_Sec_Porc1_2(0); Stats.setHabilidad_Sec_Porc2_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Deb_Sec_2();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe_2()==0 || Stats.getDaño_Orbe_1_2() == 0 || Stats.getHabilidad_Her_Orbe1_2() == 0 || Stats.getHabilidad_Sec_Orbe1_2() ==0){
                                    Hab_Deb_Sec_2();
                                }break;
                    
                case 3:
                    
                    if(Stats.getVida_Orbe_2()>=1 || Stats.getDaño_Orbe_1_2()>=1 || Stats.getHabilidad_Her_Orbe1_2()>=1 || Stats.getHabilidad_Sec_Orbe1_2()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe_2(0); Stats.setDaño_Orbe_1_2(0); Stats.setDaño_Orbe_2_2(0); 
                                    Stats.setHabilidad_Her_Orbe1_2(0); Stats.setHabilidad_Her_Orbe2_2(0); 
                                    Stats.setDaño_1_Porcentaje_2(0);  Stats.setDaño_2_Porcentaje_2(0);  
                                    Stats.setPorc_Vida_2(0); Stats.setHabilidad_Her_Porc1_2(0); Stats.setHabilidad_Her_Porc2_2(0);
                                    Stats.setHabilidad_Sec_Porc1_2(0); Stats.setHabilidad_Sec_Porc2_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Esc_Sec_2();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe_2()==0 || Stats.getDaño_Orbe_1_2() == 0 || Stats.getHabilidad_Her_Orbe1_2() == 0 || Stats.getHabilidad_Sec_Orbe1_2() ==0){
                                    Hab_Esc_Sec_2();
                                }break;
                    
                case 4:
                    
                    if(Stats.getVida_Orbe_2()>=1 || Stats.getDaño_Orbe_1_2()>=1 || Stats.getHabilidad_Her_Orbe1_2()>=1 || Stats.getHabilidad_Sec_Orbe1_2()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe_2(0); Stats.setDaño_Orbe_1_2(0); Stats.setDaño_Orbe_2_2(0); 
                                    Stats.setHabilidad_Her_Orbe1_2(0); Stats.setHabilidad_Her_Orbe2_2(0); 
                                    Stats.setDaño_1_Porcentaje_2(0);  Stats.setDaño_2_Porcentaje_2(0);  
                                    Stats.setPorc_Vida_2(0); Stats.setHabilidad_Her_Porc1_2(0); Stats.setHabilidad_Her_Porc2_2(0);
                                    Stats.setHabilidad_Sec_Porc1_2(0); Stats.setHabilidad_Sec_Porc2_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Forta_Sec_2();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe_2()==0 || Stats.getDaño_Orbe_1_2() == 0 || Stats.getHabilidad_Her_Orbe1_2() == 0 || Stats.getHabilidad_Sec_Orbe1_2() ==0){
                                    Hab_Forta_Sec_2();
                                }break;
                    
                case 5: 
                    
                    if(Stats.getVida_Orbe_2()>=1 || Stats.getDaño_Orbe_1_2()>=1 || Stats.getHabilidad_Her_Orbe1_2()>=1 || Stats.getHabilidad_Sec_Orbe1_2()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe_2(0); Stats.setDaño_Orbe_1_2(0); Stats.setDaño_Orbe_2_2(0); 
                                    Stats.setHabilidad_Her_Orbe1_2(0); Stats.setHabilidad_Her_Orbe2_2(0); 
                                    Stats.setDaño_1_Porcentaje_2(0);  Stats.setDaño_2_Porcentaje_2(0);  
                                    Stats.setPorc_Vida_2(0); Stats.setHabilidad_Her_Porc1_2(0); Stats.setHabilidad_Her_Porc2_2(0);
                                    Stats.setHabilidad_Sec_Porc1_2(0); Stats.setHabilidad_Sec_Porc2_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Her_Sec_2();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe_2()==0 || Stats.getDaño_Orbe_1_2() == 0 || Stats.getHabilidad_Her_Orbe1_2() == 0 || Stats.getHabilidad_Sec_Orbe1_2() ==0){
                                    Hab_Her_Sec_2();
                                }break;
                    
                case 6:
                    
                    if(Stats.getVida_Orbe_2()>=1 || Stats.getDaño_Orbe_1_2()>=1 || Stats.getHabilidad_Her_Orbe1_2()>=1 || Stats.getHabilidad_Sec_Orbe1_2()>=1){
                      
                        System.out.println("Tiene un orbe en uso. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                    
                                    Stats.setVida_Orbe_2(0); Stats.setDaño_Orbe_1_2(0); Stats.setDaño_Orbe_2_2(0); 
                                    Stats.setHabilidad_Her_Orbe1_2(0); Stats.setHabilidad_Her_Orbe2_2(0); 
                                    Stats.setDaño_1_Porcentaje_2(0);  Stats.setDaño_2_Porcentaje_2(0);  
                                    Stats.setPorc_Vida_2(0); Stats.setHabilidad_Her_Porc1_2(0); Stats.setHabilidad_Her_Porc2_2(0);
                                    Stats.setHabilidad_Sec_Porc1_2(0); Stats.setHabilidad_Sec_Porc2_2(0);
                                    System.out.println("Eliminado.");                                                                                                         
                                    Hab_Rep_Sec_2();       
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getVida_Orbe_2()==0 || Stats.getDaño_Orbe_1_2() == 0 || Stats.getHabilidad_Her_Orbe1_2() == 0 || Stats.getHabilidad_Sec_Orbe1_2() ==0){
                                    Hab_Rep_Sec_2();
                                }break;
                                
                /*case 7:
                    
                    System.out.println("Tiene un Orbe de velocidad, no es posible añadir atributos adicionales. ERROR 405.");break;*/
                    
                default:
                    
                    System.out.println("No ha elegido ningun orbe de especial. ERROR 404.");break;
            }            
        }
        
        public static void Hab_Abs_Sec_2(){
            
            int Op_Absorcion;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Absorción prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(25%). ");
                System.out.println("6. Nivel 5(28%). ");
                System.out.println("7. Quitar Orbe. ");
                System.out.println("8. Atras.");
                System.out.println("Elija Opcion: ");
                Op_Absorcion = in.nextInt();
                    
                switch(Op_Absorcion){
                
                        case 1:
                            
                            //Para el primer Ataque.
                                                        
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 0.");                            
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*25)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*25)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*28)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*28)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());
                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Sec_Orbe1_2() > Stats.getHabilidad_Secundaria()){
                                
                                Stats.setHabilidad_Sec_Orbe1_2(0);     Stats.setHabilidad_Sec_Porc1_2(0);
                                
                                Stats.setHabilidad_Sec_Orbe2_2(0);   Stats.setHabilidad_Sec_Porc2_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Absorción.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Absorción.");
                            }break;                           
                            
                        case 8: 
                            
                            break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe de escoger un orbe de Absorcion.");break;                                                                       
                            }
                
            }while(Op_Absorcion!=8);
            
        }
        
        public static void Hab_Deb_Sec_2(){
            
            int Op_Debilitamiento;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Debilitamiento prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");
                System.out.println("7. Quitar Orbe. ");
                System.out.println("8. Atras.");
                System.out.println("Elija Opcion: ");
                Op_Debilitamiento = in.nextInt();
                    
                switch(Op_Debilitamiento){
                
                        case 1:
                            
                            //Para el primer Ataque.
                                                        
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*22)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*22)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*24)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*24)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Sec_Orbe1_2() > Stats.getHabilidad_Secundaria()){
                                
                                Stats.setHabilidad_Sec_Orbe1_2(0);     Stats.setHabilidad_Sec_Porc1_2(0);
                                
                                Stats.setHabilidad_Sec_Orbe2_2(0);   Stats.setHabilidad_Sec_Porc2_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Debilitamiento.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Debilitamiento.");
                            }break;                            
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe de elegir un orbe de Debilitamiento.");break;
                                                                       
                            }
                
            }while(Op_Debilitamiento!=8);
        }
        
        public static void Hab_Esc_Sec_2(){
            
            int Op_Escudo;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Escudo prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");
                System.out.println("7. Quitar Orbe. ");
                System.out.println("8. Atras.");
                System.out.println("Elija Opcion: ");
                Op_Escudo = in.nextInt();
                    
                switch(Op_Escudo){
                
                        case 1:
                            
                           //Para el primer Ataque.
                                                        
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());                          
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());                          
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());                          
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());                          
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*22)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*22)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());                          
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*24)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*24)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());                          
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Sec_Orbe1_2() > Stats.getHabilidad_Secundaria()){
                                
                                Stats.setHabilidad_Sec_Orbe1_2(0);     Stats.setHabilidad_Sec_Porc1_2(0);
                                
                                Stats.setHabilidad_Sec_Orbe2_2(0);   Stats.setHabilidad_Sec_Porc2_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Escudo.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Escudo.");
                            }break;
                            
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, eliga un orbe de escudo.");break;
                                                                       
                            }                                    
            }while(Op_Escudo!=8);
        }
        
        public static void Hab_Forta_Sec_2(){
            
            int Op_Fortalecimiento;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Fortalecimiento prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");
                System.out.println("7. Quitar Orbe");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Fortalecimiento = in.nextInt();
                    
                switch(Op_Fortalecimiento){
                
                        case 1:
                            
                            //Para el primer Ataque.
                                                        
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*22)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*22)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*24)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*24)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Sec_Orbe1_2() > Stats.getHabilidad_Secundaria()){
                                
                                Stats.setHabilidad_Sec_Orbe1_2(0);     Stats.setHabilidad_Sec_Porc1_2(0);
                                
                                Stats.setHabilidad_Sec_Orbe2_2(0);   Stats.setHabilidad_Sec_Porc2_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Fortalecimiento.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Fortalecimiento.");
                            }break;
                            
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe de elegir un orbe de Fortalecimiento.");break;                                                                       
                            }
            }while(Op_Fortalecimiento!=8);
        }
        
        public static void Hab_Her_Sec_2(){
            
            int Op_Herida;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Herida prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(19%). ");
                System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");
                System.out.println("7. Quitar Orbe.");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Herida = in.nextInt();
                    
                switch(Op_Herida){
                
                        case 1:
                            
                            //Para el primer Ataque.
                                                        
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*22)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*22)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*24)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*24)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Sec_Orbe1_2() > Stats.getHabilidad_Secundaria()){
                                
                                Stats.setHabilidad_Sec_Orbe1_2(0);     Stats.setHabilidad_Sec_Porc1_2(0);
                                
                                Stats.setHabilidad_Sec_Orbe2_2(0);   Stats.setHabilidad_Sec_Porc2_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Herida.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Herida.");
                            }break;
                            
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe elegir un orbe de Herida.");break;                                                                       
                            }
            }while(Op_Herida!=8);
        }
        
        public static void Hab_Rep_Sec_2(){
            
            int Op_Respuesta;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe de Respuesta prefiere ++");
                System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(15%). ");
                System.out.println("4. Nivel 3(17%). ");
                System.out.println("5. Nivel 4(18%). ");
                System.out.println("6. Nivel 5(19%). ");
                System.out.println("7. Quitar Orbe.");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Respuesta = in.nextInt();
                    
                switch(Op_Respuesta){
                
                        case 1:
                            
                            //Para el primer Ataque.
                                                        
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            //Para el segundo Ataque.
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*3)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 0.");
                            break;
                            
                        case 2:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            //////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*7)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*15)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*17)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*17)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*18)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*18)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            Stats.setHabilidad_Sec_Porc1_2((Stats.getDaño_1()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe1_2(Stats.getHabilidad_Sec_Porc1_2() + Stats.getHabilidad_Secundaria());
                            
                            ///////////////////////////////////////////////////////
                            
                            Stats.setHabilidad_Sec_Porc2_2((Stats.getDaño_2()*19)/100);
                            
                            Stats.setHabilidad_Sec_Orbe2_2(Stats.getHabilidad_Sec_Porc2_2() + Stats.getHabilidad_Secundaria());  
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 5.");
                            break;
                            
                        case 7:
                            
                            if(Stats.getHabilidad_Sec_Orbe1_2() > Stats.getHabilidad_Secundaria()){
                                
                                Stats.setHabilidad_Sec_Orbe1_2(0);     Stats.setHabilidad_Sec_Porc1_2(0);
                                
                                Stats.setHabilidad_Sec_Orbe2_2(0);   Stats.setHabilidad_Sec_Porc2_2(0);
                                
                                System.out.println("Se elimino satisfactoriamente el Orbe de Respuesta.");
                            }else{
                                System.out.println("El mutante: " + Stats.getNombre() + ". No posee ningun Orbe de Respuesta.");
                            }break;
                        
                        
                        case 8: 
                            
                            break;
                            
                        case 9:
                            
                            Mostrar_Stats_CM();break;
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe elegir un orbe de Respuesta");break;
                                                                       
                            }
            }while(Op_Respuesta!=8);
        }     
                
        //Orbes especiales a partir de aqui:         
        public static void Eleccion_Especial(){
            
            int Orb_Esp; char Rpt = 0 ;
            
            if(Stats.getNum_Hab()==1){
            
            do{
                System.out.println("");
                System.out.println("++ Elija que Orbe especial prefiere ++");
                System.out.println("1. Debilitamiento. ");
                System.out.println("2. Escudo. ");
                System.out.println("3. Fortalecimiento. ");
                System.out.println("4. Herida. ");
                System.out.println("5. Repuesta. ");
                //System.out.println("6. Velocidad. ");
                System.out.println("7. Atras. ");
                System.out.println("Elija Opcion: ");
                Orb_Esp = in.nextInt();
                
                switch(Orb_Esp){                                        
                        
                    case 1:     
                        
                         if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                            System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                     
                                    Hab_Deb_Esp();        
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Deb_Esp();
                                }break;
                        
                    case 2:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                       
                                    Hab_Esc_Esp();   
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Esc_Esp();
                                }break;
                        
                    case 3:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                          
                                    Hab_Forta_Esp();   
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Forta_Esp();
                                }break;
                        
                    case 4:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                          
                                    Hab_Her_Esp(); 
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Her_Esp();
                                }break;
                        
                    case 5:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                             
                                    Hab_Rep_Esp();  
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Rep_Esp();
                                }break;
                        
                    /*case 6:
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                       
                                    Hab_Velocidad_Esp();     
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Velocidad_Esp();
                                }break;            */            
                    case 7:                       
                        
                        break;
                        
                    case 8:
                        
                        Mostrar_Stats_CM();break;       
                        
                    default:
                        
                        System.out.println("Opción incorrecta. Error 404");break;
                                           
                }
                
            }while(Orb_Esp!=7); 
            }else if(Stats.getNum_Hab()==2){    
                
                do{
                System.out.println("");
                System.out.println("++ Elija que Orbe especial prefiere ++");
                System.out.println("1. Absorción. ");
                System.out.println("2. Escudo. ");
                System.out.println("3. Fortalecimiento. ");
                System.out.println("4. Herida. ");
                System.out.println("5. Repuesta. ");
                //System.out.println("6. Velocidad. ");
                System.out.println("7. Atras. ");
                System.out.println("Elija Opcion: ");
                Orb_Esp = in.nextInt();
                
                switch(Orb_Esp){
                    
                    case 1:
                        
                         if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 

                                System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                    + "¿Desea eliminarlo(S/N)?");                                
                                    Rpt = in.next().charAt(0);   

                                    }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                         
                                        Hab_Abs_Esp();   

                                    }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                        System.out.println("Error, no se puede tener 2 orbes especiales en un mismo espacio.");

                                    }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                        Hab_Abs_Esp();
                                    }break;
                    case 2:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                       
                                    Hab_Esc_Esp();   
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Esc_Esp();
                                }break;
                        
                    case 3:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                          
                                    Hab_Forta_Esp();   
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Forta_Esp();
                                }break;
                        
                    case 4:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                          
                                    Hab_Her_Esp(); 
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Her_Esp();
                                }break;
                        
                    case 5:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                             
                                    Hab_Rep_Esp();  
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Rep_Esp();
                                }break;
                        
                    /*case 6:
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                       
                                    Hab_Velocidad_Esp();     
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Velocidad_Esp();
                                }break;            */            
                    case 7:                       
                        
                        break;
                        
                    case 8:
                        
                        Mostrar_Stats_CM();break;       
                        
                    default:
                        
                        System.out.println("Opción incorrecta. Error 404");break;
                                           
                }
                
            }while(Orb_Esp!=7); 
                
            }else if(Stats.getNum_Hab()==3){
                
                do{
                System.out.println("");
                System.out.println("++ Elija que Orbe especial prefiere ++");
                System.out.println("1. Absorción. ");
                System.out.println("2. Debilitamiento. ");
                System.out.println("3. Fortalecimiento. ");
                System.out.println("4. Herida. ");
                System.out.println("5. Repuesta. ");
                //System.out.println("6. Velocidad. ");
                System.out.println("7. Atras. ");
                System.out.println("Elija Opcion: ");
                Orb_Esp = in.nextInt();
                
                switch(Orb_Esp){
                    
                    case 1:
                        
                         if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 

                                System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                    + "¿Desea eliminarlo(S/N)?");                                
                                    Rpt = in.next().charAt(0);   

                                    }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                         
                                        Hab_Abs_Esp();   

                                    }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                        System.out.println("Error, no se puede tener 2 orbes especiales en un mismo espacio.");

                                    }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                        Hab_Abs_Esp();
                                    }break;
                        
                    case 2:     
                        
                         if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                            System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                     
                                    Hab_Deb_Esp();        
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Deb_Esp();
                                }break;
                        
                    case 3:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                          
                                    Hab_Forta_Esp();   
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Forta_Esp();
                                }break;
                        
                    case 4:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                          
                                    Hab_Her_Esp(); 
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Her_Esp();
                                }break;
                        
                    case 5:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                             
                                    Hab_Rep_Esp();  
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Rep_Esp();
                                }break;
                        
                    /*case 6:
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                       
                                    Hab_Velocidad_Esp();     
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Velocidad_Esp();
                                }break;            */            
                    case 7:                       
                        
                        break;
                        
                    case 8:
                        
                        Mostrar_Stats_CM();break;       
                        
                    default:
                        
                        System.out.println("Opción incorrecta. Error 404");break;
                                           
                }
                
            }while(Orb_Esp!=7); 
                
            }else if(Stats.getNum_Hab()==4){
                
                do{
                System.out.println("");
                System.out.println("++ Elija que Orbe especial prefiere ++");
                System.out.println("1. Absorción. ");
                System.out.println("2. Debilitamiento. ");
                System.out.println("3. Escudo. ");
                System.out.println("4. Herida. ");
                System.out.println("5. Repuesta. ");
                //System.out.println("6. Velocidad. ");
                System.out.println("7. Atras. ");
                System.out.println("Elija Opcion: ");
                Orb_Esp = in.nextInt();
                
                switch(Orb_Esp){
                    
                    case 1:
                        
                         if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 

                                System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                    + "¿Desea eliminarlo(S/N)?");                                
                                    Rpt = in.next().charAt(0);   

                                    }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                         
                                        Hab_Abs_Esp();   

                                    }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                        System.out.println("Error, no se puede tener 2 orbes especiales en un mismo espacio.");

                                    }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                        Hab_Abs_Esp();
                                    }break;
                        
                    case 2:     
                        
                         if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                            System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                     
                                    Hab_Deb_Esp();        
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Deb_Esp();
                                }break;
                        
                    case 3:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                       
                                    Hab_Esc_Esp();   
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Esc_Esp();
                                }break;
                                            
                    case 4:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                          
                                    Hab_Her_Esp(); 
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Her_Esp();
                                }break;
                        
                    case 5:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                             
                                    Hab_Rep_Esp();  
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Rep_Esp();
                                }break;
                        
                    /*case 6:
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                       
                                    Hab_Velocidad_Esp();     
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Velocidad_Esp();
                                }break;            */            
                    case 7:                       
                        
                        break;
                        
                    case 8:
                        
                        Mostrar_Stats_CM();break;       
                        
                    default:
                        
                        System.out.println("Opción incorrecta. Error 404");break;                                           
                }
                
            }while(Orb_Esp!=7); 
                
            }else if(Stats.getNum_Hab()==5){
                
                do{
                System.out.println("");
                System.out.println("++ Elija que Orbe especial prefiere ++");
                System.out.println("1. Absorción. ");
                System.out.println("2. Debilitamiento. ");
                System.out.println("3. Escudo. ");
                System.out.println("4. Fortalecimiento. ");
                System.out.println("5. Repuesta. ");
                //System.out.println("6. Velocidad. ");
                System.out.println("7. Atras. ");
                System.out.println("Elija Opcion: ");
                Orb_Esp = in.nextInt();
                
                switch(Orb_Esp){
                    
                    case 1:
                        
                         if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 

                                System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                    + "¿Desea eliminarlo(S/N)?");                                
                                    Rpt = in.next().charAt(0);   

                                    }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                         
                                        Hab_Abs_Esp();   

                                    }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                        System.out.println("Error, no se puede tener 2 orbes especiales en un mismo espacio.");

                                    }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                        Hab_Abs_Esp();
                                    }break;
                        
                    case 2:     
                        
                         if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                            System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                     
                                    Hab_Deb_Esp();        
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Deb_Esp();
                                }break;
                        
                    case 3:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                       
                                    Hab_Esc_Esp();   
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Esc_Esp();
                                }break;
                        
                    case 4:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                          
                                    Hab_Forta_Esp();   
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Forta_Esp();
                                }break;                        
                    
                    case 5:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                             
                                    Hab_Rep_Esp();  
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Rep_Esp();
                                }break;
                        
                    /*case 6:
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                       
                                    Hab_Velocidad_Esp();     
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Velocidad_Esp();
                                }break;            */            
                    case 7:                       
                        
                        break;
                        
                    case 9:
                        
                        Mostrar_Stats_CM();break;       
                        
                    default:
                        
                        System.out.println("Opción incorrecta. Error 404");break;                                           
                }
                
            }while(Orb_Esp!=7); 
                
            }else if(Stats.getNum_Hab()==6){
                
                do{
                System.out.println("");
                System.out.println("++ Elija que Orbe especial prefiere ++");
                System.out.println("1. Absorción. ");
                System.out.println("2. Debilitamiento. ");
                System.out.println("3. Escudo. ");
                System.out.println("4. Fortalecimiento. ");
                System.out.println("5. Herida. ");
                //System.out.println("6. Velocidad. ");
                System.out.println("7. Atras. ");
                System.out.println("Elija Opcion: ");
                Orb_Esp = in.nextInt();
                
                switch(Orb_Esp){
                    
                    case 1:
                        
                         if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 

                                System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                    + "¿Desea eliminarlo(S/N)?");                                
                                    Rpt = in.next().charAt(0);   

                                    }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                         
                                        Hab_Abs_Esp();   

                                    }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                        System.out.println("Error, no se puede tener 2 orbes especiales en un mismo espacio.");

                                    }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                        Hab_Abs_Esp();
                                    }break;
                        
                    case 2:     
                        
                         if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                            System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                     
                                    Hab_Deb_Esp();        
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Deb_Esp();
                                }break;
                        
                    case 3:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                       
                                    Hab_Esc_Esp();   
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Esc_Esp();
                                }break;
                        
                    case 4:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                          
                                    Hab_Forta_Esp();   
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Forta_Esp();
                                }break;
                        
                    case 5:
                        
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                          
                                    Hab_Her_Esp(); 
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Her_Esp();
                                }break;
                        
                    /*case 6:
                        if(Stats.getHabilidad_Secundaria()>=1 || Stats.getVelocidad_Orbe()>=1){                 
                      
                         System.out.println("Tiene un orbe especial. Para continuar tiene que eliminarlo."
                                + "¿Desea eliminarlo(S/N)?");                                
                                Rpt = in.next().charAt(0);   
                                
                                 }if(Rpt == 'S' || Rpt == 's'){                                 
                                        Stats.setHabilidad_Secundaria(0); Stats.setHabilidad_Secundaria_2(0);
                                        Stats.setVelocidad_Orbe(0);
                                        System.out.println("Eliminado.");                                                                                                       
                                    Hab_Velocidad_Esp();     
                                    
                                }else if(Rpt == 'N' || Rpt == 'n'){                                   
                                    System.out.println("Error, no se puede tener 2 orbes en un mismo espacio.");
                                    
                                }else if(Stats.getHabilidad_Secundaria()== 0 || Stats.getVelocidad_Orbe()== 0){
                                    Hab_Velocidad_Esp();
                                }break;            */            
                    case 7:                       
                        
                        break;
                        
                    case 9:
                        
                        Mostrar_Stats_CM();break;       
                        
                    default:
                        
                        System.out.println("Opción incorrecta. Error 404");break;                                           
                }
                
            }while(Orb_Esp!=7); 
                
            }            
        }       
                    
        public static void Hab_Abs_Esp(){
            
            int Op_Abs_Sec; int Op_Abs_1_Sec, Op_Abs_2_Sec;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe Especial de Absorción prefiere ++");
                System.out.println("1. Nivel 0(2%). ");
                System.out.println("2. Nivel 1(5%). ");
                System.out.println("3. Nivel 2(14%). ");
                System.out.println("4. Nivel 3(22%). ");
                /*System.out.println("5. Nivel 4(??%). ");
                System.out.println("6. Nivel 5(??%). ");*/                
                System.out.println("7. Quitar Orbe. ");
                System.out.println("8. Atras.");
                System.out.println("Elija Opcion: ");
                Op_Abs_Sec = in.nextInt();
                    
                switch(Op_Abs_Sec){
                
                        case 1:
                                                        
                            //Para el primer Ataque.
                            if(Stats.getDaño_Orbe_1() == 0){     
                               
                                Op_Abs_1_Sec = ((Stats.getDaño_1()*2)/100);
                                Stats.setHabilidad_Secundaria(Op_Abs_1_Sec); 
                                Stats.setNum_Hab_Sec(1);       
                                
                            }else if(Stats.getDaño_Orbe_1() >0){
                                
                                Op_Abs_1_Sec = ((Stats.getDaño_Orbe_1()*2)/100);
                                Stats.setHabilidad_Secundaria(Op_Abs_1_Sec); 
                                Stats.setNum_Hab_Sec(1);
                            }
                            
                            //Se escoge el orbe que desee(en este caso nivel 0) y se graba para despues usarlo en la seccion de eleccion para secundarios
                                                     
                            //Para el segundo Ataque.
                            
                            if(Stats.getDaño_Orbe_2() == 0){     
                               
                                Op_Abs_2_Sec = ((Stats.getDaño_2()*2)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Abs_2_Sec); 
                                Stats.setNum_Hab_Sec(1);       
                                
                            }else if(Stats.getDaño_Orbe_2() >0){
                                
                                Op_Abs_2_Sec = ((Stats.getDaño_Orbe_2()*2)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Abs_2_Sec); 
                                Stats.setNum_Hab_Sec(1);
                            }                            
                            System.out.println("Eligio el Orbe Especial de Absorción Nivel 0.");                            
                            break;
                            
                        case 2:
                            
                           if(Stats.getDaño_Orbe_1() == 0){     
                               
                                Op_Abs_1_Sec = ((Stats.getDaño_1()*5)/100);
                                Stats.setHabilidad_Secundaria(Op_Abs_1_Sec); 
                                Stats.setNum_Hab_Sec(1);       
                                
                            }else if(Stats.getDaño_Orbe_1() >0){
                                
                                Op_Abs_1_Sec = ((Stats.getDaño_Orbe_1()*5)/100);
                                Stats.setHabilidad_Secundaria(Op_Abs_1_Sec); 
                                Stats.setNum_Hab_Sec(1);
                            }
                           
                            //////////////////////////////////////////////////////
                            
                            if(Stats.getDaño_Orbe_2() == 0){     
                               
                                Op_Abs_2_Sec = ((Stats.getDaño_2()*5)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Abs_2_Sec); 
                                Stats.setNum_Hab_Sec(1);       
                                
                            }else if(Stats.getDaño_Orbe_2() >0){
                                
                                Op_Abs_2_Sec = ((Stats.getDaño_Orbe_2()*5)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Abs_2_Sec); 
                                Stats.setNum_Hab_Sec(1);
                            }                                              
                            System.out.println("Eligio el Orbe Especial de Absorción Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            if(Stats.getDaño_Orbe_1() == 0){     
                               
                                Op_Abs_2_Sec = ((Stats.getDaño_1()*14)/100);
                                Stats.setHabilidad_Secundaria(Op_Abs_2_Sec); 
                                Stats.setNum_Hab_Sec(1);       
                                
                            }else if(Stats.getDaño_Orbe_1() >0){
                                
                                Op_Abs_2_Sec = ((Stats.getDaño_Orbe_1()*2)/100);
                                Stats.setHabilidad_Secundaria(Op_Abs_2_Sec); 
                                Stats.setNum_Hab_Sec(1);
                            }
                            
                            ///////////////////////////////////////////////////////
                            
                            if(Stats.getDaño_Orbe_2() == 0){     
                               
                                Op_Abs_2_Sec = ((Stats.getDaño_2()*14)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Abs_2_Sec); 
                                Stats.setNum_Hab_Sec(1);       
                                
                            }else if(Stats.getDaño_Orbe_2() >0){
                                
                                Op_Abs_2_Sec = ((Stats.getDaño_Orbe_2()*2)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Abs_2_Sec); 
                                Stats.setNum_Hab_Sec(1);
                            }                            
                            System.out.println("Eligio el Orbe Especial de Absorción Nivel 2.");
                            break;
                            
                        case 4:
                            
                            if(Stats.getDaño_Orbe_1() == 0){     
                               
                                Op_Abs_1_Sec = ((Stats.getDaño_1()*22)/100);
                                Stats.setHabilidad_Secundaria(Op_Abs_1_Sec); 
                                Stats.setNum_Hab_Sec(1);       
                                
                            }else if(Stats.getDaño_Orbe_1() >0){
                                
                                Op_Abs_1_Sec = ((Stats.getDaño_Orbe_1()*22)/100);
                                Stats.setHabilidad_Secundaria(Op_Abs_1_Sec); 
                                Stats.setNum_Hab_Sec(1);
                            }
                            
                            ///////////////////////////////////////////////////////
                            
                            if(Stats.getDaño_Orbe_2() == 0){     
                               
                                Op_Abs_2_Sec = ((Stats.getDaño_2()*22)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Abs_2_Sec); 
                                Stats.setNum_Hab_Sec(1);       
                                
                            }else if(Stats.getDaño_Orbe_2() >0){
                                
                                Op_Abs_2_Sec = ((Stats.getDaño_Orbe_2()*22)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Abs_2_Sec); 
                                Stats.setNum_Hab_Sec(1);
                            }                            
                            System.out.println("Eligio el Orbe Especial de Absorción Nivel 3.");
                            break;
                            
                        /*case 5:
                            
                            if(Stats.getDaño_Orbe_1() == 0){     
                               
                                Op_Abs_1_Sec = ((Stats.getDaño_1()*2)/100);
                                Stats.setHabilidad_Secundaria(Op_Abs_1_Sec); 
                                Stats.setNum_Hab_Sec(1);       
                                
                            }else if(Stats.getDaño_Orbe_1() >0){
                                
                                Op_Abs_1_Sec = ((Stats.getDaño_Orbe_1()*2)/100);
                                Stats.setHabilidad_Secundaria(Op_Abs_1_Sec); 
                                Stats.setNum_Hab_Sec(1);
                            }
                            
                            ///////////////////////////////////////////////////////
                            
                           if(Stats.getDaño_Orbe_2() == 0){     
                               
                                Op_Abs_2_Sec = ((Stats.getDaño_2()*2)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Abs_2_Sec); 
                                Stats.setNum_Hab_Sec(1);       
                                
                            }else if(Stats.getDaño_Orbe_2() >0){
                                
                                Op_Abs_2_Sec = ((Stats.getDaño_Orbe_2()*2)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Abs_2_Sec); 
                                Stats.setNum_Hab_Sec(1);
                            }                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 4.");
                            break;
                                                        
                        case 6: 
                            
                            if(Stats.getDaño_Orbe_1() == 0){     
                               
                                Op_Abs_1_Sec = ((Stats.getDaño_1()*2)/100);
                                Stats.setHabilidad_Secundaria(Op_Abs_1_Sec); 
                                Stats.setNum_Hab_Sec(1);       
                                
                            }else if(Stats.getDaño_Orbe_1() >0){
                                
                                Op_Abs_1_Sec = ((Stats.getDaño_Orbe_1()*2)/100);
                                Stats.setHabilidad_Secundaria(Op_Abs_1_Sec); 
                                Stats.setNum_Hab_Sec(1);
                            }
                            
                            ///////////////////////////////////////////////////////
                            
                            if(Stats.getDaño_Orbe_2() == 0){     
                               
                                Op_Abs_2_Sec = ((Stats.getDaño_2()*2)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Abs_2_Sec); 
                                Stats.setNum_Hab_Sec(1);       
                                
                            }else if(Stats.getDaño_Orbe_2() >0){
                                
                                Op_Abs_2_Sec = ((Stats.getDaño_Orbe_2()*2)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Abs_2_Sec); 
                                Stats.setNum_Hab_Sec(1);
                            }                            
                            System.out.println("Eligio el Orbe de Absorción Nivel 5.");
                            break;*/
                            
                        case 7: 
                            //si se eligio pero no es de su agrado pues al eliminar vuelve todo a la normalidad
                            Stats.setNum_Hab_Sec(0);
                            
                            Stats.setHabilidad_Secundaria(0);
                            
                            Stats.setHabilidad_Secundaria_2(0);
                            
                            System.out.println("Se quito el orbe especial de absorción.");break;
                            
                        case 8:
                            //Sino se eligio nada pues quedara en 0(Valor predeterminado)
                            break;                        
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe de escoger un orbe Especial de Absorción.");break;                                                                       
                            }
                
            }while(Op_Abs_Sec!=8);
        }
        
        public static void Hab_Deb_Esp(){
            
            int Op_Deb_Esp, Op_Deb_1_Sec, Op_Deb_2_Sec;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe Especial de Debilitamiento prefiere ++");
                //System.out.println("1. Nivel 0(¿?%). ");
                System.out.println("2. Nivel 1(7%). ");
                System.out.println("3. Nivel 2(13%). ");
                System.out.println("4. Nivel 3(20%). ");
                System.out.println("5. Nivel 4(26%). ");
                //System.out.println("6. Nivel 5(24%). ");
                System.out.println("7. Quitar Orbe.");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Deb_Esp = in.nextInt();
                    
                switch(Op_Deb_Esp){
                
                        case 1:
                            
                            /*//Para el primer Ataque.
                    
                            if(Stats.getDaño_Orbe_1() == 0){     
                               
                                Op_Deb_1_Sec = ((Stats.getDaño_1()*2)/100);
                                Stats.setHabilidad_Secundaria(Op_Deb_1_Sec); 
                                Stats.setNum_Hab_Sec(2);       
                                
                            }else if(Stats.getDaño_Orbe_1() >0){
                                
                                Op_Deb_1_Sec = ((Stats.getDaño_Orbe_1()*2)/100);
                                Stats.setHabilidad_Secundaria(Op_Deb_1_Sec); 
                                Stats.setNum_Hab_Sec(2);
                            }
                            
                            //Para el segundo Ataque.
                    
                            if(Stats.getDaño_Orbe_2() == 0){     
                               
                                Op_Deb_2_Sec = ((Stats.getDaño_2()*2)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Deb_2_Sec); 
                                Stats.setNum_Hab_Sec(2);       
                                
                            }else if(Stats.getDaño_Orbe_2() >0){
                                
                                Op_Deb_2_Sec = ((Stats.getDaño_Orbe_2()*2)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Deb_2_Sec); 
                                Stats.setNum_Hab_Sec(2);
                            }                                 
                            System.out.println("Eligio el Orbe Especial de Debilitamiento Nivel 0.");                            
                            break;*/
                            
                        case 2:
                            
                            if(Stats.getDaño_Orbe_1() == 0){     
                               
                                Op_Deb_1_Sec = ((Stats.getDaño_1()*7)/100);
                                Stats.setHabilidad_Secundaria(Op_Deb_1_Sec); 
                                Stats.setNum_Hab_Sec(2);       
                                
                            }else if(Stats.getDaño_Orbe_1() >0){
                                
                                Op_Deb_1_Sec = ((Stats.getDaño_Orbe_1()*7)/100);
                                Stats.setHabilidad_Secundaria(Op_Deb_1_Sec); 
                                Stats.setNum_Hab_Sec(2);
                            }
                            
                           //////////////////////////////////////////////////////
                            
                            if(Stats.getDaño_Orbe_2() == 0){     
                               
                                Op_Deb_2_Sec = ((Stats.getDaño_2()*7)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Deb_2_Sec); 
                                Stats.setNum_Hab_Sec(2);       
                                
                            }else if(Stats.getDaño_Orbe_2() >0){
                                
                                Op_Deb_2_Sec = ((Stats.getDaño_Orbe_2()*7)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Deb_2_Sec); 
                                Stats.setNum_Hab_Sec(2);
                            }
                            
                            System.out.println("Eligio el Orbe Especial de Debilitamiento Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            if(Stats.getDaño_Orbe_1() == 0){     
                               
                                Op_Deb_1_Sec = ((Stats.getDaño_1()*13)/100);
                                Stats.setHabilidad_Secundaria(Op_Deb_1_Sec); 
                                Stats.setNum_Hab_Sec(2);       
                                
                            }else if(Stats.getDaño_Orbe_1() >0){
                                
                                Op_Deb_1_Sec = ((Stats.getDaño_Orbe_1()*13)/100);
                                Stats.setHabilidad_Secundaria(Op_Deb_1_Sec); 
                                Stats.setNum_Hab_Sec(2);
                            }
                            
                            ///////////////////////////////////////////////////////
                            
                            if(Stats.getDaño_Orbe_2() == 0){     
                               
                                Op_Deb_2_Sec = ((Stats.getDaño_2()*13)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Deb_2_Sec); 
                                Stats.setNum_Hab_Sec(2);       
                                
                            }else if(Stats.getDaño_Orbe_2() >0){
                                
                                Op_Deb_2_Sec = ((Stats.getDaño_Orbe_2()*13)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Deb_2_Sec); 
                                Stats.setNum_Hab_Sec(2);
                            }
                            
                            System.out.println("Eligio el Orbe Especial de Debilitamiento Nivel 2.");
                            break;
                            
                        case 4:
                            
                            if(Stats.getDaño_Orbe_1() == 0){     
                               
                                Op_Deb_1_Sec = ((Stats.getDaño_1()*20)/100);
                                Stats.setHabilidad_Secundaria(Op_Deb_1_Sec); 
                                Stats.setNum_Hab_Sec(2);       
                                
                            }else if(Stats.getDaño_Orbe_1() >0){
                                
                                Op_Deb_1_Sec = ((Stats.getDaño_Orbe_1()*20)/100);
                                Stats.setHabilidad_Secundaria(Op_Deb_1_Sec); 
                                Stats.setNum_Hab_Sec(2);
                            }
                            
                            ///////////////////////////////////////////////////////
                            
                            if(Stats.getDaño_Orbe_2() == 0){     
                               
                                Op_Deb_2_Sec = ((Stats.getDaño_2()*20)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Deb_2_Sec); 
                                Stats.setNum_Hab_Sec(2);       
                                
                            }else if(Stats.getDaño_Orbe_2() >0){
                                
                                Op_Deb_2_Sec = ((Stats.getDaño_Orbe_2()*20)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Deb_2_Sec); 
                                Stats.setNum_Hab_Sec(2);
                            }
                            
                            System.out.println("Eligio el Orbe Especial de Debilitamiento Nivel 3.");
                            break;
                            
                        case 5:
                            
                            if(Stats.getDaño_Orbe_1() == 0){     
                               
                                Op_Deb_1_Sec = ((Stats.getDaño_1()*26)/100);
                                Stats.setHabilidad_Secundaria(Op_Deb_1_Sec); 
                                Stats.setNum_Hab_Sec(2);       
                                
                            }else if(Stats.getDaño_Orbe_1() >0){
                                
                                Op_Deb_1_Sec = ((Stats.getDaño_Orbe_1()*26)/100);
                                Stats.setHabilidad_Secundaria(Op_Deb_1_Sec); 
                                Stats.setNum_Hab_Sec(2);
                            }
                            
                            ///////////////////////////////////////////////////////
                            
                            if(Stats.getDaño_Orbe_2() == 0){     
                               
                                Op_Deb_2_Sec = ((Stats.getDaño_2()*26)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Deb_2_Sec); 
                                Stats.setNum_Hab_Sec(2);       
                                
                            }else if(Stats.getDaño_Orbe_2() >0){
                                
                                Op_Deb_2_Sec = ((Stats.getDaño_Orbe_2()*26)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Deb_2_Sec); 
                                Stats.setNum_Hab_Sec(2);
                            }
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 4.");break;
                                                        
                        /*case 6: 
                            
                            if(Stats.getDaño_Orbe_1() == 0){     
                               
                                Op_Deb_1_Sec = ((Stats.getDaño_1()*7)/100);
                                Stats.setHabilidad_Secundaria(Op_Deb_1_Sec); 
                                Stats.setNum_Hab_Sec(2);       
                                
                            }else if(Stats.getDaño_Orbe_1() >0){
                                
                                Op_Deb_1_Sec = ((Stats.getDaño_Orbe_1()*7)/100);
                                Stats.setHabilidad_Secundaria(Op_Deb_1_Sec); 
                                Stats.setNum_Hab_Sec(2);
                            }
                            
                            ///////////////////////////////////////////////////////
                            
                            if(Stats.getDaño_Orbe_2() == 0){     
                               
                                Op_Deb_2_Sec = ((Stats.getDaño_2()*2)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Deb_2_Sec); 
                                Stats.setNum_Hab_Sec(2);       
                                
                            }else if(Stats.getDaño_Orbe_2() >0){
                                
                                Op_Deb_2_Sec = ((Stats.getDaño_Orbe_2()*2)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Deb_2_Sec); 
                                Stats.setNum_Hab_Sec(2);
                            }
                            
                            System.out.println("Eligio el Orbe de Debilitamiento Nivel 5.");break;*/
                            
                        case 7: 
                            
                            Stats.setNum_Hab_Sec(0);
                            
                            Stats.setHabilidad_Secundaria(0);
                            
                            Stats.setHabilidad_Secundaria_2(0);
                            
                            System.out.println("Se quito el orbe especial de Debilitamiento.");break;
                            
                        case 8:
                            
                            break;                        
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe de escoger un orbe Especial de Debilitamiento.");break;                                                                       
                            }
                
            }while(Op_Deb_Esp!=8);
            
        }
        //Algunos no estan modificados dado que falta información del %
        public static void Hab_Esc_Esp(){
            
            int Op_Esc_Esp, Op_Esc_1_Sec, Op_Esc_2_Sec;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe Especial de Escudo prefiere ++");
                //System.out.println("1. Nivel 0(2%). ");
                System.out.println("2. Nivel 1(5%). ");
                System.out.println("3. Nivel 2(13%). ");
                System.out.println("4. Nivel 3(20%). ");
                /*System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");*/
                System.out.println("7. Quitar Orbe.");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Esc_Esp = in.nextInt();
                    
                switch(Op_Esc_Esp){
                
                        /*case 1:
                            
                            //Para el primer Ataque.
                            
                            Op_Esc_1_Sec = ((Stats.getDaño_1()*2)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Esc_1_Sec);
                    
                            Stats.setNum_Hab_Sec(3);
                            
                            //Para el segundo Ataque.
                            
                            Op_Esc_2_Sec = ((Stats.getDaño_2()*2)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Esc_2_Sec);
                            
                            System.out.println("Eligio el Orbe Especial de Escudo Nivel 0.");                            
                            break;*/
                            
                        case 2:
                           
                           if(Stats.getDaño_Orbe_1() == 0){     
                               
                                Op_Esc_1_Sec = ((Stats.getDaño_1()*5)/100);
                                Stats.setHabilidad_Secundaria(Op_Esc_1_Sec); 
                                Stats.setNum_Hab_Sec(3);       
                                
                            }else if(Stats.getDaño_Orbe_1() >0){
                                
                                Op_Esc_1_Sec = ((Stats.getDaño_Orbe_1()*5)/100);
                                Stats.setHabilidad_Secundaria(Op_Esc_1_Sec); 
                                Stats.setNum_Hab_Sec(3);
                            } 
                           
                            //////////////////////////////////////////////////////
                            
                           if(Stats.getDaño_Orbe_2() == 0){     
                               
                                Op_Esc_2_Sec = ((Stats.getDaño_2()*5)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Esc_2_Sec); 
                                Stats.setNum_Hab_Sec(3);       
                                
                            }else if(Stats.getDaño_Orbe_2() >0){
                                
                                Op_Esc_2_Sec = ((Stats.getDaño_Orbe_2()*5)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Esc_2_Sec); 
                                Stats.setNum_Hab_Sec(3);
                            }
                           
                           System.out.println("Eligio el Orbe Especial de Escudo Nivel 1.");
                           break;
                           
                        case 3: 
                            
                            if(Stats.getDaño_Orbe_1() == 0){     
                               
                                Op_Esc_1_Sec = ((Stats.getDaño_1()*13)/100);
                                Stats.setHabilidad_Secundaria(Op_Esc_1_Sec); 
                                Stats.setNum_Hab_Sec(3);       
                                
                            }else if(Stats.getDaño_Orbe_1() >0){
                                
                                Op_Esc_1_Sec = ((Stats.getDaño_Orbe_1()*13)/100);
                                Stats.setHabilidad_Secundaria(Op_Esc_1_Sec); 
                                Stats.setNum_Hab_Sec(3);
                            } 
                           
                            //////////////////////////////////////////////////////
                            
                           if(Stats.getDaño_Orbe_2() == 0){     
                               
                                Op_Esc_2_Sec = ((Stats.getDaño_2()*13)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Esc_2_Sec); 
                                Stats.setNum_Hab_Sec(3);       
                                
                            }else if(Stats.getDaño_Orbe_2() >0){
                                
                                Op_Esc_2_Sec = ((Stats.getDaño_Orbe_2()*13)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Esc_2_Sec); 
                                Stats.setNum_Hab_Sec(3);
                            }
                           
                           System.out.println("Eligio el Orbe Especial de Escudo Nivel 2.");
                           break;
                            
                        case 4:
                            
                            if(Stats.getDaño_Orbe_1() == 0){     
                               
                                Op_Esc_1_Sec = ((Stats.getDaño_1()*20)/100);
                                Stats.setHabilidad_Secundaria(Op_Esc_1_Sec); 
                                Stats.setNum_Hab_Sec(3);       
                                
                            }else if(Stats.getDaño_Orbe_1() >0){
                                
                                Op_Esc_1_Sec = ((Stats.getDaño_Orbe_1()*20)/100);
                                Stats.setHabilidad_Secundaria(Op_Esc_1_Sec); 
                                Stats.setNum_Hab_Sec(3);
                            } 
                           
                            //////////////////////////////////////////////////////
                            
                           if(Stats.getDaño_Orbe_2() == 0){     
                               
                                Op_Esc_2_Sec = ((Stats.getDaño_2()*20)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Esc_2_Sec); 
                                Stats.setNum_Hab_Sec(3);       
                                
                            }else if(Stats.getDaño_Orbe_2() >0){
                                
                                Op_Esc_2_Sec = ((Stats.getDaño_Orbe_2()*20)/100);
                                Stats.setHabilidad_Secundaria_2(Op_Esc_2_Sec); 
                                Stats.setNum_Hab_Sec(3);
                            }
                           
                           System.out.println("Eligio el Orbe Especial de Escudo Nivel 3.");
                           break;
                            
                        /*case 5:
                            
                            Op_Esc_1_Sec = ((Stats.getDaño_1()*25)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Esc_1_Sec);
                            
                            Stats.setNum_Hab_Sec(3);
                            
                            ///////////////////////////////////////////////////////
                            
                            Op_Esc_2_Sec = ((Stats.getDaño_2()*25)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Esc_2_Sec);
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 4.");break;
                                                        
                        case 6: 
                            
                            Op_Esc_1_Sec = ((Stats.getDaño_1()*28)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Esc_1_Sec);
                            
                            Stats.setNum_Hab_Sec(3);
                            
                            ///////////////////////////////////////////////////////
                            
                            Op_Esc_2_Sec = ((Stats.getDaño_2()*28)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Esc_2_Sec);
                            
                            System.out.println("Eligio el Orbe de Escudo Nivel 5.");break;*/
                         
                        case 7: 
                            
                            Stats.setNum_Hab_Sec(0);
                            
                            Stats.setHabilidad_Secundaria(0);
                            
                            Stats.setHabilidad_Secundaria_2(0);
                            
                            System.out.println("Se quito el orbe especial de Escudo.");break;
                            
                        case 8:
                            
                            break;                       
                                                        
                        default:
                            System.out.println("Opcion Incorrecta, debe de escoger un orbe Especial de Escudo.");break;      
                            
                            }
            }while(Op_Esc_Esp!=8);
        }
        //copiar y pegar los if luego testear 6/01/2021
        public static void Hab_Forta_Esp(){
            
            int Op_Forta_Esp, Op_Forta_1_Sec, Op_Forta_2_Sec;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe especial de Fortaleciento que prefiere ++");
                //System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(5%). ");
                System.out.println("3. Nivel 2(13%). ");
                System.out.println("4. Nivel 3(20%). ");
                /*System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");*/
                System.out.println("7. Quitar Orbe.");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Forta_Esp = in.nextInt();
                    
                switch(Op_Forta_Esp){
                
                        /*case 1:
                            
                            //Para el primer Ataque.
                            
                            Op_Forta_1_Sec = ((Stats.getDaño_1()*2)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Forta_1_Sec);
                    
                            Stats.setNum_Hab_Sec(4);
                            
                            //Para el segundo Ataque.
                            
                            Op_Forta_2_Sec = ((Stats.getDaño_2()*2)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Forta_2_Sec);
                            
                            System.out.println("Eligio el Orbe Especial de Fortaleciento Nivel 0.");                            
                            break;
                            */
                        case 2:
                            
                            Op_Forta_1_Sec = ((Stats.getDaño_1()*5)/100);
                            
                           Stats.setHabilidad_Secundaria(Op_Forta_1_Sec);
                           
                           Stats.setNum_Hab_Sec(4);
                            
                            //////////////////////////////////////////////////////
                            
                            Op_Forta_2_Sec = ((Stats.getDaño_2()*5)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Forta_2_Sec);
                            
                            System.out.println("Eligio el Orbe Especial de Fortaleciento Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Op_Forta_1_Sec = ((Stats.getDaño_1()*13)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Forta_1_Sec);
                            
                            Stats.setNum_Hab_Sec(4);
                            
                            ///////////////////////////////////////////////////////
                            
                            Op_Forta_2_Sec = ((Stats.getDaño_2()*13)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Forta_2_Sec);
                            
                            System.out.println("Eligio el Orbe Especial de Fortaleciento Nivel 2.");
                            break;
                            //Crear una condicional en cada orbe que detecte si el daño base es modificado y si es así la habilidad lo detecte y utilice el daño moficicado
                        case 4:
                                                        
                            Op_Forta_1_Sec = ((Stats.getDaño_1()*20)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Forta_1_Sec);
                            
                            Stats.setNum_Hab_Sec(4);
                            
                            ///////////////////////////////////////////////////////
                            
                            Op_Forta_2_Sec = ((Stats.getDaño_2()*20)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Forta_2_Sec);
                            
                            System.out.println("Eligio el Orbe Especial de Fortaleciento Nivel 3.");
                            break;
                            
                        /*case 5:
                            
                            Op_Forta_1_Sec = ((Stats.getDaño_1()*25)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Forta_1_Sec);
                            
                            Stats.setNum_Hab_Sec(4);
                            
                            ///////////////////////////////////////////////////////
                            
                            Op_Forta_2_Sec = ((Stats.getDaño_2()*25)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Forta_2_Sec);
                            
                            System.out.println("Eligio el Orbe de Fortalecimiento Nivel 4.");break;
                                                        
                        case 6: 
                            
                            Op_Forta_1_Sec = ((Stats.getDaño_1()*28)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Forta_1_Sec);
                            
                            Stats.setNum_Hab_Sec(4);
                            
                            ///////////////////////////////////////////////////////
                            
                            Op_Esc_2_Sec = ((Stats.getDaño_2()*28)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Forta_2_Sec);
                            
                            System.out.println("Eligio el Orbe de Fortalemiento Nivel 5.");break;*/
                            
                        case 7: 
                            
                            Stats.setNum_Hab_Sec(0);
                            
                            Stats.setHabilidad_Secundaria(0);
                            
                            Stats.setHabilidad_Secundaria_2(0);
                            
                            System.out.println("Se quito el orbe especial de Fortalecimiento.");break;
                            
                        case 8:
                            
                            break;        
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe de escoger un orbe Especial de Fortalecimiento.");break;                                                                       
                            }
            }while(Op_Forta_Esp!=8);
        }   
        
        public static void Hab_Her_Esp(){
            
            int Op_Her_Sec, Op_Her_1_Sec, Op_Her_2_Sec;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe Especial de Herida prefiere ++");
                /*System.out.println("1. Nivel 0(3%). ");
                System.out.println("2. Nivel 1(7%). ");*/
                System.out.println("3. Nivel 2(13%). ");
                System.out.println("4. Nivel 3(20%). ");
                /*System.out.println("5. Nivel 4(22%). ");
                System.out.println("6. Nivel 5(24%). ");*/
                System.out.println("7. Quitar Orbe.");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Her_Sec = in.nextInt();
                    
                switch(Op_Her_Sec){
                
                        /*case 1:
                            
                            //Para el primer Ataque.
                            
                            Op_Her_1_Sec = ((Stats.getDaño_1()*2)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Her_1_Sec);
                    
                            Stats.setNum_Hab_Sec(5);
                            
                            //Para el segundo Ataque.
                            
                            Op_Her_2_Sec = ((Stats.getDaño_2()*2)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Her_2_Sec);
                            
                            System.out.println("Eligio el Orbe Especial de Herida Nivel 0.");                            
                            break;
                            
                        case 2:
                            
                            Op_Her_1_Sec = ((Stats.getDaño_1()*5)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Her_1_Sec);
                    
                            Stats.setNum_Hab_Sec(5);
                            
                            //////////////////////////////////////////////////////
                            
                            Op_Her_2_Sec = ((Stats.getDaño_2()*5)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Her_2_Sec);
                            
                            System.out.println("Eligio el Orbe Especial de Herida Nivel 1.");
                            break;*/
                            
                        case 3: 
                            
                            Op_Her_1_Sec = ((Stats.getDaño_1()*13)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Her_1_Sec);
                            
                            Stats.setNum_Hab_Sec(5);
                            
                            ///////////////////////////////////////////////////////
                            
                            Op_Her_2_Sec = ((Stats.getDaño_2()*13)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Her_2_Sec);
                            
                            System.out.println("Eligio el Orbe Especial de Herida Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Op_Her_1_Sec = ((Stats.getDaño_1()*20)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Her_1_Sec);
                            
                            Stats.setNum_Hab_Sec(5);
                            
                            ///////////////////////////////////////////////////////
                            
                            Op_Her_2_Sec = ((Stats.getDaño_2()*20)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Her_2_Sec);
                            
                            System.out.println("Eligio el Orbe Especial de Herida Nivel 3.");
                            break;
                            
                        /*case 5:
                            
                            Op_Her_1_Sec = ((Stats.getDaño_1()*25)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Her_1_Sec);
                            
                            Stats.setNum_Hab_Sec(5);
                            
                            ///////////////////////////////////////////////////////
                            
                            Op_Her_2_Sec = ((Stats.getDaño_2()*25)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Her_2_Sec);
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 4.");break;
                                                        
                        case 6: 
                            
                            Op_Her_1_Sec = ((Stats.getDaño_1()*28)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Her_1_Sec);
                            
                            Stats.setNum_Hab_Sec(5);
                            
                            ///////////////////////////////////////////////////////
                            
                            Op_Her_2_Sec = ((Stats.getDaño_2()*28)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Her_2_Sec);
                            
                            System.out.println("Eligio el Orbe de Herida Nivel 5.");break;*/
                            
                        case 7: 
                            
                            Stats.setNum_Hab_Sec(0);
                            
                            Stats.setHabilidad_Secundaria(0);
                            
                            Stats.setHabilidad_Secundaria_2(0);
                            
                            System.out.println("Se quito el orbe especial de Herida.");break;
                            
                        case 8:
                            
                            break;        
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe de escoger un orbe Especial de Herida.");break;                                                                       
                            }
            }while(Op_Her_Sec!=8);
        }
        
        public static void Hab_Rep_Esp(){
            
            int Op_Resp_Sec, Op_Res_1_Sec, Op_Res_2_Sec;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe Especial de Respuesta prefiere ++");
                System.out.println("1. Nivel 0(1%). ");
                System.out.println("2. Nivel 1(2%). ");
                System.out.println("3. Nivel 2(5%). ");
                System.out.println("4. Nivel 3(13%). ");
                System.out.println("5. Nivel 4(20%). ");
                //System.out.println("6. Nivel 5(19%). ");
                System.out.println("7. Quitar Orbe.");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Resp_Sec = in.nextInt();
                    
                switch(Op_Resp_Sec){
                
                        case 1:
                            
                            //Para el primer Ataque.
                            
                            Op_Res_1_Sec = ((Stats.getDaño_1()*1)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Res_1_Sec);
                            
                            Stats.setNum_Hab_Sec(6);
                            
                            //Para el segundo Ataque.
                            
                            Op_Res_2_Sec = ((Stats.getDaño_2()*1)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Res_2_Sec);
                            
                            System.out.println("Eligio el Orbe Especial de Respuesta Nivel 0.");                            
                            break;
                            
                        case 2:
                            
                            Op_Res_1_Sec = ((Stats.getDaño_1()*2)/100);
                            
                           Stats.setHabilidad_Secundaria(Op_Res_1_Sec);
                            
                           Stats.setNum_Hab_Sec(0);
                           
                            //////////////////////////////////////////////////////
                            
                            Op_Res_2_Sec = ((Stats.getDaño_2()*2)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Res_2_Sec);
                            
                            System.out.println("Eligio el Orbe Especial de Respuesta Nivel 1.");
                            break;
                            
                        case 3: 
                            
                            Op_Res_1_Sec = ((Stats.getDaño_1()*5)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Res_1_Sec);
                            
                            Stats.setNum_Hab_Sec(0);
                            
                            ///////////////////////////////////////////////////////
                            
                            Op_Res_2_Sec = ((Stats.getDaño_2()*5)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Res_2_Sec);
                            
                            System.out.println("Eligio el Orbe Especial de Respuesta Nivel 2.");
                            break;
                            
                        case 4:
                            
                            Op_Res_1_Sec = ((Stats.getDaño_1()*13)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Res_1_Sec);
                            
                            Stats.setNum_Hab_Sec(0);
                            
                            ///////////////////////////////////////////////////////
                            
                            Op_Res_2_Sec = ((Stats.getDaño_2()*13)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Res_2_Sec);
                            
                            System.out.println("Eligio el Orbe Especial de Respuesta Nivel 3.");
                            break;
                            
                        case 5:
                            
                            Op_Res_1_Sec = ((Stats.getDaño_1()*20)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Res_1_Sec);
                            
                            Stats.setNum_Hab_Sec(0);
                            
                            ///////////////////////////////////////////////////////
                            
                            Op_Res_2_Sec = ((Stats.getDaño_2()*20)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Res_2_Sec);
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 4.");break;
                                                        
                        /*case 6: 
                            
                            Op_Res_1_Sec = ((Stats.getDaño_1()*28)/100);
                            
                            Stats.setHabilidad_Secundaria(Op_Res_1_Sec);
                            
                            Stats.setNum_Hab_Sec(0);
                            
                            ///////////////////////////////////////////////////////
                            
                            Op_Res_2_Sec = ((Stats.getDaño_2()*28)/100);
                            
                            Stats.setHabilidad_Secundaria_2(Op_Res_2_Sec);
                            
                            System.out.println("Eligio el Orbe de Respuesta Nivel 5.");break;*/
                            
                        case 7: 
                            
                            Stats.setNum_Hab_Sec(0);
                            
                            Stats.setHabilidad_Secundaria(0);
                            
                            Stats.setHabilidad_Secundaria_2(0);
                            
                            System.out.println("Se quito el orbe especial de Herida.");break;
                            
                        case 8:
                            
                            break;        
                            
                        default:
                            System.out.println("Opcion Incorrecta, debe de escoger un orbe Especial de Respuesta.");break;                                                                       
                            }
            }while(Op_Resp_Sec!=8);
            
        }
        
        public static void Hab_Velocidad_Esp(){
            
            int Op_Vel; double Orb_Vel;
            
            do{            
                System.out.println("");
                System.out.println("++ Elija que Orbe Especial de Velocidad prefiere ++");
                System.out.println("1. Nivel 0(2%). ");
                System.out.println("2. Nivel 1(5%). ");
                System.out.println("3. Nivel 2(10%). ");
                System.out.println("4. Nivel 3(15%). ");
                System.out.println("5. Nivel 4(18%). ");
                //System.out.println("6. Nivel 5(??%). ");
                System.out.println("7. Quitar Orbe.");
                System.out.println("8. Atras. ");
                System.out.println("Elija Opcion: ");
                Op_Vel = in.nextInt();
                    
                switch(Op_Vel){
                
                        case 1:
                            
                            Orb_Vel = ((Stats.getVelocidad()*2)/100);                            
                            Stats.setVelocidad_Orbe(Orb_Vel);      
                            System.out.println("Eligio el Orbe Especial de Velocidad Nivel 0.");
                            Stats.setNum_Hab_Sec(7);
                            break;
                            
                        case 2:
                            
                            Orb_Vel = ((Stats.getVelocidad()*5)/100);                            
                            Stats.setVelocidad_Orbe(Orb_Vel);         
                            System.out.println("Eligio el Orbe Especial de Velocidad Nivel 1.");
                            Stats.setNum_Hab_Sec(7);
                            break;
                            
                        case 3: 
                            
                            Orb_Vel = ((Stats.getVelocidad()*10)/100);                            
                            Stats.setVelocidad_Orbe(Orb_Vel);            
                            System.out.println("Eligio el Orbe Especial de Velocidad Nivel 2.");
                            Stats.setNum_Hab_Sec(7);
                            break;
                            
                        case 4:
                            
                            Orb_Vel = ((Stats.getVelocidad()*15)/100);                            
                            Stats.setVelocidad_Orbe(Orb_Vel);                            
                            System.out.println("Eligio el Orbe Especial de Velocidad Nivel 3.");
                            Stats.setNum_Hab_Sec(7);
                            break;
                            
                        case 5:
                            
                            Orb_Vel = ((Stats.getVelocidad()*18)/100);                            
                            Stats.setVelocidad_Orbe(Orb_Vel); 
                            System.out.println("Eligio el Orbe Especial de Velocidad Nivel 4.");
                            Stats.setNum_Hab_Sec(7);
                            break;
                                                        
                        /*case 6: 
                            
                            Orb_Vel = ((Stats.getVelocidad()*2)/100);                            
                            Stats.setVelocidad_Orbe(Orb_Vel);                                                 
                            System.out.println("Eligio el Orbe Especial de Velocidad Nivel 5.");
                            Stats.setNum_Hab_Sec(7);
                            break;*/
                            
                        case 7: 
                            
                            Stats.setNum_Hab_Sec(0);
                            
                            Stats.setVelocidad_Orbe(0);
                            
                            System.out.println("Se quito el orbe especial de Velocidad.");break;
                            
                        case 8:
                            
                            break;        
                        default:
                            System.out.println("Opcion Incorrecta, debe de escoger un orbe Especial de Velocidad.");break;                                                                       
                            }
            }while(Op_Vel!=8);
            
    }
    }