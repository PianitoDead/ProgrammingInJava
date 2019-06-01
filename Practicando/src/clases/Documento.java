public class Documento {
    
    String Asunto_Documento, Fecha_Recepcion, Hora_Recepcion;
            
    char Descripcion_Tipo, Tipo_Documento;
            
    int Id_Actor, Id_Documento, Id_Usuario, Numero_Folio;

public Documento() {
    }

public Documento(String Asunto_Documento, String Fecha_Recepcion, String Hora_Recepcion, char Descripcion_Tipo, char Tipo_Documento, int Id_Actor, int Id_Documento, int Id_Usuario, int Numero_Folio) {
        this.Asunto_Documento = Asunto_Documento;
        this.Fecha_Recepcion = Fecha_Recepcion;
        this.Hora_Recepcion = Hora_Recepcion;
        this.Descripcion_Tipo = Descripcion_Tipo;
        this.Tipo_Documento = Tipo_Documento;
        this.Id_Actor = Id_Actor;
        this.Id_Documento = Id_Documento;
        this.Id_Usuario = Id_Usuario;
        this.Numero_Folio = Numero_Folio;
    }

    public String getAsunto_Documento() {
        return Asunto_Documento;
    }

    public void setAsunto_Documento(String Asunto_Documento) {
        this.Asunto_Documento = Asunto_Documento;
    }

    public String getFecha_Recepcion() {
        return Fecha_Recepcion;
    }

    public void setFecha_Recepcion(String Fecha_Recepcion) {
        this.Fecha_Recepcion = Fecha_Recepcion;
    }

    public String getHora_Recepcion() {
        return Hora_Recepcion;
    }

    public void setHora_Recepcion(String Hora_Recepcion) {
        this.Hora_Recepcion = Hora_Recepcion;
    }

    public char getDescripcion_Tipo() {
        return Descripcion_Tipo;
    }

    public void setDescripcion_Tipo(char Descripcion_Tipo) {
        this.Descripcion_Tipo = Descripcion_Tipo;
    }

    public char getTipo_Documento() {
        return Tipo_Documento;
    }

    public void setTipo_Documento(char Tipo_Documento) {
        this.Tipo_Documento = Tipo_Documento;
    }

    public int getId_Actor() {
        return Id_Actor;
    }

    public void setId_Actor(int Id_Actor) {
        this.Id_Actor = Id_Actor;
    }

    public int getId_Documento() {
        return Id_Documento;
    }

    public void setId_Documento(int Id_Documento) {
        this.Id_Documento = Id_Documento;
    }

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public int getNumero_Folio() {
        return Numero_Folio;
    }

    public void setNumero_Folio(int Numero_Folio) {
        this.Numero_Folio = Numero_Folio;
    }    
}
//@PianitoDead