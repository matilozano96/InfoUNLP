package MockTests;
public class AlumnoDoctorado extends Alumno{
    private String titulo;
    private String universidad;
    
    public AlumnoDoctorado (String nom, int d, String t, String u) {
        super(nom,d,8);
        titulo = t;
        universidad = u;
    }
    
    public boolean estaGraduado() {
        if (!super.estaGraduado()) return false;
        if (getMateria(6).getNota() > 7 & getMateria(7).getNota() > 7) return true;
        return false;
    }
    
    public String toString(){
        String ret = super.toString();
        ret += "\nTitulo: " + titulo + "\nUniversidad: " + universidad;
        if (estaGraduado()) ret += "\nGraduado.";
        else ret += "\nNo graduado.";
        
        return ret;
    }    
}
