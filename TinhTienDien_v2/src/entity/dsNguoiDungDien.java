/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 18 thg 12, 2024
*/ 
package entity;

import java.util.ArrayList;

public class dsNguoiDungDien {
	private static ArrayList<nguoiDungDien> dsNguoiDung = new ArrayList<nguoiDungDien>();
	public static void add(nguoiDungDien obj)
	{
		dsNguoiDung.add(obj);
	}
	public static void set(int index, nguoiDungDien obj)
	{
		dsNguoiDung.set(index, obj);
	}
	public static nguoiDungDien get(int index)
	{
		return dsNguoiDung.get(index);
	}
	public static  void delete(int index)
	{
		dsNguoiDung.remove(index);
	}
	public static  void delete(nguoiDungDien obj)
	{
		dsNguoiDung.remove(obj);
	}
	public static int size()
	{
		return dsNguoiDung.size();
	}
	public static void clear()
	{
		dsNguoiDung.clear();
	}
}
