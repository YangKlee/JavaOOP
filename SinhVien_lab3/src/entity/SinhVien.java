/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 6 thg 1, 2025
*/ 
package entity;

import java.util.ArrayList;
import java.util.Arrays;

public class SinhVien {
	private String hoTen;
	private ArrayList<DiemHP> hp = new ArrayList<DiemHP>();
	public SinhVien(String hoTen) {
		super();
		this.hoTen = hoTen;
	}
	public SinhVien(String hoTen, ArrayList<DiemHP> hp) {
		super();
		this.hoTen = hoTen;
		this.hp = hp;
	}
	public SinhVien(String hoTen, DiemHP...values)
	{
		this.hoTen = hoTen;
		this.hp = new ArrayList<DiemHP>(Arrays.asList(values));
	}
	public void themHP(DiemHP hpadd)
	{
		hp.add(hpadd);
	}
	public double tinhDTB() {
		double sumPoint = 0;
		double sumTC = 0;
		for (DiemHP d : hp)
		{
			sumPoint+= d.tinhDiem() * (double)d.getSoTinChi();
			sumTC +=  (double)d.getSoTinChi();
		}
		return sumPoint / sumTC;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public ArrayList<DiemHP> getHp() {
		return hp;
	}
	public void setHp(ArrayList<DiemHP> hp) {
		this.hp = hp;
	}
	

}
