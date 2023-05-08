package ar.edu.unlp.info.oo2.ejercicio19;

public class CalculoDeCombate {
	
	private static int [][] tablaDeDaño = { {8,5,3} , {5,3,2} , {2,1,1} , {6,5,4} };
	// Espada, Arco, Baston, Martillo
	// { Cuero, Hierro, Acero }
	
	// ... {x,y,z} -- Nueva arma en la matriz
	
	// ... {8,5,3,x} , {5,3,2,y} , {2,1,1,z} , {6,5,4,zz} -- Nueva armadura en la matriz
	
	public static void enfrentar(Personaje a, Personaje b) {
		if (a.getVida() < 1 || b.getVida() < 1) {
			
			return;
		}
		
		// Decidí centralizar el cálculo de daño de esta manera porque parece "hardcodeado" desde la consigna
		// De esta forma es más fácil de controlar los valores
		// Lo negativo es que es muy fácil de romper si se crean armas o armaduras con ID fuera de rango, aunque se puede delimitar y listo
		a.recibirDaño(tablaDeDaño[b.getArma().getId()][a.getArmadura().getId()]);
		b.recibirDaño(tablaDeDaño[a.getArma().getId()][b.getArmadura().getId()]);
	}
	
	// Alternativa
	public static void enfrentar2(Personaje a, Personaje b) {
		if (a.getVida() < 1 || b.getVida() < 1) {
			
			return;
		}
		
		// La implementacion de estos metodos seria llamar a un metodo atacar(personaje) del arma
		// Este metodo es implementado según cada arma, de forma que cada tipo de arma llame a un metodo distinto sobre cada tipo de armadura
		// Cada armadura reconoce los metodos de ataque de cada arma, y reacciona según la tabla
		
		// El problema con esta implementación es que es dificil de escalar; 
		// hay que crear un metodo nuevo en la clase abstracta armadura, e implementarlo en cada tipo de armadura por cada arma nueva introducida
		a.atacar(b);
		b.atacar(a);
	}
}
