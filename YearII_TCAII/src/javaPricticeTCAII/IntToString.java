package javaPricticeTCAII;
import java.util.*;
class IntToString{
	public static void main (String[] args){
		Scanner st = new Scanner(System.in);
		System.out.println("Enter a desired integer you want to convert");
		int stg = st.nextInt();
		System.out.println("Enter a desired double you want to convert");
		double d = st.nextDouble();
		try{
			String dr = Integer.toString(stg);
			System.out.println("Your converted string value  from int is: "+ dr);
			String dd = Double.toString(d);
			System.out.println("Your converted string value from double is: "+ dd);
		}
		catch (Exception e){
			System.out.println("You have entered invalid string! Please enter a number inside string");
		}

		st.close();

	}
}
