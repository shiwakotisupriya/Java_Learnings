package homework;


import java.util.Scanner;
public class Week3_Lab3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your validation code in number and string: ");
		String validationCode=scan.next();
		char one=validationCode.charAt(0);
		char two=validationCode.charAt(1);
		char three=validationCode.charAt(2);
		char four=validationCode.charAt(3);
		char five=validationCode.charAt(4);
		if(validationCode.length()!=5) {
			System.out.println("Your Password is not in range. It Should be of 5 in length.");
		}
		else if(!(Character.isDigit(one)&& Character.isDigit(two))) {
			System.out.println("First Two Characters should be a numeric digit.");
		}
		else if(!(Character.isAlphabetic(three)&& Character.isAlphabetic(four))) {
			System.out.println("Third and fourth character should be alphabetic value.");
		}
		else if(!(Character.isDigit(five))){
			System.out.println("Last Character should ba a numeric digit.");
		}
		else {
			System.out.println("Thankyou!! Visit again.");
		}
		
		scan.close();		
	}

	

}
