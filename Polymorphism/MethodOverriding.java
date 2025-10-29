package Polymorphism;

class Animal {
	Animal getAnimal() {
		return new Animal();
	}
	
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
	@Override
	Dog getAnimal() {      // Covariant return type: returning Dog instead of Animal
		return new Dog();
	}
    @Override
    void sound() {
        System.out.println("Dog barks");

    }
}
    
public class MethodOverriding {
	public static void main(String[] args) {
		Animal a=new Dog();    // upcasting
		a.sound();             // calls Dog's sound() (runtime polymorphism)
		
		Dog d=new Dog();
		d.getAnimal().sound();   // covariant return type example

	}

}
