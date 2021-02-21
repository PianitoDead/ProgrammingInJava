package Clases;
/**
 *
 * @author PianitoDead
 */
public class Estadisticas {
    
    private int Daño_1, /*Para 1 casilla*/Daño_Orbe_1, Daño_1_Porcentaje,/*Para 2 casillas*/Daño_Orbe_1_2, Daño_1_Porcentaje_2;
    
    private int Daño_2, /*Para 1 casilla*/Daño_Orbe_2, Daño_2_Porcentaje,/*Para 2 casillas*/Daño_Orbe_2_2, Daño_2_Porcentaje_2;
    
    private int Vida, /* Para 1 casilla*/Vida_Orbe, Porc_Vida,/*Para 2 casillas*/Vida_Orbe_2, Porc_Vida_2;
    
    private double Velocidad, Velocidad_Orbe, Vel_Porc;
    
    //Para 1 casilla(Orbes Predeterminados o Heredados)
    private int Habilidad_Heredada_1, Habilidad_Her_Orbe, Habilidad_Her_Porc, Habilidad_Heredada_2, Habilidad_Her_Orbe_2, Habilidad_Her_Porc_2;
    
    //Para 1 casilla(Orbes Secundarios)
    private int Habilidad_Secundaria, Habilidad_Secundaria_2, Habilidad_Sec_Porc, Habilidad_Sec_Orbe, Habilidad_Sec_Orbe_2, Habilidad_Sec_Porc_2; 
    
    //Para 2 casillas(Orbes Predeterminados o Heredados)
    private int Habilidad_Heredada_1_2, Habilidad_Her_Orbe1_2, Habilidad_Her_Porc1_2, Habilidad_Her_Orbe2_2, Habilidad_Her_Porc2_2, Habilidad_Heredada_2_2;
    
    //Para 2 casillas(Orbes Secundarios)
    private int Habilidad_Sec_Orbe1_2, Habilidad_Sec_Porc1_2, Habilidad_Sec_Orbe2_2, Habilidad_Sec_Porc2_2;
        
    private String Nombre, Hab_Nombre;
    
    private int Num_Orbes, Num_Hab, Num_Hab_Sec;
    
    private int Hab_Porc_Att_1, Hab_Porc_Att_1_2, Hab_Porc_Att_2, Hab_Porc_Att_2_2;

    public Estadisticas(){
        
    }

    public int getDaño_1() {
        return Daño_1;
    }

    public void setDaño_1(int Daño_1) {
        this.Daño_1 = Daño_1;
    }

    public int getDaño_Orbe_1() {
        return Daño_Orbe_1;
    }

    public void setDaño_Orbe_1(int Daño_Orbe_1) {
        this.Daño_Orbe_1 = Daño_Orbe_1;
    }

    public int getDaño_1_Porcentaje() {
        return Daño_1_Porcentaje;
    }

    public void setDaño_1_Porcentaje(int Daño_1_Porcentaje) {
        this.Daño_1_Porcentaje = Daño_1_Porcentaje;
    }

    public int getDaño_Orbe_1_2() {
        return Daño_Orbe_1_2;
    }

    public void setDaño_Orbe_1_2(int Daño_Orbe_1_2) {
        this.Daño_Orbe_1_2 = Daño_Orbe_1_2;
    }

    public int getDaño_1_Porcentaje_2() {
        return Daño_1_Porcentaje_2;
    }

    public void setDaño_1_Porcentaje_2(int Daño_1_Porcentaje_2) {
        this.Daño_1_Porcentaje_2 = Daño_1_Porcentaje_2;
    }

    public int getDaño_2() {
        return Daño_2;
    }

    public void setDaño_2(int Daño_2) {
        this.Daño_2 = Daño_2;
    }

    public int getDaño_Orbe_2() {
        return Daño_Orbe_2;
    }

    public void setDaño_Orbe_2(int Daño_Orbe_2) {
        this.Daño_Orbe_2 = Daño_Orbe_2;
    }

    public int getDaño_2_Porcentaje() {
        return Daño_2_Porcentaje;
    }

    public void setDaño_2_Porcentaje(int Daño_2_Porcentaje) {
        this.Daño_2_Porcentaje = Daño_2_Porcentaje;
    }

    public int getDaño_Orbe_2_2() {
        return Daño_Orbe_2_2;
    }

    public void setDaño_Orbe_2_2(int Daño_Orbe_2_2) {
        this.Daño_Orbe_2_2 = Daño_Orbe_2_2;
    }

    public int getDaño_2_Porcentaje_2() {
        return Daño_2_Porcentaje_2;
    }

