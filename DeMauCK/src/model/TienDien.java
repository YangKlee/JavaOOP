/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 15 thg 1, 2025
*/ 
package model;

import java.io.Serializable;

public abstract class TienDien implements IThanhToan, Serializable{
	
	protected String tenKH;
	protected int soLuong;
	public TienDien(String tenKH, int soLuong) {
		super();
		this.tenKH = tenKH;
		this.soLuong = soLuong;
	}
	public TienDien() {
		super();
	}
	
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public abstract String loaiTD();
	public abstract String toString();
}
