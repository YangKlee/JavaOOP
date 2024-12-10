/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 3 thg 12, 2024
*/ 
package mainnn;

import java.util.StringTokenizer;

public class tets {
 public static void main(String[] args) {
	String s = "Anh hẹn    em píc ca bôn";
	StringTokenizer wordSplit = new StringTokenizer(s, " ");
	while (wordSplit.hasMoreTokens())
	{
		System.out.println(wordSplit.nextElement());
	}
}
}
