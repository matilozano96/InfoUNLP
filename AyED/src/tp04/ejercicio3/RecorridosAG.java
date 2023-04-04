package tp04.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class RecorridosAG {
	
	// Retorna una lista con los elementos impares de "a" mayores a "n"
	// Recorrido PreOrden
	public ListaGenerica<Integer> numerosImparesMayoresQuePreorden (ArbolGeneral<Integer> a, Integer n){
		if (a==null) return null;
		ListaGenerica<Integer> ret = new ListaEnlazadaGenerica<Integer>();
		ret.comenzar();
		imparesPreOrdenRec(a, n, ret);
		return ret;
	}
	private void imparesPreOrdenRec(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> l) {
		if (testMayor(a.getDato(),n)) {
			l.agregarFinal(a.getDato());
		}
		if (a.tieneHijos()) {
			a.getHijos().comenzar();
			while(!a.getHijos().fin()) {
				imparesPreOrdenRec(a.getHijos().proximo(), n, l);
			}
		}
	}
	
	// Recorrido InOrden
	public ListaGenerica<Integer> numerosImparesMayoresQueInOrden (ArbolGeneral<Integer> a, Integer n) {
		if (a==null) return null;
		ListaGenerica<Integer> ret = new ListaEnlazadaGenerica<Integer>();
		ret.comenzar();
		imparesInOrdenRec(a, n, ret);
		return ret;
	}
	private void imparesInOrdenRec(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> l) {
		if (a.tieneHijos())
		{
			a.getHijos().comenzar();
			imparesInOrdenRec(a.getHijos().proximo(), n, l);
		}
		if (testMayor(a.getDato(),n)) {
			l.agregarFinal(a.getDato());
		}
		if (a.tieneHijos()) {
			while(!a.getHijos().fin()) {
				imparesPreOrdenRec(a.getHijos().proximo(), n, l);
			}
		}
	}

	// Recorrido PostOrden
	public ListaGenerica<Integer> numerosImparesMayoresQuePostOrden (ArbolGeneral<Integer> a, Integer n) {
		if (a==null) return null;
		ListaGenerica<Integer> ret = new ListaEnlazadaGenerica<Integer>();
		ret.comenzar();
		imparesPostOrdenRec(a, n, ret);
		return ret;
	}
	private void imparesPostOrdenRec(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> l) {
		if (a.tieneHijos()) {
			a.getHijos().comenzar();
			while(!a.getHijos().fin()) {
				imparesPreOrdenRec(a.getHijos().proximo(), n, l);
			}
		}
		if (testMayor(a.getDato(),n)) {
			l.agregarFinal(a.getDato());
		}
	}

	// Recorrido Por Nivel
	public ListaGenerica<Integer> numerosImparesMayoresQuePorNiveles(ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> ret = new ListaEnlazadaGenerica<Integer>();
		ListaGenerica<ArbolGeneral<Integer>> cola = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		cola.agregarFinal(a);
		while (!cola.esVacia()) {
			ArbolGeneral<Integer> elem = cola.elemento(0);
			cola.eliminarEn(0);
			if (testMayor(elem.getDato(),n)) ret.agregarFinal(elem.getDato());
			if (elem.tieneHijos()) {
				elem.getHijos().comenzar();
				while(!elem.getHijos().fin()) {
					cola.agregarFinal(elem.getHijos().proximo());
				}
			}
		}
		
		return ret;
		
	}

	private boolean testMayor(Integer dato, Integer n) {
		return (dato > n && dato %2 != 0);
	}
}

