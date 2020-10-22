package Assignment5;

import java.util.*;

public class ListManipulator {
	
	public ArrayList<Integer> sort(ArrayList<Integer> myLst, boolean ascending){
		
		Collections.sort(myLst);
		
		if(!ascending)
			Collections.reverse(myLst);
		
		return myLst;
	}
	
	public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst){
		
		Integer max = myLst.get(0);
		Integer min = myLst.get(0);
		for(int i = 0; i < myLst.size(); i++) {
			if(myLst.get(i) > max) {
				max = myLst.get(i);
			}
			if(myLst.get(i) < min) {
				min = myLst.get(i);
			}
		}
		myLst.add(myLst.indexOf(max), min);
		myLst.remove(max);
		myLst.add(myLst.indexOf(min), max);
		myLst.remove(min);
		
		return myLst;
	}
	
	public void table(ArrayList<Integer> myLst) {
		
		Collections.sort(myLst);
		
		int counter;
		System.out.println("\nThe number of appearance of each element in myLst:");
		for(int i = 0; i < myLst.size(); i++) {
			counter = 1;
			for(int j = i+1; j < myLst.size(); j++) {
			if(myLst.get(i) == myLst.get(j)) {
				counter++;
			}
			}
			System.out.println(myLst.get(i) + ": " + counter);
			i += counter-1;
		}
	}
}
