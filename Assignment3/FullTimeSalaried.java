package Assignment3;

public class FullTimeSalaried extends FullTimeEmployee {

	public FullTimeSalaried() {
	}

	public FullTimeSalaried(String firstName, String lastName, Address address, Double salary) {
		super(firstName, lastName, address, 0, salary);
	}
	
	public Double computePay(int numWeeks) {
		setBasePay((getBasePay()/365)*numWeeks*7);
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
