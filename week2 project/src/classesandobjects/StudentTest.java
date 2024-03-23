package classesandobjects;

public class StudentTest {
	public static void main (String [] args) {

		Student std1 = new Student();
		std1.setId(1);
		std1.setName("Apple");

		Student std2 = new Student();
		std2.setId(2);
		std2.setName("Banana");

		Student std3 = new Student(3);
		std3.setName("Cat");

		Student std4 = new Student(4, "Dog");

		Student std5 = new Student(5, "Elephant", "hathimerosathi@gmail.com", "9881356109" );
		System.out.println(" id: " + std5.getId() + " name: " + std5.getName());

		System.out.println(std1.noOfStds);
		System.out.println(std5.noOfStds);
		}

}


