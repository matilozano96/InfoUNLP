package tema5;
public class Jugador extends Empleado {
    private int partidos;
    private int goles;
    
    public Jugador(String n, int p, int g, double sb, int a){
        super(n, sb, a);
        partidos = p;
        goles = g;
    }
    
    public double calcularEfectividad(){ return (double) goles/partidos; }
    public double calcularSueldoACobrar() { 
        return super.calcularSueldoACobrar() + calcularAdicional();
    }
    
    public double calcularAdicional(){
        if (calcularEfectividad() > 0.5) return getSueldoBasico();
        return 0;
    }
}
