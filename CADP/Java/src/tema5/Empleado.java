package tema5;
public abstract class Empleado {
    private String nombre;
    private double sueldoBasico;
    private int antig;
    
    public Empleado(String n, double sb, int a){
        nombre = n;
        sueldoBasico = sb;
        antig = a;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSueldoBasico() {
        return sueldoBasico;
    }
    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    public int getAntig() {
        return antig;
    }
    public void setAntig(int antig) {
        this.antig = antig;
    }
    
    public abstract double calcularEfectividad();
    public double calcularSueldoACobrar(){
        return getSueldoBasico() + getSueldoBasico() * 0.1 * getAntig();
    }
    
    @Override
    public String toString(){
        return nombre + ": $" + calcularSueldoACobrar() + " - Efectividad: " + this.calcularEfectividad();
    }
}
