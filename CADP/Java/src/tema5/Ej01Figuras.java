package tema5;
public class Ej01Figuras {
    public static void main(String[] args) {
        Circulo c = new Circulo(10, "Verde", "Amarillo");
        Triangulo t = new Triangulo(10, 15, 10, "Celeste", "Azul");
        
        System.out.println(t.toString());
        System.out.println(c.toString());
        
        t.despintar();
        System.out.println(t.toString());
    }
    
}
