package Assignment3;

public class PartTimeHourly extends Employee {

	private Double baseHourlyPay;
	
	public PartTimeHourly() {
	}
	
	public PartTimeHourly(String firstName, String lastName, Address address, Double pay) {
		super(firstName, lastName, address, 0);
		setHourlyPay(pay);
	}
	
	public void setHourlyPay(Double pay) {
		this.baseHourlyPay = pay;
	}
	
	public Double getHourlyPay() {
		return this.baseHourlyPay;
	}
	
	public Double computePay(int numHrs) {
		if(numHrs > 40) return -1.0;
		
		this.baseHourlyPay = this.baseHourlyPay*numHrs;
		return baseHourlyPay;
	}
	
	public String toString() {
		if(getDirectDeposit())
			return super.toString() + "Total payment per day: $" + getHourlyPay() + "\nEducation: " + getEducation() + "\nDirect deposit: yes";
		
		else 
			return super.toString() + "Total payment per day: $" + getHourlyPay() + "\nEducation: " + getEducation() + "\nDirect deposit: no";
	}
	
	public void introduce(boolean displaySSN) {
		if(displaySSN)
			System.out.println(this + "\nSSN: " + getSSN() + "\n");
		
		else 
			System.out.println(this + "\n");
	}
}
