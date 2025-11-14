package Interfaces;

interface Vehicle {
    int wheels = 4;    // public static final

    void start();      // abstract method

    default void info() {    // default method (Java 8+)
        System.out.println("This is a vehicle");
        helper();   // calling private method
    }

    static void service() {  // static method (Java 8+)
        System.out.println("Vehicle service");
    }

    private void helper() {  // private method (Java 9+)
        System.out.println("Helper");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starting");
    }
}


public class NormalInterface {
	public static void main(String[] args) {
		  Car c = new Car();
	      c.start();
	      c.info();
	      Vehicle.service();

	}

}
