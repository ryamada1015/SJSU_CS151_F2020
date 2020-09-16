
package Assignment2_5;

public class Whale extends Animal implements Swimmer {
	 
	 public Whale(String type, String name, int age, char gender, String home, int speed) {
		 setType(type);
		 setName(name);
		 setAge(age);
		 setGender(gender);
		 setHome(home);
		 setSpeed(speed);
	 }
	 
	 
	 public void swim() {
		 System.out.println("Swimming");
	 }
}