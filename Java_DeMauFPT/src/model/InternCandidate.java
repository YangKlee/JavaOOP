package model;

import java.util.Date;

public class InternCandidate extends candidate{
	private String chuyenNganhHoc;
	private String truongHoc;
	private Date ngayTotNghiep;
	private int hocKyDangHoc;
	public InternCandidate(String hoTen, Date ngaySinh, String diaChi, String queQuan, String soDT, String email,
			String chuyenNganhHoc, String truongHoc,int hocKyDangHoc, Date ngayTotNghiep) {
		super(hoTen, ngaySinh, diaChi, queQuan, soDT, email);
		this.chuyenNganhHoc = chuyenNganhHoc;
		this.truongHoc = truongHoc;
		this.ngayTotNghiep = ngayTotNghiep;
		this.hocKyDangHoc = hocKyDangHoc;
	}
	public InternCandidate() {};
	public String getChuyenNganhHoc() {
		return chuyenNganhHoc;
	}
	public void setChuyenNganhHoc(String chuyenNganhHoc) {
		this.chuyenNganhHoc = chuyenNganhHoc;
	}
	public String getTruongHoc() {
		return truongHoc;
	}
	public void setTruongHoc(String truongHoc) {
		this.truongHoc = truongHoc;
	}
	public Date getNgayTotNghiep() {
		return ngayTotNghiep;
	}
	public void setNgayTotNghiep(Date ngayTotNghiep) {
		this.ngayTotNghiep = ngayTotNghiep;
	}
	public int getHocKyDangHoc() {
		return hocKyDangHoc;
	}
	@Override
	public String toString() {
		return "InternCandidate [chuyenNganhHoc=" + chuyenNganhHoc + ", truongHoc=" + truongHoc + ", ngayTotNghiep="
				+ ngayTotNghiep + ", hocKyDangHoc=" + hocKyDangHoc + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh
				+ ", diaChi=" + diaChi + ", queQuan=" + queQuan + ", soDT=" + soDT + ", email=" + email + "]";
	}
	public void setHocKyDangHoc(int hocKyDangHoc) {
		this.hocKyDangHoc = hocKyDangHoc;
	}
	
	
}
