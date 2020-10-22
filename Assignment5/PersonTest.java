package Assignment5;

import java.util.*;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("Joe", "Smith", 40));
		list.add(new Person("Amy", "Gold", 32));
		list.add(new Person("Tony", "Stork", 21));
		list.add(new Person("Sean", "Irish", 24));
		list.add(new Person("Tina", "Brock", 28));
		list.add(new Person("Lenny", "Hep", 18));

		System.out.println("\nAscending list sorted based on Age:");
		list.sort((Person p1, Person p2)->p1.getAge() - (p2.getAge()));
		list.forEach((s)-> System.out.println(s));
		
		System.out.println("\nDescending list sorted based on Age:");
		list.sort((Person p1, Person p2)->p2.getAge() - p1.getAge());
		list.forEach((s)-> System.out.println(s));
		
		System.out.println("\nAscending list sorted based on first name:");
		list.sort((Person p1, Person p2)->p1.getFirstName().compareTo(p2.getFirstName()));
		list.forEach((s)-> System.out.println(s));
		
		System.out.println("\nDescending list sorted based on first name:");
		list.sort((Person p1, Person p2)->p2.getFirstName().compareTo(p1.getFirstName()));
		list.forEach((s)-> System.out.println(s));
		
		System.out.println("\nAscending list sorted based on length of last name:");
		list.sort((Person p1, Person p2)->p1.getLastName().length() - p2.getLastName().length());
		list.forEach((s)-> System.out.println(s));
		
		System.out.println("\nDescending list sorted based on length of last name:");
		list.sort((Person p1, Person p2)->p2.getLastName().length() - p1.getLastName().length());
		list.forEach((s)-> System.out.println(s));
		
		

	}

}
