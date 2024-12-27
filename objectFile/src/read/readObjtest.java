/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 10 thg 12, 2024
*/ 
package read;

import java.io.*;
import java.util.ArrayList;

import entity.*;
public class readObjtest {
	public static void main(String[] args) {
		ArrayList<SinhVien> dsSv = new ArrayList<SinhVien>();
		Object a = null;
		ObjectInputStream objin = null;
		try {
			FileInputStream fin = new FileInputStream("src/file/Data.DAT");
			objin = new ObjectInputStream(fin);
			while(fin.available() > 0)
			{
				a = objin.readObject();
				dsSv.add(new SinhVien((SinhVien)a));
			}
			fin.close();
			objin.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				objin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int i = 0; i < dsSv.size(); i++)
		{
			System.out.println(dsSv.get(i).toString());
			
		}
		
		
	}
}
