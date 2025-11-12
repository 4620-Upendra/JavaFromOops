package FinalKeyword;

final class Vehicle {  // Final class - cannot be inherited
    final static int MAX_SPEED = 180;  // Assigned at declaration
    final int mileage;                 // Assigned in non-static block
    final static String COMPANY;       // Assigned in static block

    // static block to assign static final variable
    static {
        COMPANY = "Honda";
    }

    // non-static block to assign non-static final variable
    {
        mileage = 25;
    }

    // final non-static method
    final void displayMileage() {
        System.out.println("Mileage: " + mileage);
    }

    // Overloading final method (same name, different parameters)
    final void displayMileage(String model) {
        System.out.println("Model: " + model + " | Mileage: " + mileage);
    }

    // final static method
    static final void displaySpeed() {
        System.out.println("Company: " + COMPANY + " | Max Speed: " + MAX_SPEED);
    }
}

public class Main {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();

        // Calling final methods
        v.displayMileage();
        v.displayMileage("City"); // Overloaded method
        Vehicle.displaySpeed();   // Calling static final method
    }
}
