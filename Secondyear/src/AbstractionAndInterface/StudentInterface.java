package AbstractionAndInterface;

public class StudentInterface {
	public static void main(String[] args) {
		
		SchoolChildren sc=new SchoolChildren();
		sc.makeNoise();
		
	}


}
interface  Study extends SeniorStudent{  //we can get  interface by using  extends keyword
	//	we cannot write concrete method in interface 
	//	by default interface is public 
	
//	all the method in interface is abstract
	//we cannot create object of interface but we can create subclass
//	all the methods in interface must be public 
	public void makeNoise();
	public void bunkClass();
	
	
}
interface SeniorStudent{
	public void attendLate();
}

interface Teacher{
	public void lazy();
}

class SchoolChildren implements Study , Teacher{ //as study extends interface SeniorStudent too we need to implement the methods of both the interfaces i.e three methods
	public void makeNoise()
	{
		System.out.println("Students makes noise in the class");
	}
	public void bunkClass() {
		System.out.println("student doesnot buink the class but comes late");
	}
	public void attendLate() {
		System.out.println("student doesnot buink the class but comes late");
	}
	public void lazy() {
		System.out.println("Teachers are not lazy");
	}
}