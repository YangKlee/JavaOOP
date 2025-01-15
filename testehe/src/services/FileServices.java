/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 9 thg 1, 2025
*/ 
package services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileServices {
	public void writeAppendFile(String url, String content)
	{
		PrintWriter fileOut = null;
		try {
			fileOut = new PrintWriter(new FileOutputStream(url), true);
			fileOut.append(content);
		} catch (FileNotFoundException e) {
			System.out.println("Ghi file thất bại");
			e.printStackTrace();
		}
		finally {
			if (fileOut != null)
			{
				System.out.println("Write complete!");
				System.out.println(content);
				fileOut.close();
			}
		}
	}
	public void writeFile(String url, String content)
	{
		PrintWriter fileOut = null;
		try {
			fileOut = new PrintWriter(new FileOutputStream(url), false);
			fileOut.print(content);
		} catch (FileNotFoundException e) {
			System.out.println("Ghi file thất bại");
			e.printStackTrace();
		}
		finally {
			if (fileOut != null)
			{
				System.out.println("Write complete!");
				System.out.println(content);
				fileOut.close();
			}
		}
	}
	public void readFile(String url) // truyền vào url file
	{
		BufferedReader filereader  = null;
		try {
			filereader = new BufferedReader(new FileReader(url));
			String dataInp ;
			// doc tung dong
			int line = 1;
			while ((dataInp = filereader.readLine())!= null)
			{
				String[] rawData = dataInp.split(", "); // chia du lieu boi , 
				for (int i = 0; i < rawData.length ; i++)
				{
					rawData[i] = rawData[i].trim();
				}
				// xu li du lieu tu mang raw data
				line++;
			}
		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			System.err.print("Không tìn thấy file");
			fnfe.printStackTrace();
		} catch (IOException ioE) {
			System.err.println("Lỗi trong quá trình đọc ghi file");
		}
		finally {
			if (filereader != null)
			{
				try {
					filereader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Read complete!!!");
			}

		}
		
	}
}
