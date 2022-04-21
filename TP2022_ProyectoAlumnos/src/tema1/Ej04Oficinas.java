package tema1;

import PaqueteLectura.Lector;

public class Ej04Oficinas {
    public static void main(String[] args) {
        int pisos = 4;
        int ofi = 2;
        
        int [][] matriz = new int[pisos][4];
        
        System.out.print("Numero de piso (1-"+ pisos + "): ");
        int num = Lector.leerInt();
        int num2;
        while (num < pisos+1) { 
            if (num > 0) { 
                System.out.print("Numero de oficina (1-"+ ofi + "): ");
                num2 = Lector.leerInt();	
                if ((num2 > 0)&(num2 < ofi+1)) { matriz[num - 1][num2 - 1] += 1; }
                else { System.out.println("Invalido (1-"+ ofi + ")"); }
            }
            else { System.out.println("Invalido (1-"+ pisos + ")"); }
            
            System.out.print("Numero de piso (1-"+ pisos + "): ");
            num = Lector.leerInt();
        }
        
        for(int i=0; i < pisos; i++){
            System.out.println("Piso " + (i+1) + ": ");
            for(int j=0; j < ofi; j++){
                System.out.println("    Oficina " + (j+1) + ": " + matriz[i][j]);
            }
        }
    }
}
