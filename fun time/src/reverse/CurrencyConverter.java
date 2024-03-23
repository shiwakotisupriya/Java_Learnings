package reverse;
import java.util.Scanner;
public class CurrencyConverter {
	public static void main(String[] args) {
		while(true){
		Scanner f=new Scanner(System.in);
		System.out.println(" Type US, Indian or Gdp currency you need to convert");
		double currnc= f.nextDouble();
	
	
	
		double us= currnc/127.32;
		double ind=currnc/1.6;
		double gdp=currnc/151.8;
		
		System.out.println("Enter 0 to convert us dollor");
		System.out.println("Enter 3 to convert indial value");
		System.out.println("Enter 5 to convert gdp");
		
		System.out.println("Enter ammount");
		int value=f.nextInt();
		
		if(value==0) {
			System.out.println("Neplai Rupee"+currnc+"equals to"+us);
		}
		else if(value==3){
			System.out.println("Neplai Rupee"+currnc+"equals to"+ind);
		}
		else if(value==5){
			System.out.println("Neplai Rupee"+currnc+"equals to"+gdp);
		}
		else {
		 System.out.println("!!!!!!!!!   Invalide input   !!!!!!!!");
		 }
		System.out.println("Enter y to start again and bye to end");
		String t=f.next();
		if(t.equals("y")) {
			continue;
		}
		else {
			f.close();
			System.out.println("Bye......");
			break;
		}
		
		
		}	
	}
}
