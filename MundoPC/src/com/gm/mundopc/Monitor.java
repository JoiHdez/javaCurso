package com.gm.mundopc;

//CreaciÃ³n de la clase
public class Monitor {
    //DeclaraciÃ³n de variables
    private final int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;

    private Monitor(){
         idMonitor = ++contadorMonitores;
   }
    
    //Constructor que inicializa las variables
    public Monitor(String marca, double tamaño) {
        this();
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
      public double gettamaño() {
        return tamaño;
    }

    public void settamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    //MÃ©todo que concatena las variables y regresa una cadena
    @Override
    public String toString() {
        return "Monitor{" + " idMonitor=" + idMonitor + ", marca=" + marca + ", tamaño=" + tamaño + '}';
    }

}