    public void setDaño_2_Porcentaje_2(int Daño_2_Porcentaje_2) {
        this.Daño_2_Porcentaje_2 = Daño_2_Porcentaje_2;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public int getVida_Orbe() {
        return Vida_Orbe;
    }

    public void setVida_Orbe(int Vida_Orbe) {
        this.Vida_Orbe = Vida_Orbe;
    }

    public int getPorc_Vida() {
        return Porc_Vida;
    }

    public void setPorc_Vida(int Porc_Vida) {
        this.Porc_Vida = Porc_Vida;
    }

    public int getVida_Orbe_2() {
        return Vida_Orbe_2;
    }

    public void setVida_Orbe_2(int Vida_Orbe_2) {
        this.Vida_Orbe_2 = Vida_Orbe_2;
    }

    public int getPorc_Vida_2() {
        return Porc_Vida_2;
    }

    public void setPorc_Vida_2(int Porc_Vida_2) {
        this.Porc_Vida_2 = Porc_Vida_2;
    }

    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(double Velocidad) {
        this.Velocidad = Velocidad;
    }

    public double getVelocidad_Orbe() {
        return Velocidad_Orbe;
    }

    public void setVelocidad_Orbe(double Velocidad_Orbe) {
        this.Velocidad_Orbe = Velocidad_Orbe;
    }

    public double getVel_Porc() {
        return Vel_Porc;
    }

    public void setVel_Porc(double Vel_Porc) {
        this.Vel_Porc = Vel_Porc;
    }

    public int getHabilidad_Heredada_1() {
        return Habilidad_Heredada_1;
    }

    public void setHabilidad_Heredada_1(int Habilidad_Heredada_1) {
        this.Habilidad_Heredada_1 = Habilidad_Heredada_1;
    }

    public int getHabilidad_Her_Orbe() {
        return Habilidad_Her_Orbe;
    }

    public void setHabilidad_Her_Orbe(int Habilidad_Her_Orbe) {
        this.Habilidad_Her_Orbe = Habilidad_Her_Orbe;
    }

    public int getHabilidad_Her_Porc() {
        return Habilidad_Her_Porc;
    }

    public void setHabilidad_Her_Porc(int Habilidad_Her_Porc) {
        this.Habilidad_Her_Porc = Habilidad_Her_Porc;
    }

    public int getHabilidad_Heredada_2() {
        return Habilidad_Heredada_2;
    }

    public void setHabilidad_Heredada_2(int Habilidad_Heredada_2) {
        this.Habilidad_Heredada_2 = Habilidad_Heredada_2;
    }

    public int getHabilidad_Her_Orbe_2() {
        return Habilidad_Her_Orbe_2;
    }

    public void setHabilidad_Her_Orbe_2(int Habilidad_Her_Orbe_2) {
        this.Habilidad_Her_Orbe_2 = Habilidad_Her_Orbe_2;
    }

    public int getHabilidad_Her_Porc_2() {
        return Habilidad_Her_Porc_2;
    }

    public void setHabilidad_Her_Porc_2(int Habilidad_Her_Porc_2) {
        this.Habilidad_Her_Porc_2 = Habilidad_Her_Porc_2;
    }

    public int getHabilidad_Secundaria() {
        return Habilidad_Secundaria;
    }

    public void setHabilidad_Secundaria(int Habilidad_Secundaria) {
        this.Habilidad_Secundaria = Habilidad_Secundaria;
    }

    public int getHabilidad_Secundaria_2() {
        return Habilidad_Secundaria_2;
    }

    public void setHabilidad_Secundaria_2(int Habilidad_Secundaria_2) {
        this.Habilidad_Secundaria_2 = Habilidad_Secundaria_2;
    }

    public int getHabilidad_Sec_Porc() {
        return Habilidad_Sec_Porc;
    }

    public void setHabilidad_Sec_Porc(int Habilidad_Sec_Porc) {
        this.Habilidad_Sec_Porc = Habilidad_Sec_Porc;
    }

    public int getHabilidad_Sec_Orbe() {
        return Habilidad_Sec_Orbe;
    }

    public void setHabilidad_Sec_Orbe(int Habilidad_Sec_Orbe) {
        this.Habilidad_Sec_Orbe = Habilidad_Sec_Orbe;
    }

    public int getHabilidad_Sec_Orbe_2() {
        return Habilidad_Sec_Orbe_2;
    }

    public void setHabilidad_Sec_Orbe_2(int Habilidad_Sec_Orbe_2) {
        this.Habilidad_Sec_Orbe_2 = Habilidad_Sec_Orbe_2;
    }

    public int getHabilidad_Sec_Porc_2() {
        return Habilidad_Sec_Porc_2;
    }

    public void setHabilidad_Sec_Porc_2(int Habilidad_Sec_Porc_2) {
        this.Habilidad_Sec_Porc_2 = Habilidad_Sec_Porc_2;
    }

    public int getHabilidad_Heredada_1_2() {
        return Habilidad_Heredada_1_2;
    }

    public void setHabilidad_Heredada_1_2(int Habilidad_Heredada_1_2) {
        this.Habilidad_Heredada_1_2 = Habilidad_Heredada_1_2;
    }

    public int getHabilidad_Her_Orbe1_2() {
        return Habilidad_Her_Orbe1_2;
    }

    public void setHabilidad_Her_Orbe1_2(int Habilidad_Her_Orbe1_2) {
        this.Habilidad_Her_Orbe1_2 = Habilidad_Her_Orbe1_2;
    }

    public int getHabilidad_Her_Porc1_2() {
        return Habilidad_Her_Porc1_2;
    }

    public void setHabilidad_Her_Porc1_2(int Habilidad_Her_Porc1_2) {
        this.Habilidad_Her_Porc1_2 = Habilidad_Her_Porc1_2;
    }

    public int getHabilidad_Her_Orbe2_2() {
        return Habilidad_Her_Orbe2_2;
    }

    public void setHabilidad_Her_Orbe2_2(int Habilidad_Her_Orbe2_2) {
        this.Habilidad_Her_Orbe2_2 = Habilidad_Her_Orbe2_2;
    }

    public int getHabilidad_Her_Porc2_2() {
        return Habilidad_Her_Porc2_2;
    }

    public void setHabilidad_Her_Porc2_2(int Habilidad_Her_Porc2_2) {
        this.Habilidad_Her_Porc2_2 = Habilidad_Her_Porc2_2;
    }

    public int getHabilidad_Heredada_2_2() {
        return Habilidad_Heredada_2_2;
    }

    public void setHabilidad_Heredada_2_2(int Habilidad_Heredada_2_2) {
        this.Habilidad_Heredada_2_2 = Habilidad_Heredada_2_2;
    }

    public int getHabilidad_Sec_Orbe1_2() {
        return Habilidad_Sec_Orbe1_2;
    }

    public void setHabilidad_Sec_Orbe1_2(int Habilidad_Sec_Orbe1_2) {
        this.Habilidad_Sec_Orbe1_2 = Habilidad_Sec_Orbe1_2;
    }

    public int getHabilidad_Sec_Porc1_2() {
        return Habilidad_Sec_Porc1_2;
    }

    public void setHabilidad_Sec_Porc1_2(int Habilidad_Sec_Porc1_2) {
        this.Habilidad_Sec_Porc1_2 = Habilidad_Sec_Porc1_2;
    }

    public int getHabilidad_Sec_Orbe2_2() {
        return Habilidad_Sec_Orbe2_2;
    }

    public void setHabilidad_Sec_Orbe2_2(int Habilidad_Sec_Orbe2_2) {
        this.Habilidad_Sec_Orbe2_2 = Habilidad_Sec_Orbe2_2;
    }

    public int getHabilidad_Sec_Porc2_2() {
        return Habilidad_Sec_Porc2_2;
    }

    public void setHabilidad_Sec_Porc2_2(int Habilidad_Sec_Porc2_2) {
        this.Habilidad_Sec_Porc2_2 = Habilidad_Sec_Porc2_2;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getHab_Nombre() {
        return Hab_Nombre;
    }

    public void setHab_Nombre(String Hab_Nombre) {
        this.Hab_Nombre = Hab_Nombre;
    }

    public int getNum_Orbes() {
        return Num_Orbes;
    }

    public void setNum_Orbes(int Num_Orbes) {
        this.Num_Orbes = Num_Orbes;
    }

    public int getNum_Hab() {
        return Num_Hab;
    }

    public void setNum_Hab(int Num_Hab) {
        this.Num_Hab = Num_Hab;
    }

    public int getNum_Hab_Sec() {
        return Num_Hab_Sec;
    }

    public void setNum_Hab_Sec(int Num_Hab_Sec) {
        this.Num_Hab_Sec = Num_Hab_Sec;
    }

    public int getHab_Porc_Att_1() {
        return Hab_Porc_Att_1;
    }

    public void setHab_Porc_Att_1(int Hab_Porc_Att_1) {
        this.Hab_Porc_Att_1 = Hab_Porc_Att_1;
    }

    public int getHab_Porc_Att_1_2() {
        return Hab_Porc_Att_1_2;
    }

    public void setHab_Porc_Att_1_2(int Hab_Porc_Att_1_2) {
        this.Hab_Porc_Att_1_2 = Hab_Porc_Att_1_2;
    }

    public int getHab_Porc_Att_2() {
        return Hab_Porc_Att_2;
    }

    public void setHab_Porc_Att_2(int Hab_Porc_Att_2) {
        this.Hab_Porc_Att_2 = Hab_Porc_Att_2;
    }

    public int getHab_Porc_Att_2_2() {
        return Hab_Porc_Att_2_2;
    }

    public void setHab_Porc_Att_2_2(int Hab_Porc_Att_2_2) {
        this.Hab_Porc_Att_2_2 = Hab_Porc_Att_2_2;
    }     
   
}