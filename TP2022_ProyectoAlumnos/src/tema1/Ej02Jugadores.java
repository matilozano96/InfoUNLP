
package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos

import PaqueteLectura.GeneradorAleatorio;



public class Ej02Jugadores {
    public static void main(String[] args) {
        //Paso 2: Declarar la variable vector de double 
        //Paso 3: Crear el vector para 15 double
        int DF = 15;
        GeneradorAleatorio.iniciar();
        double [] alturas = new double[DF]; 
        double promedio = 0;
        int counter = 0;
        
        //Paso 4: Declarar indice y variables auxiliares a usar
                
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        for (int i=0; i<DF; i++){ 
            alturas[i] = GeneradorAleatorio.generarInt(50) * 0.01 + 1.6;
            promedio += alturas[i];
            System.out.println(i + String.format(": %.2f", alturas[i]));
        }
        //Paso 7: Calcular el promedio de alturas, informarlo
        promedio = promedio / DF;
        System.out.println(String.format("Promedio: %.2f", promedio));
        
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        
        for (int i=0; i<DF; i++){ 
            if (alturas[i] > promedio) { counter++; }
        }
        //Paso 9: Informar la cantidad.
        System.out.println("Alturas que superan el promedio: " + counter);
    }
    
}
