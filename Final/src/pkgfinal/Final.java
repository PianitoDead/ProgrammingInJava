package pkgfinal;
import java.util.Scanner; //IMPORTAMOS LA LIBRERIA: SCANNER
import java.util.ArrayList; //IMPORTAMOS LA LIBRERIA: ARRAYLIST 
public class Final {
    static Scanner in;
    static ArrayList<Participante> listaParticipantes;//SE CREA EL ARRAYLIST
    static Participante oParticipante;//SE ESTABLECE EL OBJECTO
    public static void main(String[] args) {
        in = new Scanner(System.in);
        listaParticipantes = new ArrayList();//LLAMADO DEL ARRAYLIST
        oParticipante = new Participante ();//LLAMADO DEL OBJECTO
        int Op;//SE ESTABLECE LA VARIABLE "Op" EN ENTERO(Int), ESTA SERVIRA PARA HACER EL USO DEL Switch
        String repetir;//SE ESTABLECE "repetir", QUE SE USARA PARA PODER REALIZAR LA ACCIÓN DE REPETIR
        do{//SE ESTABLECE EL Do PARA PODER REPETIR LOS CASOS
            repetir = "S";//SE LE BRINDA UN CARACTER A LA VARIABLE, ESTE SERVIRA PARA PODER DECIDIR ENTRE UN "SI" O UN "NO" 
        Op = Menu ();//A LA VARIABLE "Op" SE LE LLAMA PARA ESTABLECER EL "Menu"
        switch (Op) {//EL SWITCH SE ESTABLECE EN "Op"
            case 1://SE REALIZA CASO 1
                do{
                //Aqui irá: El Registro de los Partcipantes.
                Registro ();
                System.out.println("Desea Registrar a otro Participante: S/N");//SE REALIZA LA PREGUNTA RESPECTIVA
                    repetir = in.next();
                }while(repetir.equalsIgnoreCase("N") == false); //SE ESTABLECE EL WHILE PARA PODER FINALIZAR EL CASO 1 DEBE RESPONDER "N"
                break;
            case 2://SE REALIZA CASO 2
                do{
                //Aqui irá: El registro de las Calificaciones de cada Partcipante.
                R_Calificaciones ();
                    System.out.println("¿Desea Registrar otras notas de los Participantes? S/N:");
                    repetir = in.next();
                }while(repetir.equalsIgnoreCase("N") == false);                   
                break;
            case 3://SE REALIZA CASO 3
                do{
                //Aqui irá: La Busqueda de los Participantes.
                BuscarParticipantes ();
                System.out.println("¿Desea volver a buscar? S/N:");
                    repetir = in.next();
                }while(repetir.equalsIgnoreCase("N") == false);   
                break;
            case 4: //SE REALIZA CASO 4
                do{
                //Aqui irá: La Actualización de Datos de los Participantes.
                ActualizarParticipantes ();
                System.out.println("¿Desea actualizar los datos a otro Participante? S/N:");
                    repetir = in.next();
                }while(repetir.equalsIgnoreCase("N") == false); 
                break;
            case 5://SE REALIZA CASO 5
                do{  
                //Aqui irá: La Posibilidad de Eliminar a un Participante.
                EliminarParticipante();
                System.out.println("¿Desea Eliminar los datos de otro Participante? S/N:");
                    repetir = in.next();
                }while(repetir.equalsIgnoreCase("N") == false); 
                break;
            case 6://SE REALIZA CASO 6
                do{
                //Aqui irá: La Impresión del Certificado obtenido(Depende la Nota) por cada Participante.
                Imprimir_Certificado ();
                System.out.println("¿Desea Imprimir los datos de otro Participante? S/N:");
                    repetir = in.next();
                }while(repetir.equalsIgnoreCase("N") == false); 
                break;
            case 7://SE REALIZA CASO 7
                //Aqui irá: Los Reportes de cada Participante.
                Reportes ();
                break;
            case 8://SE REALIZA CASO 8
                //Aqui irá: La Opción para poder terminar en otras palabras Salir.
                System.out.println("Gracias por usar esta aplicación.");
                System.out.println("                        Adios. :) ");
                break;
            default:
                //Aqui irá: Un Mensaje por si no se elige ninguna opcion del Menú.
                System.out.println("Lo sentimos pero esa opcion no existe. ");
                System.out.println("                                Error 404 :( ");
        }
        }while(Op !=8);//ESTA OPCIÓN SERVIRA PARA PODER DARLE FIN A LA APLICACIOÓN EN CASO DE QUE SE QUIERA DEJAR DE USAR
    }
    public static int Menu (){//AQUI SE ESTABLECERA EL MENU QUE ESTARA COMPUESTO POR MULTIPLES OPCIONES
        System.out.println("*/*/*/*/* Menu Principal */*/*/*/*/");
        System.out.println("******************************************");
        System.out.println("1. Registrar Participante.");
        System.out.println("2. Registrar Notas del Particpante.");
        System.out.println("3. Buscar Participantes.");
        System.out.println("4. Actualizar datos de los Participantes.");
        System.out.println("5. Eliminar Partipantes.");
        System.out.println("6. Impresión de Certificado de los Participantes.");
        System.out.println("7. Reportes.");
        System.out.println("8. Salir.");
        System.out.println("/////////////////////////////////////////");
        System.out.println("Por favor elija una opcion: ");
        return in.nextInt();//ESTO HARA QUE CUANDO FINALICE LA OPCIÓN DE LOS CASOS VUELVA A RETORNAR A ESTE MENU HASTA QUE INTRODUZCA EL NUMERO "8"
    }
    public static void Registro (){
        //oParticipante = new Participante ();
        int N_R = listaParticipantes.size()+1;//AQUI SE ESTABLECERA EL NUMERO DE REGISTROS QUE RECIBIRA LA APLICACIÓN
        int D = 0;//SE ESTABLECE LA VARIABLE, ESTA SERVIRA PARA PODER DAR COMIENZO AL CONTEO 
        System.out.println("*/*/*/ Registrar Participante. /*/*/*");
        System.out.println("Registro N°: " + N_R);               //MOSTRARA EL REGISTRO Y SU NÚMERO CORRESPONDIENTE
        do {//SE USARA EL DO EVITAR QUE EL DNI SE REPITA
            //El DNI no se debe repetir y debe presentar solo 8 caracteres
                        System.out.println("DNI: ");
                        String Dni = in.next();//SE LEE EL DNI 
                        if (Dni.length() == 8){//SE ESTABLECE UNA CONDICIÓN QUE ESTABLECE EL DNI A 8 DIGITOS
                                    int pos = -1;
                            pos = BuscarXDNI(Dni);
                                 if (pos == -1){
                                     oParticipante = new Participante();
                                     oParticipante.setDNI(Dni);
                                     oParticipante.setNum_Reg(N_R);//SE GUARDA EN EL NUMERO DE REGISTRO 
                                     D++;
                                 }
                                 else{
                                     System.out.println("El Dni ya esta registrado");
                                 }
                        }
                        else{
                            System.out.println("El Dni debe ser de 8 caracteres");
                        }
                    } while (D==0);
        System.out.println("Nombre: ");
        oParticipante.setNombre(in.next());//SE REGISTRARA EL NOMBRE
        System.out.println("Apellido: ");
        oParticipante.setApellido(in.next());//SE ESTABLECERA EL APELLIDO 
        System.out.println("Sexo(M o F): ");
        String resp = in.next();
        if(resp.equalsIgnoreCase("M")){//SE ESTABLECE ESTA OPCIÓN CUYA FUNCION ES IGNORAR LA ESCRITURA DE LA CADENA
            oParticipante.setSexo("Masculino");//SE ESTABLECE EL SEXO EN MASCULINO 
        } 
        else if (resp.equalsIgnoreCase("F")){
            oParticipante.setSexo("Femenino");//SE ESTABLECE EL SEXO EN FEMENINO 
        } else{
            System.out.println("Ingrese un Valor valido");
        }
        System.out.println("*/*/*/**/*/");      
        listaParticipantes.add(oParticipante);//SE GUARDA LA VARIABLE EN LISTA DE PARTICIPANTES
                }        
    public static void R_Calificaciones (){
        int Pos;
         String DNI;
       System.out.println("*/*/*/*/ Registro de Calificaciones. */*/*/*/");
       System.out.println("Ingrese DNI: ");
       DNI = in.next();
       //Buscamos el DNI y guardamos en la variable pos
       Pos = BuscarXDNI(DNI);
       if (Pos > -1){
        oParticipante = new Participante ();
        oParticipante = listaParticipantes.get(Pos);
        System.out.println("Encontrado. :) ");
        System.out.println("Nombre: " +oParticipante.getNombre());
        System.out.println("Apellido: " +oParticipante.getApellido());
        System.out.println("Sexo: " +oParticipante.getSexo());
           System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
           System.out.println("Calificaciones de Participantes.");// SE INGRESARA LAS NOTAS DEL PARTICIPANTE 
           System.out.println("Ingrese Primera Nota: ");
           oParticipante.setCal_1(in.nextDouble());//SE LEE LA PRIMERA NOTA
           System.out.println("Ingrese Segunda Nota: ");
           oParticipante.setCal_2(in.nextDouble()); //SE LEE LA SEGUNDA NOTA
           oParticipante.Cal_Prom();
           System.out.println("*/*/*/*/ Registro de Calificaciones Completado Satisfactoriamente. /*/*/*/*");
           listaParticipantes.set(Pos, oParticipante);     // SE GUARDA EN LISTA DE PARTICIPANTES        
                    }     
       else{
           System.out.println("Participante no encontrado :( ");//SI EL DNI NO FUE ENCONTRADO APARECERA ESTE MENSAJE 
           System.out.println("Desea Registrar a ese Participante: S/N:");//SE REALIZA UNA PREGUNTA SI ES QUE EL DNI NO ESTA REGISTADO 
           if (in.next().toUpperCase().equals("S")){
               Registro ();//ENTONCES SI LA RESPUESTA ES S, SE LLAMA A REGISTRO
           }
       }      
    }
    public static void BuscarParticipantes (){//EN ESTE PARAMETRO SE PODRA BUSCAR A UN PARTICIPANTE
       int Pos;
       String DNI;
       System.out.println("** Buscar Participante**");
       System.out.println("DNI a buscar: ");
       DNI = in.next();
       //Buscamos el codigo y guardamos en pos
       Pos = BuscarXDNI(DNI);
       if (Pos > -1){ //SI EL DNI FUE ENCONTRADO, ENTONCE SE MOSTRARA LA INFORMACIÓN           
           System.out.println("Informacion del Participante: ");
           oParticipante = new Participante();
           oParticipante = listaParticipantes.get(Pos);
           System.out.println("Registro N°: " + oParticipante.getNum_Reg());
           System.out.println("Nombre: " + oParticipante.getNombre());
           System.out.println("Apellido: " + oParticipante.getApellido());
           System.out.println("Sexo: " + oParticipante.getSexo());
           System.out.println("Nota 1: " + oParticipante.getCal_1());
           System.out.println("Nota 2: " + oParticipante.getCal_2());
           System.out.println("Calificacion Final: " + oParticipante.getCal_Fin());
           listaParticipantes.set(Pos, oParticipante);
                  }       
       else{//SI EL DNI NO FUE ENCONTRADO ENTONCES SE MOSTRARA DICHO MENSAJE
           System.out.println("Participante no Registrado");
       }
    }            
    public static void ActualizarParticipantes () {//ES ESTE APARTADO SE ACTUALIZARA LA INFORMACIÓN DE LOS PARTICIPANTES
        int Pos;
         String DNI;
       System.out.println("*/*/*/*/ Eliminacion de Participantes. */*/*/*/");
       System.out.println("Ingrese DNI: ");
       DNI = in.next();
       //Buscamos el DNI y guardamos en la variable pos
       Pos = BuscarXDNI(DNI);
       if (Pos > -1){
           System.out.println("Informacion del Participante: ");
           oParticipante = new Participante();
           oParticipante = listaParticipantes.get(Pos);
           System.out.println("Nombre: " + oParticipante.getNombre());//SE LE MOSTRARA LOS DATOS Y SE LES PREGUNTARA A CADA UNO SI DESEA CAMBIARLO O NO
           System.out.println("¿Desea Actualizar el Nombre? S/N: ");
           if (in.next().toUpperCase().equals("S")){
               System.out.println("Ingrese el Nuevo Nombre: ");
               oParticipante.setNombre(in.next());        
           }
           System.out.println("Apellido: " + oParticipante.getApellido());
           System.out.println("¿Desea Actualizar Apellido? S/N: ");
           if (in.next().toUpperCase().equals("S")){
               System.out.println("Ingrese el Nuevo Apellido: ");
               oParticipante.setApellido(in.next());}
           System.out.println("Sexo: " + oParticipante.getSexo());
           System.out.println("¿Desea Actualizar Sexo? S/N: ");
           if (in.next().toUpperCase().equals("S")){
               System.out.println("Ingrese el Nuevo Sexo (M/F): ");
           String resp = in.next();
             if(resp.equalsIgnoreCase("M")){//SE ESTABLECE ESTA OPCIÓN CUYA FUNCION ES IGNORAR LA ESCRITURA DE LA CADENA
            oParticipante.setSexo("Masculino");//SE ESTABLECE EL SEXO EN MASCULINO 
                } 
             if (resp.equalsIgnoreCase("F")){
            oParticipante.setSexo("Femenino");//SE ESTABLECE EL SEXO EN FEMENINO 
                }
           }
           System.out.println("La actualizacion se realizo con exito. ¡Felicidades! :) ");
               listaParticipantes.set(Pos, oParticipante);
            }else{
           System.out.println("Participante no Registrado");     //SI EL DNI NO EXISTE SE MOSTRARA ESTE MENSAJE 
       }
    }
    public static void EliminarParticipante (){//EN ESTE APARTADO SE TENDRA LA POSIBILIDAD DE ELIMINAR A LOS PARTICIPANTES CON CIERTAS CONDICIONES
        int Pos;
       String DNI;
       System.out.println("** Buscar Participante**");
       System.out.println("DNI a buscar: ");
       DNI = in.next();
       //Buscamos el codigo y guardamos en pos
       Pos = BuscarXDNI(DNI);
       if (Pos > -1){
       System.out.println("Informacion del Participante");//UNA VEZ BUSCADO SE MOSTRARA LA INFORMACIÓN DEL PARTICIPANTE
           oParticipante = new Participante();
           oParticipante = listaParticipantes.get(Pos);
           System.out.println("Nombre: " + oParticipante.getNombre());
           System.out.println("Apellido: " + oParticipante.getApellido());
           System.out.println("Sexo: " + oParticipante.getSexo());
           if (oParticipante.getCal_Fin() < 1){//EN ESTE APARTADO SE ANALIZARA EL PARTCIPANTE POR SI TIENE ALGUNA NOTA
           System.out.println("¿Desea Eliminar este Participante? S/N: ");//SE REALIZARA LA PREGUNTA RESPECTIVA POR SI ALGUN ERROR 
           String resp = in.next();
           if (resp.equalsIgnoreCase("S")){//SI NO TUVIERA ALGUNA NOTA EL PARTICIPANTE SERA ELIMINADO 
                 listaParticipantes.remove(Pos);                              
            }
           }
           else {//EN ESTE APARTADO EL PARTICPANTE SI TIENE NOTAS Y POR LO TANTO SE MOSTRARA QUE NO SE PUEDE ELIMINAR 
               System.out.println("El Participante posee notas y por lo tanto no se puede eliminar.");//ESTO SALDRA POR SI EL PARTICIPANTE TIENE NOTAS Y POR LO TANTO NO SE PUEDE ELIMINAR
               System.out.println("Nota 1: " + oParticipante.getCal_1());
               System.out.println("Nota 2: " + oParticipante.getCal_2());           
           }       
       }
           else{
           System.out.println("Participante no Registrado");
       }
    }   
    public static void Imprimir_Certificado () {//EN ESTE APARTADO SE MOSTRARA EL CERTIFICADO DE CADA PARTICIPANTE
        int Pos;
         String DNI;
       System.out.println("*/*/*/*/ Registro de Calificaciones. */*/*/*/");
       System.out.println("Ingrese DNI: ");
       DNI = in.next();
       //Buscamos el DNI y guardamos en la variable pos
       Pos = BuscarXDNI(DNI);
       if (Pos > -1){
           System.out.println("*** Informacion del Participante ***");//UNA VEZ BUSCADO EL PARTICIPANTE POR EL DNI SE LE MOSTRARA LA INFORMACIÓN EN LA PANTALLA
           oParticipante = new Participante();
           oParticipante = listaParticipantes.get(Pos);
           System.out.println("Nombre: " + oParticipante.getNombre());
           System.out.println("Apellido: " + oParticipante.getApellido());
           System.out.println("Sexo: " + oParticipante.getSexo());
           System.out.println("*/*/*/*/*/**/*/*/*/*/*/*/*/*/");
           System.out.println("Certificado del participante: " +oParticipante.getNombre() + " fue obtenido satisfactoriamente. :) ");
           oParticipante.Calcular_Cert();          //EN ESTE APARTADO SE MOSTRARA LO QUE SE ESTABLECIO DENTRO DE LA CLASE: Participante
                  }
    }
    public static void Reportes (){
        int opc;
        do {
            System.out.println("++ Reportes  ++");
            System.out.println("1. Participantes Registrados. ");
            System.out.println("2. Participantes Aprobados. ");
            System.out.println("3. Participantes Desaprobados. ");
            System.out.println("4. Participantes Mujeres. ");
            System.out.println("5. Participantes Hombres. ");
            System.out.println("6. Menu Principal. ");
            System.out.println("Elija Opcion: ");
            opc  = in.nextInt();
            switch (opc){
                case 1:
                    //Participantes Registrados
                    Participantes_Registrados ();
                    break;
                case 2:
                    //Participantes Aprobados
                    Participantes_Aprobados ();
                    break;
                case 3:
                    //Participantes Desaprobados
                    Participantes_Desaprobados ();
                    break;
                    case 4:
                    //Participantes Mujeres
                        Participantes_Femenino ();
                    break;
                    case 5:
                    //Participantes Hombres
                        Participantes_Masculino();
                    break;
                    case 6:
                    //Menu Principal
                        System.out.println("Volviendo al Menu Principal.");
                    break;
                default:
                    System.out.println("Opcion Incorrecta");                    
            }
        }while(opc !=6);
    }
    public static void Participantes_Registrados (){
        System.out.println("++ Todos los Participantes ++");        
        for(int i = 0; i <listaParticipantes.size(); i++){//SE LISTARA LA INFORMACIÓN DE LOS PARTICIPANTES REGISTRADOS
        oParticipante = new Participante ();
        oParticipante = listaParticipantes.get(i);//SE MOSTRARA LA INFORMACIÓN DEL PARTICIPANTE JUNTO CON SUS NOTAS RESPECTIVAS
            System.out.println("Registro N°: " + oParticipante.getNum_Reg());
            System.out.println("Nombre: " + oParticipante.getNombre());
            System.out.println("Apellido: " + oParticipante.getApellido());
            System.out.println("Sexo: " + oParticipante.getSexo());
            System.out.println("Nota 1: " + oParticipante.getCal_1());
            System.out.println("Nota 2: " + oParticipante.getCal_2());
            System.out.println("Calificacion Final: " + oParticipante.getCal_Fin());
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");            
               }
    }
    public static void Participantes_Aprobados (){//SE MOSTRARA LA LISTA DE AQUELLOS PARTICIPANTES APROBADOS
        System.out.println("++ Aprobados ++");
        for(int i = 0; i <listaParticipantes.size(); i++){        
        oParticipante = new Participante ();
        oParticipante = listaParticipantes.get(i);
        if (oParticipante.getCal_Fin() >= 60){ //SE MOSTRARA SIEMPRE Y CUANDO LA NOTA FINAL SEA MAYOR O IGUAL A 60
           System.out.println("Nombre: " + oParticipante.getNombre());
           System.out.println("Apellido: " + oParticipante.getApellido());
           System.out.println("Sexo: " + oParticipante.getSexo());
           System.out.println("Nota 1: " + oParticipante.getCal_1());
           System.out.println("Nota 2: " + oParticipante.getCal_2());
           System.out.println("Calificacion Final: " + oParticipante.getCal_Fin());          
        }
        else{//SE LE MOSTRARA AL USUARIO EL MENSAJE POR SI NO HAY NINGUN APROBADO
            System.out.println("Esto esta muy vacio.");
        }
    }
        System.out.println("-----------------");  
            }
    public static void Participantes_Desaprobados (){//SE MOSTRARALA LA LISTA DE AQUELLOS PARTICIPANTES DESAPROBADOS
        System.out.println("++ Desaprobados ++");
        for(int i = 0; i <listaParticipantes.size(); i++){        
        oParticipante = new Participante ();
        oParticipante = listaParticipantes.get(i);
        if (oParticipante.getCal_Fin() < 60){ //SE MOSTRARA SIEMPRE Y CUANDO LA NOTA FINAL SEA MENOR A 60
           System.out.println("Nombre: " + oParticipante.getNombre());
           System.out.println("Apellido: " + oParticipante.getApellido());
           System.out.println("Sexo: " + oParticipante.getSexo());
           System.out.println("Nota 1: " + oParticipante.getCal_1());
           System.out.println("Nota 2: " + oParticipante.getCal_2());
           System.out.println("Calificacion Final: " + oParticipante.getCal_Fin());           
        }
        else{
            System.out.println("WOW, es increible que no Desaprobaran. Ja, ja, ja.");
        }
    }
        System.out.println("-----------------");  
    }
    public static void Participantes_Femenino (){//SE LISTARA AQUELLAS PARTICIPANTES DE GENERO FEMENINO
        System.out.println("++ Sexo Femenino ++");
        for(int i = 0; i <listaParticipantes.size(); i++){        
        oParticipante = new Participante ();
        oParticipante = listaParticipantes.get(i);
        if (oParticipante.getSexo().equals("Femenino")){//AQUI SE MOSTRARA SI LOS PARTIPANTES SON MUJERES
           System.out.println("Nombre: " + oParticipante.getNombre());
           System.out.println("Apellido: " + oParticipante.getApellido());
           System.out.println("Nota 1: " + oParticipante.getCal_1());
           System.out.println("Nota 2: " + oParticipante.getCal_2());
           System.out.println("Calificacion Final: " + oParticipante.getCal_Fin());          
                   }
        else {
            System.out.println("Lamentablemete no se encontrarón Participantes Mujeres. :( ");
        }
        }
        System.out.println("-----------------");  
    }
    public static void Participantes_Masculino (){//SE LISTARA AQUELLAS PARTICIPANTES DE GENERO MASCULINO
        System.out.println("++ Sexo Masculino ++");
        for(int i = 0; i <listaParticipantes.size(); i++){        
        oParticipante = new Participante ();
        oParticipante = listaParticipantes.get(i);
        if (oParticipante.getSexo().equals("Masculino")){//AQUI SE MOSTRARA SI LOS PARTIPANTES SON HOMBRES
           System.out.println("Nombre: " + oParticipante.getNombre());
           System.out.println("Apellido: " + oParticipante.getApellido());
           System.out.println("Nota 1: " + oParticipante.getCal_1());
           System.out.println("Nota 2: " + oParticipante.getCal_2());
           System.out.println("Calificacion Final: " + oParticipante.getCal_Fin());       
    }
        else {
            System.out.println("Lamentablemete no se encontrarón Participantes Varones. :( ");
            
        }
        }
        System.out.println("-----------------");  
    }
    public static int BuscarXDNI(String DNI){//AQUI SE ESTABLECERA LA BUSQUEDA POR MEDIO DE DNI
        int pos = -1;
        for (int i = 0; i <listaParticipantes.size(); i++){
        oParticipante = new Participante();
        oParticipante = listaParticipantes.get(i);
        if (oParticipante.getDNI().equals(DNI)){//EN ESTE APARTADO SE COMPARARA EL DNI
            pos = i;
            break;
        }
        }        
        return pos;
    }          
}    