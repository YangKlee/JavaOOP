/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 4 thg 1, 2025
*/ 
package services;

import java.util.ArrayList;
import java.util.regex.Pattern;

import references.regularInput;


public class chkExceptionInp {
	int typeCandidate ;
	String[] rawData = null;
	Pattern p = null;
	public chkExceptionInp(String[] rawData)
	{
		this.rawData = rawData;
		this.typeCandidate = Integer.parseInt(rawData[0]);
	}
	public boolean chkBirth()
	{
		p = Pattern.compile(regularInput.birthDay);
		//System.out.println(rawData[2]);
		if (p.matcher(rawData[2]).find())
		{
			return true;
		}
		else
			return false;
	}
	public boolean chkPhone()
	{
		p = Pattern.compile(regularInput.Phone);
		if (p.matcher(rawData[5]).find())
		{
			return true;
		}
		return false;
	}
	public boolean chkEmail()
	{
		p = Pattern.compile(regularInput.Email);
		if (p.matcher(rawData[6]).find())
		{
			return true;
		}
		return false;
	}
	public boolean chkYearExp()
	{
		if (typeCandidate == 1)
		{
			p = Pattern.compile(regularInput.expYear);
			if (p.matcher(rawData[7]).find())
			{
				float year = Float.parseFloat(rawData[7]);
				if (year > 0 && year <100 && typeCandidate == 1)
				{
					return true;
				}

			}
		}
		else
			return true;
		return false;
	}
	public boolean isThua(int l, int r)
	{
		for (int i = l ; i <= r ; i++)
		{
			if (rawData[i].equals("None") == false)
			{
				//System.out.println("false at "+ i);
				return false;
			}
		}
		return true;
	}
	public boolean chkDuLieuThua()
	{
		if (typeCandidate != 1) // co kinh nghiem
		{
			return isThua(7, 9);
		}
		else if (typeCandidate != 2) // tot nghiep dai hoc
		{
			return isThua(10, 12);
		}
		else if (typeCandidate != 3) // thuc tap
		{
			return isThua(13, 16);
		}
		return false;
	}
}
