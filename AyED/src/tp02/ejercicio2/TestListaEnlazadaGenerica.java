package tp02.ejercicio2;
import tp02.ejercicio2.*;

public class TestListaEnlazadaGenerica {
    public static void main(String[] args) {
        ListaGenerica<Estudiante> lista = new ListaEnlazadaGenerica();
        
        Estudiante a = new Estudiante("Testo", "Testi", "1", "eltestardo@hotmail.com", "La Testocueva");
        Estudiante b = new Estudiante("Mati", "L", "2", "ml@hotmail.com", "Mi casa");
        Estudiante c = new Estudiante("AWDFAF", "ASD", "34", "asdggfa@sdfsdgf.com.ira", "ADSDFSGFGDGF");
        Estudiante d = new Estudiante("John", "Doe", "6", "john.doe@gmail.com", "Somewhere");
        
        lista.agregarFinal(a);
        lista.agregarFinal(b);
        lista.agregarFinal(c);
        lista.agregarFinal(d);
        
        
        for (int i = 0; i < lista.tamanio(); i++) { System.out.println(lista.proximo().tusDatos()); }
        
        System.out.println("-----------------------");
        
        ListaGenerica<Integer> lista2 = new ListaEnlazadaGenericaMOD<Integer>();
        Integer [] arr = new Integer[10];
        for (int i=0; i<10; i++) { arr[i] = i*2; }
        
        boolean exito = ((ListaEnlazadaGenericaMOD<Integer>) lista2).agregar(arr);
        
        System.out.println(exito);

        for (int i=0; i<10; i++) { System.out.println(lista2.proximo()); }
    }
}
