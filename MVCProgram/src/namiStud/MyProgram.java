package namiStud;

public class MyProgram {

	public static void main(String[] args)
	{
		Student model = retriveStudentFromDatabase();

		StudentView view = new StudentView();

		StudentController controller = new StudentController(view, model);

		controller.updateView();

		controller.setName("Sujana Neupane");

		controller.updateView();
	}

	private static Student retriveStudentFromDatabase()
	{
		Student student = new Student();
		student.setName("Mahmud Ansari");
		student.setAge(15);
		return student;
	}



}
