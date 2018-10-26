package seccion14;
import java.util.ArrayList;
import java.util.Scanner;
public class Seccion14 {
    static Scanner in;
    static ArrayList<Asegurado> listaAsegurados;
    static Asegurado oAsegurado;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        listaAsegurados = new ArrayList();
        oAsegurado = new Asegurado ();
        int Op;
        String repetir;
        do{
            repetir = "S";
        Op = Menu (); 
        switch (Op) {
            case 1:
                do{
                    //Registrar
                Registrar();
                    System.out.println("Desea Registrar a otro S/N");
                    repetir = in.next();
                }while(repetir.toUpperCase().equals("N") == false);
                break;
                case 2:
                    do{
                    //Actualizar
                    ActualizarAsegurado();
                    System.out.println("Desea Actualizar a otro S/N");
                    repetir = in.next();
                }while(repetir.toUpperCase().equals("N") == false);                    
                    break;
                    case 3:
                        do{
                        //Buscar
                        BuscarPaciente();
                        System.out.println("Desea Buscar a otro S/N");
                    repetir = in.next();
                }while(repetir.toUpperCase().equals("N") == false);    
                        break;
                    case 4:
                        ActualizarSeguro();
                        break;
                        case 5:
                            do{
                            //Eliminar
                            EliminarPaciente();
                            System.out.println("Desea Eliminar a otro S/N");
                    repetir = in.next();
                }while(repetir.toUpperCase().equals("N") == false); 
                            break;
                            case 6:
                                //Listar
                                Listados();
                                break;
                                case 7:
                                    //Salir
                                    System.out.println("Adios.");
                                    break;
                                default:
                                    System.out.println("Opcion Incorrecta.");                                                         
        }
        } while (Op !=7);               
    }
    public static int Menu (){
        System.out.println("++ Menu Principal ++");
        System.out.println("1. Registrar Paciente");
        System.out.println("2. Actualizar Asegurado");
        System.out.println("3. Buscar Paciente");
        System.out.println("4. Actualizar Seguro");
        System.out.println("5. Eliminar Paciente");
        System.out.println("6. Listados");
        System.out.println("7. Salir");
        System.out.println("Elija Opcion: ");
        return in.nextInt();
    }    
    public static void Registrar(){
        oAsegurado = new Asegurado ();
        System.out.println("++ Registar Paciente ++");
        System.out.println("DNI: ");
        oAsegurado.setDNI(in.next());
        System.out.println("Nombre: ");
        oAsegurado.setNombre(in.next());
        System.out.println("Apellido: ");
        oAsegurado.setApellido(in.next());
        System.out.println("Sexo (1. Masculino 2. Femenino): ");
        if(in.nextInt() == 1){ 
            oAsegurado.setSexo("M");
        } else{
            oAsegurado.setSexo("F");
        }
        System.out.println("Año de Nacimiento: ");
        oAsegurado.setAño_N(in.nextInt());
        oAsegurado.calcularEdad();
        listaAsegurados.add(oAsegurado);
    }
    public static void ActualizarAsegurado(){
         int Pos;
         String DNI;
       System.out.println("** Buscar Asegurado**");
       System.out.println("DNI a buscar: ");
       DNI = in.next();
       //Buscamos el codigo y guardamos en pos
       Pos = BuscarXDNI(DNI);
       if (Pos > -1){
           System.out.println("Informacion del Asegurado: ");
           oAsegurado = new Asegurado();
           oAsegurado = listaAsegurados.get(Pos);
           System.out.println("Nombre: " + oAsegurado.getNombre());
           System.out.println("Desea Actualizar Nombre S/N: ");
           if (in.next().toUpperCase().equals("S")){
               System.out.println("Nuevo Nombre: ");
               oAsegurado.setNombre(in.next());           }
           System.out.println("Apellido: " + oAsegurado.getApellido());
           System.out.println("Desea Actualizar Apellido S/N: ");
           if (in.next().toUpperCase().equals("S")){
               System.out.println("Nuevo Apellido: ");
               oAsegurado.setApellido(in.next());}
           System.out.println("Sexo: " + oAsegurado.getSexo());
           System.out.println("Desea Actualizar Sexo S/N: ");
           if (in.next().toUpperCase().equals("S")){
               System.out.println("Nuevo Sexo: ");
               oAsegurado.setSexo(in.next()); }
           System.out.println("Año de Nacimiento: " + oAsegurado.getAño_N());
           System.out.println("Desea Actualizar Ano de nacimiento S/N: ");
           if (in.next().toUpperCase().equals("S")){
               System.out.println("Nuevo ano de nacimiento: ");
               oAsegurado.setAño_N(in.nextInt()); 
           oAsegurado.calcularEdad();}
           listaAsegurados.set(Pos, oAsegurado);
            }else{
           System.out.println("Asegurado no Regitrado");
       }
        System.out.println("++ Actualizar Asegurado Finalizado ++");
    }
    public static void BuscarPaciente(){
        int Pos;
         String DNI;
       System.out.println("** Buscar Asegurado**");
       System.out.println("DNI a buscar: ");
       DNI = in.next();
       //Buscamos el codigo y guardamos en pos
       Pos = BuscarXDNI(DNI);
       if (Pos > -1){
           System.out.println("Informacion del Asegurado: ");
           oAsegurado = new Asegurado();
           oAsegurado = listaAsegurados.get(Pos);
           System.out.println("Nombre: " + oAsegurado.getNombre());
           System.out.println("Apellido: " + oAsegurado.getApellido());
           System.out.println("Sexo: " + oAsegurado.getSexo());
           System.out.println("Año de Nacimiento: " + oAsegurado.getAño_N());
           System.out.println("Edad: " + oAsegurado.getEdad());
           listaAsegurados.set(Pos, oAsegurado);
            }else{
           System.out.println("Asegurado no Regitrado");
       }
        System.out.println("++ Buscar Asegurado Finalizado ++");
    }
    public static void ActualizarSeguro(){
         int Pos;
         String DNI;
       System.out.println("** Actualizar Asegurado**");
       System.out.println("DNI a buscar: ");
       DNI = in.next();
       //Buscamos el codigo y guardamos en pos
       Pos = BuscarXDNI(DNI);
       if (Pos > -1){
           System.out.println("Informacion del Asegurado: ");
           oAsegurado = new Asegurado();
           oAsegurado = listaAsegurados.get(Pos);
           System.out.println("Nombre: " + oAsegurado.getNombre());
           System.out.println("Apellido: " + oAsegurado.getApellido());           
           System.out.println("Sexo: " + oAsegurado.getSexo());      
           System.out.println("Año de Nacimiento: " + oAsegurado.getAño_N());
           System.out.println("------");
           System.out.println("Tipo de Seguro Actual: " + oAsegurado.getTipoSeguro());
           System.out.println("1. Ninguno");
           System.out.println("2. ESSalud");
           System.out.println("3. SIS");
           System.out.println("4. Privado");
           System.out.println("Eliga nuevo Seguro: ");
           oAsegurado.setTipoSeguro(in.nextInt());
           if(oAsegurado.getTipoSeguro() !=1) {
               System.out.println("Tipo de Asegurado: " + oAsegurado.getTipoAsegurado());
               System.out.println("1. Titular");
               System.out.println("2. Derechohabiente");
               System.out.println("Elija Nueva Condicion: ");
               oAsegurado.setTipoAsegurado(in.nextInt());           }
           listaAsegurados.set(Pos, oAsegurado);
            }else{
           System.out.println("Asegurado no Regitrado");
       }
        System.out.println("++ Actualizar Asegurado Finalizado ++");
    }
    public static void EliminarPaciente(){
       int Pos;
       String DNI;
       System.out.println("** Buscar Asegurado**");
       System.out.println("DNI a buscar: ");
       DNI = in.next();
       //Buscamos el codigo y guardamos en pos
       Pos = BuscarXDNI(DNI);
       if (Pos > -1){
           System.out.println("Informacion del Asegurado: ");
           oAsegurado = new Asegurado();
           oAsegurado = listaAsegurados.get(Pos);
           System.out.println("Nombre: " + oAsegurado.getNombre());
           System.out.println("Apellido: " + oAsegurado.getApellido());
           System.out.println("Sexo: " + oAsegurado.getSexo());
           System.out.println("Año de Nacimiento: " + oAsegurado.getAño_N());
           System.out.println("Edad: " + oAsegurado.getEdad());
           System.out.println("Desea Eliminar este Asegurado S/N: ");
           if (in.next().toUpperCase().equals("S")){
                 listaAsegurados.remove(Pos);
                               
            }
           else{
           System.out.println("Asegurado no Regitrado");
       }
        System.out.println("++ Eliminar Asegurado Finalizado ++"); 
         }
           }
    public static void Listados(){
        int opc;
        do {
            System.out.println("++ Listados ++");
            System.out.println("1. Todos los Pacientes");
            System.out.println("2. Pacientes no Asegurados");
            System.out.println("3. Menu Principal");
            System.out.println("Elija Opcion: ");
            opc  = in.nextInt();
            switch (opc){
                case 1:
                    //Listado todos
                    ListadoTodos ();
                    break;
                case 2:
                    //Listado no Asegurados
                    ListadoNoAsegurados();
                    break;
                case 3:
                    System.out.println("Menu Principal.");
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    
            }
        }while(opc !=3);
        
    }
    public static void ListadoNoAsegurados (){
        System.out.println("++ No Asegurados ++");
        for(int i = 0; i <listaAsegurados.size(); i++){
        
        oAsegurado = new Asegurado ();
        oAsegurado = listaAsegurados.get(i);
        if (oAsegurado.getTipoSeguro() == 0){ 
            System.out.println("Nombre: " + oAsegurado.getNombre());
           System.out.println("Apellido: " + oAsegurado.getApellido());
           System.out.println("Sexo: " + oAsegurado.getSexo());
           System.out.println("Año de Nacimiento: " + oAsegurado.getAño_N());
           System.out.println("Edad: " + oAsegurado.getEdad());
            System.out.println("-----------------");            
        }       
                }
        System.out.println("++ Fin de Listados ++");
    }
    public static void ListadoTodos (){
        System.out.println("++ Todos los Asegurados ++");
        for(int i = 0; i <listaAsegurados.size(); i++){
        
        oAsegurado = new Asegurado ();
        oAsegurado = listaAsegurados.get(i);
        
            System.out.println("Nombre: " + oAsegurado.getNombre());
            System.out.println("Apellido: " + oAsegurado.getApellido());
            System.out.println("Sexo: " + oAsegurado.getSexo());
            System.out.println("Año de Nacimiento: " + oAsegurado.getAño_N());
            System.out.println("Edad: " + oAsegurado.getEdad());
            System.out.println("Seguro: " +oAsegurado.getTipoSeguro());
            System.out.println("-----------------");            
        
       }
    }
    public static int BuscarXDNI(String DNI){
        int pos = -1;
        for (int i = 0; i <listaAsegurados.size(); i++){
        oAsegurado = new Asegurado();
        oAsegurado = listaAsegurados.get(i);
        if (oAsegurado.getDNI().equals(DNI)){
            pos = i;
            break;
        }
        }        
                return pos;
    }
}
