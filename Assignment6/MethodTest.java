package Assignment6;

import java.util.ArrayList;

public class MethodTest {

	public static <T> void main(String[] args) {

		ArrayList<String> strList = new ArrayList<String>();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<Double> doubleList = new ArrayList<Double>();
		
		strList.add("Hello");
		strList.add("Star");
		strList.add("Birds");
		strList.add("Starving");
		strList.add("Hailee Stainfeld");
		
		intList.add(1);
		intList.add(90);
		intList.add(18);
		intList.add(0);
		intList.add(54);
		intList.add(101);
		
		doubleList.add(1.1);
		doubleList.add(7.94);
		doubleList.add(34.2);
		doubleList.add(5.4);
		doubleList.add(23.1);
		doubleList.add(4.4);
		doubleList.add(23.9);
		doubleList.add(3.3);

		System.out.print("String list ");
		count(strList);
		System.out.print("Integer list ");
		count(intList);
		System.out.print("Double list ");
		count(doubleList);

	}
	
	public static <T> void count(ArrayList<T> list) {
		System.out.print("contains " + list.size() + " elements.\n");
	}

}
