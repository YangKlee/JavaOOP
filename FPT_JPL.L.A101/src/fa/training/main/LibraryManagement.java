/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 7 thg 1, 2025
*/ 
package fa.training.main;

import fa.training.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import fa.training.services.InputData;
import fa.training.services.PublicationManagerment;
import fa.training.utils.ValidationRules;

public class LibraryManagement implements ValidationRules {
	public static void main(String[] args) {
		PublicationManagerment managerment = new PublicationManagerment();
		InputData input = new InputData();
		Scanner sc = new Scanner(System.in);
		int inp = 0;
		do
		{
			System.out.println("====== LIBRARY MANAGEMENT SYSTEM ======");
			System.out.println("1. Add a book");
			System.out.println("2. Add a magazine");
			System.out.println("3. Display books and magazines");
			System.out.println("4. Add author to book");
			System.out.println("5. Display top 10 of magazines by volume");
			System.out.println("6. Search book by (isbn, author, publisher)");
			inp = Integer.parseInt(sc.nextLine());
			if (inp == 1)
			{
				managerment.addBook(input.InputBook());
			}
			
			else if (inp == 2)
			{
				managerment.addMagazine(input.inputMagarine());
			}
			else if (inp == 3)
			{
				System.out.print("Input Year: ");
				int year = Integer.parseInt(sc.nextLine());
				System.out.print("Input publicer: ");
				String cc = sc.nextLine();
				managerment.showSamePublicInfo(year, cc);
				//managerment.displayAll();
			}
			else if (inp == 4)
			{
				System.out.print("isbn: ");
				String isbn = sc.nextLine();
				System.out.print("Author: ");
				String author = sc.nextLine();
				managerment.addBookAuthor(isbn, author);
			}
			else if (inp == 5)
			{
				managerment.sortDisplayMagazine();
			}
		}
		while(inp != 0);
		
	}
}
