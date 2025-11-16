package LambdaExpression;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.Function;

public class LambdaAllExamples {

	public static void main(String[] args) {

        // Consumer Example
        Consumer<String> consumer = name -> System.out.println("Hello " + name);
        consumer.accept("Uppi");
        
        // Supplier Example
        Supplier<String> supplier = () -> "Hello from Supplier Lambda";
        System.out.println(supplier.get());

        // Predicate Example
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("10 is even: " + isEven.test(10));
        System.out.println("7 is even: " + isEven.test(7));
        
        // Function Example
        Function<Integer, Integer> square = num -> num * num;
        System.out.println("Square of 6: " + square.apply(6));

       

        

	}

}
