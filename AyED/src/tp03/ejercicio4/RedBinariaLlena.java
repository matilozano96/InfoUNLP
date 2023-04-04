package tp03.ejercicio4;
import tp03.ejercicio2.*;

public class RedBinariaLlena {
	private ArbolBinario<Integer> arbol;
	
	public int retardoReenvio() { 
		return retardoHelper(this.arbol);
	}
	private int retardoHelper(ArbolBinario<Integer> a) {
		int res = 0;
		if (a != null) {
			res += a.getDato() + Math.max(retardoHelper(a.getHijoIzquierdo()), retardoHelper(a.getHijoDerecho()));
		}
		return res;
	}
}
