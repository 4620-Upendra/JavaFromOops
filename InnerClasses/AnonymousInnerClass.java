package InnerClasses;

interface Greeting{
	void sayHello();
}

public class AnonymousInnerClass {
	
	public static void main(String[] args) {
		Greeting greet=new Greeting() {      //Anonymous Inner Class
			public void sayHello() {
				System.out.println("Hello from Anonymous Inner Class");
			}
		};
		
		greet.sayHello();
	}

}
