package grafos;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;

public class menorCaminoBFS {

	public ListaGenerica<T> menorCaminoBFS(Grafo<T> grafo){
		
		ListaGenerica<T> ret = new ListaEnlazadaGenerica<T>();
		boolean[] marca = new boolean[grafo.listaDeVertices().tamanio()];
		int[] dist = new int[grafo.listaDeVertices().tamanio()];
		
		// Estos tres se presuponen, son para el ejemplo
		Vertice<T> inicio = grafo.getInicio();
		Vertice<T> fin = grafo.getFin();
		T malo = grafo.getDatoMalo();
		// malo seria un valor para el dato de un Vertice que nos prohiba ingresar a él para generar un camino. Es a modo de ejemplo y depende de la consigna
		
		// Creamos la cola. Encolamos fin, pero se puede hacer desde el inicio si despues armamos el camino desde el final.
		ColaGenerica <Vertice<T>> cola = new ColaGenerica<T>();
		cola.encolar(fin);
		marca[fin.posicion()] = true;
		dist[fin.posicion()] = 0; // Innecesario, lo hago para no olvidarme
		
		// Exploramos todos los Vertices conectados al nodo final y sus aristas. Lineal
		while (!cola.esVacia()) {
			Vertice<T> actual = cola.desencolar();
			Lista<Arista<T>> ady = grafo.listaDeAdyacentes(actual);
			
			ady.comenzar();
			while (!ady.fin()) {
				Arista<T> temp = ady.proximo();
				int pos = temp.verticeDestino().posicion();
				
				// Si ya está marcado como visitado, ignorar. Este elemento ya está en la cola o ya fue analizado.
				if ( !marca[pos] ) {
					marca[pos] = true;
					// Si el dato indica que es un elemento que NO se puede visitar en el camino, marcarlo igual e ignorarlo 
					if ( temp.verticeDestino().dato() 	!= malo ) {
						cola.encolar(temp.verticeDestino());
						
						// Le asignamos una distancia del actual + 1. 
						// Al estar trabajando con una cola tenemos la certeza de que nos vamos a encontrar con un Vertice en la menor distancia posible, no?
						dist[pos] = dist[actual.posicion()] + 1;
					}
					// Le damos un valor muy alto para que la segunda parte del algoritmo nunca lo elija
					else {
						dist[pos] = Integer.MAX_VALUE;
					}
					
				}
			}
		}
		
		// Si no se marcó el inicio, quiere decir que no existe un camino posible. Nos ahorramos el resto saliendo acá
		// y retornamos la lista vacía
		if ( !marca[inicio.posicion()] ) { return ret; }
		
		Vertice<T> temp = inicio;
		ret.agregarFinal(temp.dato());
		while ( !temp.equals(fin) ) {
			// Funcion que retorna el Vertice con la distancia mas chica de entre la lista de adyacentes de temp
			// Eventualmente el retorno va a ser el Vertice objetivo, asi que se sale del while
			temp = getMinimo(grafo.listaDeAdyancentes(temp), dist);
			ret.agregarFinal(temp.dato());
		}
		// Como se verificó que existe un camino valido entre inicio y fin, debería ser imposible llegar a una posición 
		// en la que se agregue un Vertice no visitable, ya que con el BFS nos aseguramos de delinear el camino mas corto al objetivo
		return ret;
		
		// La complejidad de este algoritmo debería ser lineal porque ambas partes lo son: 
		// El BFS al principio explora Vectores y Aristas una sola vez
		// y el while que arma el camino (que podria hacerse recursivo muy facilmente) explora cada Vertice (y su lista de Aristas) una sola vez, 
		// y sólo los que terminan haciendo el camino final, así que también es lineal
	}
}
