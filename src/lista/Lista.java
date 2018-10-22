package lista;
import java.util.Scanner;
public class Lista {
    class Nodo{
        int info;
        Nodo enlace;
    }
    Nodo cab;
    public void InsertarNodo (){
        int N;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        N = in.nextInt();
        if (cab==null){
            cab = new Nodo();
            cab.info=N;
            cab.enlace=null;
        }
        else{
            Nodo temp = new Nodo();
            temp.info=N;
            temp.enlace=cab;
            cab=temp;
        }            
    }
    public void Mostrar(){
        Nodo aux = cab;
        while (aux!=null){
            System.out.print(aux.info+"-> ");
            aux=aux.enlace;
        }
    }
    public void Eliminar(){
        if (cab.enlace==null)
            cab = null;
        else{
            Nodo copia = cab;
            Nodo aux = null;
            while (copia.enlace!=null){
                aux = copia;
                copia = copia.enlace;
            }aux.enlace = copia.enlace;
        }
    }
    public void Buscar (){
        Scanner in = new Scanner(System.in);
        int Dato, Band = 0;
        System.out.println("Ingrese Dato: ");
        Dato = in.nextInt();
        Nodo aux = cab;
        while (aux!=null){
            if(aux.info==Dato)
                Band = 1;
                aux = aux.enlace;
        }
            if(Band == 1)
                System.out.println("Si esta en la lista.");
            else 
                System.out.println("No esta en la lista.");
        }
    public void Promedio(){
        Nodo aux;
        aux = cab;
        int cont = 0, acum = 0, prom = 0;
        while(aux!=null){
            acum = acum+aux.info;
            cont++;
            aux = aux.enlace;
            prom = acum/cont;
            System.out.println("\n El Total es: " + acum);
            System.out.println("\n El Promedio es: " + prom);
        }
    }
    public void MayoroMenor(){
        Nodo aux = cab;
        int Mayor = 0, Menor;
        Menor = aux.info;
        while(aux!=null){
            if(aux.info>Mayor)
            Mayor = aux.info;
            if(aux.info<Menor)
                Menor = aux.info;     
            aux = aux.enlace;
        System.out.println("\n El mayor es: " + Mayor);
            System.out.println("\n El Menor es: " + Menor);
        }
    }
    public void ContarPrimos(){
        Nodo aux=cab;  
        int cont=0;
        while(aux!=null){
        if(esprimo(aux.info))
        cont++;
        aux=aux.enlace;
            }
        System.out.print("\nCantidad de primos: "+cont);
            }
    public boolean esprimo(int N){
        int C=0;
        for(int i=1;i<=N;i++)
        if(N%i==0)
        C++;
        if(C<=2)
        return true;
        return false;
        }   
    public void NumerosAleatorios(){
        int N,i;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la canitdad de Numeros: ");
        N=in.nextInt();
        for(i=1; i<=N; i++){
            int Numero = (int)(Math.random()*100+1);
            InsertarNodo2(Numero);
        }
    }
    public void InsertarNodo2 (int N){
        if (cab==null){
            cab=new Nodo();
            cab.info=N;
            cab.enlace=null;
        }
        else{
            Nodo temp = new Nodo();
            temp.info = N;
            temp.enlace = cab;
            cab = temp;
        }
                }
    }
