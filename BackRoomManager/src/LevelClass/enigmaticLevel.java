/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 10 thg 12, 2024
*/ 
package LevelClass;

public class enigmaticLevel extends Level {
	public enigmaticLevel(String name, String survivalDifficulty, String shortDescription1, String shortDescription2,
			String shortDescription3) {
		super(name, survivalDifficulty, shortDescription1, shortDescription2, shortDescription3);
	}
	
	@Override
	public void enterLevel()
	{
		System.out.println("Bạn đang vào level huyền bí: "+ name);
	}
	@Override
	public void outLevel()
	{
		System.out.println("Bạn đang rời level huyền bí: "+ name);
	}
	@Override
	public String toString()
	{
		String s = "Loại Level: Huyền bí\n"
				+ "Tên: " + name +"\n"
				+ "Survial Difficulty\n Class " + survivalDifficulty + "\n"
				+shortDescription1
				+ "\n" + shortDescription2
				+ "\n" + shortDescription3;
		
		return s;
	}
}
