
public class docso {
	public static void main(String[] args) {
		int so = Integer.parseInt(args[0]);
		String chuso ;
		switch(so)
		{
		case 0: chuso = "Khong";break;
		case 1: chuso = "Mot";break;
		case 2: chuso = "Hai";break;
		case 3: chuso = "Ba";break;
		case 4: chuso = "Bon";break;
		case 5: chuso = "Nam";break;
		case 6: chuso = "Sau";break;
		case 7: chuso = "Bay";break;
		case 8: chuso = "Tam";break;
		case 9: chuso = "Chin";break;
		default: chuso = "Chi nhap cac so tu 0-9";break;
		}
		System.out.println(chuso);
	}
}
