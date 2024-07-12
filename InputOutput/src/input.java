import java.io.*;
public class input {
	public static String GetKeyboard()
	{
		String str = null;
		DataInputStream stream = new DataInputStream(System.in);
		try {
			str = stream.readLine();
		}
		catch(IOException e) {
			System.out.println("Read error");
		}
		return str;
	}
	public static int InputInt()
	{
		String str = GetKeyboard();
		return Integer.valueOf(str).intValue();
	}
	public static float InputFloat()
	{
		String str = GetKeyboard();
		return Integer.valueOf(str).floatValue();
	}
	public static char InputChar()
	{
		String str = GetKeyboard();
		return str.charAt(0);
	}
	public static String InputString()
	{
		return GetKeyboard();
	}
}
