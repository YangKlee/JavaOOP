/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 10 thg 1, 2025
*/ 
package model;

public class HocPhan {
	private String maHP;
	private String loaiHP;
	private String tenHP;
	
	public HocPhan(String maHP, String loaiHP, String tenHP) {
		super();
		this.maHP = maHP;
		this.loaiHP = loaiHP;
		this.tenHP = tenHP;
	}
	
	public HocPhan() {
		super();
	}

	public String getMaHP() {
		return maHP;
	}
	public void setMaHP(String maHP) {
		this.maHP = maHP;
	}
	public String getLoaiHP() {
		return loaiHP;
	}
	public void setLoaiHP(String loaiHP) {
		this.loaiHP = loaiHP;
	}
	public String getTenHP() {
		return tenHP;
	}
	public void setTenHP(String tenHP) {
		this.tenHP = tenHP;
	}
	
}
