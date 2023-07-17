package gun3Odev2;

public class Student extends User {
	private String studentNumber;

	public Student() {
		super();
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public Student(int id, String firstName, String lastName, String studentNumber) {
		super(id, firstName, lastName);
		this.studentNumber = studentNumber;
	}

}
