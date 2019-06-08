
package CLASES;
      

public class EMPLEADO extends PERSONA {
	private int codigo_empleado;
	private int horas_extra;
	private String compania_seguros;
        private double Sueldo;

    public EMPLEADO(int codigo_empleado, int horas_extra, String compania_seguros, double Sueldo, String nombre, String direccion, String ciudad) {
        super(nombre, direccion, ciudad);
        this.codigo_empleado = codigo_empleado;
        this.horas_extra = horas_extra;
        this.compania_seguros = compania_seguros;
    }
   public EMPLEADO(){
        
    }
    public int getCodigo_empleado() {
        return codigo_empleado;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public int getHoras_extra() {
        return horas_extra;
    }

    public void setHoras_extra(int horas_extra) {
        this.horas_extra = horas_extra;
    }

    public String getCompania_seguros() {
        return compania_seguros;
    }

    public void setCompania_seguros(String compania_seguros) {
        this.compania_seguros = compania_seguros;
    }
	
        
        
        
}
