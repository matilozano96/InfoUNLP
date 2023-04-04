package ejercicios_clase;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class Parcial2 {
	ArbolGeneral<Integer> arbol;
	
	public ListaGenerica<Integer> resolver(){
		if (arbol.esVacio()) return null;
		ListaGenerica<Integer> ret = new ListaEnlazadaGenerica<Integer>();
		fronteraRec(this.arbol, ret);
		return ret;
	}
	
	private void fronteraRec(ArbolGeneral<Integer> ar, ListaGenerica<Integer> ret) {
		if(ar.esHoja()) {
			if (ar.getDato() % 2 == 2) ret.agregarFinal(ar.getDato());
			return;
		}
		ar.getHijos().comenzar();
		while(!ar.getHijos().fin()) {
			fronteraRec(ar.getHijos().proximo(), ret);
		}
	}
}
