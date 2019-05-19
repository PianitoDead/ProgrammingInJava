public class Persona {
    
    private String Dni, Nombres, Apellidos;
    private int Edad;

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    // Metodo Predefinido.
    
    public String Concatenado (){
        
        String Cadena = "Dni: " + this.getDni()+
                            "\nNombres: " + this.getNombres()+
                            "\nApellidos: " + this.getApellidos() +
                            "\nEdad: " + this.getEdad();
        return Cadena;
    }
    
}
