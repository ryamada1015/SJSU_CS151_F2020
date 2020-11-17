package Assignment6;

public class Hexagon extends Shape {
	
	Hexagon(String name, double length){
		super(name, length, 0);
	}
	
	@Override
	public double computeArea() {
		return this.getLength() * 0.75 * java.lang.Math.sqrt(3);
	}
	
	public String toString() {
		return "Object name: " + this.getObjName() + "\nLength: " + this.getLength() + "\nArea: " + this.computeArea();
	}
}
