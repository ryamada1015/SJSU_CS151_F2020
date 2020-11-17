package Assignment6;

import java.io.Serializable;

public class Shape implements Serializable {
	
	private String name;
	private double width;
	private double length;
	
	Shape(){}
	
	Shape(String name, double length, double width){
		this.name = name;
		this.width = width;
		this.length = length;
	}
	
	public String getObjName() {
		return this.name;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setObjName(String name) {
		this.name = name;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}

	public double computeArea() {
		return 0;
	}
	
}
