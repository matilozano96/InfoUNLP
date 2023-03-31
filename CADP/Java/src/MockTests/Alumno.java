package MockTests;
public abstract class Alumno {
    private int DF;
    private Materia [] materias;
    private int dni;
    private String nombre;
    private int aprobadas = 0;
    
    public Alumno (String nom, int d, int n) {
        nombre = nom;
        dni = d;
        DF = n;
        materias = new Materia[DF];
    }
    public void agregarMateria(int c, double n, String f) {
        // Esto es para evitar que se agregue un codigo fuera del rango del vector. El enunciado no lo pide y la verdad que ni lo probé
        if (c > -1 & c < DF & materias[c] == null) { 
            materias[c] = new Materia(n,f);
            aprobadas++;
        }
        else System.out.println("Error.");
    }
    public boolean estaGraduado(){ return (aprobadas == DF); }
    public Materia getMateria(int i) { return materias[i]; }
    public String toString() {
        String ret = nombre + "\nDNI: " + dni + "\nMaterias: ";
        for (int i=0; i<DF; i++){ 
            if (getMateria(i) != null) ret += "\n  M"+ (i+1) + ": " + getMateria(i).toString();
            else ret += "\n  M"+ (i+1) + ": No aprobada.";
        }
        return ret;
    }
}
