package ar.edu.unlp.info.oo2.ejercicio1;

public class ReTweet extends Tweet {
	private Tweet origin;
	
	public ReTweet (Tweet o, String body) {
		super(body);
		this.origin = o;
		origin.getRetweeted(this);
	}
	public void setBody(String text) {
		this.body = text;
	}
	
	public Tweet getOrigin() {
		return origin;
	}
	
	public String toString() {
		if (origin == null) return (" Retweet: El tweet original fue eliminado.");
		return (" Retweet:" + origin.toString());
	}
	
	public void eliminar() {
		origin.eliminarRT(this);
		origin = null;
		super.eliminar();
	}
	
	public void eliminarRef() {
		origin = null;
	}
}
