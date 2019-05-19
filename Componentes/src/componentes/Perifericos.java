package componentes;
public class Perifericos extends Laptop{
    
    private String Mouse;
    private String Bocinas;
    private String Impresora;

    Perifericos (){
        
    }
    
    public Perifericos(String Mouse, String Bocinas, String Impresora, String Motheboard, String Pantalla, int Perifericos) {
        super(Motheboard, Pantalla, Perifericos);
        this.Mouse = Mouse;
        this.Bocinas = Bocinas;
        this.Impresora = Impresora;
    }

    public String isMouse() {
        return Mouse;
    }

    public void setMouse(String Mouse) {
        this.Mouse = Mouse;
    }

    public String isBocinas() {
        return Bocinas;
    }

    public void setBocinas(String Bocinas) {
        this.Bocinas = Bocinas;
    }

    public String isImpresora() {
        return Impresora;
    }

    public void setImpresora(String Impresora) {
        this.Impresora = Impresora;
    }
    
    
        
}
