
package Assignment2_5;

public class Animal{
	private String type;
	 private String name;
	 private int age;
	 private char gender;
	 private String home;
	 private int speed;
	 
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
		 System.out.println("moving");
	 }
	 
	 public void sound() {
		 System.out.println("sound");
	 }
	 
	 public void eat() {
		 System.out.println("Eating");
	 }
	 
	 public void sleep() {
		 System.out.println("sleeping");
	 }
	 
	 public String toString() {
		 return "\nType: " + getType() + "\nName: " + getName() + "\nAge: " + getAge()
		 + "\nGender: " + getGender() + "\nHome: " + getHome() + "\nSpeed: " + getSpeed() + "mph";
	 }
}