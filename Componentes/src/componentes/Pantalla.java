package componentes;

public class Pantalla extends Laptop{
    
    private int Hz;
    private String Tipo;
    private String Resolucion;
    private double Tamaño;

    Pantalla (){
        
    }
    
    public Pantalla(int Hz, String Tipo, String Resolucion, double Tamaño, String Motheboard, String Pantalla, int Perifericos) {
        super(Motheboard, Pantalla, Perifericos);
        this.Hz = Hz;
        this.Tipo = Tipo;
        this.Resolucion = Resolucion;
        this.Tamaño = Tamaño;
    }

    public int getHz() {
        return Hz;
    }

    public void setHz(int Hz) {
        this.Hz = Hz;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getResolucion() {
        return Resolucion;
    }

    public void setResolucion(String Resolucion) {
        this.Resolucion = Resolucion;
    }

    public double getTamaño() {
        return Tamaño;
    }

    public void setTamaño(double Tamaño) {
        this.Tamaño = Tamaño;
    }
    
    
    
    
    
}
