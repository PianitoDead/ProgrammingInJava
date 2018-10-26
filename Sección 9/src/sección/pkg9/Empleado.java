package sección.pkg9;
public class Empleado {
        protected String Codigo;
        protected String Nombre;
        protected String Apellido;
        protected double Sueldo;
        public Empleado(){}
        public String getCodigo(){
            return Codigo;
        }
        public void setCodigo (String Codigo){
            this.Codigo = Codigo;
        }
        
        //Y asi get y set para cada propiedad

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

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }
}