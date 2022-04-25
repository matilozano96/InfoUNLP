package tema3;
public class Balanza {
    private int cant;
    private double monto;
    
    public Balanza () { iniciarCompra(); }
    public void iniciarCompra() { cant = 0; monto = 0.0;}
    public void registrarProducto(double peso, double precioXKG) { 
        cant++;
        monto += peso * precioXKG;
    }
    public double getMonto(){ return monto; }
    
    public String getResumen(){ 
        return "Total a pagar por " + cant + String.format(" productos: $%.2f", monto);  
    }
    
}
