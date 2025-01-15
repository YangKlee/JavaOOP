/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 28 thg 12, 2024
*/ 
package testeee;

import java.sql.Connection;

public class test {
public static void main(String[] args) {
	int[] iAr = {1,3,5,7,9};
	for (int x:iAr)
	{
		for (int j = 0; j < 3; j++)
		{
			if (x > 4 && x <8)
			{
				continue;
			}
			System.out.println(" " + x);
			if (j == 1)
				break;
			continue;
		}
		continue;
	}
}
}
