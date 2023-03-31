package tema5;
public class Ej02Empleados {
    public static void main(String[] args) {
        Entrenador e = new Entrenador("Testo Testi", 5, 100000, 3);
        Jugador j = new Jugador("Pablo Prueba", 15, 12, 150000, 2);
        
        System.out.println(e.toString());
        System.out.println(j.toString());
    }
    
}
