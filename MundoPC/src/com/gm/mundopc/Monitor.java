package com.gm.mundopc;

//Creación de la clase
public class Monitor {
    //Declaración de variables
    private final int idMonitor;
    private String marca;
    private double tama�o;
    private static int contadorMonitores;

    private Monitor(){
         idMonitor = ++contadorMonitores;
   }
    
    //Constructor que inicializa las variables
    public Monitor(String marca, double tama�o) {
        this();
        this.marca = marca;
        this.tama�o = tama�o;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
      public double gettama�o() {
        return tama�o;
    }

    public void settama�o(double tama�o) {
        this.tama�o = tama�o;
    }

    //Método que concatena las variables y regresa una cadena
    @Override
    public String toString() {
        return "Monitor{" + " idMonitor=" + idMonitor + ", marca=" + marca + ", tama�o=" + tama�o + '}';
    }

}
