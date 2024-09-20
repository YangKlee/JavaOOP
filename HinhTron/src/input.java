import java.io.*;
public class input {
	private String getStringKeyboard()
	{
		String str =  null;
		DataInputStream stream = new DataInputStream(System.in);
		try {
			str = stream.readLine();
		}
		catch(IOException e) {
			System.out.println("Loi nhap!");
		}
		return str;
	}
	public float InputFloat()
	{
		String str = getStringKeyboard();
		return Float.parseFloat(str);
	}
}
