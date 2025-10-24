package TypesOfConstructors;

class StudentChain {
    int id;
    String name;

    // Parameterized constructor
    StudentChain(int i) {
        id = i;
        name = "Chained";
        System.out.println("Parameterized constructor called");
    }

    // Constructor chaining
    StudentChain(String n) {
        this(999); // Calls parameterized constructor above
        name = n;
        System.out.println("Constructor chaining called");
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

}


public class ConstructorChaining {

	public static void main(String[] args) {
		 StudentChain s = new StudentChain("Upendra"); // Calls constructor chaining
	     s.display();

	}

}
