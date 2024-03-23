/*
 * Q no 1
 *  Create a class named 'Student' with String variable 'name'and
 *  integer variable 'roll_no'. Assign the value of roll_noas '2' 
 *  and that of name as "John" by creating an object of the class Student.
 * Q no 2
 * 	Assign and print the roll number, phone number and address of 
 *  two students having names "Sam" and "John" respectively by 
 *  creating two objects of class 'Student'. 
 * Q no 3
 * 	Write a program to print the area and perimeter of a triangle
 *  having sides of 3, 4 and 5 units by creating a class named 
 *  'Triangle' without any parameter in its constructor.
 *  
 *  
 *  
 */

package classesAndObjects;

public class Objects1 {
	public static void main(String[] args) {
		
		
		//Q no 1
		
		Student intro=new Student();
		intro.name="Riya";
		intro.roll_no=3;
		System.out.println("Name: "+intro.name+" Roll_number is "+intro.roll_no);
		
		
		
		//Q no 2
		
		Student stu1=new Student();
		stu1.name="Sam";
		stu1.roll_no=1;
		stu1.number=983452712;
		stu1.address="Pluto";
		System.out.println( "Name: "+stu1.name + " Roll_number: "+ stu1.roll_no + " Phone_number: "+ stu1.number+" Address: " + stu1.address);
		

		Student stu2=new Student();
		stu2.name="John";
		stu2.roll_no=2;
		stu2.number=983452832;
		stu2.address="Neptune";
		System.out.println("Name: "+stu2.name + " Roll_number: "+ stu2.roll_no + " Phone_number: "+ stu2.number+" Address: " + stu2.address);
		
		
		//Q no 3
		
  
		
		
	}

}

//Q no 1
class Student{
	String name;
	int roll_no;
	double number;
	String address;
	
}

//Q no 2

class Triangle{
	int lenght=3;
	int breadth=4;
	int height =5;
	
}

