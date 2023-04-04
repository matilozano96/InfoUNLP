package tp03.ejercicio5;
import tp03.ejercicio2.*;
import tp02.ejercicio3.*;

public class ProfundidadDeArbolBinario {
	private ArbolBinario<Integer> arbol;
	
	public int sumaElementosProfundidad(int n) {
		int res = 0;
		int nivel = 0;
		ArbolBinario<Integer> aux;
		
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica();
		cola.encolar(arbol);
		cola.encolar(null);
		
		while ( !cola.esVacia() ) {
			aux = cola.desencolar();
			if (aux == null) {
				nivel++;
				if ( !cola.esVacia() ) cola.encolar(null);
			}
			else {
				if (nivel == n) res += aux.getDato();
				if (aux.tieneHijoIzquierdo()) cola.encolar(aux.getHijoIzquierdo());
				if (aux.tieneHijoDerecho()) cola.encolar(aux.getHijoDerecho());
			}
			if (nivel > n) return res;
		}
		return res;
	}
}
