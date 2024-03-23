package namiStud;

public class StudentController {
	private StudentView v;
	private Student m;

	
	public StudentController(StudentView sv, Student mod) {
		this.v=sv;
		this.m=mod;
	}

	//Getter for view
	public StudentView getV() {
		return v;
	}
	//Setter for View
	public void setV(StudentView sbv) {
		this.v=sbv;
	}
	//Getting for model
	public Student getM() {
		return m;
	}
	//setter for model
	public void setM(Student moo) {
		this.m=moo;
	}
	public void updateView() {
		v.displayDetails(m.getName(), m.getAge(), m.getName());
	}
	/*
	public String getName() {
		return name;
	}
	public void setName(String stname) {
		this.name = stname;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int ageee) {
		this.age=ageee;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	*/

}
