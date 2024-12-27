/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 12, 2024
*/ 
package daluong;

public class test {
	public static void main(String[] args) {
		Runnable r = new inSoChan("Yang");
		Runnable r1 = new inSoChan("Klee");
		Thread thObj = new Thread(r);
		Thread thObj1 = new Thread(r1);
		thObj.start();
		try {
			thObj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thObj1.start();
	}
}
