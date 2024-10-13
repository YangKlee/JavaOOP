/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 8 thg 10, 2024
*/

public class PS {
	private int tu, mau;
	
	public PS() {}
	public PS(int n)
	{
		this.tu = 5;
		this.mau = 1;
	}
	public PS(int t, int m)
	{
		this.tu = t;
		this.mau = m;
	}
	public PS(PS p)
	{
		this.tu = p.getTu();
		this.mau = p.getMau();
	}
	public void setTu(int t)
	{
		this.tu = t;
	}
	public void setMau(int m)
	{
		this.mau = m;
	}
	public int getTu()
	{
		return this.tu;
	}
	public int getMau()
	{
		return this.mau;
	}
	public void rutGon()
	{
		int target = 0;
		int uocChung = 1;
		if (this.tu >= this.mau)
			target = this.mau;
		else if(this.tu < this.mau)
			target = this.tu;
		for (int i = target ; i >= 2; i--)
		{
			if (this.tu % i == 0 && this.mau % i == 0)
				uocChung = i;
		}
		//System.out.println(uocChung);
		this.mau = this.mau / uocChung;
		this.tu = this.tu / uocChung;
	}
	public void tang(int n)
	{
		this.tu += this.mau * n;
	}
	public void gap(int n)
	{
		this.tu = this.tu * n;
	}
	public PS cong(int n)
	{
		PS p = new PS(this.tu, this.mau);
		p.setTu(p.getTu()+(p.getMau()*n));
		return p;
	}
	public PS cong(PS p)
	{
		PS p1 = new PS(this.tu , this.mau);
		if (p1.getMau() == p.getMau())
		{
			p1.setTu(p.getTu() + p1.getTu());
		}
		else
		{
			p1.setTu((p1.getTu() * p.getMau()) + (p.getTu() * p1.getMau()));
			p1.setMau(p.getMau() * p1.getMau());
		}
		return p1;
	}
	public String toString()
	{
		String out = this.tu + " / " + this.mau;
		return out;
	}
}
