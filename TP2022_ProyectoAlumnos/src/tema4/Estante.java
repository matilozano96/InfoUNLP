package tema4;
public class Estante {
    private int DF = 20;
    private Libro [] libros;
    private int DL = 0;
    
    public Estante(int n) { 
        DF = n;
        libros = new Libro[DF];
    }
    
    public Estante() { libros = new Libro[DF]; }
    
    public boolean estaLleno(){
        return (DF == DL);
    }
    public void agregarLibro(Libro l){
        if (DL < DF) libros[DL++]=l;
        else System.out.println("Error. Se alcanzó la cantidad maxima de libros.");
    }
    public Libro buscarLibro(String t) {
        for (int i=0; i < DL; i++){  
            if (libros[i].getTitulo().equals(t)) return libros[i];
        }
        return null;
    }
    
}
