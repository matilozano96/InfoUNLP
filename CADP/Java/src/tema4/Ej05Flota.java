package tema4;
import PaqueteLectura.Lector;
public class Ej05Flota {
    public static void main(String[] args) {
        Flota f = new Flota();
        f.agregarMicro(new Micro("ABC123","Mar del Plata","5:00"));
        f.agregarMicro(new Micro("CDE456","Tandil","16:00"));
        f.agregarMicro(new Micro("SAG894","Retiro","12:00"));
        f.agregarMicro(new Micro("QHN896","Parana","14:40"));
        f.agregarMicro(new Micro("AFE112","Campana","20:30"));
        
        System.out.print("Buscar destino: ");
        Micro b = f.buscarXDestino(Lector.leerString());
        if (b != null) System.out.println(b);
        else System.out.println("No encontrado.");
    }
    
}
