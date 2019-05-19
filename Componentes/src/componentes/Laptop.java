package componentes;
public class Laptop {
    
    private String Motheboard;
    private String Pantalla;
    private int Perifericos;

    public Laptop(){
        
    }
    public Laptop(String Motheboard, String Pantalla, int Perifericos) {
        this.Motheboard = Motheboard;
        this.Pantalla = Pantalla;
        this.Perifericos = Perifericos;
    }

    public String getMotheboard() {
        return Motheboard;
    }

    public String getPantalla() {
        return Pantalla;
    }

    public int getPerifericos() {
        return Perifericos;
    }
    
    

    
    
}
