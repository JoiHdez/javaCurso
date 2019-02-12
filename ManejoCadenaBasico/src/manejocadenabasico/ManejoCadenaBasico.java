package manejocadenabasico;

public class ManejoCadenaBasico {

    public static void main(String[] args) {
      String nombre = "Joel";
      String apellido = "Hernandez";
      
      System.out.println("Concatenacion: " + nombre + " " + apellido);
      
      System.out.println("Nueva linea: \n" + nombre + " " + apellido);
      
      System.out.println("Tabulador: \t" + nombre + " " + apellido);
      
      System.out.println("Retroceso: \b"  + nombre + " " + apellido);
      
      System.out.println("Retorno de carro: \r " + nombre + " " + apellido);
      
      System.out.println("Comilla simple: \'" + nombre + " " + apellido + "\'");
      
      System.out.println("Comillas doble: \"" + nombre + " " + apellido + "\"");
    }
}
