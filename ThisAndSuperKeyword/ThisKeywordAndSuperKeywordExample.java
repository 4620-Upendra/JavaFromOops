package ThisAndSuperKeyword;

class Parent{
	String name="parent";
	
	Parent(){
		System.out.println("Parent Constructor");
	}
	void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent{
	String name="Child";
	 Child() {
		 super();              // calls Parent constructor
	 }
	 
	 void display() {
	        System.out.println(super.name);   // accessing parent name variable
	        super.show();                     // calling parent show method
	        System.out.println(this.name);    // accessing current class name variable
	        this.print();                     // calling current class print method
	 }
	 void print() {
	        System.out.println("Child print()");
	 }
}

public class ThisKeywordAndSuperKeywordExample {
	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
	}

}
