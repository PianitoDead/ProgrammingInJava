public class Usuario extends Documento{
    
    String Direccion_Usuario, Dni_Usuario, E_mail_Usuario, Nombre, Telefono_Usuario;
    
    int Id_Oficina;
    
    char Ape_Mat, Ape_Pat, Sexo;

    public Usuario() {
    }
    
    public Usuario(String Direccion_Usuario, String Dni_Usuario, String E_mail_Usuario, String Nombre, String Telefono_Usuario, int Id_Oficina, char Ape_Mat, char Ape_Pat, char Sexo, String Asunto_Documento, String Fecha_Recepcion, String Hora_Recepcion, char Descripcion_Tipo, char Tipo_Documento, int Id_Actor, int Id_Documento, int Id_Usuario, int Numero_Folio) {
        super(Asunto_Documento, Fecha_Recepcion, Hora_Recepcion, Descripcion_Tipo, Tipo_Documento, Id_Actor, Id_Documento, Id_Usuario, Numero_Folio);
        this.Direccion_Usuario = Direccion_Usuario;
        this.Dni_Usuario = Dni_Usuario;
        this.E_mail_Usuario = E_mail_Usuario;
        this.Nombre = Nombre;
        this.Telefono_Usuario = Telefono_Usuario;
        this.Id_Oficina = Id_Oficina;
        this.Ape_Mat = Ape_Mat;
        this.Ape_Pat = Ape_Pat;
        this.Sexo = Sexo;
    }

    public String getDireccion_Usuario() {
        return Direccion_Usuario;
    }

    public void setDireccion_Usuario(String Direccion_Usuario) {
        this.Direccion_Usuario = Direccion_Usuario;
    }

    public String getDni_Usuario() {
        return Dni_Usuario;
    }

    public void setDni_Usuario(String Dni_Usuario) {
        this.Dni_Usuario = Dni_Usuario;
    }

    public String getE_mail_Usuario() {
        return E_mail_Usuario;
    }

    public void setE_mail_Usuario(String E_mail_Usuario) {
        this.E_mail_Usuario = E_mail_Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono_Usuario() {
        return Telefono_Usuario;
    }

    public void setTelefono_Usuario(String Telefono_Usuario) {
        this.Telefono_Usuario = Telefono_Usuario;
    }

    public int getId_Oficina() {
        return Id_Oficina;
    }

    public void setId_Oficina(int Id_Oficina) {
        this.Id_Oficina = Id_Oficina;
    }

    public char getApe_Mat() {
        return Ape_Mat;
    }

    public void setApe_Mat(char Ape_Mat) {
        this.Ape_Mat = Ape_Mat;
    }

    public char getApe_Pat() {
        return Ape_Pat;
    }

    public void setApe_Pat(char Ape_Pat) {
        this.Ape_Pat = Ape_Pat;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }
}
//@PianitoDead