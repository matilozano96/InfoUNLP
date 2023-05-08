package ar.edu.unlp.info.oo2.ejercicio19;

public class C_CreadorDeThor extends A_CreadorDePersonaje {
	
	public A_Personaje crearPersonaje(String n) {
		A_Personaje ret = new A_Personaje(n);
		ret.setArma(new C_Martillo());
		ret.setArmadura(new C_ArmaduraDeAcero());
		ret.addHabilidad(new A_Habilidad("Combate a distancia"));
		ret.addHabilidad(new A_Habilidad("Lanzar Rayos"));
		
		return ret;
	}

}
