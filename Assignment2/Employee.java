
package Assignment2_3;

public class Employee extends Person {
	private int id;
	private String status;
	private double payAmount;
	
	public Employee(String firstName, String lastName, int age, int ssn, String address, String gender, double weight,
			int id, String status, double payAmount) {
		super(firstName, lastName, age, ssn, address, gender, weight);
		setID(id);
		setStatus(status);
		setPayAmount(payAmount);
	}

	public void setID(int id) {
		this.id = id;
	}
	
	public int getID() {
		return id;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}
	
	public double getPayAmount() {
		return this.payAmount;
	}
	
	public String toString() {
		return "Name: " + getFirstName() + " " + getLastName() + "\nAge: " + getAge() + "\nSSN: " + getSSN()
		+ "\nAddress: " + getAddress() + "\nGender: " + getGender() + "\nWeight: " + getWeight() + "kg"
				+ "\nEmployee ID: " + getID() + "\nEmployee Status: " + getStatus() + "\nPay Amount: $" + getPayAmount();
	}
	
	public void introduce() {
		System.out.println(this);
	}
	
	public void calculatePayment(double unitsWorked) {
		if(getStatus() == "Part time" || this.status == "Contractor") {
			System.out.println("Total amount paid: $" + getPayAmount()*unitsWorked + "\n\n");
		}
		
		else if(getStatus() == "Full time") {
			System.out.println("Total amount paid: " + (getPayAmount()/365)*unitsWorked*7 + "\n\n");
		}
	}
	
	
}