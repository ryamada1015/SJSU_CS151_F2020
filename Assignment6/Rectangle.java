package Assignment6;

public class Rectangle extends Shape{

	Rectangle(String name, double width, double length){
		super(name, width, length);
	}
	
	@Override
	public double computeArea() {
		return this.getWidth() * this.getLength();
	}
	
	public String toString() {
		return "Object name: " + this.getObjName() + "\nLength: " + this.getLength() + "\nWidth: " + this.getWidth()
		+ "\nArea: " + this.computeArea();
	}
}
