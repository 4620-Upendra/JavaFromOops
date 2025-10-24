package TypesOfConstructors;

class Person {
    int id;
    String name;

    // 1) No-parameter constructor
    Person() {
        id = 0;
        name = "Unknown";
        System.out.println("No-parameter constructor called");
    }

    // 2) Parameterized constructor with one parameter
    Person(int i) {
        id = i;
        name = "Unknown";
        System.out.println("Parameterized constructor with one parameter called");
    }

    // 3) Parameterized constructor with two parameters
    Person(int i, String n) {
        id = i;
        name = n;
        System.out.println("Parameterized constructor with two parameters called");
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Person p1 = new Person();             // Calls no-parameter constructor
        p1.display();

        Person p2 = new Person(101);          // Calls parameterized constructor with one parameter
        p2.display();

        Person p3 = new Person(102, "Upendra"); // Calls parameterized constructor with two parameters
        p3.display();
	}

}
