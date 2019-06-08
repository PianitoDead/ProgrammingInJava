package Clases;

public class Prestamo extends Libro{

    private int Max_Libros, Max_Dias, Codigo;

    public Prestamo() {
    }

    public Prestamo(int Max_Libros, int Max_Dias, int Codigo, String Nombre, String Tipo, String Edutorial, String Autor, int Anno) {
        super(Nombre, Tipo, Edutorial, Autor, Anno);
        this.Max_Libros = Max_Libros;
        this.Max_Dias = Max_Dias;
        this.Codigo = Codigo;
    }

    public int getMax_Libros() {
        return Max_Libros;
    }

    public void setMax_Libros(int Max_Libros) {
        this.Max_Libros = Max_Libros;
    }

    public int getMax_Dias() {
        return Max_Dias;
    }

    public void setMax_Dias(int Max_Dias) {
        this.Max_Dias = Max_Dias;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
 }