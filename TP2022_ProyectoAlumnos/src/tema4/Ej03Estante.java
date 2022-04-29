package tema4;
public class Ej03Estante {
    public static void main(String[] args) {
        Estante e = new Estante();
        e.agregarLibro(new Libro("Mujercitas2", new Autor("El chabon de Mujercitas", "Escribio Mujercitas", "USA"), "11111", 500.0));
        
        Libro l = e.buscarLibro("Mujercitas");
        if (l != null) System.out.println(l.getPrimerAutor().getNombre());
        else System.out.println("No encontrado.");
    }
    
}
