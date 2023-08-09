package main;

public class Person {
	private String nameArtist;
	private boolean isAuthor;
	private boolean isProducer;
	
	public Person(String name, boolean isAuthor, boolean isProducer) {
		this.nameArtist = nameArtist;
		this.isAuthor = isAuthor;
		this.isProducer = isProducer;
	}
	
	public String getNameArtist() {
		return nameArtist;
	}
	
	public boolean isAuthor() {
		return isAuthor;
	}
	
	public boolean isProducer() {
		return isProducer;
	}
	
}
