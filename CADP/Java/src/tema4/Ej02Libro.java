package tema4;
public class Ej02Libro {
    public static void main(String[] args) {
        Libro libro1= new  Libro( "Java: A Beginner's Guide",   
                                 "Mcgraw-Hill", 2014,   
                                 new Autor("Herbert Schildt", "Escribe cosas", "ENG"), "978-0071809252", 21.72);
        Libro libro2= new Libro("Practicas del Lenguaje",  
                                new Autor("Asociacion Maestros Argentinos", "Escriben cosas", "ARG"),  "978-9501314694",19.95);
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println("Editorial de libro2: " +libro2.getEditorial());
        System.out.println("Año edición de libro2: " +libro2.getAñoEdicion());
        
    }
    
    
}
