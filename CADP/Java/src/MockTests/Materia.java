package MockTests;
public class Materia {
    private double nota;
    private String fecha;
    
    public Materia (double n, String f) { 
        nota = n;
        fecha = f;
    }
    
    public double getNota() { return nota; };
    public String toString() { return String.format("Nota: %.2f",nota) + " Fecha: " + fecha; }
}
