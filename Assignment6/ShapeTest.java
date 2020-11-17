package Assignment6;

import java.io.*;
import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {

		ArrayList<Shape> shapeArr = new ArrayList<Shape>();
		Shapes shapeList = new Shapes(shapeArr);
				
		shapeList.add(new Triangle("Triangle1", 10, 20));
		shapeList.add(new Triangle("Triangle2", 3.1, 7.5));
		shapeList.add(new Circle("Circle1", 15));
		shapeList.add(new Circle("Circle2", 4.7));
		shapeList.add(new Rectangle("Rectangle1", 1, 5));
		shapeList.add(new Rectangle("Rectangle2", 39, 100));
		shapeList.add(new Hexagon("Hexagon1", 18));
		shapeList.add(new Hexagon("Hexagon2", 2));
				
		new Thread() {
			public void run() {
				shapeList.compute();
			}
		}.start();
		
		new Thread() {
			public void run() {
				shapeList.compute();
			}
		}.start();
	
		for(int i = 1; i < 9; i++) {
			try {
				String fileName = "obj" + i;
				FileOutputStream streamOut = new FileOutputStream("./" + fileName + ".ser");
				ObjectOutputStream objectOutput = new ObjectOutputStream(streamOut);
				objectOutput.writeObject(shapeArr.get(i-1));
				objectOutput.close();
				streamOut.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
	
	}
}
