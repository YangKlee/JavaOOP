public class MyDate {
	private int Day;
	private int Month;
	private int Year;
	
	public MyDate(int d, int m , int y)
	{
		this.Day = d;
		this.Month = m;
		this.Year = y;
	}
	
	public void GetDate()
	{
		System.out.println(Day+"/"+Month+"/"+Year);
	}
	public Boolean isLeapYear()
	{
		if(Year % 100 != 0 && Year % 4 == 0)
		{
			return true;
		}
		return false;
	}
}
