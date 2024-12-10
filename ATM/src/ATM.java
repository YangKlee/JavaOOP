/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 13 thg 10, 2024
*/

public class ATM {
	public static int querySTK(TaiKhoan[] dsTK,String STK, int n)
	{
		for (int i = 0; i < n; i++)
		{
			if (STK.equals(dsTK[i].getSoTaiKhoan()))
				return i;
		}
		throw new Error("Đéo tìm thấy STK " + STK);
	}
	public static void displayTaiKhoan(TaiKhoan[] dsTK, int n)
	{
		System.out.println("*********Sao kê tài khoản**********");
		for (int i = 0; i < n; i++)
		{
			System.out.println("TK: " + dsTK[i].getSoTaiKhoan());
			System.out.println("So Du: " + dsTK[i].getSoDu());
			System.out.println("-----------------------------");
		}
	}
	public static int tongSoTienHienCo(TaiKhoan[] dsTK, int n)
	{
		int sum = 0;
		for (int i = 0; i < n; i++)
		{
			sum += dsTK[i].getSoDu();
		}
		return sum;
	}
	public static void napTien(TaiKhoan[] dsTK,String STK, int SoTien, int n)
	{
		int i = querySTK(dsTK,STK, n);
		dsTK[i].napTien(SoTien);
		System.out.println("Nạp tiền thành công!");
	}
	public static void rutTien(TaiKhoan[] dsTK,String STK, int SoTien, int n)
	{
		int i = querySTK(dsTK,STK, n);
		dsTK[i].rutTien(SoTien);
		System.out.println("Rút tiền thành công!");
	}
	public static void chuyenTien(TaiKhoan[] dsTK,String STK_nguon,
			String STK_dich , int SoTien, int n)
	{
		int i = querySTK(dsTK, STK_nguon, n);
		int j = querySTK(dsTK, STK_dich, n);
		dsTK[j].chuyenTien(dsTK[i], SoTien);
		System.out.println("Chuyển tiền thành công!");
	}
	public static void main(String[] args) {
		final int n = 2; // so luong danh sach tai khoan
		TaiKhoan[] dsTK = new TaiKhoan[n];
		dsTK[0] = new TaiKhoan("1111111");
		dsTK[1] = new TaiKhoan("2222222");
		napTien(dsTK, "1111111", 1000, n);
		//displayTaiKhoan(dsTK, n);
		chuyenTien(dsTK, "1111111", "2222222", 5500, n);
		rutTien(dsTK, "2222222", 200, n);
		chuyenTien(dsTK,"2222222","1111111", 100, n);
		displayTaiKhoan(dsTK, n);
		System.out.println("Tong tien hien co: "+ tongSoTienHienCo(dsTK, n));
	}
}
