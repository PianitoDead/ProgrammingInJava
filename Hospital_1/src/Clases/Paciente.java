package Clases;

public class Paciente extends Persona{
    
    private String Diagnostico;
    
    private double Factura;

    public Paciente() {

    }

    public Paciente(String Diagnostico, double Factura, String DNI, String Nombre, String Dirrecion, String Fecha_Nac) {
        super(DNI, Nombre, Dirrecion, Fecha_Nac);
        this.Diagnostico = Diagnostico;
        this.Factura = Factura;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }

    public double getFactura() {
        return Factura;
    }

    public void setFactura(double Factura) {
        this.Factura = Factura;
    }
    
    /**
 *
 * @author PianitoDead
 */    
    
}
