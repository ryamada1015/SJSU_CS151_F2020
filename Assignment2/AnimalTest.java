
package Assignment2_5;

public class AnimalTest {
	public static void main(String args[]) {
		
		Dog dog = new Dog("Canis", "Dog", 10, 'M', "Yard", 20);
		System.out.println(dog);
		dog.greetHuman();
		dog.walk();
		
		Cat cat = new Cat("Felidae", "Cat", 5, 'F', "House", 5);
		System.out.println(cat);
		cat.scratch();
		
		Racoon racoon = new Racoon("Procyonidae", "Racoon", 6, 'M', "Forest", 10);
		System.out.println(racoon);
		racoon.scratch();
		
		Whale whale = new Whale("Cetacea", "Whale", 2, 'F', "Ocean", 9);
		System.out.println(whale);
		whale.swim();
	}
}
