package Abstraction;

public class Main {
	 public static void main(String[] args) {
	     Animal dog = new Dog();
	     dog.makeSound();
	     dog.sleep();

	     Animal cat = new Cat();
	     cat.makeSound();
	     cat.sleep();
	     
	     Cow c1 = new Cow();
	     c1.makeSound();
	     c1.sleep();
	 }
}
