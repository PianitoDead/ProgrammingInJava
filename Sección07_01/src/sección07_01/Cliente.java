package sección07_01;
public class Cliente {
    //Propiedades
    public String Nombre;
    public int Edad;
    
    //Constructor
    public Cliente(){}
    //Getter y Setter
    public String RetornarNombre(){
        return Nombre;
    }
    public void IngresarNombre(String N){
        Nombre = N;
    }
    public int getEdad(){
        return this.Edad;
    }
    public void setEdad(int Edad){
        this.Edad = Edad;
    }
    
}
