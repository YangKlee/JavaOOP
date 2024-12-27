/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 12, 2024
*/ 
package entity;
import java.lang.Math;
public abstract class khachHangDien {
	double chiSoCu;
	double chiSoMoi;
	//double dinhMuc;
	public khachHangDien(double chiSoCu, double chiSoMoi) {
		super();
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
	}
	public double tinhDienTieuThu(double a, double b)
	{
		return Math.abs(a - b);
	}
	public double getChiSoCu() {
		return chiSoCu;
	}
	public void setChiSoCu(double chiSoCu) {
		this.chiSoCu = chiSoCu;
	}
	public double getChiSoMoi() {
		return chiSoMoi;
	}
	public void setChiSoMoi(double chiSoMoi) {
		this.chiSoMoi = chiSoMoi;
	}
	public abstract double tinhTienDien();

}
