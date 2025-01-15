/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 1, 2025
*/ 
package program;

import java.util.Scanner;

import references.regularInput;

public class chkRegex implements regularInput{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine().trim();
		
		{
			if (line.matches(regex_diem))
			{
				System.out.println("Yesss!");
			}
		}
		while(line == "0");
	}
}
