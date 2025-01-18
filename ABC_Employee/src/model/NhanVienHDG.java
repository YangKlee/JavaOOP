/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 18 thg 1, 2025
*/ 
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVienHDG extends NhanVien {

	private double luongGio;
	private byte soGio;
	
	public NhanVienHDG(String maNV, String hoTen, Date ngaySinh, double luongGio, byte soGio) {
		super(maNV, hoTen, ngaySinh);
		this.luongGio = luongGio;
		this.soGio = soGio;
	}
	
	public NhanVienHDG() {
		super();
	}

	@Override
	public double tinhLuong() {
		if (this.soGio <= 160)
		{
			return this.soGio * this.luongGio;
		}
		else
		{
			return (this.soGio - 160) * (this.luongGio * 2);
		}
	}

	@Override
	public String loaiNV() {
		return "TG";
	}

	@Override
	public String toString() {
		SimpleDateFormat simpleDate = new SimpleDateFormat("MM/dd/yyyy");
		return "Nhan vien theo giờ: \n" + "Ma NV: " + this.maNV + 
				" Ho ten: " + this.hoTen + " Ngay sinh: "+ simpleDate.format(this.ngaySinh)  + " Số giờ làm việc: " +
				this.soGio+" Lương giờ: " + this.luongGio + " Tien luong: "+ this.tinhLuong();
	}

	public double getLuongGio() {
		return luongGio;
	}

	public void setLuongGio(double luongGio) {
		this.luongGio = luongGio;
	}

	public byte getSoGio() {
		return soGio;
	}

	public void setSoGio(byte soGio) {
		this.soGio = soGio;
	}
	
}
