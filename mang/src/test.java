import java.util.*;

public class test {
	public static void main(String[] args) {
		// khai bao mang co dinh
		int listNum[] ;
		listNum = new int[10]; // cap o nho cho mang
		// khai bao mang dong
		ArrayList arr = new ArrayList();
		// sinh mang ngau nhien n phan tu
		int n = 1000;
		Random rand = new Random();
		for(int i = 0; i < n; i++)
		{
			arr.add(rand.nextInt(101)); // 0 - 100
		}
		for(int i = 0; i < n; i++)
		{
			// lay phan tu vi tri thu i trong mang
			System.out.print((int)arr.get(i));
			System.out.print(' ');
			if((i+1)%10 == 0)
				System.out.print('\n');
		}
		
	}
}
