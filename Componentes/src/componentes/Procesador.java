package componentes;
public class Procesador extends Laptop{
    
    private double GHz;
    private String Marca;
    private int Hilos;
    private String Denominacion;
    private int T_Tamaño;

    Procesador(){
        
    }
    public Procesador(double GHz, String Marca, int Hilos, String Denominacion, int T_Tamaño, String Motheboard, String Pantalla, int Perifericos) {
        super(Motheboard, Pantalla, Perifericos);
        this.GHz = GHz;
        this.Marca = Marca;
        this.Hilos = Hilos;
        this.Denominacion = Denominacion;
        this.T_Tamaño = T_Tamaño;
    }

    

    public double getGHz() {
        return GHz;
    }

    public void setGHz(double GHz) {
        this.GHz = GHz;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getHilos() {
        return Hilos;
    }

    public void setHilos(int Hilos) {
        this.Hilos = Hilos;
    }

    public String getDenominacion() {
        return Denominacion;
    }

    public void setDenominacion(String Denominacion) {
        this.Denominacion = Denominacion;
    }

    public int getT_Tamaño() {
        return T_Tamaño;
    }

    public void setT_Tamaño(int T_Tamaño) {
        this.T_Tamaño = T_Tamaño;
    }
    
    
    
    
    
}
