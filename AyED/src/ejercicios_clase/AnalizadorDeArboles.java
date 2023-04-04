package ejercicios_clase;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class AnalizadorDeArboles {
	public ListaEnlazadaGenerica<Integer> caminoTodosNeg(ArbolGeneral<Integer> arbol){
		// Retorna null para arboles vacios o nulos
		if (arbol == null || arbol.esVacio()) return null;
		
		ListaEnlazadaGenerica<Integer> ret = new ListaEnlazadaGenerica<Integer>();	
		boolean encontrado = caminoTodosNegREC(arbol, ret);
		
		// Retorna null si no hay camino valido
		if (!encontrado) return null;
		
		// Retorna camino valido
		return ret;
	}
	
	private boolean caminoTodosNegREC(ArbolGeneral<Integer> arbol, ListaGenerica<Integer> lista) {
		// Retornar F para positivos
		if (arbol.getDato() >= 0) return false;
		
		// Retornar T para hojas negativas
		lista.agregarFinal(arbol.getDato());
		if (arbol.esHoja()) return true;
		
		// Evaluar hijos para los demas casos
		arbol.getHijos().comenzar();
		while(!arbol.getHijos().fin()) {
			// Retornar T si el hijo i retornó una lista que cumple el objetivo
			if (caminoTodosNegREC(arbol.getHijos().proximo(), lista)) return true;
		}
		
		// Eliminar elemento de la lista para que el nodo padre siga explorando
		lista.eliminarEn(lista.tamanio());
		
		// Retornar F si ninguno de los hijos retornó una lista que cumpla el objetivo
		return false;
	}
}
