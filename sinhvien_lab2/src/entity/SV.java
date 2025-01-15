/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 4 thg 1, 2025
*/ 
package entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class SV {
	private String hoTen;
	private Date ngaySinh;
	private double dtb;
	private String[] nameElements;
	public SV(String hoTen, Date date, double dtb) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = date;
		this.dtb = dtb;
		nameElements = hoTen.split(" ");
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public int getTuoi()
	{
		Date current = new Date();
		return (current.getYear() - ngaySinh.getYear());		
	}
	public double getDtb() {
		return dtb;
	}
	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
	public String getHo()
	{
		return nameElements[0];
	}
	public String getTenDem()
	{
		return nameElements[1];
	}
	public String getTen()
	{
		int i = 2;
		String tmp = ""; 
		while (nameElements.length > i)
		{
			tmp += " "+ nameElements[i];
			i++;
		}
		return tmp.trim();
	}
	public String getXepLoai()
	{
		if (dtb >= 8)
		{
			return "Xuất sắc";
		}
		else if (dtb >= 7)
		{
			return "Khá";
		}
		else if (dtb >= 5)
		{
			return "Trung bình";
		}
		else
		{
			return "Yếu";
		}
	}
	@Override
	public String toString() {
		return "SV [hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", dtb=" + dtb + ", getXepLoai()=" + getXepLoai() + "]";
	}
	
}
