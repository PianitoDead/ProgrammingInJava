import javax.swing.*;

public class Listones {
    
    public static void main(String[] args) {
        
            double A, B, C, D, H, E ,F, G, I;
        
        JOptionPane.showMessageDialog(null, "Aplicación para calcular el espacio entre listones.");
        
        A = Double.valueOf(JOptionPane.showInputDialog("Ingrese el tamaño del listón en mm(Milimetros) "));
        
        B = Double.valueOf(JOptionPane.showInputDialog("Ingrese la longitud de del espacio en mm(Milimetros) "));
        
        C = Double.valueOf(JOptionPane.showInputDialog("Ingrese el tamaño del listón en mm(Milimetro) "));
        
        D = B + A; E = D / 10;  F = E / (C + 1); G = (F / 10); H = D - A; I = (D - A) / 10;
        
        int Op;
        
        do{
            
        Op = Integer.parseInt(JOptionPane.showInputDialog("\n Desea Ver los resultados en mm o cm \n"
            
            + "1. Milimetros. \n"
            
                + "2. Centimetros. \n"
            
                    +"0. Salir. \n"
            
                        + "Ingrese una Opcion: "));
        
                switch(Op){
                    
                    case 1: {
                        
                        JOptionPane.showMessageDialog(null, "La Longitud en Milimetros sería: " + D + " mm\n"
                                + "El resultado final en Milimetros con el listón es de: " + (double)Math.round(F * 100) / 100 + " mm\n"
                                        + "El Resultado final en Milimetros sin el listón es de: " + (double)Math.round(H * 100) / 100 +  " mm");break;
                    
                    }
                        
                    case 2:{
                        
                        JOptionPane.showMessageDialog(null, "La Longitud en Centimetros sería: " + E + " cm\n"
                                + "El resultado final en Centimetros con el listón es de: " + (double)Math.round(G * 100) / 100 +  " cm\n"
                                        + "El Resultado final en Centimetros sin el listón es de: " + (double)Math.round(I * 100) / 100 +  " cm");break;
                                        
                    }
                        
                    case 0:{
                        
                        Op = JOptionPane.showConfirmDialog(null, "¿Desea realmente salir?" , "Salir" , JOptionPane.YES_NO_OPTION);                        
                        
                        if (Op == JOptionPane.YES_OPTION){
                        
                        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro programa. Adios. ");break;
                        
                        }
                        
                        else if(Op == JOptionPane.NO_OPTION){
                            
                            JOptionPane.showMessageDialog(null, "Sabía elección :) ");break;
                        }
                    }
                            
                    default:
                        
                        JOptionPane.showMessageDialog(null, "Opción invalida. 404(Bad Gateway)");break;                                           
                }     
                
        }while(Op!= JOptionPane.YES_OPTION);        
        
    }        
}