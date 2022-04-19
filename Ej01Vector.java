package tema1;
import PaqueteLectura.GeneradorAleatorio;

public class Ej01Vector {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int DF=11;  
        int [] tabla2 = new int[DF]; // indices de 0 a 10
        int i;
        for (i=0;i<DF;i++) {
            tabla2[i] = GeneradorAleatorio.generarInt(100);
        }
        for (i=0;i<DF;i++) System.out.println(tabla2[i] + " x 2: " + tabla2[i]*2);
    }
    
}
