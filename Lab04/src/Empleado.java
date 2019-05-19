public class Empleado extends Persona{
    
    private double Sueldo,Paga; 
    
    private int Horas;

    public Empleado() {
        
        
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    public double getPaga() {
        return Paga;
    }

    public void setPaga(double Paga) {
        this.Paga = Paga;
    }

    
    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;   
    }
    
   
    public String MostrarDatos(){
        return "\n      Nombre: " + this.getNombre() + "\n            DNI: " + this.getDNI()+ "\n                Edad: " + this.getEdad();
         
    }
    
    public void MostrarSueldo(){
        
        Sueldo = this.Horas * this.Paga;
        
        System.out.println("                El sueldo es: " + this.Sueldo);
    }      
                                    }    
                                         
