package myMVC;

public class StudentView {  // view class
	public void displayStudentDetails(int id,String name, String email) {
		System.out.println("****STUDENT DETAILS****");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
	}
}
