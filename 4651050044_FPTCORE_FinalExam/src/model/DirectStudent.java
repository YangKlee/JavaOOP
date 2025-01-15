/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 1, 2025
*/ 
package model;

import java.util.Date;

public class DirectStudent extends Student {
	private String capDoGiaiThuong;
	private String tenGiai;
	private int namDatGiai;
	private String xepLoaiGiai;
	public DirectStudent(String hoTen, Date ngaySinh, String gioiTinh, String diaChi, String queQuan, String soDT,
			String email, String capDoGiaiThuong, String tenGiai, int namDatGiai, String xepLoaiGiai) {
		super(hoTen, ngaySinh, gioiTinh, diaChi, queQuan, soDT, email);
		this.capDoGiaiThuong = capDoGiaiThuong;
		this.tenGiai = tenGiai;
		this.namDatGiai = namDatGiai;
		this.xepLoaiGiai = xepLoaiGiai;
	}
	public DirectStudent() {
		super();
	}
	public String getCapDoGiaiThuong() {
		return capDoGiaiThuong;
	}
	public void setCapDoGiaiThuong(String capDoGiaiThuong) {
		this.capDoGiaiThuong = capDoGiaiThuong;
	}
	public String getTenGiai() {
		return tenGiai;
	}
	public void setTenGiai(String tenGiai) {
		this.tenGiai = tenGiai;
	}
	public int getNamDatGiai() {
		return namDatGiai;
	}
	public void setNamDatGiai(int namDatGiai) {
		this.namDatGiai = namDatGiai;
	}
	public String getXepLoaiGiai() {
		return xepLoaiGiai;
	}
	public void setXepLoaiGiai(String xepLoaiGiai) {
		this.xepLoaiGiai = xepLoaiGiai;
	}
	@Override
	public String toString() {
		return "DirectStudent [capDoGiaiThuong=" + capDoGiaiThuong + ", tenGiai=" + tenGiai + ", namDatGiai="
				+ namDatGiai + ", xepLoaiGiai=" + xepLoaiGiai + ", toString()=" + super.toString() + "]";
	}
	
	
}
