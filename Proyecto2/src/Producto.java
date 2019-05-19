import javax.swing.JOptionPane;
public class Producto {
    private String Codigo, Descripcion, Marca;
    private int Stock, Salida;
    private double Precio;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getSalida() {
        return Salida;
    }

    public void setSalida(int Salida) {
        this.Salida = Salida;
    }
    
    
    public void StockValorizado(){
        double Valor;
        Valor = this.Stock*this.Precio;
        
        JOptionPane.showMessageDialog(null, "Valor = " + Valor);
    }
    
    

    
    
}
