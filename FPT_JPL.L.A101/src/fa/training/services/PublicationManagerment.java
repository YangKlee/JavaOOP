/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 7 thg 1, 2025
*/ 
package fa.training.services;
import java.util.ArrayList;

import fa.training.entities.*;
import fa.training.utils.*;
public class PublicationManagerment implements data {
	SearchEngine search = new SearchEngine();
	private boolean isExits(Publication p)
	{
		for (Publication p1 : dataPublications)
		{
			if (p1.getClass() == Book.class && p.getClass() == Book.class)
			{
				Book b =  new Book((Book)p);
				Book b1 =  new Book((Book)p1);
				if (b.getIsbn().equals(b1.getIsbn()))
				{
					return false;
				}
			}
			else
			{
				if (p1.hashCode() == p.hashCode())
				{
					return false;
				}
			}
		}
		return true;
	}
	public void addBook(Book newBook)
	{
		if (isExits(newBook))
		{
			dataPublications.add(newBook);
			System.out.println("Thêm sách thành công!");
		}
		else
		{
			System.out.println("Thêm sách thất bại! có sự trùng lặp");
		}
	}
	public void addMagazine(Magazine newMagazine)
	{
		if (isExits(newMagazine))
		{
			dataPublications.add(newMagazine);
			System.out.println("Thêm tạp chí thành công!");
		}
		else
		{
			System.out.println("Thêm tạp chí thất bại! có sự trùng lặp");
		}

	}
	public void displayAll()
	{
		for (Publication b : dataPublications)
		{
			System.out.print("Loại: " );
			if (b.getClass() == Book.class)
			{
				System.out.println("Sách");
			}
			else
			{
				System.out.println("Tạp chí");
			}
			b.display();
		}
	}
	public void displayFind(ArrayList<Book> bookls)
	{
		for (Book b: bookls)
		{
			b.display();
		}
	}
	public void addBookAuthor(String isbn ,String author)
	{
		int index = search.searchBookByIsbn(isbn);
		if (index == -1)
		{
			System.out.println("Hông tìm thấy sách");
		}
		else
		{
			Book obj = (Book)dataPublications.get(index);
			if (!obj.getAuthor().contains(author))
			{
				obj.addAuthor(author);
				System.out.println("Add successfully");
				dataPublications.set(index, obj);
			}
			else
			{
				System.out.println("Author existed");
			}
		}
	}
	public void showSamePublicInfo(int publicationYear, String publisher)
	{
		for (Publication p : search.searchSamePublicInfo(publicationYear, publisher))
		{
			System.out.print("Loại: " );
			if (p.getClass() == Book.class)
			{
				System.out.println("Sách");
			}
			else
			{
				System.out.println("Tạp chí");
			}
			p.display();
		}
	}
	public void sortDisplayMagazine()
	{
		ArrayList<Magazine> lsManagize = new ArrayList<Magazine>(search.searchManagine());
		// sort by volume
		for (int i = 0; i < lsManagize.size(); i++)
		{
			for (int j = i+1; j < lsManagize.size(); j++)
			{
				if (lsManagize.get(i).getVolume() < lsManagize.get(j).getVolume())
				{
					Magazine tmp = lsManagize.get(i);
					lsManagize.set(i, lsManagize.get(j));
					lsManagize.set(j, tmp);
				}
			}
		}
		int count  = 0;
		for (Magazine m : lsManagize)
		{
			if (count <= 10)
				m.display();
			count++;	
		}
	}
	public void searchIsbn(String isbn)
	{
		dataPublications.get(search.searchBookByIsbn(isbn)).display();
	}
	public void searchAuthor(String author)
	{
		displayFind(search.searchBookAuthor(author));
	}
	public void search(String publisher)
	{
		displayFind(search.searchBookPublisher(publisher));
	}
}
