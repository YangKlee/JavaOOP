/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 10 thg 12, 2024
*/ 
package test2;

import java.io.*;

public class test {
	public static void main(String[] args) throws IOException {
		PrintWriter pwrt = new PrintWriter
				(new FileOutputStream("src/file/out.txt", true));
		String s = "\nkhi nhin len troi se thay vi tinh tu J97";
		for (char c: s.toCharArray())
		{
			pwrt.append(c);
		}
		pwrt.close();
		
		BufferedReader bfr = new BufferedReader(new FileReader("src/file/out.txt"));
		while(bfr.ready())
		{
			System.out.println(bfr.readLine());
		}
		

		
	}
}
