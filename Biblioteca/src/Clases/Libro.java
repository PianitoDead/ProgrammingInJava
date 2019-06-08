package Clases;

public class Libro {
    
    private String Nombre, Tipo, Editorial, Autor;
    
    private int Anno;

    public Libro() {
    }
    
    public Libro(String Nombre, String Tipo, String Editorial, String Autor, int Anno) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Editorial = Editorial;
        this.Autor = Autor;
        this.Anno = Anno;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getAnno() {
        return Anno;
    }

    public void setAnno(int Anno) {
        this.Anno = Anno;
    }    
}
