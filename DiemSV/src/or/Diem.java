/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 20 thg 11, 2024
*/ 
package or;

public class Diem {
	String tenHocPhan;
	int soTinChi;
	float chuyenCan, giuaKy, cuoiKy;
	public Diem(String tenHocPhan, int soTinChi, float chuyenCan, float giuaKy, float cuoiKy) {
		super();
		this.tenHocPhan = tenHocPhan;
		this.soTinChi = soTinChi;
		this.chuyenCan = chuyenCan;
		this.giuaKy = giuaKy;
		this.cuoiKy = cuoiKy;
	}
	public Diem()
	{
		
	}
	public Diem(Diem dm) {
		this.tenHocPhan = dm.tenHocPhan;
		this.soTinChi = dm.soTinChi;
		this.chuyenCan = dm.chuyenCan;
		this.giuaKy = dm.giuaKy;
		this.cuoiKy = dm.cuoiKy;
	}
	float tinhDiem()
	{
		return (this.chuyenCan * 0.1f) + (this.giuaKy * 0.2f) + (this.cuoiKy * 0.3f) ;
	}
	public int getSoTinChi() {
		return soTinChi;
	}

	
	
	
}
