import java.util.*;
public class nhanvien {
	// tất cả các thuộc tính của lớp nên để private để bảo toàn tính đóng gói
	//không cho người khác có thể trưc tiếp chỉnh sửa các thuộc tính mà phải thông qua các phương thức
	private String HoTen;
	private String NgaySinh;
	private String ChucVu;
	private float HeSoLuong;
	private float LuongCoBan;
	private float HeSoPhuCap;
	// phương thức  constuctor giúp tạo ra một đối tượng mới của lớp đó và khởi tạo các thuộc tính của đối tượng đó
	public nhanvien(String HoTen, String NgaySinh,
			String ChucVu, float HeSoLuong,float LuongCoBan)
	{
		this.HoTen = HoTen;
		//Date ngaysinh = new Date(NgaySinh);
		this.NgaySinh = NgaySinh;
		// quy định hệ số phụ cấp cho từng chức vụ
		/*GD - Giám đốc
		 *PGD - Phó giám đốc
		 *TP - Trưởng phòng
		 *PP - Phó phòng
		 * */
		if(ChucVu.equals("GD"))
		{
			this.HeSoPhuCap = 1.0f;
		}
		else if(ChucVu.equals("PGD"))
		{
			this.HeSoPhuCap = 0.8f;
		}
		else if(ChucVu.equals("TP"))
		{
			this.HeSoPhuCap = 0.5f;
		}
		else if(ChucVu.equals("PP"))
		{
			this.HeSoPhuCap = 0.4f;
		}
		this.HeSoLuong = HeSoLuong;
		this.LuongCoBan = LuongCoBan;
	}
	public float tinhLuong()
	{
		return (this.HeSoLuong + this.HeSoPhuCap) * this.LuongCoBan;
	}
	public float tinhTienBHXH()
	{
		return this.tinhLuong() * 0.06f;
	}
	public float tinhTienBHTN()
	{
		return this.tinhLuong() * 0.01f;
	}
	public float tinhTienNhan()
	{
		return this.tinhLuong() - this.tinhTienBHXH() - this.tinhTienBHTN();
	}
	// phương thức  hỗ trợ in ra các thuộc tính của đối tượng, giúp rút ngắn cho câu 2
	public void inThongTinNV()
	{
		System.out.println("--------- Nhân viên: "+this.HoTen+ "---------");
		System.out.println("Lương: "+this.tinhLuong());
		System.out.println("BHXH: "+this.tinhTienBHXH());
		System.out.println("BHTN: "+this.tinhTienBHTN());
		System.out.println("Tien nhan: "+this.tinhTienNhan());
	}
	// muốn lấy một thuộc tính của đối tượng thì phải thông qua phương thức get như này;
	public String getNgaySinh()
	{
		return this.NgaySinh;
	}
	public String getTenNV()
	{
		return this.HoTen;
	}
}