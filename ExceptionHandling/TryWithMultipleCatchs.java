package ExceptionHandling;

public class TryWithMultipleCatchs {

	public static void main(String[] args) {
		
		try {
			String s=null;
			System.out.println(s.length());  // NullPointerException
		} 
		catch(ArithmeticException e) {       // child
			System.out.println(e);
		} 
		catch(NullPointerException e) {     // child
			System.out.println(e);
		}
		catch(RuntimeException e) {         //parent
			System.out.println(e);
		}
		catch(Exception e) {              //Grandparent
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block executed");
		}
		
		System.out.println("Program executed successfully");
	}

}
