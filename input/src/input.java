import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tuoi cua ban: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Tuoi cua ban la: "+ age);
		System.out.println("Nhap ho va ten: ");
		String name = sc.nextLine();
		System.out.println("Ten cua ban la: "+ name);
		System.out.print("Nhap ma sinh vien: ");
		int MaSV = Integer.parseInt(sc.nextLine());
		System.out.println("MaSV ban la : "+ MaSV);
	}
}
