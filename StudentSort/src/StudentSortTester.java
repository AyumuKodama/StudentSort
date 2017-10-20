
public class StudentSortTester {
	
	public static void main(String[] args) {
		StudentList roster = new StudentList();
		System.out.println("\nORIGINAL");
		System.out.println(roster.toString());
		roster.bubbleSort();
		System.out.println("\nSORTED");
		System.out.println(roster.toString());
	}
}