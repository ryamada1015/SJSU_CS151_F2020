package Assignment5;

public class Course {
	private String courseName;
	private String courseDescription;
	private String department;
	private String time;
	private String day;
	
	Course(){}
	
	public Course(String courseName, String courseDescription, String department,
			String time, String day) {
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.department = department;
		this.time = time;
		this.day = day;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public String getCourseDescription() {
		return this.courseDescription;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public String getTime() {
		return this.time;
	}
	
	public String getDay() {
		return this.day;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void setCourseDescription(String description) {
		this.courseDescription = description;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public void setDay(String day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		return "Course Name: " + getCourseName() + "\nCourse Description: " + getCourseDescription() +
				"\nDepartment: " + getDepartment() + "\nTime: " + getTime() + "\nDay: " + getDay() + "\n";
	}
}
