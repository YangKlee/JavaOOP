/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 1, 2025
*/ 
package services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import references.regularInput;

public class chkExceptionInp implements regularInput{
	String[] rawData;
	public chkExceptionInp(String[] rawData)
	{
		this.rawData = rawData;
	}
	public boolean chkNgaySinh()
	{
		SimpleDateFormat dateChk = new SimpleDateFormat("dd-MM-yyyy");
		if (rawData[2].matches(regex_Date))
		{
			try {
				Date test = dateChk.parse(rawData[2]);
				return true;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				return false;
			}
		}
		return false;
	}
	public boolean chkNgayThiTuyen()
	{
		if (!rawData[0].equals("1"))
		{
			return true;
		}
		else
		{
			SimpleDateFormat dateChk = new SimpleDateFormat("dd-MM-yyyy");
			if (rawData[8].matches(regex_Date))
			{
				try {
					Date test = dateChk.parse(rawData[8]);
					return true;
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					return false;
				}
			}
			return false;
		}
		//return false;
		
	}
	public boolean chkTongDiemThi()
	{
		if (!rawData[0].equals("1"))
		{
			return true;
		}
		else
		{
			if (rawData[9].matches(regex_diem))
			{
				if (Double.parseDouble(rawData[9]) >0 && Double.parseDouble(rawData[9]) <= 30)
				{
					return true;
				}
			}
			return false;
		}
	}
	public boolean chkSoDT()
	{
		if (rawData[6].matches(regex_phone))
		{
			return true;
		}
		return false;
	}
	public boolean chkGioiTinh()
	{
		if (rawData[3].equals("Nam") || rawData[3].equals("Nu"))
		{
			return true;
		}
		return false;
	}
	public boolean chkCapDoGiai()
	{
		if (!rawData[0].equals("2"))
		{
			return true;
		}
		else
		{
			if (rawData[10].equals("Quoc gia") || rawData[10].equals("Quoc te"))
			{
				return true;
			}
			return false;
		}
	}
	public boolean chkXepLoaiGiai()
	{
		if (!rawData[0].equals("2"))
		{
			return true;
		}
		else
		{
			String[] giai = {"Nhat", "Nhi", "Ba", "Khuyen khich"};
			for (String s : giai)
			{
				if (s.equals(rawData[13]));
				{
					return true;
				}
			}
			return false;
		}
	}
	private boolean isThua(int l, int r)
	{
		for (int i = l; i <= r; i++)
		{
			if (!rawData[i].equals("None"))
			{
				return false;
			}
		}
		return true;
	}
	public boolean chkDuLieuThua()
	{
		if (!rawData[0].equals("1"))
		{
			return isThua(8, 9);
		}
		else if (!rawData[0].equals("2"))
		{
			return isThua(10,13);
		}
		return false;
		
	}
	
}
