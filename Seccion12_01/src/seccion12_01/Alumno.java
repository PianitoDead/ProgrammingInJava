package seccion12_01;
public class Alumno {
    private String AP;
    private String AM;
    private String N;
    private double NU1;
    private double NU2;
    private double NU3;
    private double PROM;
    public Alumno (){}   
    
    public void setAP(String AP) {
        this.AP = AP;
    } 
    
    public String getAP() {
        return AP;
    }

    public String getAM() {
        return AM;
    }

    public void setAM(String AM) {
        this.AM = AM;
    }

    public String getN() {
        return N;
    }

    public void setN(String N) {
        this.N = N;
    }

    public double getNU1() {
        return NU1;
    }

    public void setNU1(double NU1) {
        this.NU1 = NU1;
    }

    public double getNU2() {
        return NU2;
    }

    public void setNU2(double NU2) {
        this.NU2 = NU2;
    }

    public double getNU3() {
        return NU3;
    }

    public void setNU3(double NU3) {
        this.NU3 = NU3;
    }

    public double getPROM() {
        return PROM;
    }

    public void setPROM(double PROM) {
        this.PROM = PROM;
    } 
    
    public void calcularPromedio (){
        PROM = (NU1 * 0.2 + NU2 * 0.3 + NU3 * 0.5);
    
}
}