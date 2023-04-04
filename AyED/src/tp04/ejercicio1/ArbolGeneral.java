package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	public ListaEnlazadaGenerica<T> preOrden() {
		return null;
	}
	
	public Integer altura() {
		if (this == null) return -1;
		if (!this.tieneHijos()) return 0;

		Integer max = 0;
		this.getHijos().comenzar();
		while (!this.getHijos().fin()) {
			Integer temp = this.getHijos().proximo().altura();
			if (temp > max) max = temp;
		}
		return max + 1;
	}

	public Integer nivel(T dato) {
		int nivel = 1;
		ListaGenerica<ArbolGeneral<T>> cola = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		cola.agregarFinal(this);
		cola.agregarFinal(null);
		
		while (!cola.fin()) {
			ArbolGeneral<T> elem = cola.elemento(0);
			cola.eliminarEn(0);
			if (elem == null) {
				nivel++;
				if (!cola.esVacia()) cola.agregarFinal(null);
			}
			else { 
				// Se encuentra el dato
				if (elem.getDato().equals(dato)) return nivel;
				if (elem.tieneHijos()) {
					elem.getHijos().comenzar();
					while (!elem.getHijos().fin()) cola.agregarFinal(elem.getHijos().proximo());
				}
			}
		}
		
		// No se encontró el dato
		return -1;
		
	}

	public Integer ancho() {
		if (this == null) return -1;
		if (!this.tieneHijos()) return 0;
		
		Integer max = 0;
		this.getHijos().comenzar();
		while (!this.getHijos().fin()) {
			Integer temp = this.getHijos().proximo().ancho();
			if (temp > max) max = temp;
		}
		return Math.max(max, this.getHijos().tamanio());
	}

}
