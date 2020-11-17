package Assignment6;

public class Circle extends Shape{

	private double radius;
	
	Circle(String name, double radius){
		super(name, 0, 0);
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double computeArea() {
		return 3.14 * this.radius * this.radius;
	}
	
	public String toString() {
		return "Object name: " + this.getObjName() + "\nRadius: " + this.radius + "\nArea: " + this.computeArea();
	}
}
