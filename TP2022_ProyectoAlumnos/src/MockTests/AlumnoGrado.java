package MockTests;
public class AlumnoGrado extends Alumno{
    private String carrera;
    
    public AlumnoGrado (String nom, int d, String c) {
        super(nom,d,30);
        carrera = c;
    }
    
    public boolean estaGraduado() {
        if (!super.estaGraduado()) return false;
        if (getMateria(29).getNota()>5) return true;
        return false;
    }
    
    public String toString(){
        String ret = super.toString();
        ret += "\nCarrera: " + carrera;
        if (estaGraduado()) ret += "\nGraduado.";
        else ret += "\nNo graduado.";
        
        return ret;
    }
}
