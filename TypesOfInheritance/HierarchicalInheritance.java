package TypesOfInheritance;

class Vehicle {
    void start() {
        System.out.println("Vehicle starts...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives...");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike rides...");
    }
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		System.out.println("type 3:Hierarchical Inheritance");
		System.out.println("");
		
		Car c=new Car();
		Bike b=new Bike();
		
		c.start();
		c.drive();
		
		b.start();
		b.ride();
	}

}
