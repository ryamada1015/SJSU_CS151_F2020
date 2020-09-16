
package Assignment2_5;

public class Whale implements Animal, Swimmer {
	private String type;
	 private String name;
	 private int age;
	 private char gender;
	 private String home;
	 private int speed;
	 
	 public Whale(String type, String name, int age, char gender, String home, int speed) {
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
		 System.out.println("Whale moving");
	 }
	 
	 public void sound() {
		 System.out.println("none");
	 }
	 
	 public void eat() {
		 System.out.println("Eating small fish");
	 }
	 
	 public void sleep() {
		 System.out.println("sleeping");
	 }
	 
	 public String toString() {
		 return "\nType: " + getType() + "\nName: " + getName() + "\nAge: " + getAge()
		 + "\nGender: " + getGender() + "\nHome: " + getHome() + "\nSpeed: " + getSpeed() + "mph";
	 }
	 
	 public void swim() {
		 System.out.println("Swimming");
	 }
}