 
package Assignment2_5;

interface Animal {
	void move();
	void sound();
	void eat();
	void sleep();
	String toString();
}

interface Domesticated {
	void walk();
	void greetHuman();
}

interface Scratcher {
	void scratch();
}

interface Swimmer {
	void swim();
}

public class Dog implements Animal, Domesticated {
	 private String type;
	 private String name;
	 private int age;
	 private char gender;
	 private String home;
	 private int speed;
	 
	 public Dog(String type, String name, int age, char gender, String home, int speed) {
		 setType(type);
		 setName(name);
		 setAge(age);
		 setGender(gender);
		 setHome(home);
		 setSpeed(speed);
	 }
	 
	 void setType(String type) {
		 this.type = type;
	 }
	 
	 private String getType() {
		 return this.type;
	 }
	 
	 void setName(String name) {
		 this.name = name;
	 }
	 
	 private String getName() {
		 return this.name;
	 }
	 
	 void setAge(int age) {
		 this.age = age;
	 }
	 
	 private int getAge() {
		 return this.age;
	 }
	 
	 void setGender(char gender) {
		 this.gender = gender;
	 }
	 
	 private char getGender() {
		 return this.gender;
	 }
	 
	 void setHome(String home) {
		 this.home = home;
	 }
	 
	 private String getHome() {
		 return this.home;
	 }
	 
	 void setSpeed(int speed) {
		 this.speed = speed;
	 }
	 
	 private int getSpeed() {
		 return this.speed;
	 }
	 
	 public void move() {
		 System.out.println("Dog moving");
	 }
	 
	 public void sound() {
		 System.out.println("arf-arf");
	 }
	 
	 public void eat() {
		 System.out.println("Eating dog food");
	 }
	 
	 public void sleep() {
		 System.out.println("sleeping");
	 }
	 
	 public String toString() {
		 return "\nType: " + getType() + "\nName: " + getName() + "\nAge: " + getAge()
		 + "\nGender: " + getGender() + "\nHome: " + getHome() + "\nSpeed: " + getSpeed() + "mph";
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