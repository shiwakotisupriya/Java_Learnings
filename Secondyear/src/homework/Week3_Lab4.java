package homework;

import java.util.Scanner;

public class Week3_Lab4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number between 1 to 20");
		int userNum=scan.nextInt();	
		int o;
		
		if(userNum > 20) {System.out.println("Sorry! We can not forther proceed the process.");}
		else {
		for(o=1; o<=userNum;o++) {
			System.out.print("*");
		}
		}	
		scan.close();
	}

}
