/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 27 thg 11, 2024
*/ 
package classQNU;

public class HocPhan {
	private int maHp;
	private String tenHp;
	private int soTC;
	public HocPhan(int maHp, String tenHp, int soTC) {
		super();
		this.maHp = maHp;
		this.tenHp = tenHp;
		this.soTC = soTC;
	}
	public int getMaHp() {
		return maHp;
	}
	public void setMaHp(int maHp) {
		this.maHp = maHp;
	}
	public String getTenHp() {
		return tenHp;
	}
	public void setTenHp(String tenHp) {
		this.tenHp = tenHp;
	}
	public int getSoTC() {
		return soTC;
	}
	public void setSoTC(int soTC) {
		this.soTC = soTC;
	}
	@Override
	public String toString() {
		return "HocPhan [maHp=" + maHp + ", tenHp=" + tenHp + ", soTC=" + soTC + "]";
	}
	
}
