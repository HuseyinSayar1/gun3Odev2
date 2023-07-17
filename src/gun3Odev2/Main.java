package gun3Odev2;

public class Main {

	public static void main(String[] args) {

		Instructor instuInstructor=new Instructor(1,"Huseyin", "SAYAR", "12345");
		Student student = new Student(2,"Ahmet", "AVCI", "6789");
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.instructor(instuInstructor);
		
		StudentManager studentManager=new StudentManager();
		studentManager.student(student);
	}

}
