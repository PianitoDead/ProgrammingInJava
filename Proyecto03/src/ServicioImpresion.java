public class ServicioImpresion {
        ServicioEnvio servicioA;
    ServicioPDF servicioB;     
    public ServicioImpresion() {         
        this.servicioA= new ServicioEnvio();
        this.servicioB= new ServicioPDF();
    }
    public void imprimir() {         
        servicioA.enviar();
        servicioB.pdf();
      }    }
    
}
