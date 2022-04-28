package tema3;
import PaqueteLectura.Lector;
public class Ej04Circulo {
    public static void main(String[] args) {
        System.out.print("Radio: ");
        Circulo c = new Circulo(Lector.leerDouble());
        
        System.out.println(c.toString());
    }
    
}
