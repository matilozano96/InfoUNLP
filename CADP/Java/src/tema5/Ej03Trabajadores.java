package tema5;
public class Ej03Trabajadores {
    public static void main(String[] args) {
        Persona p = new Persona("Mauro", 11203737, 70);
        Trabajador t = new Trabajador("Mauro", 11203737, 70, "Jardinero");
        
        System.out.println(p.toString());
        System.out.println(t.toString());
    }
    
}
