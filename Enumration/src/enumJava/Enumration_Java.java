package enumJava;


//not a part of sylabus
public class Enumration_Java {
	public static void main(String[] args) {
		
		for (Students s: Students.values()) {
			System.out.println(s);
		}
	}
	enum Students{
		Supriya ,Alisha,Liza,Satakshi;
	}
	
}


