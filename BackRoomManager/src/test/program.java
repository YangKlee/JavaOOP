/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 10 thg 12, 2024
*/ 
package test;
import java.util.ArrayList;

import LevelClass.*;
public class program {
	public static void main(String[] args) {
		ArrayList<Level> listLevel = new ArrayList<Level>();
		listLevel.add(new normalLevel(1, "Level 0", "1", "Safe", "Unstable", "Devoid of Entities"));
		listLevel.add(new enigmaticLevel("Level FUN", "Safe", "Safe", "Safe", "Safe"));
		for (int i = 0; i < listLevel.size(); i++)
		{
			System.out.println(listLevel.get(i).toString());
			System.out.println("\n");
		}
	}
}
