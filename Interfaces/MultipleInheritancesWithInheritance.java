package Interfaces;

interface A {
    void m1();
}

interface B {
    void m1();
}

class Test implements A, B {

    @Override
    public void m1() {
        System.out.println("m1 implemented from both A and B");
    }
}

public class MultipleInheritancesWithInheritance {
	public static void main(String[] args) {
		 Test t = new Test();
	     t.m1();

	}

}
