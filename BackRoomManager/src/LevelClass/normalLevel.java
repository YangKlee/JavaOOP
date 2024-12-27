/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 10 thg 12, 2024
*/ 
package LevelClass;

public class normalLevel extends Level {
	int ID;

	public normalLevel(int ID,String name, String survivalDifficulty, String shortDescription1, String shortDescription2,
			String shortDescription3) {
		super(name, survivalDifficulty, shortDescription1, shortDescription2, shortDescription3);
		this.ID = ID;
	}
	
	@Override
	public void enterLevel()
	{
		System.out.println("Bạn đang vào level: "+ name);
	}
	@Override
	public void outLevel()
	{
		System.out.println("Bạn đang rời level: "+ name);
	}
	@Override
	public String toString()
	{
		String s = "Loại Level: Thường\n"
				+ "ID: " + ID +" Tên: " + name +"\n"
				+ "Survial Difficulty\n Class " + survivalDifficulty + "\n"
				+ shortDescription1
				+ "\n" + shortDescription2
				+ "\n" + shortDescription3;
		
		return s;
	}
}
