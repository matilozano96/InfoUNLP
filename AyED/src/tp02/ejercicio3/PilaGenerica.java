package tp02.ejercicio3;
import tp02.ejercicio2.*;

public class PilaGenerica<T> extends ListaEnlazadaGenerica<T> {
	
	public void apilar(T nodo) { this.agregarInicio(nodo); }
	public T desapilar() {
		if (this.esVacia()) { return null; }
		
		T elem = this.elemento(1);
		this.eliminarEn(1);
		return elem;
	}
	
	public T tope() { return this.elemento(1); }
	public boolean esVacia() { return (this.tamanio() == 0); }
}
