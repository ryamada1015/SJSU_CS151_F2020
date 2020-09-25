package Assignment3;

public class Executive extends Employee {

	private Double yearlyBonus;
	private Double yearlyCompensation;
	
	public Executive() {
	}

	public Executive(String firstName, String lastName, Address address, int id, Double pay, Double bonus) {
		super(firstName, lastName, address, id);
		setPay(pay);
		setBonus(bonus);
	}
	
	public void setPay(Double pay) {
		this.yearlyCompensation = pay;
	}
	
	public Double getPay() {
		return this.yearlyCompensation;
	}
	
	public void setBonus(Double bonus) {
		this.yearlyBonus = bonus;
	}
	
	public Double getBonus() {
		return this.yearlyBonus;
	}
	
	public Double computePay() {
		this.yearlyCompensation += yearlyBonus;
		return this.yearlyCompensation;
	}
	
	public String toString() {
		if(getDirectDeposit())
			return super.toString() + "ID: " + getID() + "\n" 
			+ "Total payment: $" + getPay() + "\nEducation: " + getEducation() + "\nDirect deposit: yes";
		else
			return super.toString() + "ID: " + getID() + "\n" 
			+ "Total payment: $" + getPay() + "\nEducation: " + getEducation() + "\nDirect deposit: no";
	}
	
	public void introduce(boolean displaySSN) {
		if(displaySSN)
			System.out.println(this + "\nSSN: " + getSSN() + "\n");
		
		else 
			System.out.println(this + "\n");
	}

}
