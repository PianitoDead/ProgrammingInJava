package seccion14;
public class Asegurado {
    private String DNI;
    private String Apellido;
    private String Nombre;
    private String Sexo;
    private int A�o_N;
    private int Edad;
    private int TipoSeguro; // 0 = Ninguno, 1 = ESSalud, 2 = SIS, 3 = Privado
    private int TipoAsegurado; // 1 = Titular, 2 = Derechohabiente
    
    //Costructores
    public Asegurado (){
    }
    public Asegurado(String DNI, String Apellido, String Nombre, String Sexo, int A�o_N, int Edad, int TipoSeguro, int TipoAsegurado) {
        this.DNI = DNI;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.A�o_N = A�o_N;
        this.Edad = Edad;
        this.TipoSeguro = TipoSeguro;
        this.TipoAsegurado = TipoAsegurado;
    }
    
    //Get and Set

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getA�o_N() {
        return A�o_N;
    }

    public void setA�o_N(int A�o_N) {
        this.A�o_N = A�o_N;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getTipoSeguro() {
        return TipoSeguro;
    }

    public void setTipoSeguro(int TipoSeguro) {
        this.TipoSeguro = TipoSeguro;
    }

    public int getTipoAsegurado() {
        return TipoAsegurado;
    }

    public void setTipoAsegurado(int TipoAsegurado) {
        this.TipoAsegurado = TipoAsegurado;
    }   
    //Metodos adicionales
    public void calcularEdad(){
        this.Edad = 2018 - this.A�o_N;
    }
   
}
