package Assignment3;

public abstract class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String ssn;
	private Address address;
	
	public Person(String firstName, String lastName, Address address) {
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
	}
	
	public Person() {}

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
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public String getSSN() {
		return this.ssn;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	public String toString() {
		return "Name: " + getFirstName() + " " + getLastName() + "\n" + "Age: " + getAge() + "\n" + "Address: " 
				+ getAddress().getStreetNum() + " " + getAddress().getStreetName() + " " + getAddress().getCity()
				+ " " + getAddress().getZIP() + " " + getAddress().getState() + "\n";
	}
}
