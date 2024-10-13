package candiate;
public class cadidate_manager {
	public static candidate[] createCadiate(int n)
	{
		candidate[] listCandiate = new candidate[n];
		listCandiate[0] = new candidate(1, "Nguyễn Yến Nhi", "Nữ", "02/17/2005", "nhi4651050044", 3.4f);
		listCandiate[1] = new candidate(2, "Nguyễn Khánh Dương", "Nam", "07/18/2005", "duongklee", 3.3f);
		listCandiate[2] = new candidate(3, "Trần Thanh Cường", "Thứ 3", "09/17/2005", "cuong4651050034", 6.4f);
		return listCandiate;
	}
	public static void display(candidate[] listCandiate,int n)
	{
		for (int i = 0 ; i < n; i++)
		{
			listCandiate[i].inThongTin();
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		int n;
		n = 3;
		candidate[] listCandiate = new candidate[n];
		listCandiate = createCadiate(n);
		display(listCandiate, n);
	}
}
