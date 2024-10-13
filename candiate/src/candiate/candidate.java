package candiate;
public class candidate {
	private int id;
	private String name;
	private String gender;
	private String birthDate;
	private String email;
	private double gpa;
	
	public candidate(int id, String name, String gender, String birthDate, String email, double gpa)
	{
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.email = email;
		this.gpa = gpa;
	}

	public void inThongTin()
	{
		System.out.println("Ứng viên: " + this.name);
		System.out.println("Giới tính: " + this.gender);
		System.out.println("Sinh nhật: " + this.birthDate);
		System.out.println("Email: "+ this.email);
		System.out.println("GPA: " + this.gpa);
	}
}
