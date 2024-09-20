public class test {
    public static void nhapMang(int a[], int n)
    {
        input inp = new input();
        for (int i = 0; i < n; i++)
        {
            a[i] = inp.inputInt();
        }
    }
    // thuc hien phep luy thua bac n-1 ma tran T de tim so fibo thu n
    public static void powMaTran(long T[][], int n)
    {
    	// ma tran tam thoi de luu tru ket qua phep nhan hai ma tran 
    	long tmp[][] = new long[2][2];
    	// tao va khai bao ma tran T co so de phuc vu cho phep tich luy thua
    	long T_first[][] = {{1l,1l},{1l,0l}};
        long tmpsum = 0; // bien tam de luu tru ket qua 
        // nhan hai ma tran
        for(int q = 0; q < n; q++)
        {
            for(int i = 0; i < 2; i++)
            {
                for(int j = 0; j < 2; j++)
                {
                    for(int k = 0; k < 2; k++)
                    {
                        tmpsum += T[i][k] * T_first[k][j];
                    }
                    tmp[i][j] = tmpsum;
                    tmpsum = 0;
                }
            }
            // sao chep ket qua tu ma tran tam thoi vao ma tran T de thuc hien 
            // lan luy thua tiep theo
            T[0][0] = tmp[0][0]; 
            T[0][1] = tmp[0][1]; 
            T[1][0] = tmp[1][0]; 
            T[1][1] = tmp[1][1];
        }


    }
    public static long tinhFiboN(int fibo)
    {
    	// tao ma tran co so T
        long T[][] = {{1l,1l},{1l,0l}};
        powMaTran(T, fibo-1);
        return T[0][1];
    }
    public static void main(String args[])
    {
        input inp = new input();
        int n = inp.inputInt();
        int a[] = new int[n];
        nhapMang(a,n);
        for (int i = 0; i < n; i++)
        {
        	int j = 0;
        	long tmp = 0;
        	do
        	{
        		tmp = tinhFiboN(j);
        		if(tmp == a[i])
        		{
        			System.out.print(a[i] + " ");
        			break;
        		}   
        		j++;
        	}while(a[i] > tmp);
        }
    }
}
