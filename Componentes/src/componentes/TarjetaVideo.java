package componentes;
public class TarjetaVideo extends Laptop{
    
    private String Marca;
    private int Tamaño;
    private String Tipo;
    private String Nombre;
    
    public TarjetaVideo(){
        
    }

    public TarjetaVideo(String Marca, int Tamaño, String Tipo, String Nombre, String Motheboard, String Pantalla, int Perifericos) {
        super(Motheboard, Pantalla, Perifericos);
        this.Marca = Marca;
        this.Tamaño = Tamaño;
        this.Tipo = Tipo;
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
}
