package tema4;
public class Flota {
    final int DF = 15;
    private int DL = 0;
    private Micro [] micros = new Micro[DF];
    
    public Flota () {}
    public boolean estaCompleta() { return (DL >= DF); }
    public void agregarMicro(Micro m){ 
        if (!estaCompleta()) micros[DL++] = m;
    }
    public Micro buscarXDestino (String des) {
        Micro ret = null;
        for (int i = 0; i < DL && ret == null; i++) {
            if (micros[i].getDestino().equals(des)) ret = micros[i];
        }
        return ret;
    }
}
