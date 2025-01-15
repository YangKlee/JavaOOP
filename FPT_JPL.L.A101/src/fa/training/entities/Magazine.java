/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 7 thg 1, 2025
*/ 
package fa.training.entities;

import java.util.Date;
import java.util.Set;

public class Magazine extends Publication {
	private String author;
	private int volume;
	private int edition;
	
	public Magazine(int publicationYear, String publisher, Date publicationDate, String author, int volume,
			int edition) {
		super(publicationYear, publisher, publicationDate);
		this.author = author;
		this.volume = volume;
		this.edition = edition;
	}
	public Magazine()
	{
		super();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Publication Year: " + getPublicationYear());
		System.out.println("Publisher: " + getPublisher());
		System.out.println("publication date: " + getPublicationDate());
		System.out.println("author: " + this.author);
		System.out.println("volume: " + this.volume);
		System.out.println("edition: " + this.edition);
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	
}
