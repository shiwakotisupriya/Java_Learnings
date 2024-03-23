package Array2d;
import java.util.Scanner;
public class Student_Marks {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int numStudents = 3;
	        int numSubjects = 3;

	        int[][] marks = new int[numStudents][numSubjects];

	        // Input marks for each student and subject
	        for (int i = 0; i < numStudents; i++) {
	            System.out.println("Enter marks for student " + (i + 1) + ":");
	            for (int j = 0; j < numSubjects; j++) {
	                System.out.print("Subject " + (j + 1) + ": ");
	                marks[i][j] = scanner.nextInt();
	            }
	        }

	        // Calculate total marks for each student
	        int[] totalMarks = new int[numStudents];
	        for (int i = 0; i < numStudents; i++) {
	            int total = 0;
	            for (int j = 0; j < numSubjects; j++) {
	                total += marks[i][j];
	            }
	            totalMarks[i] = total;
	        }

	        // Display total marks for each student
	        System.out.println("\nTotal marks obtained by each student:");
	        for (int i = 0; i < numStudents; i++) {
	            System.out.println("Student " + (i + 1) + ": " + totalMarks[i]);
	        }
	        scanner.close();
	    }
	    
	}



