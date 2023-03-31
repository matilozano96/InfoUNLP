package tema4;

import PaqueteLectura.Lector;

public class Entrenador {
    private String nombre;
    private double sueldoB;
    private int antig;
    private int campeonatos;
    
    public Entrenador(String n, double s, int a, int c) {
        nombre = n; sueldoB = s; antig = a; campeonatos = c;
    }
    
    public Entrenador(){
    }

    public String getNombre() {
        return nombre;
    }
    public double getSueldoB() {
        return sueldoB;
    }
    public int getAntig() {
        return antig;
    }
    public int getCampeonatos() {
        return campeonatos;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAntig(int antig) {
        this.antig = antig;
    }
    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }
    public void setSueldoB(double sueldoB) {
        this.sueldoB = sueldoB;
    }
    
    public double calcularEfectividad() { return(double) campeonatos/antig; }
    public double calcularSueldo() { 
        double sueldo = sueldoB + (sueldoB * 0.1 * antig);
        if (campeonatos > 10) { return sueldo + 50000; }
        if (campeonatos > 4) { return sueldo + 30000; }
        if (campeonatos > 0) { return sueldo + 5000; }
        return sueldo;
    }
    
    @Override public String toString() {
        return nombre + ": " +
            String.format("\nSalario: $%.2f", calcularSueldo()) + 
            String.format("\nEfectividad: %.2f", calcularEfectividad());
    
    }
}
