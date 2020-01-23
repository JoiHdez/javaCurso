package personas;

import java.util.Scanner;

public class PersonaPrueba {
    
    public static void main(String args[]){
        //Creacion de un Objeto
        Persona p1 = new Persona();
        
        //Pedir valores al usuario
        System.out.println("\nPidiendo Datos!");
        Scanner entradaNomComp = new Scanner(System.in);
        System.out.println("Nombre: ");
        p1.nombre = entradaNomComp.next();
        System.out.println("Apellido Paterno: ");
        p1.app = entradaNomComp.next();
        System.out.println("Apellido Materno: ");
        p1.apm = entradaNomComp.next();
        System.out.println("Edad: ");
        p1.edad = entradaNomComp.nextInt();
        System.out.println("Sexo: ");
        p1.sexo = entradaNomComp.next();
        
        System.out.println("\nEl Nombre Completo es: " + p1.nombre + " " + p1.app + " " + p1.apm);
        System.out.println("\nLa edad es: " + p1.edad);
        System.out.println("\nEl sexo es: " + p1.sexo);
        
        //Llamando un metodo del objeto creado
        System.out.println("Valores por default del objeto Persona");
        p1.desplejarNombre();
        
        //Modificar valores
        p1.nombre = "Joel";
        p1.app = "Hernandez";
        p1.apm = "Contreras";
        
        //Volvemos a llamar el metodo
        System.out.println("\nNuevos valorea del objeto Persona");
        p1.desplejarNombre();
     
    }
}
