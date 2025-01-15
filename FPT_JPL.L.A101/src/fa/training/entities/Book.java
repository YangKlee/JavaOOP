/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 7 thg 1, 2025
*/ 
package fa.training.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Book extends Publication {
	private String isbn;
	private Set<String> author = new HashSet<String>();
	private String publicationPlace;
	public Book(Book book)
	{
		super(book.getPublicationYear(), book.getPublisher(), book.getPublicationDate());
		this.isbn = book.isbn;
		this.author = book.author;
		this.publicationPlace = book.publicationPlace;
		
	}
	public Book()
	{
		super();
	}
	public Book(int publicationYear, String publisher, Date publicationDate, String isbn, Set<String> author,
			String publicationPlace) {
		super(publicationYear, publisher, publicationDate);
		this.isbn = isbn;
		this.author = author;
		this.publicationPlace = publicationPlace;
	}
	public void addAuthor(String au)
	{
		this.author.add(au);
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Set<String> getAuthor() {
		return author;
	}
	public void setAuthor(Set<String> author) {
		this.author = author;
	}
	public String getPublicationPlace() {
		return publicationPlace;
	}
	public void setPublicationPlace(String publicationPlace) {
		this.publicationPlace = publicationPlace;
	}
	public void display()
	{
		System.out.println("Publication Year: " + getPublicationYear());
		System.out.println("Publisher: " + getPublisher());
		System.out.println("publication date: " + getPublicationDate());
		System.out.println("isbn:" + this.isbn);
		System.out.println("author: " );
		for (String au : author)
		{
			System.out.print(au+ " ");
		}
		System.out.print("\n");
		System.out.println("publication place: " + this.publicationPlace);
	}
	
}
