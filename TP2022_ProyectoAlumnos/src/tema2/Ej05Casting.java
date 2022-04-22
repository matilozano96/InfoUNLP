package tema2;
import PaqueteLectura.Lector;

public class Ej05Casting {
    public static void main(String[] args) {
        int dias = 5;
        int cant = 8;
        Persona [][] casting = new Persona[dias][cant];
        
        for (int i = 0; i < dias; i++){
            System.out.println("Dia " + (i+1) + ": ");
            for (int j=0; j<cant; j++){
                System.out.print(" Nombre: ");
                String n = Lector.leerString();
                if (n.equals("ZZZ")) { 
                    i = dias;
                    j = cant;
                }
                else { 
                    System.out.print(" DNI: ");
                    int dni = Lector.leerInt();
                    System.out.print(" Edad: ");
                    int edad = Lector.leerInt();
                    casting[i][j] = new Persona(n, dni, edad);
                }
                System.out.print(" ");
                
            }
        }
    }
}
