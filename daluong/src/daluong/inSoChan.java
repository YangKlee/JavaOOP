/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 12, 2024
*/ 
package daluong;

public class inSoChan implements Runnable {
	String str;
	public inSoChan(String str)
	{
		this.str = str;
	}
	public void run() {
		for (int i =1; i <= 10; i++)
		{
			System.out.println(this.str + " " + i);
		}
		System.out.println(this.str +" Done!");
	}
}
