package Clases;

public class Empleado extends Persona{
    
    private String Compania;
    private double Salario;
    private int Horas_Extra;
    
    public Empleado() {
    }   
        
    public Empleado(String Compania, double Salario, int Horas_Extra, String DNI, String Nombre, String Dirrecion, String Fecha_Nac) {
        super(DNI, Nombre, Dirrecion, Fecha_Nac);
        this.Compania = Compania;
        this.Salario = Salario;
        this.Horas_Extra = Horas_Extra;
    }

    public String getCompania() {
        return Compania;
    }

    public void setCompania(String Compania) {
        this.Compania = Compania;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public int getHoras_Extra() {
        return Horas_Extra;
    }

    public void setHoras_Extra(int Horas_Extra) {
        this.Horas_Extra = Horas_Extra;
    }    
    
    /**
 *
 * @author PianitoDead
 */   
}
