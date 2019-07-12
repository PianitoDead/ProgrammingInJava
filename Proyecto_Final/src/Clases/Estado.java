package Clases;

public class Estado extends Documento{
    
    String Descripcion_Estado, Nombre_Estado;
    
    int Id_Estado;

    public Estado() {
    }

    public Estado(String Descripcion_Estado, String Nombre_Estado, int Id_Estado, String Asunto_Documento, String Fecha_Recepcion, String Hora_Recepcion, char Descripcion_Tipo, char Tipo_Documento, int Id_Actor, int Id_Documento, int Id_Usuario, int Numero_Folio) {
        super(Asunto_Documento, Fecha_Recepcion, Hora_Recepcion, Descripcion_Tipo, Tipo_Documento, Id_Actor, Id_Documento, Id_Usuario, Numero_Folio);
        this.Descripcion_Estado = Descripcion_Estado;
        this.Nombre_Estado = Nombre_Estado;
        this.Id_Estado = Id_Estado;
    }

    public String getDescripcion_Estado() {
        return Descripcion_Estado;
    }

    public void setDescripcion_Estado(String Descripcion_Estado) {
        this.Descripcion_Estado = Descripcion_Estado;
    }

    public String getNombre_Estado() {
        return Nombre_Estado;
    }

    public void setNombre_Estado(String Nombre_Estado) {
        this.Nombre_Estado = Nombre_Estado;
    }

    public int getId_Estado() {
        return Id_Estado;
    }

    public void setId_Estado(int Id_Estado) {
        this.Id_Estado = Id_Estado;  
    }
}
//@PianitoDead