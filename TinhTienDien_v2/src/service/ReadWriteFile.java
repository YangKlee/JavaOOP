/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 21 thg 12, 2024
*/ 
package service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import entity.*;
public class ReadWriteFile {
	public void writeFile(String urlFile) throws FileNotFoundException
	{
		PrintWriter pwrite = new PrintWriter(new FileOutputStream(urlFile, true));
		for (int i = 0; i < dsNguoiDungDien.size(); i++)
		{
			String sout = (dsNguoiDungDien.get(i).getTypeName()+','+
					dsNguoiDungDien.get(i).getChiSoCu()+',' +
					dsNguoiDungDien.get(i).getChiSoMoi()+',' +
					dsNguoiDungDien.get(i).getDinhMuc()+','+
					dsNguoiDungDien.get(i).tinhTienDien() +'\n');
			System.out.println(sout);
			for (char c:sout.toCharArray())
			{
				pwrite.append(c);
			}
			System.out.println(i);

		}

		pwrite.close();
	}
}
