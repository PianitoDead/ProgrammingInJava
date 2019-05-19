import javax.swing.JOptionPane;

public class Ejemplo2 {

    public static void main (String [] arg){    
        
        Producto Prod1 = new Producto();
        
        Prod1.setCodigo(JOptionPane.showInputDialog("Ingrese Codigo: "));
        Prod1.setDescripcion(JOptionPane.showInputDialog("Ingrese Descripcion: "));
        Prod1.setMarca(JOptionPane.showInputDialog("Ingrese Marca: "));
        Prod1.setStock(Integer.parseInt(JOptionPane.showInputDialog("ingrese Stock: ")));
        Prod1.setSalida(Integer.parseInt(JOptionPane.showInputDialog("ingrese Salidas: ")));
        Prod1.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("ingrese Precio: ")));
        
        //--------------------------------------------------------------------------------------
        //Mostar Stock Valorizado.
        
        Prod1.StockValorizado();
        
    }
}
