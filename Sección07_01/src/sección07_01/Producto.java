package sección07_01;

public class Producto {
    //Propiedades
    public int Codigo;
    public String Nombre;
    public double Precio;    
    //Costructor
    public Producto(){}
    //get and set
    public int getCodigo(){
        return Codigo;
    }
    public void setCodigo(int Codigo){
        this.Codigo = Codigo;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
            
    
}
