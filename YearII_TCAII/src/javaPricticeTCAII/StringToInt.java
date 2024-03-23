package javaPricticeTCAII;
import java.util.*;
class StringToInt{
	public static void main (String[] args){
		Scanner st = new Scanner(System.in);
		System.out.println("Enter a desired string you want to convert");
		String stg = st.next();
		
		try{
			int d = Integer.parseInt(stg);
			System.out.println("Your converted integer value is: "+ d);
		}
		catch (Exception e){
			System.out.println("You have entered invalid string! Please enter a number inside string");
		}
		st.close();
	

	}
}
