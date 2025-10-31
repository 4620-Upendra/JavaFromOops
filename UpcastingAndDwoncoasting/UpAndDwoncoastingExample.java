package UpcastingAndDwoncoasting;

class Parent{
	void show() {
		System.out.println("parent show method");
	}
}

class Child extends Parent{
	
	@Override
	void show() {
		System.out.println("child show method");
	}
	
	void display() {
		System.out.println("Child display method");
	}
}

public class UpAndDwoncoastingExample {
	public static void main(String[] args) {
		//1)Upcasting: Child object → Parent reference variable
		Parent parentRef=new Child();
		parentRef.show();        // Calls Child show() (Runtime Polymorphism)
		// parentRef.display();  // Not allowed  ( with Parent reference) we only accesses parent methods with parentreference
		
		//2)Downcasting: Parent reference → Child reference
		
		// Safe Downcasting using instanceof
		if(parentRef instanceof Child) {    // Check before downcasting
			Child c=(Child)parentRef;        // Downcasting only if it's truly Child
			c.show();         // Calls Child show()
			c.display();     // Now accessible after downcasting
		}else {
			System.out.println("Downcasting not possible");
		}
		
	}

}
