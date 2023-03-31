package tema4;
public class Estante {
    private int DF = 1;
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
        if (estaLleno()) System.out.println("Error. Se alcanzó la cantidad maxima de libros.");
        else libros[DL++]=l;
    }
    public Libro buscarLibro(String t) {
        Libro ret = null;
        for (int i = 0; i < DL && ret == null; i++) { 
            if (libros[i].getTitulo().equals(t)) ret = libros[i];
        }
        return ret;
        
        // for loop falopa
        // for (i=0; (i < DL) && !(libros[i].getTitulo().equals(t)); i++){}
        // if (i == DL) return null;
        // return libros[i];
    }
    
}
