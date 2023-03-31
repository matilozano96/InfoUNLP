package tema4;
import PaqueteLectura.Lector;
public class Ej04Micros {
    public static void main(String[] args) {    
        Micro m = new Micro("ABC123","Mar del Plata","5:00");
        int n;
        for (int i = 0; i < 5;){
            System.out.print("Pasajero " + (i+1) + ". Elegir asiento (0-19): " );
            n = Lector.leerInt();
            if (m.asientoValido(n)) {
                if (!m.estadoAs(n)){
                    m.ocupar(n);
                    i++;
                    System.out.println("Hecho");
                }
                else System.out.println("Ocupado. Se sugiere el asiento " + m.getDesocupado());
            }
            else System.out.println("Invalido. Elegir en el rango (0-19)");
        }
        System.out.println("Finalizado. Hay " + m.getOcupados() + " asientos ocupados.");
    }
}
