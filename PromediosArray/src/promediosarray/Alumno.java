package promediosarray;
public class Alumno {
    protected String Codigo;
    
    protected String Apellido;
    
    protected String Nombre;
    
    protected double Parcial1;
    
    protected double Parcial2;
    
    protected double Parcial3;   
    
    protected double Promedio;
      
    public Alumno (){}

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getParcial1() {
        return Parcial1;
    }

    public void setParcial1(double Parcial1) {
        this.Parcial1 = Parcial1;
    }

    public double getParcial2() {
        return Parcial2;
    }

    public void setParcial2(double Parcial2) {
        this.Parcial2 = Parcial2;
    }

    public double getParcial3() {
        return Parcial3;
    }

    public void setParcial3(double Parcial3) {
        this.Parcial3 = Parcial3;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }
    public void calcularPromedio (){
        Promedio = (getParcial1() * 0.2 + getParcial2() * 0.3 + getParcial3() * 0.5);
    } 
    }