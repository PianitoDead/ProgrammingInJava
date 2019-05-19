public class Alumno extends Persona{
    
    private String RolUCV;

    public Alumno(){
        this.RolUCV = "0000";
    }

    public String getRolUCV() {
        return RolUCV;
    }

    public void setRolUCV(String RolUCV) {
        this.RolUCV = RolUCV;
    }
    
    public String QuienSoy(){
        return this.getRUT() + ", " + this.getNombre() + ", " + this.RolUCV;
    }
}
