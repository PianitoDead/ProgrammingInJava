public class EquipoSonido {

private int Potencia, Voltios, numCD;
private String Marca;

public EquipoSonido(){
    
    this.Marca = "Sony";
    
    System.out.println("Constructor por Defecto.");
}

public EquipoSonido(String ma, int P, int V){
    
    this.Marca=ma;
    
    this.Potencia=P;
    
    this.Voltios=V;
    
    this.numCD=10;
    
    System.out.println("Constructor con 3 argumentos.");
}


}
