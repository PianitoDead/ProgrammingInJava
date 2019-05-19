package componentes;
public class PlacaMadre extends Laptop {
    
    private int Ram;
    private String Procesador;
    private String T_Video;

    public PlacaMadre(int Ram, String Procesador, String T_Video, String Motheboard, String Pantalla, int Perifericos) {
        super(Motheboard, Pantalla, Perifericos);
        this.Ram = Ram;
        this.Procesador = Procesador;
        this.T_Video = T_Video;
    }

    PlacaMadre(){
        
    }
    
    public int getRam() {
        return Ram;
    }

    public void setRam(int Ram) {
        this.Ram = Ram;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public String getT_Video() {
        return T_Video;
    }

    public void setT_Video(String T_Video) {
        this.T_Video = T_Video;
    }
    
    
    
    
}
