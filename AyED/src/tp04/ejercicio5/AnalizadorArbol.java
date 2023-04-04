package tp04.ejercicio5;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class AnalizadorArbol {
	
	
	// Devolver el mayor promedio en UN NIVEL del arbol
	public int devolverMaximoPromedio(ArbolGeneral<AreaEmpresa> arbol) {
		ListaEnlazadaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ListaEnlazadaGenerica<ArbolGeneral<AreaEmpresa>>();
		int nivel = 1;
		int promedioMax = -1;
		int sumaActual = 0;
		int contadorNivel = 0;
		
		cola.agregarFinal(arbol);
		cola.agregarFinal(null);
		
		while (!cola.esVacia()) {
			ArbolGeneral<AreaEmpresa> elem = cola.elemento(0);
			cola.eliminarEn(0);
			if (elem == null) {
				if (sumaActual / contadorNivel > promedioMax) promedioMax = sumaActual / contadorNivel;
				nivel++;
				contadorNivel = 0;
				sumaActual = 0;
				if (!cola.esVacia()) cola.agregarFinal(null);
			}
			else {
				contadorNivel++;
				sumaActual =+ elem.getDato().getTardanza();
				
				elem.getHijos().comenzar();
				while(!elem.getHijos().fin()) {
					cola.agregarFinal(elem.getHijos().proximo());
				}
			}
		}
		
		
		return promedioMax;
	}
}
