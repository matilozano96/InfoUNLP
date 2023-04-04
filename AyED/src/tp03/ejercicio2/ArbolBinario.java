package tp03.ejercicio2;
import tp02.ejercicio3.*;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas() {
		return contarHojasHelper(this);
	}
	
	private int contarHojasHelper(ArbolBinario<T> a) {
		if (a==null) return 0;
		if (!a.tieneHijoDerecho() & !a.tieneHijoIzquierdo()) return 1;
		return contarHojasHelper(a.getHijoIzquierdo()) + contarHojasHelper(a.getHijoDerecho());
		
	}
	

    public ArbolBinario<T> espejo() {
    	if (this != null) {
			this.getHijoIzquierdo().espejo();
			this.getHijoDerecho().espejo();
			this.intercambiarHijos();
		}
    	return this;
	}
    
    private void intercambiarHijos() {  
		ArbolBinario<T> aux;
		aux = this.hijoIzquierdo;
		this.hijoIzquierdo = this.hijoDerecho;
		this.hijoDerecho = aux;
    }


	public void entreNiveles(int n, int m){
		int nivel = 0;
		ArbolBinario<T> aux;
		
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		cola.encolar(this);
		cola.encolar(null);
		
		while (!cola.esVacia()) {
			aux = cola.desencolar();
			if (aux != null) { 
				if ((nivel >= n) && (nivel <= m)) {
					System.out.print(" " + aux.getDato());
				}
				if (aux.tieneHijoDerecho()) cola.encolar(aux.getHijoDerecho());
				if (aux.tieneHijoIzquierdo()) cola.encolar(aux.getHijoIzquierdo());
				
			}
			else { 
				nivel++;
				System.out.println();
				if ( !cola.esVacia() ) cola.encolar(null);
			}
			if (nivel > m) return;
		}
	}

	

}
