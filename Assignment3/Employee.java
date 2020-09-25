package Assignment3;

public abstract class Employee extends Person {
	
	private int id;
	private String educationLevel;
	private boolean directDeposit;

	public Employee() {
	}

	public Employee(String firstName, String lastName, Address address, int id) {
		super(firstName, lastName, address);
		setID(id);
	}
	
	public void setEducation(String education) {
		this.educationLevel = education;
	}
	
	public String getEducation() {
		return this.educationLevel;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setDirectDeposit(boolean directDeposit) {
		this.directDeposit = directDeposit;
	}
	
	public boolean getDirectDeposit() {
		return this.directDeposit;
	}
}
