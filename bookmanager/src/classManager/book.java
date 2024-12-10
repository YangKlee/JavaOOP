/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 29 thg 11, 2024
*/ 
package classManager;
import java.util.*;
public class book {
	private String tenSach;
	private double giaBan;
	private int namXuatBan;
	private tacgia tacgiaObject;
	public book(String tenSach, double giaBan, int namXuatBan, tacgia tacgiaObject) {
		super();
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namXuatBan = namXuatBan;
		this.tacgiaObject = tacgiaObject;
	}
	public book(book bookObj)
	{
		this.tenSach = bookObj.tenSach;
		this.giaBan = bookObj.giaBan;
		this.namXuatBan = bookObj.namXuatBan;
		this.tacgiaObject = bookObj.tacgiaObject;
	}
	public book(String tenSach, double giaBan, int namXuatBan, String tenTacGia, NgaySinh ngaySinh) {
		super();
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namXuatBan = namXuatBan;
		this.tacgiaObject = new tacgia(tenTacGia, ngaySinh);
	}
	
	public book(String tenSach, double giaBan, int namXuatBan) {
		super();
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namXuatBan = namXuatBan;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	public tacgia getTacgiaObject() {
		return tacgiaObject;
	}
	public String getTenTacGia()
	{
		return this.tacgiaObject.getTenTacGia();
		
	}
	public NgaySinh getNgaySinh()
	{
		return this.tacgiaObject.getNgaySinh();
	}
	
	public void setTenTacGia(String ten)
	{
		this.tacgiaObject.setTenTacGia(ten);
	}
	
	public void setNgaySinh(NgaySinh ngaySinh)
	{
		this.tacgiaObject.setNgaySinh(ngaySinh);
	}
	public void setTacgiaObject(tacgia tacgiaObject) {
		this.tacgiaObject = tacgiaObject;
	}
	public Boolean isCungNamXuatBan(book Sach)
	{
		if (this.namXuatBan == Sach.namXuatBan)
			return true;
		return false;
	}
	public void giamGiaSach(double x)
	{
		this.setGiaBan( this.giaBan - (this.giaBan* (x / 100)));
	}
	@Override
	public String toString() {
		return "book [tenSach=" + tenSach + ", giaBan=" + giaBan + ", namXuatBan=" + namXuatBan + ", tacgiaObject="
				+ tacgiaObject.toString() + "]";
	}
	
	
	
	
}
