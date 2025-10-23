package BLCAndELC;

//Executive Logic Class (ELC)
public class StudentELC {

	 public static void main(String[] args) {
	        // Create BLC object to access business logic
	        StudentBLC blc = new StudentBLC();

	        // Sample data
	        int marks = 82;

	        // Execute logic using BLC
	        String grade = blc.calculateGrade(marks);

	        // Display result
	        System.out.println("Student Marks: " + marks);
	        System.out.println("Grade: " + grade);
	    }
}
