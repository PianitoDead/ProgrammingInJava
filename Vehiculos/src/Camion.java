public class Camion extends Vehiculo{

    private int Carga;
    
    public Camion (){
        this.Carga = 0;
    }

    public int getCarga() {
        return Carga;
    }

    public void setCarga(int Carga) {
        this.Carga = Carga;
    }
    
    public String MostarCamion (){
        return "\n      Marca: " + this.getMarca() + "\n            Numero de Serie: " + this.getPatente() + "\n                Carga: " + this.getCarga();
    }
    
}
