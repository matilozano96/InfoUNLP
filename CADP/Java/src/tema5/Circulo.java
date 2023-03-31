package tema5;

public class Circulo extends Figura{
    private double radio;
    
    public Circulo(double r, String cRelleno, String cLinea) { 
        super(cRelleno, cLinea);
        radio = r; 
    }
    public void setRadio(double r) { radio = r; }
    
    public double calcularArea() { return Math.PI * radio * radio; }
    public double calcularPerimetro() { return Math.PI * radio * 2; }
}

