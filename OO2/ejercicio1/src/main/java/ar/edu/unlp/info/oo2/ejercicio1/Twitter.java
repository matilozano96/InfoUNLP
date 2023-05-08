package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.LinkedList;
import java.util.List;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter() {
		usuarios = new LinkedList<Usuario>();
	}
	
	public Usuario nuevoUsuario(String screenName) {
		if (usuarios.stream()   
		 .anyMatch(usuario->usuario.getScreenName().equals(screenName))) 
		{
			System.out.printf("El usuario ", screenName, " ya existe.");
			return null;
		}
		
		Usuario nuevo = new Usuario(screenName);
		usuarios.add(nuevo);
		return nuevo;
	}
	
	public void eliminarUsuario(Usuario u) {
		u.clear();
		usuarios.remove(u);
	}
}
