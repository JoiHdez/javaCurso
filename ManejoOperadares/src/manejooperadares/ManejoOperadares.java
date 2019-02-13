package manejooperadares;

public class ManejoOperadares {

    public static void main(String[] args) {
        System.out.println("Operadores Aritmeticos");
        int a = 1 + 2;
        int b = a * 4;
        int c = b / 2;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        
        System.out.println("\n Operador modulo (residuo): ");
        System.out.println("x mod 10 = " + a % 2);
        
        System.out.println("\n Operador Compuesto:");
        //a = a + 4
        a += 2;
        b -= 4;
        c *= a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        System.out.println("\n Operador Invremento");
        //int a = a +  1;
        //Puede reescribirse como
        a++;
        System.out.println("a = " + a);
        
        //Preincremento/decremento (se incrementa antes de asignar el valor)
        c = ++a;
        //Posincremento/decremento (se incremanta despues de asignar el valor)
        d = b++;
        System.out.println("b = " + b);
        System.out.println("c = " + a);
        System.out.println("d = " + d);
        
        System.out.println("\nOperador relacional:");
        // a es menor que b
        boolean res = a < b;
        System.out.println("res = " + res);
        
        System.out.println("\nOperador ternario");
        int min = (a < b ) ? a : b;
        System.out.println("min = " + min);
        
        System.out.println("\n Operador de Asignacion");
        int i, j, k;
        //cadena de asignacion
        i = j = k = 100; // valor de x, y, and z es igual a 100
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        
    }

}
