package Interfaces;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.Function;

public class PredefinedFunctionaLInterface {
	public static void main(String[] args) {
		 // Consumer
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println("Consumed: " + value);
            }
        };
        consumer.accept("Hello");

        // Supplier
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 10;
            }
        };
        System.out.println("Supplied: " + supplier.get());

        // Predicate
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };
        System.out.println("Is Even? " + predicate.test(14));

        // Function
        Function<Integer, String> function = new Function<Integer, String>() {
            @Override
            public String apply(Integer n) {
                return "Value is " + n;
            }
        };
        System.out.println(function.apply(25));
	}

}
