public class Persona {
    
    private String DNI, Nombre; private int Edad;

    public Persona() {
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public String MostrarPersona(){
        return "\n      Nombre: " + this.getNombre() + "\n            DNI: " + this.getDNI()+ "\n                Edad: " + this.getEdad();
    }
}
