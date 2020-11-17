package Assignment6;

public class Triangle extends Shape {

	private double height;
	
	Triangle(String name, double height, double width){
		super(name, 0, width);
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double computeArea() {
		return this.height * this.getWidth() / 2;
	}
	
	public String toString() {
		return "Object name: " + this.getObjName() + "\nHeight: " + this.height + "\nWidth: " + this.getWidth()
		+ "\nArea: " + this.computeArea();
	}
}
