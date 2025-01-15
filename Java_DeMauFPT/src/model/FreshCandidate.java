package model;

import java.util.Date;

public class FreshCandidate extends candidate {
	private Date ngayTotNghiep;
	private String xepLoaiTotNghiep;
	private String truongTotNghiep;
	public FreshCandidate(String hoTen, Date ngaySinh, String diaChi, String queQuan, String soDT, String email,
			Date ngayTotNghiep, String xepLoaiTotNghiep, String truongTotNghiep) {
		super(hoTen, ngaySinh, diaChi, queQuan, soDT, email);
		this.ngayTotNghiep = ngayTotNghiep;
		this.xepLoaiTotNghiep = xepLoaiTotNghiep;
		this.truongTotNghiep = truongTotNghiep;
	}
	public FreshCandidate() {};
	public Date getNgayTotNghiep() {
		return ngayTotNghiep;
	}
	public void setNgayTotNghiep(Date ngayTotNghiep) {
		this.ngayTotNghiep = ngayTotNghiep;
	}
	public String getXepLoaiTotNghiep() {
		return xepLoaiTotNghiep;
	}
	public void setXepLoaiTotNghiep(String xepLoaiTotNghiep) {
		this.xepLoaiTotNghiep = xepLoaiTotNghiep;
	}
	public String getTruongTotNghiep() {
		return truongTotNghiep;
	}
	public void setTruongTotNghiep(String truongTotNghiep) {
		this.truongTotNghiep = truongTotNghiep;
	}
	@Override
	public String toString() {
		return "FreshCandidate [ngayTotNghiep=" + ngayTotNghiep + ", xepLoaiTotNghiep=" + xepLoaiTotNghiep
				+ ", truongTotNghiep=" + truongTotNghiep + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi="
				+ diaChi + ", queQuan=" + queQuan + ", soDT=" + soDT + ", email=" + email + "]";
	}
	
}
