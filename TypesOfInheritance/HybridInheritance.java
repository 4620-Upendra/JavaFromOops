package TypesOfInheritance;

interface Engine{
	void engineType();
}
interface Vehicle2 extends Engine{   //single inheritances
	void start();
}
interface Flyable1{
	void fly();
}

class SmartCar implements Vehicle2, Flyable1{
	@Override
	public void engineType() {
		System.out.println("Electric Engine");
	}
	@Override
	public void start() {
		System.out.println("Smartcar starts");
	}
	@Override
	public void fly() {
		System.out.println("Smartcar flies");
	}
}
public class HybridInheritance {
	public static void main(String[] args) {
		System.out.println("type 5:Hybrid Inheritance");
		System.out.println("");
		SmartCar sc=new SmartCar();
		sc.engineType();
		sc.start();
		sc.fly();
	}

}
