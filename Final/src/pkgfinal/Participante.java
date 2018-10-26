package pkgfinal;
public class Participante {
    private int Num_Reg;
    private String DNI;
    private String Nombre;
    private String Apellido;
    private String Sexo;    
    private double Cal_1;
    private double Cal_2;
    private double Cal_Fin;
    //Costructores
    public Participante (){     
                            }
    public Participante(int Num_Reg, String DNI, String Nombre, String Apellido, String Sexo, double Cal_1, double Cal_2, double Cal_Fin) {
        this.Num_Reg = Num_Reg;
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo = Sexo;
        this.Cal_1 = Cal_1;
        this.Cal_2 = Cal_2;
        this.Cal_Fin = Cal_Fin;
    }
    //Set and Get
    public int getNum_Reg() {
        return Num_Reg;
    }
    public void setNum_Reg(int Num_Reg) {
        this.Num_Reg = Num_Reg;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    public String getSexo() {
        return Sexo;
    }     
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    public double getCal_1() {
        return Cal_1;
    }
    public void setCal_1(double Cal_1) {
        this.Cal_1 = Cal_1;
    }
    public double getCal_2() {
        return Cal_2;
    }
    public void setCal_2(double Cal_2) {
        this.Cal_2 = Cal_2;
    }
    public double getCal_Fin() {
        return Cal_Fin;
    }
    public void setCal_Fin(double Cal_Fin) {
        this.Cal_Fin = Cal_Fin;
    }
    public void Cal_Prom (){//SE PODRA CALCULAR EL PROMEDIO GRACIAS A ESTE
        this.Cal_Fin = this.Cal_1 + this.Cal_2;
    }
    public void Calcular_Cert (){//SE ESTABLECERA CALCULAR CARTIFICADO
        if (Cal_Fin <= 0){//SI EL PARTICIPANTE OBTUVO 0 PUNTOS OBTENDRA NADA
            System.out.println("Lamentablemente el Participante no Asistio al Evento :( ");
        }
            else if (Cal_Fin < 60){//SI EL PARTICIPANTE OBRUVO UNA NOTA MENOR A 60 PUNTOS OBTENDRA EL CERTIFICADO DE PARTICIPACION 
                System.out.println("Obtuvo el Certificado: ");
                System.out.println("Participacion al Evento Academico.");    
                System.out.println("Otorgado al Participante: " + Nombre);
                System.out.println("Que obtuvo un Puntaje Final de: " + Cal_Fin + " Puntos :) ");
                            }
            else if(Cal_Fin >=60){//SI EL APRTICIPANTE OBTUVO UA NOTA MAYOR A 60 PUNTOS OBTENDRA EL CERTIFICADO DE APROBACIÓN
                System.out.println("¡Felicidades! Aprobo y por lo tanto obtuvo el Certificado:");
                System.out.println("Aprobacion del Evento Academico.");
                System.out.println("Concedido al Participante: " + Nombre);
                System.out.println("Que logro alcanzar un Puntaje Final de: " + Cal_Fin + " Puntos. ¡Felicidades! :) ");
            }
    }   
}