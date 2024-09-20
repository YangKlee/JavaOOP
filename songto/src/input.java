import java.io.*;
public class input {
	private String Input()
	{
		String str = null;
		DataInputStream stream = new DataInputStream(System.in);
		try 
		{
			str = stream.readLine();
			
		}catch(IOException e) {
			System.out.println("Loi nhap!");
		}
		return str;
		
	}
	public int InputInt()
	{
		String str = Input();
		return Integer.parseInt(str);
	}
	public float InputFloat()
	{
		String str = Input();
		return Float.parseFloat(str);
	}
	public char InputChar()
	{
		String str = Input();
		return str.charAt(0);
	}
	public String InputString()
	{
		return Input();
	}
}
