

package CLASES;


public class PACIENTE extends PERSONA {
	private int codigo_diagnostico;
	private int telefono;
	private String fecha_nac;

    public PACIENTE(int codigo_diagnostico, int telefono, String fecha_nac, String nombre, String direccion, String ciudad) {
        super(nombre, direccion, ciudad);
        this.codigo_diagnostico = codigo_diagnostico;
        this.telefono = telefono;
        this.fecha_nac = fecha_nac;
    }

    public int getCodigo_diagnostico() {
        return codigo_diagnostico;
    }

    public void setCodigo_diagnostico(int codigo_diagnostico) {
        this.codigo_diagnostico = codigo_diagnostico;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
	
        
        
}
