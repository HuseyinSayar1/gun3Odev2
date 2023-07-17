package gun3Odev2;

public class Instructor extends User {
	private String instructorNumber;

	public Instructor() {
		super();

	}

	public Instructor(int id, String firstName, String lastName, String instructorNumber) {
		super(id, firstName, lastName);
		this.instructorNumber = instructorNumber;

	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

}
