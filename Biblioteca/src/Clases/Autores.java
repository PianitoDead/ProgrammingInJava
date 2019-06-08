package Clases;

public class Autores extends Libro{
    
    private String Nacionalidad, Fecha_Nac;

    public Autores() {
    }

    public Autores(String Nacionalidad, String Fecha_Nac, String Nombre, String Tipo, String Edutorial, String Autor, int Anno) {
        super(Nombre, Tipo, Edutorial, Autor, Anno);
        this.Nacionalidad = Nacionalidad;
        this.Fecha_Nac = Fecha_Nac;
    }
    
    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getFecha_Nac() {
        return Fecha_Nac;
    }

    public void setFecha_Nac(String Fecha_Nac) {
        this.Fecha_Nac = Fecha_Nac;
    }     
}