package OOPs;

public class Lab1 {

	public static void main(String[] args) {
		
		Student  object= new Student ();
		object.sum(10,89,67,45,35,45);
		

	}

}
class Student{
	
	//to perform operations of multiple numbers in a method 
	void sum(int... a) {
		int addition =0;
		for(int y:a) {
			addition = addition+y;
			
		}
		System.out.println("Sum Is: "+addition);
	}
	
}
