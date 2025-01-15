/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 10 thg 1, 2025
*/ 
package model;

public class Diem {
	private HocPhan hp;
	private double diemQT;
	private double diemCK;
	public Diem(HocPhan hp, double diemQT, double diemCK) {
		super();
		this.hp = hp;
		this.diemQT = diemQT;
		this.diemCK = diemCK;
	}
	public Diem() {
		super();
	}
	public HocPhan getHp() {
		return hp;
	}
	public void setHp(HocPhan hp) {
		this.hp = hp;
	}
	public double getDiemQT() {
		return diemQT;
	}
	public void setDiemQT(double diemQT) {
		this.diemQT = diemQT;
	}
	public double getDiemCK() {
		return diemCK;
	}
	public void setDiemCK(double diemCK) {
		this.diemCK = diemCK;
	}
	public double tinhDiem()
	{
		return diemCK*0.6 + diemQT*0.4;
	}
		
}
