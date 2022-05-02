package tema5;
public class Entrenador extends Empleado {
    private int campeonatos;
    
    public Entrenador(String n, int c, double sb, int a){
        super(n, sb, a);
        campeonatos = c;
    }
    
    public double calcularEfectividad(){ return (double) campeonatos/getAntig(); }
    public double calcularAdicional() { 
        if (campeonatos > 10) return 50000;
        if (campeonatos > 4) return 30000;
        if (campeonatos > 1) return 5000;
        return 0;
    }
    public double calcularSueldoACobrar() { 
        return super.calcularSueldoACobrar() + calcularAdicional();
    }
}

