/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 18 thg 12, 2024
*/ 
package entity;
import java.lang.Math;
public abstract class nguoiDungDien {
	double chiSoCu, chiSoMoi;
	double dinhMuc;
	protected double giaTrongDM = 0;
	protected double giaVuotDM = 0;
	public String typeName;
	public nguoiDungDien(double chiSoCu, double chiSoMoi, double dinhMuc) {
		super();
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
		this.dinhMuc = dinhMuc;
		
	}
	public double tinhTienDien()
	{
		System.out.println(giaTrongDM+" "+ giaVuotDM);
		double dienTieuThu = Math.abs(this.chiSoCu - this.chiSoMoi);
		if (dienTieuThu <= dinhMuc)
		{
			return dienTieuThu * giaTrongDM;
		}
		else
		{
			double price = 0;
			price += dinhMuc*giaTrongDM;
			price += giaVuotDM * (dienTieuThu - dinhMuc);
			return price;
		}
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
	public double getDinhMuc() {
		return dinhMuc;
	}
	public void setDinhMuc(double dinhMuc) {
		this.dinhMuc = dinhMuc;
	}

	public abstract String getTypeName();
	

}
