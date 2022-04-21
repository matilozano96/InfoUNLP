package tema2;

import PaqueteLectura.GeneradorAleatorio;

public class Ej02VectorPersonas {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar(); 
        int cant = 10;
        Persona [] p = new Persona [cant];
        int dimL = 0;
        
        for (int i=0; i < cant; i++){
            int e = GeneradorAleatorio.generarInt(100);
            if (e == 0) { i = cant; }
            else {
                p[i] = new Persona(GeneradorAleatorio.generarString(20), GeneradorAleatorio.generarInt(99999998), e);
                dimL++;
            }
        }
        
        int min = 99999999;
        int minIndex = dimL + 1;
        int c = 0;
        for (int i=0; i < dimL; i++){ 
            if (p[i].getDNI() < min) { 
                min = p[i].getDNI();
                minIndex = i;
            }
            if (p[i].getEdad() > 65) { c++; }
        }
        
        System.out.println("Personas mayores a 65 años: " + c);
        System.out.println("Menor DNI: " + p[minIndex].toString());
    }
    
}
