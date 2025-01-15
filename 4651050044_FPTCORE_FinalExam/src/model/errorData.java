/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 1, 2025
*/ 
package model;

public class errorData {
	private int line;
	private boolean isTrueNgaySinh;
	private boolean isTrueNgayThiTuyen;
	private boolean isTrueSoDT;
	private boolean isTrueDiemThi;
	private boolean isTrueGioiTinh;
	private boolean isTrueCapDo;
	private boolean isTrueXepLoai;
	private boolean isDuDuLieu;
	public boolean isDuDuLieu() {
		return isDuDuLieu;
	}
	public void setDuDuLieu(boolean isDuDuLieu) {
		this.isDuDuLieu = isDuDuLieu;
	}
	
	public boolean isHopLe()
	{
		if (isTrueNgaySinh && isTrueNgayThiTuyen && isTrueSoDT && isTrueDiemThi && isTrueGioiTinh && isTrueCapDo &&isTrueXepLoai
				&& isDuDuLieu)
		{
			return true;
		}
		return false;
	}
	public errorData() {
		super();
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public boolean isTrueNgaySinh() {
		return isTrueNgaySinh;
	}
	public void setTrueNgaySinh(boolean isTrueNgaySinh) {
		this.isTrueNgaySinh = isTrueNgaySinh;
	}
	public boolean isTrueNgayThiTuyen() {
		return isTrueNgayThiTuyen;
	}
	public void setTrueNgayThiTuyen(boolean isTrueNgayThiTuyen) {
		this.isTrueNgayThiTuyen = isTrueNgayThiTuyen;
	}
	public boolean isTrueSoDT() {
		return isTrueSoDT;
	}
	public void setTrueSoDT(boolean isTrueSoDT) {
		this.isTrueSoDT = isTrueSoDT;
	}
	public boolean isTrueDiemThi() {
		return isTrueDiemThi;
	}
	public void setTrueDiemThi(boolean isTrueDiemThi) {
		this.isTrueDiemThi = isTrueDiemThi;
	}
	public boolean isTrueGioiTinh() {
		return isTrueGioiTinh;
	}
	public void setTrueGioiTinh(boolean isTrueGioiTinh) {
		this.isTrueGioiTinh = isTrueGioiTinh;
	}
	public boolean isTrueCapDo() {
		return isTrueCapDo;
	}
	public void setTrueCapDo(boolean isTrueCapDo) {
		this.isTrueCapDo = isTrueCapDo;
	}
	public boolean isTrueXepLoai() {
		return isTrueXepLoai;
	}
	public void setTrueXepLoai(boolean isTrueXepLoai) {
		this.isTrueXepLoai = isTrueXepLoai;
	}
	@Override
	public String toString() {
		return "errorData [line=" + line + ", isTrueNgaySinh=" + isTrueNgaySinh + ", isTrueNgayThiTuyen="
				+ isTrueNgayThiTuyen + ", isTrueSoDT=" + isTrueSoDT + ", isTrueDiemThi=" + isTrueDiemThi
				+ ", isTrueGioiTinh=" + isTrueGioiTinh + ", isTrueCapDo=" + isTrueCapDo + ", isTrueXepLoai="
				+ isTrueXepLoai + ", isDuDuLieu=" + isDuDuLieu + "]";
	}
	
}
