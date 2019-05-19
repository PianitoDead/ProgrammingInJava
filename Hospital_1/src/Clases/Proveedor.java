package Clases;

public class Proveedor extends Persona{

    private double Saldo, Descuentos;

    private String Codigo, Fax, Telefono;

    public Proveedor() {
    }

    public Proveedor(double Saldo, double Descuentos, String Codigo, String Fax, String Telefono, String DNI, String Nombre, String Dirrecion, String Fecha_Nac) {
        super(DNI, Nombre, Dirrecion, Fecha_Nac);
        this.Saldo = Saldo;
        this.Descuentos = Descuentos;
        this.Codigo = Codigo;
        this.Fax = Fax;
        this.Telefono = Telefono;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public double getDescuentos() {
        return Descuentos;
    }

    public void setDescuentos(double Descuentos) {
        this.Descuentos = Descuentos;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    /**
 *
 * @author PianitoDead
 */
}   
