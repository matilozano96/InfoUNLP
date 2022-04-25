package tema3;

import PaqueteLectura.GeneradorAleatorio;

public class Ej01Triangulo {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        Triangulo t = new Triangulo(GeneradorAleatorio.generarDouble(9)+1,GeneradorAleatorio.generarDouble(9)+1,GeneradorAleatorio.generarDouble(9)+1);
        
        System.out.println(t.getLados());
        System.out.println(t.toString());
        
        
    }
    
}
