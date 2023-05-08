package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.List;

public class Tweet {
	protected String body;
	private List<ReTweet> retweets;
	
	public Tweet (String text) {
		this.body = text;
	}
	
	public void setBody(String text) {
		if ((text.length() < 1) || (text.length() > 280)) return;
		this.body = text;
	}
	
	public String toString() {
		return " " + body;
	}
	
	public void getRetweeted(ReTweet rt) {
		retweets.add(rt);
	}
	
	public void eliminarRT(ReTweet rt) {
		retweets.remove(rt);
	}
	
	public void eliminar() {
		retweets.forEach(retweet->retweet.eliminarRef());
	}
}
