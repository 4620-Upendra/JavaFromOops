package InnerClasses;

class Outer2{
	private int number=20;
	
	static class Inner{
		static void show() {
			Outer2 outer=new Outer2();   //For Accessing non-static member because we cannot directly access non static members from static method
			System.out.println("Accessing non-static member "+outer.number);
			System.out.println("Hello from Static Nested class");
		}
	}
}
public class StaticNestedClass {
	public static void main(String[] args) {
		Outer2.Inner.show();
	}

}
