package ar.edu.unlp.info.oo2.ejercicio19;

public class C_CreadorDeMagos {
	
	public A_Personaje crearMago(String n) {
		A_Personaje ret = new A_Personaje(n);
		ret.setArma(new C_Baston());
		ret.setArmadura(new C_ArmaduraDeCuero());
		ret.addHabilidad(new A_Habilidad("Magia"));
		ret.addHabilidad(new A_Habilidad("Combate a distancia"));
		
		return ret;
	}

}
