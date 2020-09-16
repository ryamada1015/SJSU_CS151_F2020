
package Assignment2_3;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private int ssn;
	private String address;
	private String gender;
	private double weight;
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, int age, int ssn, String address, String gender, double weight) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setSSN(ssn);
		setAddress(address);
		setGender(gender);
		setWeight(weight);
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setSSN(int ssn) {
		this.ssn = ssn;
	}
	
	public int getSSN() {
		return this.ssn;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public String toString() {
		return "Name: " + getFirstName() + " " + getLastName() + "\nAge: " + getAge() + "\nSSN: " + getSSN()
				+ "\nAddress: " + getAddress() + "\nGender: " + getGender() + "\nWeight: " + getWeight() + "kg";
	}
	
	public void introduce() {
		System.out.println(this);
	}
	
	
	
	
}