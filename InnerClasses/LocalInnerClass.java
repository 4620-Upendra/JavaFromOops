package InnerClasses;

class Outer3{
	void printMessage() {
		class LocalInner{
			void message() {
				System.out.println("Hello from local Inner class");
			}
		}
		LocalInner obj=new LocalInner();
		obj.message();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		Outer3 outer=new Outer3();
		outer.printMessage();
	}

}
