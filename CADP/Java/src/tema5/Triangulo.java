/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

public class Triangulo extends Figura{
    private double [] lados = new double[]{0,0,0};  
    public Triangulo (double l1, double l2, double l3, String cRelleno, String cLinea){ 
        super(cRelleno,cLinea);
        lados[0] = l1;
        lados[1] = l2;
        lados[2] = l3;
    }
    
    public double getLado(int i) { 
        if ((i > 0) & (i < 4)) { return lados[i-1]; }
        return -1;
    }
    
    public String getLados(){ 
        return String.format("Lado 1: %.2f", lados[0]) + 
                String.format(" Lado 2: %.2f", lados[1]) + 
                String.format(" Lado 3: %.2f", lados[2]);}
    
    public void setLado(int i, double len) { lados[i-1] = len; }
    
    public double calcularArea(){
        double s;
        s = ((lados[0]+lados[1]+lados[2])/2.0);
        return Math.sqrt(s * (s-lados[0]) * (s-lados[1]) * (s-lados[2]));
    }
    public double calcularPerimetro(){
        return (lados[0]+lados[1]+lados[2]);
    }  
}