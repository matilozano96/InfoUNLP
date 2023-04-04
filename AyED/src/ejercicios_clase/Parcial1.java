package ejercicios_clase;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class Parcial1 {
	
	// Solucion recursiva
	public static boolean esDeSeleccionREC(ArbolGeneral<Integer> arbol) {
		if ( arbol.esHoja() || arbol.esVacio() ) return true;
		
		arbol.getHijos().comenzar();
		Integer min = Integer.MAX_VALUE;
		
		while (!arbol.getHijos().fin()) {
			ArbolGeneral<Integer> actual = arbol.getHijos().proximo();
			if (min > actual.getDato()) min = actual.getDato();
			
			if (!esDeSeleccionREC(actual)) return false;
			if (min < arbol.getDato()) return false;
		}
		
		return (min == arbol.getDato());
	}
	
	// La mejor solución es iterativa
	// Encolar hijos. Comparar con hijo menor. Retornar/Pasar.
	public static boolean esDeSeleccionIT(ArbolGeneral<Integer> arbol) {
		ListaEnlazadaGenerica<ArbolGeneral<Integer>> cola = new ListaEnlazadaGenerica();
		cola.agregarFinal(arbol);
		
		while (!cola.esVacia()) {
			ArbolGeneral<Integer> actual = cola.elemento(0);
			cola.eliminarEn(0);
			
			if (actual.tieneHijos()) if (actual.getDato() != getMinimo(actual.getHijos())) return false;
			
			actual.getHijos().comenzar();
			while (actual.getHijos().fin()) {
				cola.agregarFinal(actual.getHijos().proximo());
			}
		}
		
		return true;
	}
	
	public static int getMinimo(ListaGenerica<ArbolGeneral<Integer>> lista) {
		int min = Integer.MAX_VALUE;
		lista.comenzar();
		while (lista.fin()) {
			int dato = lista.proximo().getDato();
			if (dato < min) min = dato;
		}
		return min;
	}
}
