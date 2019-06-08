


package CLASES;
public class PROVEEDOR extends PERSONA {
	private int codigo_vendedor;
	private Double saldo;
	private int fax;
	private int telefono;
	private Double descuentos;

    public PROVEEDOR(int codigo_vendedor, Double saldo, int fax, int telefono, Double descuentos, String nombre, String direccion, String ciudad) {
        super(nombre, direccion, ciudad);
        this.codigo_vendedor = codigo_vendedor;
        this.saldo = saldo;
        this.fax = fax;
        this.telefono = telefono;
        this.descuentos = descuentos;
    }

    public int getCodigo_vendedor() {
        return codigo_vendedor;
    }

    public void setCodigo_vendedor(int codigo_vendedor) {
        this.codigo_vendedor = codigo_vendedor;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(Double descuentos) {
        this.descuentos = descuentos;
    }
	
        
        
        
}
