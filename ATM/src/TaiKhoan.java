/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 13 thg 10, 2024
*/

public class TaiKhoan {
	final int MIN_MONEY = 100;
	private String soTaiKhoan;
	private int soDu;
	public TaiKhoan() {};
	public TaiKhoan(String STK) {
		this.soTaiKhoan = STK;
		this.soDu = MIN_MONEY;
	}
	public TaiKhoan(String STK, int soDu)
	{
		this.soTaiKhoan =  STK;
		if (soDu <= MIN_MONEY)
			this.soDu = MIN_MONEY;
		else
			this.soDu = soDu;
	}
	public String getSoTaiKhoan()
	{
		return this.soTaiKhoan;
	}
	public int getSoDu()
	{
		return this.soDu;
	}
	public void setSoTaiKhoan(String STK)
	{
		this.soTaiKhoan = STK;
	}
	public void setSoDu(int soDu)
	{
		if (soDu >= 0)
			this.soDu = soDu;
		else
			throw new Error("Mả cha thằng đần số dư sao nhỏ hơn 0 được ??");
	}
	public void chuyenTien(TaiKhoan a, int soTien)
	{
		// tai khoan this la tai khoan dich
		if (a.getSoDu() >= soTien)
		{
			a.setSoDu(a.getSoDu() - soTien);
			this.setSoDu(this.getSoDu() + soTien);
		}
		else
			throw new Error("Số dư đéo đủ");
	}
	public void napTien(int SoTien)
	{
		this.setSoDu(this.getSoDu() + SoTien);
	}
	public void rutTien(int SoTien)
	{
		if (this.getSoDu() >= SoTien)
			this.setSoDu(this.getSoDu() - SoTien);
		else
			throw new Error("Đéo đủ tiền mà đòi rút");
	}
	
}
