package ar.edu.unlp.info.oo2.ejercicio19;

// Patron Factory Method
// Falta una clase Director, que llamaría y crearia los distintos tipos de Fabrica
public abstract class A_CreadorDePersonaje {
	
	public abstract A_Personaje crearPersonaje(String n);

}
