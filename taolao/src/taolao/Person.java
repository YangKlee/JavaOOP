/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 23 thg 10, 2024
*/ 
package taolao;

public class Person {
	private String Name;
	private float chieuCao;
	private float canNang;
	public Person() {};
	public Person(String name, float chieuCao, float canNang)
	{
		this.Name = name;
		this.chieuCao = chieuCao;
		this.canNang = canNang;
	}
	public Person(String name, float chieuCao)
	{
		this.Name = name;
		this.chieuCao = chieuCao;
		//this.canNang = canNang;
	}
	public void hienThi()
	{
		System.out.println(Name + chieuCao + canNang);
	}
	public String getName()
	{
		return this.Name;
	}
	public void setName(String name)
	{
		this.Name = name;
	}
	
}
