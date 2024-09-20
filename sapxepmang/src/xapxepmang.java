import java.util.Random;
public class xapxepmang {
	public static void sinhMang(int a[], int n)
	{
		Random rand = new Random();
		for (int i = 0; i < n; i++)
		{
			a[i] = rand.nextInt(100000);
		}
	}
	public static void inMang(int a[], int n)
	{
		for (int i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.print('\n');
	}
	public static void merge(int a[], int l, int m, int r)
	{
		
		int subArray1_long = (m -l)+1, subArray2_long = (r - (m+1))+1;
		int subArray1[] = new int[subArray1_long];
		int subArray2[] = new int [subArray2_long];
		for(int i = l ; i <= m; i++)
		{
			subArray1[i-l] = a[i];
		}
		for(int i = m+1 ; i <= r; i++)
		{
			subArray2[i-(m+1)] = a[i];
		}
		int i= 0, j = 0;
		while(i < subArray1_long && j < subArray2_long)
		{
			if(subArray1[i] >= subArray2[j])
			{
				
				a[l] = subArray2[j];
				l++; j++;
			}	
			else
			{
				a[l] = subArray1[i];
				l++; i++;
			}
		}
		while (i < subArray1_long )
		{
			a[l] = subArray1[i];
			l++; i++;
		}
		while (j < subArray2_long )
		{
			a[l] = subArray2[j];
			l++; j++;
		}
		
	}
	public static void mergeSoft(int a[], int n, int l, int r)
	{
		if(l >= r)
			return;
		else
		{
			int m = (l+r)/2;
			mergeSoft(a,n,l,m);
			mergeSoft(a,n,m+1,r);
			merge(a,l,m,r);
		}
	}
	public static void main(String[] args) {
		input inp = new input();
		int n = inp.InputInt();
		int a[] = new int[n];
		sinhMang(a,n);
		mergeSoft(a,n,0,n-1);
		inMang(a,n);
		
	}
}
