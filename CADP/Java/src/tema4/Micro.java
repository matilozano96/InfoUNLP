package tema4;

public class Micro {
    final int AS = 20;
    
    private String patente;
    private String destino;
    private String salida = "00:00";
    private boolean [] asientos = new boolean [AS];
    private int ocupados = 0;
    
    public Micro (String p, String d, String s){
        patente = p;
        destino = d;
        salida = s;
        for (int i = 0; i < AS; i++){ asientos[i] = false; }
    }

    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getSalida() {
        return salida;
    }
    public void setSalida(String salida) {
        this.salida = salida;
    }

    public int getOcupados() {
        return ocupados;
    }
    public boolean lleno() { return (ocupados == AS); }
    public boolean asientoValido(int n) { return (n >= 0 && n < 20); }
    public boolean estadoAs(int n) { return asientos[n]; }
    
    public void ocupar(int n) { 
        if (!asientos[n]) { 
            asientos[n] = true;
            ocupados++;
        }
    } 
    public void desocupar(int n) { 
        if (asientos[n]) { 
            asientos[n] = false;
            ocupados--;
        }
    }
    
    public int getDesocupado() { 
        
        for (int i = 0; i < AS; i++){ if (!asientos[i]) return i; }
        return -1;
    }
    
    public String toString() { return "Micro con destino a " + destino + " - Patente " + patente + " Salida: " + salida; }
}
