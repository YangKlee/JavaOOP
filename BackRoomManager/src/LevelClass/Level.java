/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 10 thg 12, 2024
*/ 
package LevelClass;

public abstract class Level {
	String name;
	String survivalDifficulty;
	String shortDescription1;
	String shortDescription2;
	String shortDescription3;
	
	public Level(String name, String survivalDifficulty, String shortDescription1, String shortDescription2,
			String shortDescription3) {
		super();
		this.name = name;
		this.survivalDifficulty = survivalDifficulty;
		this.shortDescription1 = shortDescription1;
		this.shortDescription2 = shortDescription2;
		this.shortDescription3 = shortDescription3;
	}
	public abstract String toString();
	public abstract void enterLevel();
	public abstract void outLevel();
}
