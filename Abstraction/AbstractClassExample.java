package Abstraction;

abstract class Animal{
	//abstract method
	abstract void sound();     
	
	// normal method
	void sleep() {          
		System.out.println("Animal is sleeping");
	}
}

class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("Dog barks: Woof Woof");
	}
}

public class AbstractClassExample {
	public static void main(String[] args) {
		Animal a=new Dog();     //upcasting
		a.sound();          // abstract method implemented in Dog class
		a.sleep();          //normal method from abstract class

	}

}
