package registro.practica;
public class Participante_Estudiante extends PersonaUCV{
    private String Facultad;
    private int Ciclo;
    
        public Participante_Estudiante (){
            super();
        }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    public int getCiclo() {
        return Ciclo;
    }

    public void setCiclo(int Ciclo) {
        this.Ciclo = Ciclo;
    }
        
        
}
