package tema3;
import PaqueteLectura.Lector;
public class Ej05Balanza {
    public static void main(String[] args) {
        Balanza2 b = new Balanza2();
        Producto p = new Producto();
        String d;
        double peso;
        double precioXKG;
        
        
        System.out.println("Iniciando...");
        
        System.out.print("\nIngresar producto: ");
        d = Lector.leerString();
        
        System.out.print("Ingresar peso: ");
        peso = Lector.leerDouble();
        
        while (peso > 0){            
            System.out.print("Ingresar precio por KG: ");
            precioXKG = Lector.leerDouble();
            
            p.setDescripcion(d);
            p.setPesoEnKg(peso);
            b.registrarProducto(p, precioXKG);
            
            System.out.print("\nIngresar producto: ");
            d = Lector.leerString();
            
            System.out.print("Ingresar peso: ");
            peso = Lector.leerDouble();
        }
        
        System.out.println("\n" + b.getResumen());
    }
    
}
