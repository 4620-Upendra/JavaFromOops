package TypesOfConstructors;

class StudentCopy {
    int id;
    String name;

    StudentCopy(int i, String n) { // Parameterized constructor
        id = i;
        name = n;
    }

    // Copy constructor
    StudentCopy(StudentCopy s) {
        id = s.id;
        name = s.name;
        System.out.println("Copy constructor called");
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class CopyConstructor {

	public static void main(String[] args) {
		 StudentCopy s1 = new StudentCopy(103, "Kumar");
	     StudentCopy s2 = new StudentCopy(s1); // Calls copy constructor
	     s2.display();

	}

}
