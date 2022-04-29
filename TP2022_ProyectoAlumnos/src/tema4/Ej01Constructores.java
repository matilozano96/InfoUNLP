package tema4;

import PaqueteLectura.Lector;

public class Ej01Constructores {
    public static void main(String[] args) {
        System.out.print("Radio del circulo: ");
        Circulo c = new Circulo(Lector.leerDouble());
        
        System.out.println("Triangulo: ");
        int[] ladosT = new int[3];
        for (int i=0; i<3; i++){ 
            System.out.print(" Lado " + (i+1) + ": "); 
            ladosT[i] = Lector.leerInt();
        }
        Triangulo t = new Triangulo (ladosT[0], ladosT[1], ladosT[2]);
        
        String n; Double s; int a; int camp;
        System.out.println("Entrenador:");
        System.out.print(" Nombre:");
        n = Lector.leerString();
        System.out.print(" Sueldo basico:");
        s = Lector.leerDouble();
        System.out.print(" Antiguedad:");
        a = Lector.leerInt();
        System.out.print(" Campeonatos Ganados:");
        camp = Lector.leerInt();
        
        Entrenador e = new Entrenador(n,s,a,camp);
    }
    
}
