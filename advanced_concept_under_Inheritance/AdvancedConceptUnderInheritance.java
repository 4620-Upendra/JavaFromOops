package advanced_concept_under_Inheritance;

class Parent{
	public void show() {
		System.out.println("parent show method");
	}
	public static void display() {
		System.out.println("parent static display method");
	}
	public void greet(String name) {
		System.out.println("hello "+ name +" from parent");
	}
}

class Child extends Parent{
	
	//Method Overriding with(same name, parameters, return type(should same))
	@Override
	public void show() {
		System.out.println("child show method - Overridden method");
	}
	
	//static method hiding
	public static void display() {
		System.out.println("child static display method - hidden method");
	}
	
	//method overloading with(same name,different parameter) and return type(can different)
	public  void greet(String name,int times) {
		 for (int i = 1; i <= times; i++) {
	            System.out.println("Hello " + name + " from Child - " + i);
	        }
	}
}

public class AdvancedConceptUnderInheritance {
	public static void main(String[] args) {
		 Parent p = new Child();
	     Child c = new Child();
	     
	   // Method Overriding → runtime (dynamic binding)
	     p.show();
	     
	  // Static Method Hiding → compile time (based on reference type)
	     p.display();
	     c.display();
	     
	  // Method Overloading → compile time
	     c.greet("Upendra");
	     c.greet("Upendra", 3);
	}

}
