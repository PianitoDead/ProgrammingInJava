package lista2;

import java.util.Scanner;

public class Lista2 {

    class Nodo{
        char info;
        Nodo enlace;
    }
    Nodo cab;
    public void InsertarNodo (){
        char N;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un caracter: ");
        N = in.next().charAt(0);
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
        char Dato, Band = 0;
        System.out.println("Ingrese Dato: ");
        Dato = in.next().charAt(Band);
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
    public void ContadordeVocales(){
        Nodo aux=cab;  
        int cont=0;
        while(aux!=null){ 
        if(aux.info=='a' || aux.info=='e' || aux.info=='i' || aux.info=='o' || aux.info=='u')
        cont++;
        aux=aux.enlace;
            }
        System.out.print("\nCantidad de Vocales: "+cont);
            }
    public void ContadordeLetras(){
        Nodo aux=cab;  
        int cont=0;
        while(aux!=null){ 
        cont++;
        aux=aux.enlace;
            }
        System.out.print("\nCantidad de Letras: "+cont);
            }
    }
        

    

    

