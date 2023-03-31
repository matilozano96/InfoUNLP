package tema1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Ej05Restaurante {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        
        int num = 5;
        int [][] clientes = new int [num][4];
        String [] categorias = new String [4];
        categorias[0] = "Atencion al cliente";
        categorias[1] = "Calidad de la comida";
        categorias[2] = "Precio";
        categorias[3] = "Ambiente";
        
        for (int i = 0; i < num; i++){
            System.out.println("Cliente "+ (i+1) + ": ");
            for (int j = 0; j < 4; j++) {
                System.out.print("    " + categorias[j] + ": ");
                clientes[i][j] = GeneradorAleatorio.generarInt(10);
                System.out.println(clientes[i][j]);
            }
        }
        
        System.out.println("Promedios: ");
        for (int j = 0; j < 4; j++){
            int suma = 0;
            System.out.print("    " + categorias[j] + ": ");
            for (int i = 0; i < num; i++) {
                suma += clientes[i][j];
            }
            System.out.println(suma / 4);
        }
    }
}
