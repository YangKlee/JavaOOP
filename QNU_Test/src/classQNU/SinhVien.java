/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 27 thg 11, 2024
*/ 
package classQNU;

import java.util.ArrayList;

public class SinhVien {
	private int maSV;
	private String firstName;
	private String lastName;
	private boolean gioiTinh;
	private String diaChi;
	ArrayList<Diem> dsDiem = new ArrayList<Diem>();
	public SinhVien() {
		
	}
	public SinhVien(int maSV, String firstName, String lastName, boolean gioiTinh, String diaChi, Diem diemHP) {
		super();
		this.maSV = maSV;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gioiTinh = gioiTinh;
		dsDiem.add(diemHP);
		this.diaChi = diaChi;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public Boolean getGioiTinh()
	{
		return this.gioiTinh;
	}
	public ArrayList<Diem> getDsDiem() {
		return dsDiem;
	}
	public void setDsDiem(ArrayList<Diem> dsDiem) {
		this.dsDiem = dsDiem;
	}
	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", firstName=" + firstName + ", lastName=" + lastName + ", gioiTinh="
				+ gioiTinh + ", dsDiem=" + dsDiem + "]";
	}
	
	
	
}
