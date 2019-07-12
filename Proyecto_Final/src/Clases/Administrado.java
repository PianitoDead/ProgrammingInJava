package Clases;

public class Administrado extends Documento{
    
    String Administrado, Direccion_Administrado, Dni_Administrado, Telefono_Administrado;
            
    int Id_Administrado;
            
    char Sexo_Administrado;

    public Administrado() {
    }

    public Administrado(String Administrado, String Direccion_Administrado, String Dni_Administrado, String Telefono_Administrado, int Id_Administrado, char Sexo_Administrado, String Asunto_Documento, String Fecha_Recepcion, String Hora_Recepcion, char Descripcion_Tipo, char Tipo_Documento, int Id_Actor, int Id_Documento, int Id_Usuario, int Numero_Folio) {
        super(Asunto_Documento, Fecha_Recepcion, Hora_Recepcion, Descripcion_Tipo, Tipo_Documento, Id_Actor, Id_Documento, Id_Usuario, Numero_Folio);
        this.Administrado = Administrado;
        this.Direccion_Administrado = Direccion_Administrado;
        this.Dni_Administrado = Dni_Administrado;
        this.Telefono_Administrado = Telefono_Administrado;
        this.Id_Administrado = Id_Administrado;
        this.Sexo_Administrado = Sexo_Administrado;
    }

    public String getAdministrado() {
        return Administrado;
    }

    public void setAdministrado(String Administrado) {
        this.Administrado = Administrado;
    }

    public String getDireccion_Administrado() {
        return Direccion_Administrado;
    }

    public void setDireccion_Administrado(String Direccion_Administrado) {
        this.Direccion_Administrado = Direccion_Administrado;
    }

    public String getDni_Administrado() {
        return Dni_Administrado;
    }

    public void setDni_Administrado(String Dni_Administrado) {
        this.Dni_Administrado = Dni_Administrado;
    }

    public String getTelefono_Administrado() {
        return Telefono_Administrado;
    }

    public void setTelefono_Administrado(String Telefono_Administrado) {
        this.Telefono_Administrado = Telefono_Administrado;
    }

    public int getId_Administrado() {
        return Id_Administrado;
    }

    public void setId_Administrado(int Id_Administrado) {
        this.Id_Administrado = Id_Administrado;
    }

    public char getSexo_Administrado() {
        return Sexo_Administrado;
    }

    public void setSexo_Administrado(char Sexo_Administrado) {
        this.Sexo_Administrado = Sexo_Administrado;
    }    
}
//@PianitoDead