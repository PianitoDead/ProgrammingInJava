package registro.practica;
public class PersonaUCV {
        protected int Dni;
        protected String Nombre;
        protected String Apellido;
        protected double Taller1;
        protected double Taller2;
        protected double Final;
        
public PersonaUCV(){}

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getTaller1() {
        return Taller1;
    }

    public void setTaller1(double Taller1) {
        this.Taller1 = Taller1;
    }

    public double getTaller2() {
        return Taller2;
    }

    public void setTaller2(double Taller2) {
        this.Taller2 = Taller2;
    }

    public double getFinal() {
        return Final;
    }

    public void setFinal(double Final) {
        this.Final = Final;
    }                      
    
}
