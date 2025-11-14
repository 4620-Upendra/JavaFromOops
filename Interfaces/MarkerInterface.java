package Interfaces;

interface MyMarker {}

class Student implements MyMarker {
    void display() {
        System.out.println("Marker interface example");
    }
}
public class MarkerInterface {
	public static void main(String[] args) {
		Student s = new Student();
        s.display();

	}

}
