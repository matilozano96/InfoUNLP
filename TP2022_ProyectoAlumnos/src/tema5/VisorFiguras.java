package tema5;

public class VisorFiguras {
 private int mostradas;
 private int dimF = 5;
 private int dimL = 0;
 private Figura [] figuras;
 
 public VisorFiguras(){
    mostradas=0;
    figuras = new Figura[dimF];
 }
 public void guardarFigura(Figura f){
     if (quedaEspacio()) figuras[dimL++] = f;
 }
 public boolean quedaEspacio() { return !(dimL >= dimF); }
 
 public int getGuardadas(){ return dimL; }
 
 public void mostrar(){
 for (int i=0; i < dimL; i++) { 
     System.out.println(figuras[i].toString());
     mostradas++;
    }
 }
 public int getMostradas() {
 return mostradas;
 }
}
