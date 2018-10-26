package seccion12_02;
public class Curso {
    private String Codigo;
    private String Nombre;
    private double Nota1;
    private double Nota2;
    private double Nota3;
    private double PROM;
    public Curso(){
        
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double Nota3) {
        this.Nota3 = Nota3;
    }

    public double getPROM() {
        return PROM;
    }

    public void setPROM(double PROM) {
        this.PROM = PROM;
    }
    
    public void calcularPromedio (){
        PROM = (Nota1 * 0.2 + Nota2 * 0.3 + Nota3 * 0.5);
    }
    }