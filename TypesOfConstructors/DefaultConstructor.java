package TypesOfConstructors;

class Student {
    int id;
    String name;

    // No constructor defined → compiler provides default constructor and assign default values 
}

public class DefaultConstructor {

	public static void main(String[] args) {
		Student student1=new Student();
		System.out.println("ID:"+student1.id);
		System.out.println("name:"+student1.name);

	}

}
