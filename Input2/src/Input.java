import java.util.Scanner;

public class Input {
	private String GetSystemIn() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;	
	}
	
	public int InputInt() {
		String input = GetSystemIn();
		return Integer.parseInt(input);
	}
	public float InputFloat() {
		String input = GetSystemIn();
		return Float.parseFloat(input);
	}
	public char InputChar() {
		String input = GetSystemIn();
		return input.charAt(0);
	}
	public String InputString() {
		String input = GetSystemIn();
		return input;
	}
}
