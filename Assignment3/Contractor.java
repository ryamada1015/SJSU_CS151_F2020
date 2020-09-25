package Assignment3;

public class Contractor extends Employee {

	private Double basePay;
	
	public Contractor() {
	}
	
	public Contractor(String firstName, String lastName, Address address, Double pay, int id) {
		super(firstName, lastName, address, id);
		setBasePay(pay);
	}
	
	public void setBasePay(Double basePay) {
		this.basePay = basePay;
	}
	
	public Double getBasePay() {
		return this.basePay;
	}
	
	public Double computePay(int numHrs) {
		this.basePay = this.basePay*numHrs;
		return this.basePay;
	}
	
	public String toString() {
		
		if(getDirectDeposit())
			return super.toString() + "ID: " + getID() + "\n" 
			+ "Total payment: $" + getBasePay() + "\nEducation: " + getEducation() + "\nDirect deposit: yes";
		else
			return super.toString() + "ID: " + getID() + "\n" 
			+ "Total payment: $" + getBasePay() + "\nEducation: " + getEducation() + "\nDirect deposit: no";
	}
	
	public void introduce(boolean displaySSN) {
		if(displaySSN)
			System.out.println(this + "\nSSN: " + getSSN() + "\n");
		
		else 
			System.out.println(this + "\n");
	}

}
