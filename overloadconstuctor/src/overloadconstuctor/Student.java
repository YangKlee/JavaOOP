/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 1 thg 10, 2024
*/ 
package overloadconstuctor;

import java.awt.print.Printable;

public class Student {
	String MaSV;
	String HoTen;
	int NienKhoa;
	String Khoa;
	String NgaySinh;
	private float DiemTrungBinh;
	Student(String MaSV, String HoTen, String NgaySinh)
	{
		this.MaSV = MaSV;
		this.NgaySinh = NgaySinh;
		this.HoTen = HoTen;
	}
	Student(String MaSV, String HoTen, String Khoa, String NgaySinh)
	{
		this.MaSV = MaSV;
		this.NgaySinh = NgaySinh;
		this.HoTen = HoTen;
		this.Khoa = Khoa;
	}
	Student(String MaSV, String HoTen, int NienKhoa,String Khoa, String NgaySinh )
	{
		this.MaSV = MaSV;
		this.NgaySinh = NgaySinh;
		this.HoTen = HoTen;
		this.Khoa = Khoa;
		this.NienKhoa = NienKhoa;
	}
	Student(String MaSV, String HoTen, int NienKhoa,String Khoa, String NgaySinh , float DiemTrungBinh)
	{
		this.MaSV = MaSV;
		this.NgaySinh = NgaySinh;
		this.HoTen = HoTen;
		this.Khoa = Khoa;
		this.NienKhoa = NienKhoa;
		this.DiemTrungBinh = DiemTrungBinh;
	}
	void display()
	{
		System.out.println(this.MaSV + " " + this.HoTen + " " + this.Khoa + " " + this.NienKhoa + " "+ this.DiemTrungBinh + " ");
	}
}
