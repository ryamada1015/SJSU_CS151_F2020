package Assignment3;

public class Customer extends Person {

	private int customerID;
	private String paymentPreference;
	
	public Customer() {
	}
	
	public Customer(String firstName, String lastName, Address address, int id) {
		super(firstName, lastName, address);
		setID(id);
	}
	
	public void setID(int id) {
		this.customerID = id;
	}
	
	public int getID() {
		return this.customerID;
	}
	
	public void setPaymentPref(String paymentPref) {
		this.paymentPreference = paymentPref;
	}
	
	public String getPaymentPref() {
		return this.paymentPreference;
	}
	
	public String toString() {
		return super.toString() + "ID: " + getID() + "\n" 
				+ "Payment preference: " + getPaymentPref() + "\n";
	}
	
	public void introduce() {
		System.out.println(this);
	}

}
