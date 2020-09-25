package Assignment3;

public class FullTimeHourly extends FullTimeEmployee{

	private Double overtimePay;
	
	public FullTimeHourly() {
	}

	public FullTimeHourly(String firstName, String lastName, Address address, int id, Double basePay, Double overtime) {
		super(firstName, lastName, address, id, basePay);
		setOvertime(overtime);
	}
	
	public void setOvertime(Double overtime) {
		this.overtimePay = overtime*getBasePay();
	}
	
	public Double getOvertime() {
		return this.overtimePay;
	}
	
	public Double computePay(int numHrs) {
		setBasePay(getBasePay()*numHrs+getOvertime());
		return getBasePay();
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
