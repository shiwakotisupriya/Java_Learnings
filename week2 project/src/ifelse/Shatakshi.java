package ifelse;
import java.util.Scanner;
public class Shatakshi {
	public static void main(String[]args) {
		Scanner lab=new Scanner(System.in);
		System.out.println("Enter your marks");
		int t=lab.nextInt();
		if(t<25) {
			System.out.println("Congratulations You Are Fail");
		}
		else if((t>=25)&&(t<45)){
			System.out.println("E");
		}
		else if((t>=45)&&(t<50)){
			System.out.println("D");
		}
		else if((t>=50)&&(t<60)){
			System.out.println("C");
		}
		else if((t>=60)&&(t<80)){
			System.out.println("B");
		}
		else if((t>=80)&&(t<100)){
			System.out.println("A");
		}
		else {
			System.out.println("Not correct marks");
		}


	}
}

