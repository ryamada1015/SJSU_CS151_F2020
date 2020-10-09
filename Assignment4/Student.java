package Assignment4;

public class Student implements Cloneable {

	private String firstName;
	private String lastName;
	private int age;
	private double gpa;
	private String major;
	private String department;
	private Course course;
	
	public Student(String firstName, String lastName, int age, double gpa, String major,
			String department, Course course) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		this.course = course;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public Course getCourse() {
		return this.course;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setCourse(String name, String description, String department,
			String time, String day) {
		this.course.setCourseName(name);
		this.course.setCourseDescription(description);
		this.course.setDepartment(department);
		this.course.setTime(time);
		this.course.setDay(day);
	}
	
	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();
		student.course = (Course) course.clone();
		return student;
	}
	
	public void printInfo() {
		System.out.println(this.firstName + " " + this.lastName + "\n" + this.age + "\n"
				+ this.gpa + "\n" + this.major + "\n" + this.department + "\n"
				+ this.course.getCourseName() + "\n" + this.course.getcourseDescription()
				+ "\n" + this.course.getDepartment() + "\n" + this.course.getTime()
				+ "\n" + this.course.getDay() + "\n");
	}
}
