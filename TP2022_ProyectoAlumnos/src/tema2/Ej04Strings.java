package tema2;

import PaqueteLectura.Lector;

public class Ej04Strings {
    final static int TAM = 10;
    
    public static void main(String[] args) {
        String [] v = new String[TAM];
        
        for (int i = 0; i<TAM; i++){
            System.out.print((i+1) + ": ");
            v[i] = Lector.leerString();
        }
        
        String cadena = new String();
        for (int i = 0; i<TAM; i++){
            cadena += v[i].charAt(0);
        }
        
        System.out.print(cadena);
    }
    
}
