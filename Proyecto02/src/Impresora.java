public class Impresora {
    
    
    private String Marca, Serie, Texto;
    public Impresora(){
        
    }
    
    public void Imprimir(Documento Doc){
        this.Texto=Doc.getTexto();
        System.out.println("Datos = " + this.Texto);
    }
}

