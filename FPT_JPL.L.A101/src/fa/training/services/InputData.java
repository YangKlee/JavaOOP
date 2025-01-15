/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 7 thg 1, 2025
*/ 
package fa.training.services;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import fa.training.entities.*;
import fa.training.utils.ValidationRules;
public class InputData implements ValidationRules{
	String patternDate = "dd/MM";
	SimpleDateFormat simpleDate = new SimpleDateFormat(patternDate);
	Scanner sc = new Scanner(System.in);
	public Book InputBook()
	{
		
		Book bookInp = new Book();
		System.out.print("publication year: ");
		bookInp.setPublicationYear(Integer.parseInt(sc.nextLine()));
		System.out.print("publisher: ");
		bookInp.setPublisher(sc.nextLine());
		System.out.print("publication date: ");
		while(true)
		{
			try {
				bookInp.setPublicationDate(simpleDate.parse(sc.nextLine()));
				break;
			} catch (ParseException e) {
				System.out.println("Định dạng ngày không hợp lệ, vui lòng nhập lại");
				continue;
			}
		}
		System.out.print("isbn: ");
		while(true)
		{
			String tmp = "";
			tmp = sc.nextLine();
			if (tmp.matches(RULE_ISBN))
			{
				bookInp.setIsbn(tmp);
				break;
			}
			else
				System.out.println("Định dạng ibsn sai! Nhập lại!...");
		}
		System.out.print("author (nhập cách nhau bởi dấu phẩy) : ");
		String[] tmpAuthor = (sc.nextLine()).split(",");
		for (String s : tmpAuthor)
		{
			bookInp.addAuthor(s);
		}
		System.out.print("publication place : ");
		bookInp.setPublicationPlace(sc.nextLine());
		return bookInp;
	}
	public Magazine inputMagarine()
	{
		
		Magazine managizeInp = new Magazine();
		System.out.print("publication year: ");
		managizeInp.setPublicationYear(Integer.parseInt(sc.nextLine()));
		System.out.print("publisher: ");
		managizeInp.setPublisher(sc.nextLine());
		System.out.print("publication date: ");
		while(true)
		{
			try {
				managizeInp.setPublicationDate(simpleDate.parse(sc.nextLine()));
				break;
			} catch (ParseException e) {
				System.out.println("Định dạng ngày không hợp lệ, vui lòng nhập lại");
				continue;
			}
		}
		System.out.print("author: ");
		managizeInp.setAuthor(sc.nextLine());
		System.out.print("Volume: ");
		managizeInp.setVolume(Integer.parseInt(sc.nextLine()));
		System.out.print("Edition: ");
		managizeInp.setEdition(Integer.parseInt(sc.nextLine()));
		return managizeInp;
	}
}
