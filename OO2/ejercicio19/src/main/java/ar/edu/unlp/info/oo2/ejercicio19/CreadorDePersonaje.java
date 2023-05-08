package ar.edu.unlp.info.oo2.ejercicio19;

public final class CreadorDePersonaje {
	
	public static Personaje crearArquero(String n) {
		Personaje ret = new Personaje(n);
		
		// Las armas y armaduras podrían pasar a ser instanciadas por una factory de Armas y Armaduras, respectivamente
		// Sin embargo, por ahora no me parece necesario dada la baja complejidad de su funcionamiento requerido
		
		// Si, por ejemplo, la idea fuera que las armas tuvieran un valor de rango y un valor de daño
		// y las armaduras tuvieran un valor de defensa, ahí justificaría el uso de algo más complejo
		ret.setArma(new Arco());
		ret.setArmadura(new ArmaduraDeCuero());
		
		// Las habilidades, por ahora, no tienen ninguna funcionalidad, así que se limitan a ser Strings.
		// Si se definiera algún uso para las habilidades, probablemente se implementarían como las armas y las armaduras.
		ret.addHabilidad(new Habilidad("Combate a distancia"));
		
		return ret;
	}
	
	public static Personaje crearMago(String n) {
		Personaje ret = new Personaje(n);
		ret.setArma(new Baston());
		ret.setArmadura(new ArmaduraDeCuero());
		ret.addHabilidad(new Habilidad("Magia"));
		ret.addHabilidad(new Habilidad("Combate a distancia"));
		
		return ret;
	}
	
	public static Personaje crearGuerrero(String n) {
		Personaje ret = new Personaje(n);
		ret.setArma(new Espada());
		ret.setArmadura(new ArmaduraDeAcero());
		ret.addHabilidad(new Habilidad("Combate cuerpo a cuerpo"));
		
		return ret;
	}
	
	public static Personaje crearThor(String n) {
		Personaje ret = new Personaje(n);
		ret.setArma(new Martillo());
		ret.setArmadura(new ArmaduraDeAcero());
		ret.addHabilidad(new Habilidad("Combate a distancia"));
		ret.addHabilidad(new Habilidad("Lanzar Rayos"));
		
		return ret;
	}
}
