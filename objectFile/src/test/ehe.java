/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 10 thg 12, 2024
*/ 
package test;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entity.*;
public class ehe {
	public static void main(String[] args) throws IOException {
		SinhVien a = new SinhVien("Nguyễn Yến Nhi", new Date(17, 02, 2005), 189, 43.5);
		SinhVien b = new SinhVien("Nguyễn Khánh Dương", new Date(18, 02, 2005), 189, 43.5);
		FileOutputStream fout = new FileOutputStream("src/file/Data.DAT");
		ObjectOutputStream objout = new ObjectOutputStream(fout); 
		//String s = "SHIKANOKO";
		
		objout.writeObject(a);
		objout.writeObject(b);
		objout.flush();
		objout.close();
		fout.close();

	}

}
