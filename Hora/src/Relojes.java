public class Relojes {
    
    public static void main(String[] args) {
        Hora reloj1 = new Hora();
        reloj1.ponerEnHora(24,17,10,10);
        System.out.println(reloj1.verHora());
        reloj1.incrementar();
        System.out.println(reloj1.verHora());
        reloj1.decrementa();
        System.out.println(reloj1.verHora());

    }
}
