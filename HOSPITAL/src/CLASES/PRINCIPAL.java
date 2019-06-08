/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;
import java.util.*;

public class PRINCIPAL {
    
    public static void main( String arg[]){
        Scanner leer= new Scanner(System.in);
        String n1,d1,c1,com1,f1; double suel1;
        double sal1,des1;
        int cod1,he1,t1,fax1,tel1;
        System.out.println("DATOS DE EMPLEADO1");
        System.out.print("Ingrese Nombre: ");
        n1=leer.next();
        System.out.print("Ingrese Direccion: ");
        d1=leer.next();
        System.out.print("Ingrese Ciudad: ");
        c1=leer.next();
        System.out.print("Ingrese Codigo : ");
        cod1=leer.nextInt();
        System.out.print("Ingrese horas extra : ");
        he1=leer.nextInt();
        System.out.print("Ingrese Compañia seguros: ");
        com1=leer.next();
        System.out.print("Ingrese Sueldo: ");
        suel1=leer.nextDouble();
        EMPLEADO EMP1=new EMPLEADO(cod1,he1,com1,suel1,n1,d1,c1);
        
        System.out.println("DATOS DE PACIENTE1");
        System.out.print("Ingrese Nombre: ");
        n1=leer.next();
        System.out.print("Ingrese Direccion: ");
        d1=leer.next();
        System.out.print("Ingrese Ciudad: ");
        c1=leer.next();
        System.out.print("Ingrese Codigo : ");
        cod1=leer.nextInt();
        System.out.print("Ingrese telefono : ");
        t1=leer.nextInt();
        System.out.print("Ingrese Fecha Nacimiento: ");
        f1=leer.next();
        PACIENTE PAC1=new PACIENTE(cod1,t1,f1,n1,d1,c1);
        
        System.out.println("DATOS DE PROVEEDOR1");
        System.out.print("Ingrese Nombre: ");
        n1=leer.next();
        System.out.print("Ingrese Direccion: ");
        d1=leer.next();
        System.out.print("Ingrese Ciudad: ");
        c1=leer.next();
        System.out.print("Ingrese Codigo : ");
        cod1=leer.nextInt();
        System.out.print("Ingrese saldo : ");
        sal1=leer.nextDouble();
        System.out.print("Ingrese Fax: ");
        fax1=leer.nextInt();
        System.out.print("Ingrese Telefono : ");
        tel1=leer.nextInt();
        System.out.print("Ingrese Descuentos: ");
        des1=leer.nextDouble();
        PROVEEDOR PROV1=new PROVEEDOR(cod1,sal1,fax1,tel1,des1,n1,d1,c1);
        
        //MOSTRAR DATOS DE OBJETOS
        System.out.println("DATOS DE EMPLEADO1");
        System.out.println("Nombre: "+ EMP1.getNombre());       
        System.out.println("Direccion: "+ EMP1.getDireccion());        
        System.out.println("Ciudad: "+ EMP1.getCiudad());        
        System.out.println("Codigo : "+ EMP1.getCodigo_empleado());        
        System.out.println("Horas extra : "+ EMP1.getHoras_extra());        
        System.out.println("Compañia seguros: "+EMP1.getCompania_seguros());
        
     
    }

}
