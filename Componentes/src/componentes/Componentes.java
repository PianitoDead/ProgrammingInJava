package componentes;

import java.util.Scanner;

public class Componentes {   
      
    public static void main(String[] args) {
        
        RAM RAM1 = new RAM(); Pantalla Pantalla1= new Pantalla(); 
        
        Procesador Procesador1= new Procesador(); TarjetaVideo TarjetaVideo1= new TarjetaVideo();

        Perifericos Perifericos1 = new Perifericos();
        
        Scanner in = new Scanner(System.in);        
        
        int Op; String Res;             
                
                do{
                    
            System.out.println("\nRegistro de Componentes de una Laptop."
                + "\n1) RAM: " + "\n2) Pantalla: " + "\n3) Procesador: "
                + "\n4) Tarjeta de Video: " + "\n5) Perifericos: " + "\n6) Mostrar Datos: "
                + "\n0) Salir. ");
                    
        Op = in.nextInt();        
        
        switch (Op){
            case 1:
                System.out.println("Cantidad: ");
                
                RAM1.setCantidad(in.nextInt());
                                                                
                System.out.println("Frecuencia.");
                
                RAM1.setFrecuencia(in.nextDouble());
                
                System.out.println("Tipo.");
                
                RAM1.setTipo(in.next());
                
                break;
                
            case 2: 
                                
                System.out.println("Taza de Refrescamiento(Hz): ");
                
                Pantalla1.setHz(in.nextInt());
                
                System.out.println("Tipo de Pantalla: ");
                
                Pantalla1.setTipo(in.next());
                
                System.out.println("Resolucion: ");
                
                Pantalla1.setResolucion(in.next());
                
                System.out.println("Tamaño de la Pantalla: ");
                
                Pantalla1.setTamaño(in.nextDouble());
                
                break;
                
            case 3: 
                
                System.out.println("Velocidad del Procesador (GHZ): ");
                
                Procesador1.setGHz(in.nextDouble());
                
                System.out.println("Marca del Procesador: ");
                
                Procesador1.setMarca(in.next());
                
                System.out.println("Cantidad de Hilos: ");
                
                Procesador1.setHilos(in.nextInt());
                
                System.out.println("Nombre del Procesador: ");
                
                Procesador1.setDenominacion(in.next());
                
                System.out.println("Tamaño en nm: ");
                
                Procesador1.setT_Tamaño(in.nextInt());
                
                break;
                
            case 4:
                
                System.out.println("Marca: ");
                
                TarjetaVideo1.setMarca(in.next());
                
                System.out.println("Tamaño en nm: ");
                
                TarjetaVideo1.setTamaño(in.nextInt());
                
                System.out.println("Tipo: Intengrada o externa. ");
                
                TarjetaVideo1.setTipo(in.next());
                
                System.out.println("Nombre: ");
                
                TarjetaVideo1.setNombre(in.next());      
                
                break;
                
            case 5:   
                
                System.out.println("¿Usara Mouse?");              
                                
                Res = in.next();
                
                Perifericos1.setMouse(Res);
                    
                System.out.println("¿Usara Bocinas: ?");
                
                Res = in.next();
                
                Perifericos1.setBocinas(Res);
                
                System.out.println("¿Usara Impresora: ?");
                
                Res = in.next();

                Perifericos1.setImpresora(Res);    
                    
                break;
                
            case 6: 
                
                System.out.println("******** RAM ********");
                
                System.out.println("\nCantidad: " + RAM1.getCantidad()
                        + "\nFrecuencia: " + RAM1.getFrecuencia()
                        + "\nTipo: " + RAM1.getTipo());
                
                System.out.println("******** Pantalla ********");
                
                System.out.println("\nTaza de Refrescamiento: " +Pantalla1.getHz()
                        + "\nTipo de Pantalla: " + Pantalla1.getTipo()
                        + "\nResolucion de la Pantalla: " +Pantalla1.getResolucion()
                        + "\nTamaño de la Pantalla: " +Pantalla1.getTamaño());
                
                System.out.println("******** Procesador ********");
                
                System.out.println("\nVelocidad del Procesador(GHZ): " +Procesador1.getGHz()
                        + "\nMarca del Procesdaor: " +Procesador1.getMarca()
                        + "\nCantidad de Hilos: " + Procesador1.getHilos()
                        + "\nNombre del Procsador: " + Procesador1.getDenominacion()
                        + "\nTamaño(nm): " +Procesador1.getT_Tamaño());
                
                System.out.println("******** Perifericos ********");
                
                System.out.println("\nMouse: " + Perifericos1.isMouse()
                        + "\nBocinas:" + Perifericos1.isBocinas()
                        + "\nImpresora:" + Perifericos1.isImpresora());
                
                System.out.println("******** Gracias ********");       
                
                break;
                
            case 0 : 
                
                System.out.println("***** Gracias por usar este programa :) ********");
                
                break;
                
                default:
                    
                System.out.println("Lo sentimos pero esa opcion no existe. ");
                
                System.out.println("                                Error 404 :( ");
                
                break;
                                                
        }
    }while(Op !=0);       
        
           }
    }



    

