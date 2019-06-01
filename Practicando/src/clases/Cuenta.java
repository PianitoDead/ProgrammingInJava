public class Cuenta extends Documento{
    
    int Id_Cuenta;
    
    String Usuario, Contrasena;
    
    boolean Estado;

    public Cuenta() {
    }
    
    public Cuenta(int Id_Cuenta, String Usuario, String Contrasena, boolean Estado, String Asunto_Documento, String Fecha_Recepcion, String Hora_Recepcion, char Descripcion_Tipo, char Tipo_Documento, int Id_Actor, int Id_Documento, int Id_Usuario, int Numero_Folio) {
        super(Asunto_Documento, Fecha_Recepcion, Hora_Recepcion, Descripcion_Tipo, Tipo_Documento, Id_Actor, Id_Documento, Id_Usuario, Numero_Folio);
        this.Id_Cuenta = Id_Cuenta;
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
        this.Estado = Estado;
    }

    public int getId_Cuenta() {
        return Id_Cuenta;
    }

    public void setId_Cuenta(int Id_Cuenta) {
        this.Id_Cuenta = Id_Cuenta;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
}
//@PianitoDead