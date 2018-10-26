package seccion13_01;
import java.util.ArrayList;
import java.util.Scanner;
public class Seccion13_01 {
    static Scanner in;
    static ArrayList <Producto> oProductos;
    static Producto oProductoAux;
   public static void main(String[] args) {
       in = new Scanner(System.in);
       oProductos = new ArrayList();
       //Objecto Auxiliar
       oProductoAux = new Producto();
       int Op;
       do{
           Op = Menu ();
           switch (Op){
                   case 1 :
                       AgregarProductos();
                   break;
                   case 2 :
                       ListarProductos();
                   break;
                   case 3 :
                       BuscarProducto();
                   break;
                   case 4 :
                       ActualizarProducto();
                   break;
                   case 5 :
                       EliminarProducto();
                   break;
                   case 6 :
                       System.out.println("Hasta pronto!\n");
                   break;
                   default :
                       System.out.println("Opcion incorrecta. Error 404\n");
                   break;
           }
       }while(Op != 6);
    }

   public static int Menu(){
       System.out.println("\n** Menu de Opciones **");
       System.out.println("1. Agregar Productos.");
       System.out.println("2. Listar Productos.");
       System.out.println("3. Buscar Productos.");
       System.out.println("4. Actualizar Productos.");
       System.out.println("5. Eliminar Productos.");
       System.out.println("6. Salir.");
       System.out.println("Elija una Opcion: ");
       return in.nextInt();       
   }
   public static void AgregarProductos (){
       System.out.println("\n** Registrar Productos **");
       //Preparar el obj Aux
       oProductoAux = new Producto();
       //Ingresar datos en el obj aux
       System.out.println("Codigo: ");
       oProductoAux.setCodigo(in.nextInt());
       System.out.println("Nombre: ");
       oProductoAux.setNombre(in.next());
       System.out.println("Precio: ");
       oProductoAux.setPrecio(in.nextDouble());
       //Agregamos Obj Aux a la Coleccion
       oProductos.add(oProductoAux);
       System.out.println("----Fin de Agregar \n");              
   }
   public static void ListarProductos(){
       System.out.println("\n** Listar Productos");
       for (int i = 0; i<oProductos.size(); i++){
           //Recuperar Obj Aux
           oProductoAux = new Producto();
           oProductoAux = oProductos.get(i);
           // Mostrar informacion
           System.out.println("Codigo: " + oProductoAux.getCodigo());
           System.out.println("Nombre: " + oProductoAux.getNombre());
           System.out.println("Precio: " + oProductoAux.getPrecio());
           System.out.println("-----------------");                               
       }
       System.out.println("-- FIn de Listado\n");
   }
   public static int BuscarPorCodigo(int Cod){
       int Pos = -1;
       for(int i = 0; i<oProductos.size(); i++){
           //Preparamos OBJ
           oProductoAux = new Producto ();
           //Recuperarmos el elemento de la pos i
           oProductoAux = oProductos.get(i);
           //si hay coincidencia en el codigo
           if(oProductoAux.getCodigo() == Cod){
               Pos = i;
               break;
           }
       }
       return Pos;
   }
   public static void BuscarProducto(){
       int Cod, Pos;       
       System.out.println("\n** Buscar Producto **");
       System.out.println("Codigo a buscar: ");
       Cod = in.nextInt();
       //Buscamos el codigo y guardamos en pos
       Pos = BuscarPorCodigo(Cod);
       if (Pos > -1){
           System.out.println("\nCodigo del producto encontrado: ");
           System.out.println("Codigo: " + oProductoAux.getCodigo());
           System.out.println("Nombre: " + oProductoAux.getNombre());
           System.out.println("Precio: " + oProductoAux.getPrecio());
                  }
       else{
           System.out.println("El codigo no existe.\n");
           
       }
       System.out.println("-----Fin de buscar\n");
       
   }
   public static void ActualizarProducto(){
       int Cod, Pos;       
       System.out.println("\n** Buscar Producto a **");
       System.out.println("Codigo a buscar: ");
       Cod = in.nextInt();
       //Buscamos el codigo y guardamos en pos
       Pos = BuscarPorCodigo(Cod);
       if (Pos > -1){
           System.out.println("\nCodigo del producto encontrado: ");
           System.out.println("Codigo: " + oProductoAux.getCodigo());
           System.out.println("Nombre: " + oProductoAux.getNombre());
           System.out.println("Precio: " + oProductoAux.getPrecio());
           System.out.println("Desea Actualizar este Producto (S/N)");
          if (in.next().toUpperCase().equals("S")){
               System.out.println("*Ingrese la nueva informacion: ");
               //Ingresar datos en el obj aux
                System.out.println("Codigo: ");
                oProductoAux.setCodigo(in.nextInt());
                System.out.println("Nombre: ");
                oProductoAux.setNombre(in.next());
                System.out.println("Precio: ");
                oProductoAux.setPrecio(in.nextDouble());
                //Actualizar Obj Aux a la Coleccion en la posicion Pos
                oProductos.set(Pos, oProductoAux);
                
               
           }
   }
   
           }
   public static void EliminarProducto(){
       int Cod, Pos;       
       System.out.println("\n** Buscar Producto **");
       System.out.println("Codigo a buscar: ");
       Cod = in.nextInt();
       //Buscamos el codigo y guardamos en pos
       Pos = BuscarPorCodigo(Cod);
       if (Pos > -1){
           System.out.println("\nCodigo del producto encontrado: ");
           System.out.println("Codigo: " + oProductoAux.getCodigo());
           System.out.println("Nombre: " + oProductoAux.getNombre());
           System.out.println("Precio: " + oProductoAux.getPrecio());
           System.out.println("Desea Eliminar este producto (S/N)");
           if (in.next().toUpperCase().equals("S")){
               oProductos.remove(Pos);               
               
           }
              
   }
}
  
}