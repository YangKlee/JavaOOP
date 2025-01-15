/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 5 thg 1, 2025
*/ 
package program;

import java.util.ArrayList;

import entity.SV;

public class DSSV {
	private ArrayList<SV> DSSV = new ArrayList<SV>();
	public void themSV(SV sv)
	{
		DSSV.add(sv);
	}
	public void hienThi()
	{
		for (SV sv : DSSV)
		{
			System.out.println(sv.toString());
		}
	}
	public void timTen(String name)
	{
		for (int i = 0; i < DSSV.size(); i++)
		{
			if ((DSSV.get(i).getTen()).equals(name))
			{
				System.out.println(DSSV.get(i).toString());
			}
		}
	}
	public void xoaSVFirst(String name)
	{
		for (int i = 0; i < DSSV.size(); i++)
		{
			if ((DSSV.get(i).getTen()).equals(name))
			{
				DSSV.remove(i);
				break;
			}
		}
	}
	public double calcAgeAvg()
	{
		int sum = 0;
		for (SV sv : DSSV)
		{
			sum += sv.getTuoi();
		}
		return sum / DSSV.size();
	}
	public void xapTheoHoTen()
	{
		
	}
}
