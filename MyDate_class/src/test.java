
public class test {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(18,07,2028);
		date1.GetDate();
		if(date1.isLeapYear()) {
			System.out.println("Nam nhuan");
		}
	}
}
