package tema3;

import PaqueteLectura.Lector;

public class Ej02Balanza {
    public static void main(String[] args) {
        Balanza b = new Balanza();
        double peso;
        double precioXKG;
        
        
        System.out.println("Iniciando...");
        
        System.out.print("\nIngresar peso: ");
        peso = Lector.leerDouble();
        
        while (peso > 0){
            System.out.print("Ingresar precio por KG: ");
            precioXKG = Lector.leerDouble();
            
            b.registrarProducto(peso, precioXKG);
            
            System.out.print("\nIngresar peso: ");
            peso = Lector.leerDouble();
        }
        
        System.out.println("\n" + b.getResumen());
    }
    
}
