
public class Student {

	private String firstName;
	private String lastName;
	private int gradeLevel;
	private double gpa;
	
	public Student(String firstName, String lastName, int gradeLevel, double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getGradeLevel() {
		return this.gradeLevel;
	}

	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	public String toString() {
		String returnString = "";
		returnString += this.getLastName() + ", " + this.getFirstName();
		returnString += "\nGrade " + this.getGradeLevel();
		returnString += "\nGPA: " + this.getGPA() + "\n";
		return returnString;
	}
	
}