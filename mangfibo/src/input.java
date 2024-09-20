import java.io.*;
public class input {
    private String getStringKeyboard()
    {
        String str = null;
        DataInputStream stream = new DataInputStream(System.in);
        try
        {
           str = stream.readLine();
        }
        catch(IOException e)
        {
            System.out.println("Nhap loi!");
        }
        return str;
    }
    public int inputInt()
    {
        String str = getStringKeyboard();
        return Integer.parseInt(str);
    }
}
