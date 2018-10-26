package sección07_01;

import java.util.Scanner;

public class Sección07_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String No;
        
        Cliente C1 = new Cliente();
        System.out.println("Ingrese los datos del Cliente 1");
        System.out.println("Nombre: ");
        No = in.next();
        C1.IngresarNombre(No);
        System.out.println("Edad: ");
        C1.setEdad(in.nextInt());
              
                      
        
        Cliente C2 = new Cliente();
        System.out.println("Ingrese los datos del Cliente 2");
        System.out.println("Nombre: ");
        No = in.next();
        C2.IngresarNombre(No);
        System.out.println("Edad: ");
        C2.setEdad(in.nextInt());
        
        System.out.println("El Cliente1: " + C1.RetornarNombre());
        System.out.println("Tiene la Edad: " + C1.getEdad());
        
        System.out.println("El Cliente2: " + C2.RetornarNombre());
        System.out.println("Tiene la Edad: " + C2.getEdad());     
        
        //Producto
        Producto ObjComputo = new Producto();
        System.out.println("Nuevo Producto");
        System.out.println("Codigo: ");
        ObjComputo.setCodigo(in.nextInt());
        System.out.println("Nombre: ");
        ObjComputo.setNombre(in.next());
        System.out.println("Precio: ");
        ObjComputo.setPrecio(in.nextDouble());
        
        System.out.println("Datos Guardados");
        System.out.println("Codigo: " + ObjComputo.getCodigo());
        System.out.println("Nombre: " +ObjComputo.getNombre());
        System.out.println("Precio: " +ObjComputo.getPrecio());       
        
                   
    }
    
}
