package TypesOfInheritance;

class Vehicle{
	void start() {
		System.out.println("Vehicle is starting");	
	}
}

class Car extends Vehicle{
	void drive() {
		System.out.println("Car is driving");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		System.out.println("type 1:Single Inheritance");
		Car c=new Car();
		c.start();
		c.drive();

	}

}
