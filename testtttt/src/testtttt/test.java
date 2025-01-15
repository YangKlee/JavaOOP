/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 10 thg 1, 2025
*/ 
package testtttt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Date d = new Date();
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine().trim();
		//String regex = "^[a-zA-Z][a-zA-Z0-9\\.]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+$";
		String regex = "^[0-9]{4}/[0-9]{1,2}/[0-9]{1,2}$";
		if (inp.matches(regex))
		{
				System.out.println("Yes!!");
		}
		else
		{
			System.out.println("No!!");
		}
		
	}
	//
}
