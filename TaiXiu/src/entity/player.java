/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 16 thg 12, 2024
*/ 
package entity;

public class player {
	private double soDu;

	public double getSoDu() {
		return soDu;
	}
	public void napTien(double money)
	{
		if (money < 0)
		{
			// exception
		}
		else
		{
			this.soDu += money;
		}
	}
	public void rutTien(double money)
	{
		if (this.soDu < money)
		{
			// exception
		}
		else
		{
			this.soDu -= money;
		}
	}
}
