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


    /**
     * @param args
     */
    public static void main (String[] args) {


        Scanner Cliente =new Scanner (System.in);
        System.out.println("******PROPIEDAD******");
        System.out.println("Ingrese por favor su nombre");
        Nombre = Cliente.nextLine();
        System.out.println("Ingrese por favor Numero Telefonico");
        Telefono = Cliente.nextLine();
        System.out.println("Ingrese por favor la direccion");
        Direccion = Cliente.nextLine();
        System.out.println("Ingrese su profesion");
        Profesion = Cliente.nextLine();
        System.out.println("Ingrese por favor su Lugar de trabajo");
        Lugar_Trabajo = Cliente.nextLine();
        System.out.println("Ingrese por favor descripcion de la propiedad");
        Descripcion_propiedad = Cliente.nextLine();
        System.out.println("Ingrese por favor el salario");
        Salario = Cliente.nextInt();
    }

}

         

    