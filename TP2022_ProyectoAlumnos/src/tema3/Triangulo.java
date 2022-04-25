package tema3;
public class Triangulo {
    private double [] lados = new double[]{0,0,0};
    private String relleno = "0xFFFFFF";
    private String borde = "0x000000";

    
    public Triangulo (){ }
    
    public Triangulo (double l1, double l2, double l3){ 
        lados[0] = l1;
        lados[1] = l2;
        lados[2] = l3;
    }
    
    public String getR() { return relleno; }
    public String getB() { return borde; }
    public double getLado(int i) { 
        if ((i > 0) & (i < 4)) { return lados[i-1]; }
        return -1;
    }
    
    public String getLados(){ 
        return String.format("Lado 1: %.2f", lados[0]) + 
                String.format(" Lado 2: %.2f", lados[1]) + 
                String.format(" Lado 3: %.2f", lados[2]);}
    
    public void setR(String c){ relleno = c; }
    public void setB(String c){ borde = c; }
    public void setLado(int i, double len) { lados[i-1] = len; }
    
    public double calcularArea(){
        double s;
        s = ((lados[0]+lados[1]+lados[2])/2.0);
        return Math.sqrt(s * (s-lados[0]) * (s-lados[1]) * (s-lados[2]));
    }
    public double calcularPerimetro(){
        return (lados[0]+lados[1]+lados[2]);
    }
    
    @Override public String toString(){ 
        return String.format("Area: %.2f",  calcularArea()) + 
               String.format("\nPerimetro: %.2f", calcularPerimetro());}
    
    
}
