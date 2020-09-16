
package Assignment2_5;

class Cat extends Animal implements Scratcher {
	
	 public Cat(String type, String name, int age, char gender, String home, int speed) {
		 setType(type);
		 setName(name);
		 setAge(age);
		 setGender(gender);
		 setHome(home);
		 setSpeed(speed);
	 }
	 
	 public void scratch() {
		 System.out.println("Scratching");
	 }

}