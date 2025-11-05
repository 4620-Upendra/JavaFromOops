package Encapsulation;

class Person{
	// private variables (data hiding)
	private String name;
	private int age;
	
	// setter: write/modify data
	public void setName(String name) {
		this.name = name;
	}
	 // Setter for age with validation
	public void setAge(int age) {
		if(age>0) {
			this.age=age;		
		}else {
			System.out.println("Age must be positive");
		}
	}
	// getter: read data
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class Main {
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Uppi");
		p.setAge(21);
		
		System.out.println("Name:"+p.getName());
		System.out.println("age:"+p.getAge());

	}

}
