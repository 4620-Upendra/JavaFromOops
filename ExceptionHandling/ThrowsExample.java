package ExceptionHandling;

public class ThrowsExample {

    public static void main(String[] args) throws Exception {  
        // Exception Propagation:
        // When testMethod() throws an exception and main() does not handle it using try-catch,
        // the exception is propagated (passed) to main() method.
        // Propagation means exception moves up the call stack until handled. 
    	//then the Default Exception Handler of JVM will handle it.
        
        testMethod();
        System.out.println("Main method executed without try-catch");
    }

    static void testMethod() throws Exception {    
        // Ducking an Exception:
        // When a method does not handle the exception and instead uses 'throws' keyword 
        // to pass the responsibility to the calling method, it is called Exception Ducking.
        // Meaning: "I am not handling it here, let caller handle it."

        throw new Exception("Exception thrown from testMethod");
    }
}
