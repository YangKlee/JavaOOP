import java.util.*;
public class chuongtrinh {
	// phương thức static: https://rikkei.edu.vn/static-trong-java/ 
	public static void inThongTin(int n, nhanvien[] NV)
	{
		for(int i = 0; i < n; i++)
		{
			// gọi phương thức in thông tin nhân viên từ class nhanvien.java
			NV[i].inThongTinNV();
			System.out.print("\n");
		}
	}
	public static float tinhTongLuong(int n, nhanvien[] NV)
	{
		float sum = 0.0f;
		for(int i = 0; i < n; i++)
		{
			// gọi phương thức tính lương từ class nhanvien.java
			sum += NV[i].tinhLuong();
		}
		return sum;
	}
	public static int timNVTuoiCaoNhat(int n, nhanvien[] NV)
	{
		/*
		 * Giải thích: Giả sử trường hợp danh sách nhân viên có năm sinh bằng nhau
		 * thì phương pháp tìm tuổi nhân viên lớn nhất bằng cách lấy năm hiện tại
		 * trừ cho năm sinh nhân viên sau đó tìm ra max thì sẽ không còn chính xác 
		 * Vì vậy ở đây lấy mili giây của từng date rồi trừ
		 * */
		// Nếu để trống Date() thì sẽ tự động lấy thời gian hiện tại
		Date currentTime = new Date();
		//int NamHT = currentTime.getYear();
		long max = 0;
		int max_index = 0;
		for(int i = 0; i < n; i++)
		{
			Date getNamSinhNV = new Date(NV[i].getNgaySinh());
			//int tuoiNV = NamHT - getNamSinhNV.getYear();
			// getTime() là get mili giây của thời gian. Vì vậy độ chính xác của biểu thức
			// tính bằng mili giây
			long tuoiNV = currentTime.getTime() - getNamSinhNV.getTime();
			if(tuoiNV > max)
			{
				max = tuoiNV;
				max_index = i;
			}
		}
		return max_index;
	}
	public static void main(String[] args) {
		// n là số nhân viên, tạo một mảng chứa n nhân viên
		int n = 5;
		nhanvien[] NV = new nhanvien[n];
		// input:
		// String HoTen, String NgaySinh, String ChucVu, float HeSoLuong,float LuongCoBan
		NV[0] = new nhanvien("Nguyễn Khánh Dương", "07/18/2005", "PGD", 1.0f, 1300000);
		NV[1] = new nhanvien("Nguyễn Yến Nhi", "02/17/2005", "GD", 1.5f, 1500000);
		NV[2] = new nhanvien("Mavuika", "12/01/2001", "TP", 0.5f, 500000);
		NV[3] = new nhanvien("Furina", "03/16/2000", "TP", 0.5f, 700000);
		NV[4] = new nhanvien("Nahida", "09/09/2016", "PP", 0.5f, 730000);
		inThongTin(n, NV);
		System.out.println("Tong luong cac NV: " + tinhTongLuong(n, NV));
		int x = timNVTuoiCaoNhat(n, NV);
		System.out.println("Nhan vien co tuoi cao nhat la: "+ NV[x].getTenNV());
		System.out.println("Luong TB cua ds nhan vien: " + (tinhTongLuong(n, NV)) / (float)n);
		
	}
}
