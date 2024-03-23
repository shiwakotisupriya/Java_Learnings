package myMVC;


public class StudentController {
	private StudentView sv;  // datatype should be same as view class
	private Student sm;  // datatype should be same as model class
	
	public StudentController(StudentView sv, Student sm) {  // parameterized controller for StudentController class
		this.sv=sv;
		this.sm=sm;
	}
	
	public int getStudentId() {
	return sm.getId();
	
	}
	
	public void setStudentId(int id) {
		sm.setId(id);
	}
	
	public String getStudentName() {
		return sm.getName();
		
	}
		
	public void setStudentName(String name) {
		sm.setName(name);
	}
	
	public String getStudentEmail() {
		return sm.getEmail();
		
	}
		
	public void setStudentEmail(String email) {
		sm.setEmail(email);
	}
	
	public void updateStudent() {
		sv.displayStudentDetails(sm.getId(), sm.getName(), sm.getEmail());  //displayStudentDetails is from StudentView class
	}
	
}
