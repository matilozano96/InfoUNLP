package tema5;
public class Ej05VisorFiguras {
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado(15, "0xFFFFFF", "0x000000");
        Cuadrado c2 = new Cuadrado(25, "AZUL", "BLANCO");
        Rectangulo r = new Rectangulo(10.2, 15, "NEGRO", "ROJO");
        Triangulo t = new Triangulo(10, 15, 12, "BLANCO", "AZUL");
        
        VisorFiguras v = new VisorFiguras();
        v.guardarFigura(c1);
        v.guardarFigura(c2);
        v.guardarFigura(r);
        v.guardarFigura(t);
        
        v.mostrar();
        
        System.out.println("Figuras mostradas: " + v.getMostradas());
        
    }
    
}
