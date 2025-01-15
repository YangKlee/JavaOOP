/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 4 thg 1, 2025
*/ 
package entity;

public class HCN {
	private Diem d1, d2;
	public HCN(Diem d1, Diem d2)
	{
		this.d1 = d1;
		this.d2 = d2;
	}
	private double tinhChieuDai()
	{
		Diem d12 = new Diem(d1.getX(), d2.getY());
		return d1.khoangCach(d12);
	}
	private double tinhChieuRong()
	{
		Diem d21 = new Diem(d2.getX(), d1.getY());
		return d1.khoangCach(d21);
	}
	public double chuVi()
	{
		return (tinhChieuDai() + tinhChieuRong())*2;
	}
	public double dienTich()
	{
		return tinhChieuDai() * tinhChieuRong();
	}
	public String toString()
	{
		return "[" +d1.toString()+","+d2.toString()+ "]";
	}
	
	
}
