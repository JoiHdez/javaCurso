package personas;
public class Persona {
    //Esto es una Platilla
    //Atributos de una clase
    //No es necesario asignar valores
    String nombre;
    String app;
    String apm;
    int edad;
    String sexo;
    //Metodos de la clase
    //Los usaran los objectos de desta clase
    public void desplejarNombre() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido Paterno: " + app);
        System.out.println("Apellido Materno: " + apm);
    }
    
}
