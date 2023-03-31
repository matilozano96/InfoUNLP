package tema5;
public class Rectangulo extends Figura{
    
    private double lado;
    private double lado2;
    
    public Rectangulo(double unLado, double otroLado, String unColorR, String unColorL){
        super(unColorR,unColorL);
        setLado2(otroLado);
        setLado(unLado);

    } 
    
    public double getLado(){
        return lado;       
    }
    public void setLado(double unLado){
        lado=unLado;
    }
    public double getLado2(){
        return lado2;       
    }
    public void setLado2(double unLado){
        lado2=unLado;
    }

    public double calcularArea(){
       return (getLado()* getLado2());
    }
    
    public double calcularPerimetro(){
       return (getLado()*2 + getLado2() * 2);
    }
    
    public String toString(){
       String aux = super.toString() + 
                    " Lado 1: " + getLado() +
                    " Lado 2: " + getLado2();
       return aux;
    }
}
