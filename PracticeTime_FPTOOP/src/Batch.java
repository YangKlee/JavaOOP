/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 1 thg 10, 2024
*/

public class Batch {
	private String batchName;
	private String batchDate;
	Interviewer interviewer ; // ???
	Candidate[] candidates = new Candidate[5];
	public Batch(String batchName,String batchDate )
	{
		this.batchName = batchName;
		this.batchDate = batchDate;
	}
}
