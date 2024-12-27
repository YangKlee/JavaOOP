/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 12, 2024
*/ 
package entity;

public class donViSanSuat extends khachHangDien {
	private static final double DINH_MUC_DON_VI = 20000;
	private static final double GIA_TRONG_DINH_MUC = 10000;
	private static final double GIA_NGOAI_DINH_MUC = 25000;
	
	public donViSanSuat(double chiSoCu, double chiSoMoi) {
		super(chiSoCu, chiSoMoi);
	}

	@Override
	public double tinhTienDien()
	{
		double tieuThu = tinhDienTieuThu(chiSoCu, chiSoMoi);
		if (tieuThu <= DINH_MUC_DON_VI)
		{
			return tieuThu * GIA_TRONG_DINH_MUC;
		}
		else
		{
			return (DINH_MUC_DON_VI * GIA_TRONG_DINH_MUC) + ((tieuThu - DINH_MUC_DON_VI) * GIA_NGOAI_DINH_MUC);
		}
		
	}
}
