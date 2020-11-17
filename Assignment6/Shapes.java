package Assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Shapes<T extends Shape> {

	private ArrayList<T> shapeList;
	
	Shapes(ArrayList<T> shapeList){
		this.shapeList = shapeList;
	}
	
	public ArrayList<T> getList(){
		return this.shapeList;
	}
	
	public void setList(ArrayList<T> shapeList) {
		this.shapeList = shapeList;
	}
	
	public void add(T obj) {
		shapeList.add(obj);
	}
	
	public void remove(T obj) {
		shapeList.remove(obj);
	}
	
	synchronized public void compute() {
		for(T obj:shapeList) {
			System.out.println(obj);
		}
		System.out.println("\nMax area: " + this.max() + "\nMin area: " + this.min());
	}
	
	public double max() {
		return Collections.max(shapeList, new Comparator<T>() {
			public int compare(T obj1, T obj2) {
				return Double.compare(obj1.computeArea(), obj2.computeArea());
			}
		}).computeArea();
	}
	
	public double min() {
		return Collections.min(shapeList, new Comparator<T>() {
			public int compare(T obj1, T obj2) {
				return Double.compare(obj1.computeArea(), obj2.computeArea());
			}
		}).computeArea();
	}
}
