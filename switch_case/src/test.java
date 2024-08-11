public class test {
	public static void main(String[] args) {
		int number = 10;
		String ChuSo = null;
		switch(number)
		{
			case 0: ChuSo = "Không"; break;
			case 1: ChuSo = "Một";break;
			case 2: ChuSo = "Hai";break;
			case 3: ChuSo = "Ba";break;
			case 4: ChuSo = "Bốn";break;
			case 5: ChuSo = "Năm";break;
			default: ChuSo = "Không xác định"; break;// neu khong thoa cac dieu kien tren thi chay vao default
		}
		System.out.println(ChuSo);
	}
}
