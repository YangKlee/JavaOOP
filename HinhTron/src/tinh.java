
public class tinh {
	public static void main(String[] args) {
		input inp = new input();
		float r = inp.InputFloat();
		hinhtron h1 = new hinhtron(r);
		System.out.println("Chu vi: " + h1.tinhChuVi());
		System.out.println("Dien tich: " + h1.tinhDienTich());
		
	}
}
