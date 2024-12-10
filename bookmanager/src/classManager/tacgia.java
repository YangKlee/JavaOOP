/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 29 thg 11, 2024
*/ 
package classManager;

import java.util.*;

public class tacgia {
	private String tenTacGia;
	private NgaySinh ngaySinh;
	public tacgia() {};
	public tacgia(String tenTacGia, NgaySinh ngaySinh) {
		super();
		this.tenTacGia = tenTacGia;
		this.ngaySinh = ngaySinh;
	}
	public tacgia(tacgia tacGiaObj) {
		super();
		this.tenTacGia = tacGiaObj.tenTacGia;
		this.ngaySinh = tacGiaObj.ngaySinh;
	}
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public NgaySinh getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(NgaySinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	@Override
	public String toString() {
		return "tacgia [tenTacGia=" + tenTacGia + ", ngaySinh=" + ngaySinh.toString() + "]";
	}
	
	
}
