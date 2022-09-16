public class Arrendatario {
    
    String Nombre_Arrendatario;
    String Telefono;
    String Direccion;
    String Profesion;
    String Lugar_Trabajo;
    String Descripcion_propiedad;
    Integer Salario;

    public Arrendatario( String NuevoArrendatario, String nuevoTelefono, String nuevaDireccion,
        String nuevaProfession,String nuevoLugarTrabajo,String nuevaDescripcionPropiedad,Integer nuevoSalario) {
        Nombre_Arrendatario = NuevoArrendatario;
        Telefono= nuevoTelefono;
        Direccion= nuevaDireccion;
        Profesion= nuevaProfession;
        Lugar_Trabajo=nuevoLugarTrabajo;
        Descripcion_propiedad= nuevaDescripcionPropiedad;
        Salario=nuevoSalario;
    }

    public void imprimirInformacion () {
        System.out.println(
            "Nombre: " + Nombre_Arrendatario +
            " Telefono: " + Telefono +
            " Direccion: " + Telefono +
            " Profesion: " + Profesion +
            " Lugar_Trabajo: " + Lugar_Trabajo +
            " Descripcion_propiedad: " + Descripcion_propiedad +
            " Salario: " + Salario );
    }
}



