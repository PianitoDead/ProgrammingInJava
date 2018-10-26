package seccion11;
public class Persona {

    private String Nombres;
    
    private String Apeliidos;
    
    private String Telefono;
    
    public Persona(){}
    
    public Persona (String Nombres, String Apellidos, String Telefono){
                this.Nombres = Nombres;
                this.Apeliidos = Apellidos;
                this.Telefono = Telefono;
    }
    // Getter and Setter

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApeliidos() {
        return Apeliidos;
    }

    public void setApeliidos(String Apeliidos) {
        this.Apeliidos = Apeliidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
}
