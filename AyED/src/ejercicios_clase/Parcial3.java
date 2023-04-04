package ejercicios_clase;

import tp03.ejercicio2.ArbolBinario;

public class Parcial3 {
	
	private ArbolBinario<Integer> arbol;
	
	public boolean esMonodistante(Integer valor) {
		if (this.arbol.esVacio()) return false;
		return esMonoRec(valor, arbol);
	}
	
	private boolean esMonoRec(Integer k, ArbolBinario<Integer> ar) {
		if ( ar.getDato() > k ) return false;
		if ( ar.esHoja() ) return ( ar.getDato().equals(k) );
		
		boolean ret = true;
		
		if (ar.tieneHijoIzquierdo()) ret = esMonoRec(k-ar.getDato(), ar.getHijoIzquierdo());
		if (ar.tieneHijoDerecho() & ret) ret = esMonoRec(k-ar.getDato(), ar.getHijoDerecho());
		
		return ret;
	}
}
