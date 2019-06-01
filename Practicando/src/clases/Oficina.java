public class Oficina extends Documento{
    
    String Nombre_Oficina, Descripcion_Oficina;
    
    char Dependencia;
    
    int Id_Oficina;

    public Oficina() {
    }
    
    public Oficina(String Nombre_Oficina, String Descripcion_Oficina, char Dependencia, int Id_Oficina, String Asunto_Documento, String Fecha_Recepcion, String Hora_Recepcion, char Descripcion_Tipo, char Tipo_Documento, int Id_Actor, int Id_Documento, int Id_Usuario, int Numero_Folio) {
        super(Asunto_Documento, Fecha_Recepcion, Hora_Recepcion, Descripcion_Tipo, Tipo_Documento, Id_Actor, Id_Documento, Id_Usuario, Numero_Folio);
        this.Nombre_Oficina = Nombre_Oficina;
        this.Descripcion_Oficina = Descripcion_Oficina;
        this.Dependencia = Dependencia;
        this.Id_Oficina = Id_Oficina;
    }

    public String getNombre_Oficina() {
        return Nombre_Oficina;
    }

    public void setNombre_Oficina(String Nombre_Oficina) {
        this.Nombre_Oficina = Nombre_Oficina;
    }

    public String getDescripcion_Oficina() {
        return Descripcion_Oficina;
    }

    public void setDescripcion_Oficina(String Descripcion_Oficina) {
        this.Descripcion_Oficina = Descripcion_Oficina;
    }

    public char getDependencia() {
        return Dependencia;
    }

    public void setDependencia(char Dependencia) {
        this.Dependencia = Dependencia;
    }

    public int getId_Oficina() {
        return Id_Oficina;
    }

    public void setId_Oficina(int Id_Oficina) {
        this.Id_Oficina = Id_Oficina;
    }
}
//@PianitoDead