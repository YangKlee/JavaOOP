/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 5 thg 1, 2025
*/ 
package entity;

public abstract class DiemHP {
	protected String tenHP;
	protected int soTinChi;
	public DiemHP(String tenHP, int soTinChi) {
		super();
		this.tenHP = tenHP;
		this.soTinChi = soTinChi;
	}
	public String getTenHP() {
		return tenHP;
	}
	public void setTenHP(String tenHP) {
		this.tenHP = tenHP;
	}
	public int getSoTinChi() {
		return soTinChi;
	}
	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}
	public abstract double tinhDiem();
}
