package model;

import java.util.Date;

public abstract class candidate {
	protected String hoTen;
	protected Date ngaySinh;
	protected String diaChi;
	protected String queQuan;
	protected String soDT;
	protected String email;
	public candidate(String hoTen, Date ngaySinh, String diaChi, String queQuan, String soDT, String email) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.queQuan = queQuan;
		this.soDT = soDT;
		this.email = email;
	}
	public candidate()
	{
		
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "candidate [hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", queQuan=" + queQuan
				+ ", soDT=" + soDT + ", email=" + email + "]";
	}
	
	
	
}
