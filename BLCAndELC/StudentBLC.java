package BLCAndELC;

//Business Logic Class (BLC)
public class StudentBLC {
	
	// Method to calculate grade based on marks
    public String calculateGrade(int marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 75) return "A";
        else if (marks >= 60) return "B";
        else return "C";
    }
}
