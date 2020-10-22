package Assignment5;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	Person(String firstName, String lastName, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
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
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getFirstName() + " " + this.getLastName() + "\nAge: " + this.getAge();
	}
}
