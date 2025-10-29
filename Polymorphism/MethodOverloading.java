package Polymorphism;


class Calculator{
	
	//same method name,different parameter list(type/number)
	int add(int a,int b) {
		return a+b;
	}
	
	double add(double a,double b) {   // primitive widening
		return a+b;
	}
	
	Integer add(Integer a) {     //autoboxing
		return a+10;
	}
}


public class MethodOverloading {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		
		System.out.println(c.add(5, 10));       // exact match (int, int)
		System.out.println(c.add(5.5, 2.3));   // calls add(double, double)
	    System.out.println(c.add(20));         // autoboxing (Integer)
	    System.out.println(c.add(5.1f, 2.2f));  
	 // No exact match (float, float) then calls add(double,double)) float->double  (primitive widening)
	}

}
