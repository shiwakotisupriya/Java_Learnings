
package Array;

import java.util.*;
public class UserName {

	public static void main(String[] args) {
		System.out.println("Enter the numbers of fav persons:  ");
		Scanner name =new Scanner(System.in);
		int limit =name.nextInt();
		String names[] = new String[limit];
		int loop;
		System.out.println("Enter the names of your fav persons: ");
		
		
		//for taking input from user we need to use loop
		
		for(loop=0;loop <limit;loop++) {
			names[loop]=name.next();
		}
		
		
		//for result 
		
		for(loop=0;loop<names.length;loop++) {
			System.out.println("name "+(loop+1)+" is "+names[loop]);
		}
		
		name.close();
		

	}


}
