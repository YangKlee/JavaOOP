import java.math.*;
public class songto {
	public static void nhapMang(int a[], int n)
	{
		input ip = new input();
		for (int i = 0; i < n; i++)
		{
			a[i] = ip.InputInt();
		}
	}
	public static boolean isPrime(int n)
	{
		if(n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n) ; i++)
		{
			if(n%i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		input ip = new input();
		int n = ip.InputInt();
		int a[] = new int[n];
		nhapMang(a,n);
		for (int i = 0; i < n; i++)
		{
			if(isPrime(a[i]))
				System.out.println(a[i]+ " ");
		}
	}
}
