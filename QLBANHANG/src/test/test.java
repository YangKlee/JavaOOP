/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 25 thg 12, 2024
*/ 
package test;
import java.util.HashMap;

import Database.*;
import entity.*;
public class test implements DSSP {
	public static void main(String[] args) {
		DatabaseControl db = new DatabaseControl();
		dsSanPham.put("SP01", new SanPham("Dầu gội", 100, 2004));
		dsSanPham.put("SP02", new SanPham("Giấy ăn", 100, 2004));
		dsSanPham.put("SP03", new SanPham("Sữa", 200, 2014));
		dsSanPham.put("SP04", new SanPham("Sữa tắm", 300, 2204));
		
		for (String key : dsSanPham.keySet())
		{
			db.themSP(key, dsSanPham.get(key));
		}
	}
}
