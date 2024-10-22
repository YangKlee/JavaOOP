/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 22 thg 10, 2024
*/ 
package items;

public abstract class BuuPham {
	protected String nguoiGui;
	protected String nguoiNhan;
	protected String diaChiNguoiGui;
	protected String diaChiNguoiNhan;
	public BuuPham(){};
	public BuuPham(String send, String des, String sendAdd, String desAdd)
	{
		this.nguoiGui = send;
		this.nguoiNhan = des;
		this.diaChiNguoiGui = sendAdd;
		this.diaChiNguoiNhan = desAdd;
	}
	public abstract float getGia ();
	public abstract String getLoai ();
	public abstract void hienThi ();
}
