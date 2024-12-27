/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 25 thg 12, 2024
*/ 
package entity;

import java.util.*;

public class SinhVien {
	String hoTen;
	List <Diem> dsDiem = new ArrayList<>();
	public SinhVien(String hoTen, List<Diem> dsDiem) {
		super();
		this.hoTen = hoTen;
		this.dsDiem = dsDiem;
	}
	public SinhVien(String hoTen) {
		super();
		this.hoTen = hoTen;
	}
	public void themDiem(Diem diem)
	{
		this.dsDiem.add(diem);
	}
	public void themDiem(String tenHP, int soTC,double cn, double gk, double ck)
	{
		this.dsDiem.add(new Diem(tenHP, soTC,cn, gk, ck));
	}
	public double tinhDTB()
	{
		double avg = 0;
		for (Diem d : dsDiem)
		{
			avg += d.tinhDiem();
		}
		return avg / (double)dsDiem.size();
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
}
