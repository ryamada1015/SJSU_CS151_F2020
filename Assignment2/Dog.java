 
package Assignment2_5;


public class Dog extends Animal implements Domesticated {
	 
	 public Dog(String type, String name, int age, char gender, String home, int speed) {
		 setType(type);
		 setName(name);
		 setAge(age);
		 setGender(gender);
		 setHome(home);
		 setSpeed(speed);
	 }
	 
	 
	 public void walk() {
		 System.out.println("Walking");
	 }
	 
	 public void greetHuman() {
		 System.out.println("Woof!");
	 }
	 
	 public void bark() {
		 System.out.println("Barking");
	 }
}