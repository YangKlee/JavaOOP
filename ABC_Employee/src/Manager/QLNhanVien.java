/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 18 thg 1, 2025
*/ 
package Manager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.NhanVien;
import model.NhanVienHDDH;
import model.NhanVienHDG;

public class QLNhanVien {
	private List<NhanVien> dsnv ;
	public QLNhanVien()
	{
		dsnv = new ArrayList<NhanVien>();
	}
	BufferedReader bread = null;
	public void docFile(String tenFile)
	{
		SimpleDateFormat simpleDate = new SimpleDateFormat("MM/dd/yyyy");
		try {
			bread = new BufferedReader(new FileReader(tenFile));
			String line;
			while((line = bread.readLine()) != null)
			{
				String[] rawData = line.split(", ");
				String type = rawData[0];
				String maNV = rawData[1];
				String hoTen = rawData[2];
				Date birth = simpleDate.parse(rawData[3]);
				if (type.equals("DH"))
				{
					NhanVienHDDH dh = new NhanVienHDDH();
					dh.setMaNV(maNV);
					dh.setHoTen(hoTen);
					dh.setNgaySinh(birth);
					dh.setLuongThang(Double.parseDouble(rawData[4]));
					dsnv.add(dh);
				}
				else if (type.equals("TG"))
				{
					NhanVienHDG tg = new NhanVienHDG();
					tg.setMaNV(maNV);
					tg.setHoTen(hoTen);
					tg.setNgaySinh(birth);
					tg.setLuongGio(Double.parseDouble(rawData[4]));
					tg.setSoGio(Byte.parseByte(rawData[5]));
					dsnv.add(tg);
				}
				else
				{
					System.err.println("Phát hiện trường nhân viên không hợp lệ");
				}
				System.out.println("Đọc file thành công!");
			}
		} catch (FileNotFoundException e) {
			System.err.println("Không tìm thấy thư mục file");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (bread!= null)
				try {
					bread.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	ObjectOutputStream objout = null;
	public void ghiFile(String tenFile)
	{
		try {
			objout = new ObjectOutputStream(new FileOutputStream(tenFile));
			for (NhanVien nv : dsnv)
			{
				if (nv.getClass() == NhanVienHDG.class)
				{
					objout.writeObject((NhanVienHDG)nv);
				}
			}
			System.out.println("Ghi file thành công!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (objout!= null)
				try {
					objout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	public void sapXep()
	{
		ArrayList<NhanVien> lsNVSort = new ArrayList<NhanVien>(dsnv);
		for (int i = 0; i < lsNVSort.size(); i++)
		{
			for (int j = i+1; j < lsNVSort.size(); j++)
			{
				if (lsNVSort.get(i).tinhLuong() > lsNVSort.get(j).tinhLuong())
				{
					NhanVien tmp = lsNVSort.get(i);
					lsNVSort.set(i, lsNVSort.get(j));
					lsNVSort.set(j, tmp);
				}
			}
		}
		for (NhanVien nv : lsNVSort)
		{
			System.out.println(nv.toString());
		}
	}
	
}
