package Clases;

public class Acciones extends Documento{
    
    String Nombre_Accion;
    
    int Id_Envio, Id_Acciones;

    public Acciones() {
    }

    public Acciones(String Nombre_Accion, int Id_Envio, int Id_Acciones, String Asunto_Documento, String Fecha_Recepcion, String Hora_Recepcion, char Descripcion_Tipo, char Tipo_Documento, int Id_Actor, int Id_Documento, int Id_Usuario, int Numero_Folio) {
        super(Asunto_Documento, Fecha_Recepcion, Hora_Recepcion, Descripcion_Tipo, Tipo_Documento, Id_Actor, Id_Documento, Id_Usuario, Numero_Folio);
        this.Nombre_Accion = Nombre_Accion;
        this.Id_Envio = Id_Envio;
        this.Id_Acciones = Id_Acciones;
    }

    public String getNombre_Accion() {
        return Nombre_Accion;
    }

    public void setNombre_Accion(String Nombre_Accion) {
        this.Nombre_Accion = Nombre_Accion;
    }

    public int getId_Envio() {
        return Id_Envio;
    }

    public void setId_Envio(int Id_Envio) {
        this.Id_Envio = Id_Envio;
    }

    public int getId_Acciones() {
        return Id_Acciones;
    }

    public void setId_Acciones(int Id_Acciones) {
        this.Id_Acciones = Id_Acciones;
    }    
}
//@PianitoDead