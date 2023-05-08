package ar.edu.unlp.info.oo2.ejercicio19;

public class C_CreadorDeArqueros extends A_CreadorDePersonaje{
	
	public A_Personaje crearPersonaje(String n) {
		A_Personaje ret = new A_Personaje(n);
		
		// Las armas y armaduras podrían pasar a ser instanciadas por una factory de Armas y Armaduras, respectivamente
		// Sin embargo, por ahora no me parece necesario dada la baja complejidad de su funcionamiento requerido
		
		// Si, por ejemplo, la idea fuera que las armas tuvieran un valor de rango y un valor de daño
		// y las armaduras tuvieran un valor de defensa, ahí justificaría el uso de algo más complejo
		ret.setArma(new C_Arco());
		ret.setArmadura(new C_ArmaduraDeCuero());
		
		// Las habilidades, por ahora, no tienen ninguna funcionalidad, así que se limitan a ser Strings.
		// Si se definiera algún uso para las habilidades, probablemente se implementarían como las armas y las armaduras.
		ret.addHabilidad(new A_Habilidad("Combate a distancia"));
		
		return ret;
	}
}
