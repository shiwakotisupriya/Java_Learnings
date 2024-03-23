package inheritance;

public class Inheri1 {
	public static void main(String[] args) {
		
	}
}
class Member{
	String name;
	int age;
	double phone;
	String address;
	double salary;
	void printSalary() {
		System.out.println("Name: "+ name+ " Age" +" Address" + "Salary");
		
	}
	
}
class Employee extends Member{
	String spelization;
	
}
class Manager extends Member{
	String depertment;
	
}
