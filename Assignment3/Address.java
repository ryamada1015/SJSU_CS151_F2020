package Assignment3;

public class Address {
	
	private int streetNum;
	private String streetName;
	private String city;
	private String zip;
	private String state;
	
	public Address(int streetNum, String streetName, String city, String zip, String state) {
		setStreetNum(streetNum);
		setStreetName(streetName);
		setCity(city);
		setZIP(zip);
		setState(state);
	}
	
	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}
	
	public int getStreetNum() {
		return this.streetNum;
	}
	
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public String getStreetName() {
		return this.streetName;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setZIP(String zip) {
		this.zip = zip;
	}
	
	public String getZIP() {
		return this.zip;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return this.state;
	}
}
