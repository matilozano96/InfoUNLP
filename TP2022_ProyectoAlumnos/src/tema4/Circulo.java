package tema4;
public class Circulo {
    private String relleno = "0xFFFFFF";
    private String borde = "0x000000";
    private double radio;
    
    public Circulo(double r) { radio = r; }
    
    public Circulo() {}
    
    public String getR() { return relleno; }
    public String getB() { return borde; }
    
    public void setR(String r) { relleno = r; }
    public void setB(String b) { borde = b; }
    public void setRadio(double r) { radio = r; }
    
    public double calcularArea() { return Math.PI * radio * radio; }
    public double calcularPerimetro() { return Math.PI * radio * 2; }
    
    @Override public String toString(){ 
        return String.format("Area: %.2f",  calcularArea()) + 
               String.format("\nPerimetro: %.2f", calcularPerimetro());}
    
}
