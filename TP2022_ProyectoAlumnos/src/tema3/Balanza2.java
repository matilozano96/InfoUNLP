package tema3;
public class Balanza2 {
    private int cant;
    private double monto;
    private String resumen = "";
    
    public Balanza2 () { iniciarCompra(); }
    public void iniciarCompra() { cant = 0; monto = 0.0;}
    public void registrarProducto(Producto p, double precioXKG) { 
        cant++;
        double precio = p.getPesoEnKg() * precioXKG;
        monto += precio;
        resumen += p.getDescripcion()+ " " + precio + "$ - ";
    }
    public double getMonto(){ return monto; }
    
    public String getResumen(){ 
        return (resumen + "Total a pagar por " + cant + String.format(" productos: $%.2f", monto));  
    }    
}
