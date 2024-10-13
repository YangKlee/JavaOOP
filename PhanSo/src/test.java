/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 8 thg 10, 2024
*/

public class test {
	public static void main(String[] args) {
		PS p = new PS(18, 25);
		PS q = new PS(17, 20);
		PS r = new PS();
		PS t = new PS();
		r = p.cong(q);
		r.rutGon();
		System.out.println(r.toString());
	}
	
}
