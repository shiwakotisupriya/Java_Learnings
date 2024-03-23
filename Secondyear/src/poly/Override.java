package poly;

public class Override {

	public static void main(String[] args) {
		Learners learn=new Learners();
		learn.read();
		learn.write();
		learn.eat();
		System.out.println("*********Break*********");
		
		Employee ee= new Employee();
		ee.read();
		ee.write();
		ee.eat();
		ee.makemoney();
		
		

	}

}
 class Learners {
	void read() {
		System.out.println("Student reads 3 books per annum on average");
	}
	void write() {
		System.out.println("Student are lazy to write");
	}
	void eat() {
		System.out.println("Students eat 100kg per month on average");
	}

}
class Employee extends Learners {
	void read() {
		System.out.println("Employee reads 10 to 15 books per annum");
	}
	void eat() {
		System.out.println("They eat light food");
	}
	void makemoney() {
		System.out.println("Employee earns money");
	}

}
