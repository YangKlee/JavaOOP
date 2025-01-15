/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 7 thg 1, 2025
*/ 
package fa.training.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import fa.training.entities.*;
import fa.training.entities.Publication;
import fa.training.utils.data;

public class SearchEngine implements data {
	public int searchBookByIsbn(String isbn)
	{
		for (Publication b : dataPublications)
		{
			if (b.getClass() == Book.class)
			{
				Book tmp = (Book)b;
				if (tmp.getIsbn().equals(isbn))
					return dataPublications.indexOf(b);
			}
		}
		return -1;
	}
	public Set<Publication> searchSamePublicInfo(int publicationYear, String publisher)
	{
		Set<Publication> trueElements = new HashSet<Publication>();
		for (Publication p : dataPublications)
		{
			if (p.getPublicationYear() == publicationYear && p.getPublisher().equals(publisher))
			{
				trueElements.add(p);
			}
		}
		return trueElements;
	}
	public ArrayList<Magazine> searchManagine()
	{
		ArrayList<Magazine> listMagazines = new ArrayList<Magazine>();
		for (Publication p : dataPublications)
		{
			if (p.getClass() == Magazine.class)
			{
				listMagazines.add((Magazine)p);
			}
		}
		return listMagazines;
	}
	public ArrayList<Book> searchBook()
	{
		ArrayList<Book> listBook = new ArrayList<Book>();
		for (Publication p : dataPublications)
		{
			if (p.getClass() == Book.class)
			{
				listBook.add((Book)p);
			}
		}
		return listBook;
	}
	public ArrayList<Book> searchBookAuthor(String author)
	{
		ArrayList<Book> listBook = new ArrayList<Book>(searchBook());
		ArrayList<Book> listRes = new ArrayList<Book>();
		for (Book b : listBook)
		{
			if(b.getAuthor().contains(author))
			{
				listRes.add(b);
			}
		}
		return listRes;
	}
	public ArrayList<Book> searchBookPublisher(String publisher)
	{
		ArrayList<Book> listBook = new ArrayList<Book>(searchBook());
		ArrayList<Book> listRes = new ArrayList<Book>();
		for (Book b : listBook)
		{
			if(b.getPublisher().equals(publisher))
			{
				listRes.add(b);
			}
		}
		return listRes;
	}
}
