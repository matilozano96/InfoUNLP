package MockTests;
import PaqueteLectura.GeneradorAleatorio;
public class AlumnosMain {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        
        AlumnoGrado g = new AlumnoGrado("Testo Testi", 40774621, "Ingenieria");
        AlumnoDoctorado d = new AlumnoDoctorado("Probando Probandi", 11556325, "Ingeniero en Sistemas", "UNLP");
        
        for (int i = 0; i < 30; i++) {
            String fecha;
            if (i < 9) fecha = "0" + (i+1) + "/03/2022";
            else fecha = (i+1) + "/03/2022";
            g.agregarMateria(i, GeneradorAleatorio.generarDouble(6)+4, fecha);
        }
        for (int i = 0; i < 8; i++) {
            String fecha = "0" + (i+1) + "/03/2022";
            d.agregarMateria(i, GeneradorAleatorio.generarDouble(6)+4, fecha);
        }
        
        System.out.println("\n" + g.toString());
        System.out.println("\n" + d.toString());
    }
}
