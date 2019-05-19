public class Autobus extends Vehiculo{
    
    private int Asientos;

    public Autobus() {
        this.Asientos = 0;
    }   

    public int getAsientos() {
        return Asientos;
    }

    public void setAsientos(int Asientos) {
        this.Asientos = Asientos;
    } 
    
    public String MostrarAutoBus(){
        return "\n      N° de Asientos: " + this.getAsientos() + "\n            Marca: " + this.getMarca() + "\n                Numero de Serie: " + this.getPatente();
    }
    
}
