package registro.practica;
public class Participante_Profesor extends TrabajadorUCV {
    private String Titulo;
    public Participante_Profesor(){
        super();
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
        public void Nombre_Titulo(){
            switch (Titulo){
                case "Ingeniero":
                    System.out.println("Usted eligio Ingeniero. ");break;
                case "Licenciado":
                    System.out.println("Usted eligio Licenciado.");break;
                case "Maestro":
                    System.out.println("Usted eligio Maestro.");break;
                case "Doctor":
                    System.out.println("Usted eligio Doctor.");break;
                default: 
                    System.out.println("El titulo: " + Titulo + " no exite. Error 404.");
                            
            }
        }
}
