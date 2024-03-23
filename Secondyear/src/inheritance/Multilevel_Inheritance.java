package inheritance;

public class Multilevel_Inheritance {
		public static void main(String[] args) {
			Npl pre= new Npl();
			pre.protection();
			System.out.println("Name is " +pre.name);
			Gandaki bg= new Gandaki();
			System.out.println("Area of nepal is " +bg.area);
		}

	}

	class Cntry{
		String name = "Nepal";
		int populations =300000000;
		float area=4261782.2671f;
		
		void protection() {
			System.out.println("Every nation provides security");
		}
		
	}
	class Npl extends Cntry{
		
		String name = "President";
		void protection() {
			System.out.println("I will protect my Land");
		}
	}
	class Gandaki extends Nepal{
		
		String name = "President";
		void protection() {
			System.out.println("I will protect my Land");
		}
	}






