package Clases;

public class Envio extends Documento {
    
    String Destinatario, Fecha_Envio, Hora_Envio, Remitente;
    
    int Id_Oficina;

    public Envio() {
    }

    public Envio(String Destinatario, String Fecha_Envio, String Hora_Envio, String Remitente, int Id_Oficina, String Asunto_Documento, String Fecha_Recepcion, String Hora_Recepcion, char Descripcion_Tipo, char Tipo_Documento, int Id_Actor, int Id_Documento, int Id_Usuario, int Numero_Folio) {
        super(Asunto_Documento, Fecha_Recepcion, Hora_Recepcion, Descripcion_Tipo, Tipo_Documento, Id_Actor, Id_Documento, Id_Usuario, Numero_Folio);
        this.Destinatario = Destinatario;
        this.Fecha_Envio = Fecha_Envio;
        this.Hora_Envio = Hora_Envio;
        this.Remitente = Remitente;
        this.Id_Oficina = Id_Oficina;
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }

    public String getFecha_Envio() {
        return Fecha_Envio;
    }

    public void setFecha_Envio(String Fecha_Envio) {
        this.Fecha_Envio = Fecha_Envio;
    }

    public String getHora_Envio() {
        return Hora_Envio;
    }

    public void setHora_Envio(String Hora_Envio) {
        this.Hora_Envio = Hora_Envio;
    }

    public String getRemitente() {
        return Remitente;
    }

    public void setRemitente(String Remitente) {
        this.Remitente = Remitente;
    }

    public int getId_Oficina() {
        return Id_Oficina;
    }

    public void setId_Oficina(int Id_Oficina) {
        this.Id_Oficina = Id_Oficina;
    } 
}
//@PianitoDead