package tema2;

import PaqueteLectura.Lector;

public class Ej01Persona {
    public static void main(String[] args) {
        
        System.out.print("Nombre: ");
        String n = Lector.leerString();
        System.out.print("DNI: ");
        int dni = Lector.leerInt();
        System.out.print("Edad: ");
        int edad = Lector.leerInt();
        
        Persona p = new Persona(n, dni, edad);
        System.out.print(p.toString());
    }
}
