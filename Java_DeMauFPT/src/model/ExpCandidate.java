package model;

import java.util.Date;

public class ExpCandidate extends candidate{
	private double namKN;
	private String kyNang;
	private String noiLamViecLast;
	public ExpCandidate(String hoTen, Date ngaySinh, String diaChi, String queQuan, String soDT, String email,
			double namKN, String kyNang, String noiLamViecLast) {
		super(hoTen, ngaySinh, diaChi, queQuan, soDT, email);
		this.namKN = namKN;
		this.kyNang = kyNang;
		this.noiLamViecLast = noiLamViecLast;
	}
	public ExpCandidate() {};
	@Override
	public String toString() {
		return "ExpCandidate [namKN=" + namKN + ", kyNang=" + kyNang + ", noiLamViecLast=" + noiLamViecLast + ", hoTen="
				+ hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", queQuan=" + queQuan + ", soDT=" + soDT
				+ ", email=" + email + "]";
	}
	public double getNamKN() {
		return namKN;
	}
	public void setNamKN(double namKN) {
		this.namKN = namKN;
	}
	public String getKyNang() {
		return kyNang;
	}
	public void setKyNang(String kyNang) {
		this.kyNang = kyNang;
	}
	public String getNoiLamViecLast() {
		return noiLamViecLast;
	}
	public void setNoiLamViecLast(String noiLamViecLast) {
		this.noiLamViecLast = noiLamViecLast;
	}
	
	
	
}
