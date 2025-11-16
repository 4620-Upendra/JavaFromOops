package InnerClasses;

class Outer1{
	private String message="Hello from member (non-static) Inner class ";
	
	class Inner{
		void display() {
			System.out.println(message);
		}
	}
}
public class NonStaticInnerClass {
	public static void main(String[] args) {
		Outer1 outer =new Outer1();
		Outer1.Inner inner=outer.new Inner();
		inner.display();
	}

}
