package Assignment5;

import java.util.*;

import Assignment5.Course;

public class Student extends Course{
	private String firstName;
	private String lastName;
	private int age;
	private double gpa;
	private String major;
	private String department;
	LinkedList<Course> courses = new LinkedList<Course>();
	
	public Student(String firstName, String lastName, int age, double gpa, String major,
			String department, LinkedList<Course> courses) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		this.courses = courses;
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
	
	public LinkedList<Course> getCourses() {
		return this.courses;
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
	
	public void setCourses(LinkedList<Course> courses) {
		this.courses = courses;
	}
	
	public void addCourse(Course course) {
		(this.courses).add(course);
	}
	
	public void removeCourse(Course course) {
		(this.courses).remove(course);
	}
	
	public void sortCourses(boolean ascending, String base) {
		if(ascending) {
			if(base == "name") 
				(this.courses).sort((Course c1, Course c2)->c1.getCourseName().compareTo(c2.getCourseName()));
			else if(base == "description")
				(this.courses).sort((Course c1, Course c2)->c1.getCourseDescription().compareTo(c2.getCourseDescription()));
			else if(base == "department")
				(this.courses).sort((Course c1, Course c2)->c1.getDepartment().compareTo(c2.getDepartment()));
			else if(base == "time")
				(this.courses).sort((Course c1, Course c2)->c1.getTime().compareTo(c2.getTime()));
			else if(base == "description")
				(this.courses).sort((Course c1, Course c2)->c1.getDay().compareTo(c2.getDay()));

	}
		if(!ascending) {
			if(base == "name") 
				(this.courses).sort((Course c1, Course c2)->c2.getCourseName().compareTo(c1.getCourseName()));
			else if(base == "description")
				(this.courses).sort((Course c1, Course c2)->c2.getCourseDescription().compareTo(c1.getCourseDescription()));
			else if(base == "department")
				(this.courses).sort((Course c1, Course c2)->c2.getDepartment().compareTo(c1.getDepartment()));
			else if(base == "time")
				(this.courses).sort((Course c1, Course c2)->c2.getTime().compareTo(c1.getTime()));
			else if(base == "description")
				(this.courses).sort((Course c1, Course c2)->c2.getDay().compareTo(c1.getDay()));
		}
		System.out.println("Course List:\n");
		(this.courses).forEach((s)->System.out.println(s));  
	}
	
}
