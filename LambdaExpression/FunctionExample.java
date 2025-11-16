package LambdaExpression;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<Integer,Integer> square=num->num*num;
		System.out.println("Square of 6:"+square.apply(6));
	}

}
