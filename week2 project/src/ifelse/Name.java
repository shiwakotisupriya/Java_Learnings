package ifelse;
import java.util.Scanner;
public class Name {
	public static void main(String[]args) {
		Scanner oo=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=oo.nextLine();
		System.out.println("Enter your age");
		int age=oo.nextInt();
		System.out.println("Enter your address");
		String address=oo.next();
		System.out.println("Enter your gender");
		char gender=oo.next().charAt(0);
		System.out.println("Enter your email");
		String email=oo.next();
		System.out.println("Enter your height");
        double height=oo.nextDouble();
        System.out.println("Are you vegain??");
        Boolean vegan =oo.nextBoolean();
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Address:"+address);
        System.out.println("Gender:"+gender);
        System.out.println("Email:"+email);
        System.out.println("height:"+height);
        System.out.println("vegain:"+vegan);
	}
	
}
