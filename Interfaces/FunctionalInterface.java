package Interfaces;

interface MyFunctionalInterface {
    void execute();   // Single Abstract Method

    default void show() {}
    static void util() {}
}

public class FunctionalInterface {
	public static void main(String[] args) {
		MyFunctionalInterface obj = new MyFunctionalInterface() {
            @Override
            public void execute() {
                System.out.println("Executing using anonymous inner class");
            }
        };

        obj.execute();


	}

}
