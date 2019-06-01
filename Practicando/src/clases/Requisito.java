public class Requisito extends Documento{
    
    String Nombre_Requisito, Nombre_Procedimiento;
    
    int Id_Oficina, Id_Requisito;

    public Requisito() {
    }

    public Requisito(String Nombre_Requisito, String Nombre_Procedimiento, int Id_Oficina, int Id_Requisito, String Asunto_Documento, String Fecha_Recepcion, String Hora_Recepcion, char Descripcion_Tipo, char Tipo_Documento, int Id_Actor, int Id_Documento, int Id_Usuario, int Numero_Folio) {
        super(Asunto_Documento, Fecha_Recepcion, Hora_Recepcion, Descripcion_Tipo, Tipo_Documento, Id_Actor, Id_Documento, Id_Usuario, Numero_Folio);
        this.Nombre_Requisito = Nombre_Requisito;
        this.Nombre_Procedimiento = Nombre_Procedimiento;
        this.Id_Oficina = Id_Oficina;
        this.Id_Requisito = Id_Requisito;
    }

    public String getNombre_Requisito() {
        return Nombre_Requisito;
    }

    public void setNombre_Requisito(String Nombre_Requisito) {
        this.Nombre_Requisito = Nombre_Requisito;
    }

    public String getNombre_Procedimiento() {
        return Nombre_Procedimiento;
    }

    public void setNombre_Procedimiento(String Nombre_Procedimiento) {
        this.Nombre_Procedimiento = Nombre_Procedimiento;
    }

    public int getId_Oficina() {
        return Id_Oficina;
    }

    public void setId_Oficina(int Id_Oficina) {
        this.Id_Oficina = Id_Oficina;
    }

    public int getId_Requisito() {
        return Id_Requisito;
    }

    public void setId_Requisito(int Id_Requisito) {
        this.Id_Requisito = Id_Requisito;
    }
}
//@PianitoDead