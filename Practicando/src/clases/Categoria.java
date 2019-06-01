public class Categoria extends Documento{
    
    String Descripcion_Categoria, Nombre_Categoria;
    
    int Id_Categoria;        

    public Categoria() {
    }
    
    public Categoria(String Descripcion_Categoria, String Nombre_Categoria, int Id_Categoria, String Asunto_Documento, String Fecha_Recepcion, String Hora_Recepcion, char Descripcion_Tipo, char Tipo_Documento, int Id_Actor, int Id_Documento, int Id_Usuario, int Numero_Folio) {
        super(Asunto_Documento, Fecha_Recepcion, Hora_Recepcion, Descripcion_Tipo, Tipo_Documento, Id_Actor, Id_Documento, Id_Usuario, Numero_Folio);
        this.Descripcion_Categoria = Descripcion_Categoria;
        this.Nombre_Categoria = Nombre_Categoria;
        this.Id_Categoria = Id_Categoria;
    }

    public String getDescripcion_Categoria() {
        return Descripcion_Categoria;
    }

    public void setDescripcion_Categoria(String Descripcion_Categoria) {
        this.Descripcion_Categoria = Descripcion_Categoria;
    }

    public String getNombre_Categoria() {
        return Nombre_Categoria;
    }

    public void setNombre_Categoria(String Nombre_Categoria) {
        this.Nombre_Categoria = Nombre_Categoria;
    }

    public int getId_Categoria() {
        return Id_Categoria;
    }

    public void setId_Categoria(int Id_Categoria) {
        this.Id_Categoria = Id_Categoria;
    }    
}
//@PianitoDead