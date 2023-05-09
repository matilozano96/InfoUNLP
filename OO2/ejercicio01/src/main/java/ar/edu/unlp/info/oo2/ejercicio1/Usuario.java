package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.List;
import java.util.LinkedList;

public class Usuario {
	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		tweets = new LinkedList<Tweet>();
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	public Tweet tweet(String body) {
		if ((body.length() < 1) || (body.length() > 280)) return null;
		
		Tweet nuevo = new Tweet(body);
		return nuevo;
	}
	
	public Tweet reTweet(Tweet origin, String body) {
		Tweet nuevo = new ReTweet(origin, body);
		return nuevo;
	}
	
	public void eliminarTweet(Tweet victim) {
		victim.eliminar();
		tweets.remove(victim);
	}
	
	public void clear() {
		tweets.forEach(tweet->tweet.eliminar());
		tweets.clear();
	}
	
	public void verTweets() {
		System.out.println(screenName + ": ");
		tweets.forEach(tweet->System.out.println(tweet.toString()));
	}

}
