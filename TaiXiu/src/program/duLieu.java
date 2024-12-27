/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 16 thg 12, 2024
*/ 
package program;
import entity.*;
public class duLieu {
	static player p = null;
	public static void newPlayer()
	{
		p = new player();
	}
	public static player getPlayer()
	{
		return p;
	}
	
}
