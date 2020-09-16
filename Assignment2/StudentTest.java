
package Assignment2;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.setFirstName("John");
		student.setLastName("Smith");
		student.setAge(20);
		student.setGPA(3.6);
		student.setMajor("Computer Science");
		student.setDepartment("School of Computer Science");
		
		Student.Course course = student.new Course();
		course.printSchedule();
	}
}