import java.util.*;
public class baitap {
	public static void main(String[] args) {
		int row = 4, col = 4;
		int[][] arr = new int[row][col];
		Random rand = new Random();
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				arr[i][j] = rand.nextInt(101); // rand 0 -100
			}
		}
		int sum_le = 0;
		// tong cac so o dong le
		for(int i = 0; i < row; i++)
		{
			if((i+1)%2 != 0)
			{
				for(int j = 0; j < col; j++)
					sum_le += arr[i][j];
			}
		}
		System.out.print(sum_le);
	}
}
