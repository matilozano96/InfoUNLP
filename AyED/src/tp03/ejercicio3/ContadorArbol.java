package tp03.ejercicio3;
import tp02.ejercicio2.*;
import tp03.ejercicio2.*;

public class ContadorArbol {
	private ArbolBinario<Integer> arbol;
	
	public void setArbol(ArbolBinario arbol) { this.arbol = arbol; }
	
	public ListaEnlazadaGenerica<Integer> numerosParesInOrden() {
		ListaEnlazadaGenerica<Integer> res = new ListaEnlazadaGenerica();
		if (arbol != null) paresHelperInOrden(arbol, res);
		return res;
	}
	
	private void paresHelperInOrden(ArbolBinario<Integer> a, ListaEnlazadaGenerica<Integer> l) {
		if (a.tieneHijoIzquierdo()) paresHelperInOrden(a.getHijoIzquierdo(), l);
		if (a.getDato() % 2 == 0) l.agregarFinal(a.getDato());
		if (a.tieneHijoDerecho()) paresHelperInOrden(a.getHijoDerecho(), l);
	}
	
	public ListaEnlazadaGenerica<Integer> numerosParesPostOrden() {
		ListaEnlazadaGenerica<Integer> res = new ListaEnlazadaGenerica();
		paresHelperPosOrden(arbol, res);
		return res;
	}
	
	private void paresHelperPosOrden(ArbolBinario<Integer> a, ListaEnlazadaGenerica<Integer> l) {
		if (a.tieneHijoIzquierdo()) paresHelperPosOrden(a.getHijoIzquierdo(), l);
		if (a.tieneHijoDerecho()) paresHelperPosOrden(a.getHijoDerecho(), l);
		if (a.getDato() % 2 == 0) l.agregarFinal(a.getDato());
	}
}
