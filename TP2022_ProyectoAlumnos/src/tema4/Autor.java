package tema4;
public class Autor {
    private String nombre;
    private String bio;
    private String origen;
    
    public Autor (String n, String b, String o) {
        nombre = n;
        bio = b;
        origen = o;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    } 

    @Override
    public String toString() {
        return nombre + " (" + bio + ") " + origen;
    }
    
    
}
