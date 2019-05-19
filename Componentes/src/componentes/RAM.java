package componentes;
public class RAM extends Laptop{
    
    private String Tipo;
    private Double Frecuencia;
    private int Cantidad;
    
    
    public RAM (){
        
    }
    public RAM(String Tipo, Double Frecuencia, int Cantidad, String Motheboard, String Pantalla, int Perifericos) {
        super(Motheboard, Pantalla, Perifericos);
        this.Tipo = Tipo;
        this.Frecuencia = Frecuencia;
        this.Cantidad = Cantidad;
    }

    

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Double getFrecuencia() {
        return Frecuencia;
    }

    public void setFrecuencia(Double Frecuencia) {
        this.Frecuencia = Frecuencia;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

   

    

    
        
    }
    
    

