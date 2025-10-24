package TypesOfConstructors;

class StudentZero {
    int id;
    String name;

    // User-defined zero-parameter constructor
    StudentZero() {
        id = 101;
        name = "ZeroParam";
        System.out.println("Zero-parameter constructor called");
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
public class NoParameterConstructor {

	public static void main(String[] args) {
		 StudentZero s = new StudentZero(); // Calls user-defined zero-parameter constructor
	        s.display();

	}

}
