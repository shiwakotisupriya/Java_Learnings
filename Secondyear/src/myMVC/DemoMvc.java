package myMVC;

public class DemoMvc {

	public static void main(String[] args) {
		//fetch student records 
		Student model= fetchStudentDetails();  // object of model
		
		StudentView view = new StudentView(); // object of view
		
		StudentController controller = new StudentController(view,model); // object of controller
		
		controller.updateStudent();  // to update student
		 
		controller.setStudentName("Europe");
		controller.setStudentId(12);
		controller.setStudentEmail("eurokids@gmail.com");
		
		System.out.println("After update Details as follows");
		controller.updateStudent();

	}
	
	

	private static Student fetchStudentDetails() {
		
		Student student = new Student();
		student.setId(11);
		student.setName("Satakshi");
		student.setEmail("sat@gmail.com");
		return student;
	}

}
