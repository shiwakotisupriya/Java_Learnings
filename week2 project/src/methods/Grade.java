package methods;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		
		gradesheet();
		
		
	}
	static char gradesheet() {
		System.out.println("Enter Your Marks Please!!");
		Scanner gd = new Scanner(System.in);
		int grade=gd.nextInt();
		if( grade<=4) {
			System.out.println("G");
		}
		else if((grade>=5)&&(grade<=39)){
			System.out.println("F");	
		}
		else if((grade>=40)&&(grade<=49)){
			System.out.println("D");	
		}
		else if((grade>=50)&&(grade<=59)){
			System.out.println("C");	
		}
		else if((grade>=60)&&(grade<=69)){
			System.out.println("B");
		}
		else if((grade>=70)&&(grade<=100)){
			System.out.println("A");	
		}else {
			System.out.println("z");	
		}
		return 0;
	}
	
}
