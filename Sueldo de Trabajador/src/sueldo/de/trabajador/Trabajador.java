package sueldo.de.trabajador;
public class Trabajador {
    private String DNI;
    private String Nombre;
    private String Apellido;
    private int N_Ventas;
    private double Sueldo;
    public Trabajador (){}

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

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getN_Ventas() {
        return N_Ventas;
    }

    public void setN_Ventas(int N_Ventas) {
        this.N_Ventas = N_Ventas;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }
    public void calcularSueldo (){
        Sueldo = 950 + N_Ventas * 30;
    }
    
    
}
