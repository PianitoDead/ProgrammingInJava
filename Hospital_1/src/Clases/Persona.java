package Clases;

public class Persona {
    
    private String DNI, Nombre, Dirrecion, Fecha_Nac;

    public Persona() {
    }

    public Persona(String DNI, String Nombre, String Dirrecion, String Fecha_Nac) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Dirrecion = Dirrecion;
        this.Fecha_Nac = Fecha_Nac;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDirrecion() {
        return Dirrecion;
    }

    public void setDirrecion(String Dirrecion) {
        this.Dirrecion = Dirrecion;
    }

    public String getFecha_Nac() {
        return Fecha_Nac;
    }

    public void setFecha_Nac(String Fecha_Nac) {
        this.Fecha_Nac = Fecha_Nac;
    }
    
    /**
 *
 * @author PianitoDead
 */    
}
