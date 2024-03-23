package inheritance;

public class MethodeTest {
	public static void main(String[] args) {
		Animals animal1=new Animals("hphp",4,15,'m',false);
		animal1.showDetails();
		Animals animal2=new Animals("hptp",5,5,'F',true);
		animal2.showDetails();
		
		Dog dog1=new Dog("ddgd",3,10,'M',false,"Spich" );
		dog1.eat();
		dog1.bark();
		dog1.showDetails();
		
		Animals dog2 =new Dog ("ddgd",7,17,'F',true,"Spich" );
		dog2.showDetails();
		  
		 
	}
}
