/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 25 thg 12, 2024
*/ 
package entity;

public class Diem {
	String tenHocPhan;
	int soTinChi;
	double chuyenCan, giuaKy, cuoiKy;
	public Diem(String tenHocPhan, int soTinChi, double chuyenCan, double giuaKy, double cuoiKy) {
		super();
		this.tenHocPhan = tenHocPhan;
		this.soTinChi = soTinChi;
		this.chuyenCan = chuyenCan;
		this.giuaKy = giuaKy;
		this.cuoiKy = cuoiKy;
	}
	public double tinhDiem()
	{
		return 0.1*chuyenCan +  0.2*giuaKy +  0.7*cuoiKy;
	}
}
