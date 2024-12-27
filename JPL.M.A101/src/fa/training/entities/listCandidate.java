/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 12, 2024
*/ 
package fa.training.entities;

import java.util.ArrayList;

public class listCandidate {
	static ArrayList<Candidate> lsCandidate = new ArrayList<Candidate>();
	
	public static void add(Candidate obj)
	{
		lsCandidate.add(obj);
	}
	public static Candidate get(int index)
	{
		return lsCandidate.get(index);
	}
	public static int size()
	{
		return lsCandidate.size();
	}
}
