package Assignment4;

class TooManyHoursWorkedException extends Exception {
	
	TooManyHoursWorkedException(String msg){
		super(msg);
	}
	
}

public class Employee {

	private String firstName;
	private String lastname;
	private String id;
	private int hourlyPay;
	
	Employee(String firstName, String lastName, String id, int hourlyPay) {
		this.firstName = firstName;
		this.lastname = lastName;
		this.id = id;
		this.hourlyPay = hourlyPay;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastname;
	}
	
	public String getID() {
		return this.id;
	}
	
	public int getHourlyPay() {
		return this.hourlyPay;
	}
	
	public double computePay(int hours) {
		
		try {
			if(hours > 40)
				throw new TooManyHoursWorkedException("Work hours cannot exceed 40 hours.");
			else if(hours < 0)
				throw new NumberFormatException();
			else
				return hours*this.hourlyPay;
		}
		catch(TooManyHoursWorkedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid work hours.");
			e.printStackTrace();
		}
		return -1;
	}
	
	
	
	
	
	
}
