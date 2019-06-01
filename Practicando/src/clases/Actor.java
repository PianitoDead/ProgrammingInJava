public class Actor extends Documento{
    
    char Demonominacion;
    
    boolean Estado;

    public Actor() {
    }
    
    public Actor(char Demonominacion, boolean Estado, String Asunto_Documento, String Fecha_Recepcion, String Hora_Recepcion, char Descripcion_Tipo, char Tipo_Documento, int Id_Actor, int Id_Documento, int Id_Usuario, int Numero_Folio) {
        super(Asunto_Documento, Fecha_Recepcion, Hora_Recepcion, Descripcion_Tipo, Tipo_Documento, Id_Actor, Id_Documento, Id_Usuario, Numero_Folio);
        this.Demonominacion = Demonominacion;
        this.Estado = Estado;
    }

    public char getDemonominacion() {
        return Demonominacion;
    }

    public void setDemonominacion(char Demonominacion) {
        this.Demonominacion = Demonominacion;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }    
}
//@PianitoDead