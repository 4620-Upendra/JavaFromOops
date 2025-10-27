package TypesOfInheritance;

interface Vehicle1{
	void start();
}

interface Flyable{
	void fly();
}

class FlyingCar implements Vehicle1,Flyable{
	@Override
	public void start() {
		System.out.println("FlyingCar starts");
	}
	@Override
	public void fly() {
		System.out.println("FlylingCar is flying");
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		System.out.println("type 4:Multiple Inheritance");
		System.out.println("");
		FlyingCar fc=new FlyingCar();
		fc.start();
		fc.fly();
	}

}
