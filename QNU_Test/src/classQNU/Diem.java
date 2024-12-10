/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 27 thg 11, 2024
*/ 
package classQNU;

public class Diem{
	private int maHP;
	private double diemQuaTrinh;
	private double diemCuoiKy;
	private double diemHocPhan;
	public Diem(int maSV, int maHP, double diemQuaTrinh, double diemCuoiKy, double diemHocPhan) {
		super();
		this.maHP = maHP;
		this.diemQuaTrinh = diemQuaTrinh;
		this.diemCuoiKy = diemCuoiKy;
		this.diemHocPhan = diemHocPhan;
	}
	public Diem(int maSV, int maHP, double diemQuaTrinh) {
		super();
		this.maHP = maHP;
		this.diemQuaTrinh = diemQuaTrinh;
	}
	public Diem(int maSV, int maHP, double diemQuaTrinh, double diemCuoiKy) {
		super();
		this.maHP = maHP;
		this.diemQuaTrinh = diemQuaTrinh;
		this.diemCuoiKy = diemCuoiKy;
	}

	public int getMaHP() {
		return maHP;
	}
	public void setMaHP(int maHP) {
		this.maHP = maHP;
	}
	public double getDiemQuaTrinh() {
		return diemQuaTrinh;
	}
	public void setDiemQuaTrinh(double diemQuaTrinh) {
		this.diemQuaTrinh = diemQuaTrinh;
	}
	public double getDiemCuoiKy() {
		return diemCuoiKy;
	}
	public void setDiemCuoiKy(double diemCuoiKy) {
		this.diemCuoiKy = diemCuoiKy;
	}
	public double getDiemHocPhan() {
		return diemHocPhan;
	}
	public void setDiemHocPhan(double diemHocPhan) {
		this.diemHocPhan = diemHocPhan;
	}
	@Override
	public String toString() {
		return "Diem [ maHP=" + maHP + ", diemQuaTrinh=" + diemQuaTrinh + ", diemCuoiKy=" + diemCuoiKy
				+ ", diemHocPhan=" + diemHocPhan + "]";
	}
	
	
}
