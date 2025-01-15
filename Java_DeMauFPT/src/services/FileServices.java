/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 8 thg 1, 2025
*/ 
package services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.xml.crypto.Data;

import references.data;

public class FileServices {
	
	public void writeAppendFile(String url, String content)
	{
		PrintWriter fileOut = null;
		try {
			fileOut = new PrintWriter(new FileOutputStream(url), true);
			fileOut.append(content);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
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
	public void readFile(String url)
	{
		DataServices dataService = new DataServices();
		BufferedReader filereader  = null;
		try {
			filereader = new BufferedReader(new FileReader(url));
			String dataInp ;
			// doc tung dong
			int line = 1;
			while ((dataInp = filereader.readLine())!= null)
			{
				String[] rawData = dataInp.split(", ");
				for (int i = 0; i < rawData.length ; i++)
				{
					rawData[i] = rawData[i].trim();
				}
				dataService.importData(line, rawData);
				line++;
			}
		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			System.err.print("éo tìm thấy file");
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
