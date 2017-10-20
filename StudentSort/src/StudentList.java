import java.util.*;

public class StudentList {
	
	private Student[] list;
	
	public StudentList() {
		Scanner scnr = new Scanner(System.in);
		int numStudents;
		String last, first;
		int grade;
		double gpa;
		System.out.print("How many students? ");
		numStudents = scnr.nextInt();
		list = new Student[numStudents];
		for (int i = 0; i < numStudents; i++) {
			System.out.println();
			System.out.println("STUDENT " + (i + 1) + "...");
			System.out.println("Last Name: ");
			last = scnr.next();
			System.out.println("First Name: ");
			first = scnr.next();
			System.out.println("Grade Level: ");
			grade = scnr.nextInt();
			System.out.println("GPA: ");
			gpa = scnr.nextDouble();
			list[i] = new Student(first, last, grade, gpa);
		}
		scnr.close();
	}
	
	public String toString() {
		String outString = "";
		for (Student stu : list) {
			outString += stu.toString();
		}
		outString += "\n";
		return outString;
	}
	
	public void bubbleSort() {
		int size = list.length;
		String tempFirstName;
		String tempLastName;
		int tempGradeLevel;
		double tempGPA;
		for (int i = size - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (list[j].getLastName().compareTo(list[j + 1].getLastName()) > 0) {
					tempFirstName = list[j].getFirstName();
					tempLastName = list[j].getLastName();
					tempGradeLevel = list[j].getGradeLevel();
					tempGPA = list[j].getGPA();
					
					list[j].setFirstName(list[j + 1].getFirstName());
					list[j].setLastName(list[j + 1].getLastName());
					list[j].setGradeLevel(list[j + 1].getGradeLevel());
					list[j].setGPA(list[j + 1].getGPA());
					
					list[j + 1].setFirstName(tempFirstName);
					list[j + 1].setLastName(tempLastName);
					list[j + 1].setGradeLevel(tempGradeLevel);
					list[j + 1].setGPA(tempGPA);
				}
			}
		}
	}

}