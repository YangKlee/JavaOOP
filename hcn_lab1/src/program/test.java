/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 4 thg 1, 2025
*/ 
package program;

import entity.Diem;
import entity.HCN;

public class test implements data {
	public static void main(String[] args) {
		dsHCN.add(new HCN(new Diem(1, 1), new Diem(2, 2)));
		dsHCN.add(new HCN(new Diem(1, 1), new Diem(1, 1)));
		dsHCN.add(new HCN(new Diem(1, 1), new Diem(3, 3)));
		dsHCN.add(new HCN(new Diem(1, 1), new Diem(5, 5)));
		dsHCN.add(new HCN(new Diem(1, 1), new Diem(4, 3)));
		dsHCN.add(new HCN(new Diem(2, 2), new Diem(4, 4)));
		for (HCN h : dsHCN)
		{
			System.out.println(h.toString() + "Chu vi: " + h.chuVi() + " Dien tich: "+ h.dienTich());
		}
		// xap xep
		for (int i = 0 ; i < dsHCN.size(); i++)
		{
			for (int j = i+1; j < dsHCN.size(); j++)
			{
				if (dsHCN.get(j).dienTich() < dsHCN.get(i).dienTich())
				{
					HCN tmp = dsHCN.get(i);
					dsHCN.set(i, dsHCN.get(j));
					dsHCN.set(j, tmp);
				}
			}
		}
		System.out.println("arter sort");
		for (HCN h : dsHCN)
		{
			System.out.println(h.toString() + "Chu vi: " + h.chuVi() + " Dien tich: "+ h.dienTich());
		}
	}
}
