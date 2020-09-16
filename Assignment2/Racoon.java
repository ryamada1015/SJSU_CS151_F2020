
package Assignment2_5;

class Racoon extends Animal implements Scratcher {
	
	 public Racoon(String type, String name, int age, char gender, String home, int speed) {
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