package Assignment3;

public abstract class FullTimeEmployee extends Employee {

	private Double basePay;
	
	public FullTimeEmployee() {
	}
	
	public FullTimeEmployee(String firstName, String lastName, Address address, int id, Double basePay) {
		super(firstName, lastName, address, id);
		setBasePay(basePay);
	}
	
	public void setBasePay(Double basePay) {
		this.basePay = basePay;
	}
	
	public Double getBasePay() {
		return this.basePay;
	}

}
