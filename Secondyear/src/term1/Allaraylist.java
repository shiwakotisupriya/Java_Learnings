package term1;
import java.util.*;
public class Allaraylist {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		//Write a Java program to create an array list,add some colors (strings) and print out the collection.
		al.add("Blue");
		al.add("Maroon");
		al.add("Black");
		
		
		
		//Write a Java program to insert an element into the array list at the first position
		
		al.add(0,"Pink");
		al.add(2,"RoseRed");
		al.add(3,"Velvet");
		
		
		System.out.println(al);
		System.out.println("   ");
		System.out.println("   ");
		
		System.out.println("_________________________________________________________");
		
		//Write a Java program to retrieve an element (at a specified index) from a given array list.
		
		System.out.println("Retrive element:"+ al.get(2));
		System.out.println("   ");
		System.out.println("   ");
		
		//Write a Java program to update an array element by the given element
		
		System.out.println("To replace the value of blue by Blueberry"+al.set(1, "Blueberry"));
		
		System.out.println("   ");
		System.out.println("   ");
		//Write a Java program to remove the third element from an array list.
		 
		System.out.println("Remove element 5 "+al.remove(5));
		
		System.out.println("   ");
		System.out.println("   ");
		//Write a Java program to search for an element in an array list
		
		if(al.contains("Blueberry")) {
			System.out.println("Found = "+al.contains("Blueberry"));
		}
		else {
			System.out.println("Not Found");
		}
		
		System.out.println("   ");
		System.out.println("   ");
		//Write a Java program to sort a given array list.
				System.out.println("Before sort: "+al);
				
				Collections.sort(al);
				System.out.println("After sort: "+al);
				System.out.println("   ");
				System.out.println("   ");
				
		//Write a Java program to copy one array list into another.
		
				List<String> List1 = new ArrayList<String>();
				List1.add("1");
				List1.add("2");
				List1.add("3");
				List1.add("4");
				System.out.println("List1: " + List1);
				List<String> List2 = new ArrayList<String>();
				List2.add("A");
				List2.add("B");
				List2.add("C");
				List2.add("D");
				System.out.println("List2: " + List2);
				// Copy List2 to List1
				Collections.copy(List1, List2);
				System.out.println("Copy List to List2,\nAfter copy:");
				System.out.println("List1: " + List1);
				System.out.println("List2: " + List2);
				
				System.out.println("   ");
				System.out.println("   ");
				
				
				//Write a Java program to reverse elements in an array list.
				
				System.out.println("Before Reverse"+al);
				Collections.reverse(al);
				System.out.println("After Reverse"+al);
				
		System.out.println("______________________");
		//for printing all the array elements
		for(String t: al) {
			System.out.println(t);
		}
		
		
		
	}

}
