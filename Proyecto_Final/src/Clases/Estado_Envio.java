package Clases;

public class Estado_Envio extends Documento{
    
    String Estado_Recepcion;
    
    int Id_Envio, Id_Recepcion;

    public Estado_Envio() {
    }
    
    public Estado_Envio(String Estado_Recepcion, int Id_Envio, int Id_Recepcion, String Asunto_Documento, String Fecha_Recepcion, String Hora_Recepcion, char Descripcion_Tipo, char Tipo_Documento, int Id_Actor, int Id_Documento, int Id_Usuario, int Numero_Folio) {
        super(Asunto_Documento, Fecha_Recepcion, Hora_Recepcion, Descripcion_Tipo, Tipo_Documento, Id_Actor, Id_Documento, Id_Usuario, Numero_Folio);
        this.Estado_Recepcion = Estado_Recepcion;
        this.Id_Envio = Id_Envio;
        this.Id_Recepcion = Id_Recepcion;
    }

    public String getEstado_Recepcion() {
        return Estado_Recepcion;
    }

    public void setEstado_Recepcion(String Estado_Recepcion) {
        this.Estado_Recepcion = Estado_Recepcion;
    }

    public int getId_Envio() {
        return Id_Envio;
    }

    public void setId_Envio(int Id_Envio) {
        this.Id_Envio = Id_Envio;
    }

    public int getId_Recepcion() {
        return Id_Recepcion;
    }

    public void setId_Recepcion(int Id_Recepcion) {
        this.Id_Recepcion = Id_Recepcion;
    }    
}
//@PianitoDead