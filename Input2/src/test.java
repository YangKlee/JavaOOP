public class test {
	public static void main(String[] args) {
		Input inp = new Input();
		System.out.print("Nhap ma sinh vien: ");
		int MaSV = inp.InputInt();
		System.out.println("Ma SV la: " + MaSV);
		System.out.print("Nhap ho ten: ");
		String HoTen = inp.InputString();
		System.out.println("Ho ten la: " + HoTen);
		
	}
}
