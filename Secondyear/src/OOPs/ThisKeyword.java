package OOPs;

public class ThisKeyword {
	public static void main(String[] args) {
		Student1 ref =new Student1(1, "Supriya");
		ref.display();
		
	}

}
class Student1{
	int id;
	String name;
	Student1 (int sid, String sname){ //constructor 
		this.id=sid;
		this.name=sname;		
	}
	
	void display() {
		System.out.println("Student id: "+id);
		System.out.println("Student id: "+name);
	}
		
}
