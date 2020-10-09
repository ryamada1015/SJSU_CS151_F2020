package Assignment4;

public class StudentTest {

	public static void main(String[] args) {

		Course course = new Course("CS151", "Object Oriented Design and Programming",
				"CS", "6:00pm", "Tuesday");
		Student student = new Student("John", "Smith", 20, 3.6, 
				"Computer Science", "School of Computer Science", course);
		Student student2 = null;
		
		try {
			student2 = (Student) student.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		student.printInfo();
		student2.printInfo();
	}

}
