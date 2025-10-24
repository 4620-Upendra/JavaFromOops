package TypesOfConstructors;

class StudentParam {
    int id;
    String name;

    // Parameterized constructor
    StudentParam(int i, String n) {
        id = i;
        name = n;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}


public class ParameterizedConstructor {

	public static void main(String[] args) {
		StudentParam s = new StudentParam(102, "Upendra");
        s.display();

	}

}
