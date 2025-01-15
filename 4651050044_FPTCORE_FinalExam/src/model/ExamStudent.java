/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 1, 2025
*/ 
package model;

import java.util.Date;

public class ExamStudent extends Student{
	private Date ngayThiTuyen;
	private double tongDiem;
	public ExamStudent(String hoTen, Date ngaySinh, String gioiTinh, String diaChi, String queQuan, String soDT,
			String email, Date ngayThiTuyen, double tongDiem) {
		super(hoTen, ngaySinh, gioiTinh, diaChi, queQuan, soDT, email);
		this.ngayThiTuyen = ngayThiTuyen;
		this.tongDiem = tongDiem;
	}
	public ExamStudent() {
		super();
	}
	public Date getNgayThiTuyen() {
		return ngayThiTuyen;
	}
	public void setNgayThiTuyen(Date ngayThiTuyen) {
		this.ngayThiTuyen = ngayThiTuyen;
	}
	public double getTongDiem() {
		return tongDiem;
	}
	public void setTongDiem(double tongDiem) {
		this.tongDiem = tongDiem;
	}
	@Override
	public String toString() {
		return "ExamStudent [ngayThiTuyen=" + ngayThiTuyen + ", tongDiem=" + tongDiem + ", toString()="
				+ super.toString() + "]";
	}
	
}
