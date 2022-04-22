package tema2;

import PaqueteLectura.Lector;

public class Ej04Strings {
    public static void main(String[] args) {
        int tam = 10;
        String [] v = new String[tam];
        
        for (int i = 0; i<tam; i++){
            System.out.print((i+1) + ": ");
            v[i] = Lector.leerString();
        }
        
        String cadena = new String();
        for (int i = 0; i<tam; i++){
            cadena += v[i].charAt(0);
        }
        
        System.out.print(cadena);
    }
    
}
