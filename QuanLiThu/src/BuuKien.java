/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 22 thg 10, 2024
*/

public class BuuKien extends BuuPham {
	private final float GIA = 5000f;
	public BuuKien(String send, String des, String sendAdd, String desAdd)
	{
		super(send,des, sendAdd, desAdd);
	}
	@Override
	public float getGia()
	{
		return this.GIA;
	}
	@Override
	public void hienThi()
	{
		// thong tin hien thi
		// in thong tin
		String out = "Buu pham kien hang "+ "\n"+
					"Nguoi gui: " + this.nguoiGui + "\n"+
					"Dia chi nguoi gui: " + this.diaChiNguoiGui + "\n"+
					"Nguoi nhan: "+ this.nguoiNhan + "\n"+
					"Dia chi nguoi nhan: "+ this.diaChiNguoiNhan + "\n" +
					"Gia tien: " + this.getGia();
		System.out.println(out);
		System.out.println("===================");
	}
	@Override
	public String getLoai()
	{
		return "buu kien";
	}
	
}
