import java.util.Scanner;

public class ClasePrincipal {
    
    // Atributos
    static String Nombre;
    static String Telefono;
    static String Direccion;
    static String Profesion;
    static String Lugar_Trabajo;
    static String Descripcion_propiedad;
    static Integer Salario;
    
    


    public static void main (String[] args) {
        Scanner informacionUsuario  =new Scanner (System.in);
        System.out.println("******INMOBILIARIA INTERAMERICANA******");
        Integer Cantidad=3;
        Arrendatario listaArrendamiento[]= new Arrendatario[Cantidad]; 
        

        for (Integer c = 0; c < Cantidad ; c++) {
                
            System.out.println("Has seleccionado la opcion eres Arrendador ");
            System.out.println("******INMOBILIARIA INTERAMERICANA******");
            System.out.println("Ingrese por favor su nombre");
            Nombre = informacionUsuario.nextLine();
            System.out.println("Ingrese por favor Numero Telefonico");
            Telefono = informacionUsuario.nextLine();
            System.out.println("Ingrese por favor la direccion");
            Direccion = informacionUsuario.nextLine();
            System.out.println("Ingrese su profesion");
            Profesion = informacionUsuario.nextLine();
            System.out.println("Ingrese por favor su Lugar de trabajo");
            Lugar_Trabajo = informacionUsuario.nextLine();
            System.out.println("Ingrese por favor descripcion de la propiedad que esta buscando");
            Descripcion_propiedad = informacionUsuario.nextLine();
            System.out.println("Ingrese por favor el salario");
            Salario = informacionUsuario.nextInt();
            System.out.println("Arrendador "+ Nombre + "Propiedad que busca "+ Descripcion_propiedad);

            Arrendatario nuevoArrendatario = new Arrendatario (Nombre, Telefono,Direccion,Profesion,Lugar_Trabajo,Descripcion_propiedad,Salario);    
            listaArrendamiento[c]=nuevoArrendatario;
            System.out.println(nuevoArrendatario.Profesion);

                
        } 

        for (Integer c = 0; c< Cantidad ; c++){
            
                listaArrendamiento[c].imprimirInformacion();
        }
            
        // listaArrendamiento[0].imprimirInformacion();
        // listaArrendamiento[1].imprimirInformacion();
        // listaArrendamiento[2].imprimirInformacion();

        informacionUsuario.close();
    }
}








//     /**
//      * @param args
//      */
//     public static void main (String[] args) {

//         Scanner sn= new Scanner(System.in);
//         boolean Salir = false;
//         int opcion; 
        
//         while (!Salir){
//             System.out.println("******INMOBILIARIA INTERAMERICANA******");
            
//             System.out.println("1. Propietario");
//             System.out.println("2. Arrendador ");
//             System.out.println("3.Salir");
            
//             try{
//                 System.out.println("Escriba una de las opciones");
//                 opcion = sn.nextInt();

//                 switch(opcion){
//                     case 1:
//                         System.out.println("Has seleccionado la opcion eres Propietario" );
//                         
//                         
//                         System.out.println("Ingrese por favor su nombre");
//                         Nombre = Cliente.nextLine();
//                         System.out.println("Ingrese por favor Numero Telefonico");
//                         Telefono = Cliente.nextLine();
//                         System.out.println("Ingrese por favor la direccion");
//                         Direccion = Cliente.nextLine();
//                         System.out.println("Ingrese su profesion");
//                         Profesion = Cliente.nextLine();
//                         System.out.println("Ingrese por favor su Lugar de trabajo");
//                         Lugar_Trabajo = Cliente.nextLine();
//                         System.out.println("Ingrese por favor descripcion de la propiedad");
//                         Descripcion_propiedad = Cliente.nextLine();
//                         System.out.println("Ingrese por favor el salario");
//                         Salario = Cliente.nextInt();
//                         System.out.println("Propietario "+ Cliente + "Descripcion de la pripiedad " + Descripcion_propiedad );
//                         break;
//                     case 2:
//                         
//                         break;
//                     case 3:
//                         Salir= true;
//                 }
//             } catch(Error err) {
//                 System.out.println("Hubo un error" + err.getMessage());
//             }
//         }
//     }
// }