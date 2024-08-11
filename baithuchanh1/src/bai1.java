public class bai1 {
	public static long GiaiThua(long n)
	{
		if(n == 1)
			return 1;
		else
			return n * GiaiThua(n-1);
	}
	public static void main(String[] args) {
		long n = Integer.parseInt(args[0]);
		System.out.print(GiaiThua(n * 1l));
		
	}
}
