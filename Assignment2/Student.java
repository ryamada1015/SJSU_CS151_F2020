
package Assignment2;

public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private double gpa;
	private String major;
	private String department;
	
	public Student() {
		
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastname() {
		return lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	public double getGPA() {
		return gpa;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public class Course {
		void printSchedule() {
			System.out.println("CS151 Tue/Thur 6-7:15\nEng101 Mon/Wed 10-11:15\nHist100 Tue/Thur 1:30-2:45");
		}
	}
}