package seccion12_02;
public class Alumno {
    private String Codigo;
    private String Nombre;
    private String Apellido;
    private Curso [] oMisCursos;    
    public Alumno (){
            }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
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

    public Curso[] getoMisCursos() {
        return oMisCursos;
    }

    public void setoMisCursos(Curso[] oMisCursos) {
        this.oMisCursos = oMisCursos;
    }
    
}