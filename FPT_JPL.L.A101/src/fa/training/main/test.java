/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 7 thg 1, 2025
*/ 
package fa.training.main;

import java.util.regex.Pattern;

import fa.training.utils.ValidationRules;

public class test implements ValidationRules{
	public static void main(String[] args) {
		String ts = "0356701052";
		Pattern p = Pattern.compile(RULE_ISBN);
		if (p.matcher(ts).find())
		{
			System.out.println("OK");
		}
	}
}
