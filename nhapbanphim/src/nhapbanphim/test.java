/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 11, 2024
*/ 
package nhapbanphim;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int sum = 0;
		try {
			int n = inp.nextInt();
			for (int i = 0; i < n; i++)
			{
				sum += inp.nextInt();
			}
			System.out.println(sum);
		} catch (Exception ime) {
			System.out.println("Chi duoc nhap so");
		}
		finally {
			inp.close();
		}

	}
}
