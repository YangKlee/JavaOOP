/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 10 thg 12, 2024
*/ 
package program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("src/file/text.txt");
		System.out.println("Remaing bytes: " + fin.available());
		int c;
		/*
		while (true)
		{
			c = fin.read();
			if (c == -1)
			{
				//fin.close();
				break;
			}
			System.out.print((char)c);
		}
		*/

		byte a[] = new byte[fin.available()];
		fin.read(a);
		for (byte x: a)
		{
			System.out.print((char)x);
		}
		fin.close();
		FileOutputStream fout = new FileOutputStream("src/file/out.txt");
		fout.write(a);

	}

}
