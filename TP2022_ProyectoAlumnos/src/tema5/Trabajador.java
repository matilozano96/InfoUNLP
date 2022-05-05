package tema5;
public class Trabajador extends Persona{
    private String tarea;
    public Trabajador (String n, int d, int e, String t) {
        super(n,d,e);
        tarea = t;
    }
    
    public String getTarea(){ return tarea; }
    public void setTarea(String t) { tarea = t; }
    
    public String toString(){
        return super.toString() + " Soy " + tarea;
    }
    
}
