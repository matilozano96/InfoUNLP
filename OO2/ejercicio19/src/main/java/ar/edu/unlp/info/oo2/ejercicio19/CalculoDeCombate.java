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
		// Usa los parametros de fuerza y defensa de armas y armaduras respectivamente para calcular el daño dinamicamente
		a.atacar(b);
		b.atacar(a);
	}
}
