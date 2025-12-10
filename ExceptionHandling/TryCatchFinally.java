package ExceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		try {
			int result=10/0;       // risky code
		}
		catch(ArithmeticException e) {
			 System.out.println(e);
			 System.out.println("Exception caught: Cannot divide by zero");
		}
		finally {
			System.out.println("finally block executed");		
		}

		System.out.println("Program continues...");
	}

}
