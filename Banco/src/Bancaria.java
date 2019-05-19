public class Bancaria {
    
    public float n_Cuenta ;
    public float s_Actual;
    public float i_Anual;
    
    
    //Constructor
    
    
    public Bancaria() {
    }

    public float getN_Cuenta() {
        return n_Cuenta;
    }

    public void setN_Cuenta(float n_Cuenta) {
        this.n_Cuenta = n_Cuenta;
    }

    public float getS_Actual() {
        return s_Actual;
    }

    public void setS_Actual(float s_Actual) {
        this.s_Actual = s_Actual;
    }

    public float getI_Anual() {
        return i_Anual;
    }

    public void setI_Anual(float i_Anual) {
        this.i_Anual = i_Anual;
    }
    
    
    
    
    //Actualizar saldo.
    
    public float actualizarSaldo() {
        float s_Nuevo;
        s_Nuevo = s_Actual + (s_Actual * ((i_Anual / 100) / 365));
        return s_Nuevo;
    }
    
    
    //Ingresar Saldo.
    
    public double ingresar(double cant_Ingresada) {
        double nuevo_monto;
        nuevo_monto = actualizarSaldo() + cant_Ingresada;
        return nuevo_monto;
    }
    
    //Retirara saldo.
    
    public double retirar(double cant_retiro) {
        double nuevo_monto = 0;
        if (this.s_Actual >= cant_retiro) {
            nuevo_monto = actualizarSaldo() - cant_retiro;
        } else {
            System.out.println("No hay saldo suficiente en su cuenta. :( ");
        }
        return nuevo_monto;
    }
    
    
}