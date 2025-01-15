/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 8 thg 1, 2025
*/ 
package references;

public interface SQLCommand {
	public String addExpCandidateCommand = "exec addExpCandidate ?,?,?,?,?,?,?,?,?";
	public String addFreshCandidateCommand = "exec addFreshCandidate ?,?,?,?,?,?,?,?,?";
	public String addInternCandidateCommand = "exec addInternCandidate ?,?,?,?,?,?,?,?,?,?";
}
