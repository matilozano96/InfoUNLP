package tema1;

//Paso 1. importar la funcionalidad para generar datos aleatorios
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Ej03Matrices {

    public static void main(String[] args) {
	//Paso 2. iniciar el generador aleatorio
        GeneradorAleatorio.iniciar();
	 
        //Paso 3. definir la matriz de enteros de tamaño 10x10 e iniciarla con nros. aleatorios 
        int tam = 10;
        int [][] matriz = new int[tam][tam];
        int [] sumas = new int[tam];
        for (int i=0; i < tam; i++){
            for (int j=0; j < tam; j++){
                matriz[i][j] = GeneradorAleatorio.generarInt(200);
            }
        }
        //Paso 4. mostrar el contenido de la matriz en consola
        for (int i=0; i < tam; i++){
            for (int j=0; j < tam; j++){
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
        //Paso 5. calcular e informar la suma de todos los elementos almacenados entre las filas 2 y 9 y las columnas 0 y 3
        int suma = 0;
        for (int i=2; i <= 9; i++){
            for (int j=0; j <= 3; j++){
                suma += matriz[i][j];
            }
        }
        System.out.println("Suma 1: " + suma);
        //Paso 6. generar un vector de 10 posiciones donde cada posición i contiene la suma de la columna i de la matriz 
        for (int i=0; i < tam; i++){
            sumas[i] = 0;
            for (int j=0; j < tam; j++){
                sumas[i] += matriz[i][j];
            }
        }
	//   luego de generado, imprimir el vector
        System.out.println();
        for (int i=0; i < tam; i++){ System.out.println("Columna " + i + ": " + sumas[i]); }

        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        System.out.println("Valor a buscar: ");
        boolean encontrado = false;
        int buscar = Lector.leerInt();
        
        for (int i=0; i < tam; i++){
            for (int j=0; j < tam; j++){
                if (matriz[i][j] == buscar){ 
                    System.out.println("Encontrado en " + i + "," + j);
                    encontrado = true;
                }
            }
        }
        if (!encontrado) { System.out.println("No se encontró el elemento."); }
        //   y en caso contrario imprima "No se encontró el elemento".

    }
}
