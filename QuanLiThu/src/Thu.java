/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 22 thg 10, 2024
*/

public class Thu extends BuuPham {
	private String loaiThu;
	private float gia;
	private final float GIA_THU_THUONG = 800f;
	private final float GIA_THU_BAO_DAM = 2000f;
	public Thu(String type, String send, String des, String sendAdd, String desAdd)
	{
		super(send, des, sendAdd, desAdd);
		this.loaiThu = type;
		if (loaiThu.equals("thuong"))
			this.gia = this.GIA_THU_THUONG;
		else if (loaiThu.equals("bao dam"))
			this.gia = this.GIA_THU_BAO_DAM;
		else
			throw new Error("Loai thu hem ton tai");
	}
	@Override
	public float getGia()
	{
		return this.gia;
	}
	@Override
	public void hienThi()
	{
		// in thong tin
		String out = "Buu pham thu loai: " + this.loaiThu +"\n"+
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
		return this.loaiThu;
	}
	

}
