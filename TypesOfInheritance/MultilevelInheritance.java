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

class ElectricCar extends Car{
	void charge() {
		System.out.println("ElectricCar is charging");
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		System.out.println("type 2:Multilevel Inheritance");
		ElectricCar e=new ElectricCar();
		e.start();
		e.drive();
		e.charge();
	}

}
