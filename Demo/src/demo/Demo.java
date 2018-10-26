package demo;
public class Demo {    
    public static void main(String[] args) {
        for (int i=1; i<=11; i++){
            System.out.println("No volvere a lanzar cosas " + i);
        }
        for (int j=1; j<=10; j+=2){
            System.out.println("Ejemplo: " + j);
        }
        int n;
        int c;
        n = 5;
        c = 0;
        while (c <= 12){
            System.out.println(n + " x " +  c + " = " +(n*c));
            c++ ;
        }
    }
    
}
