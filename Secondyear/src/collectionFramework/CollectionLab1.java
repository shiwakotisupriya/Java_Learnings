package collectionFramework;	

import java.util.*;
public class CollectionLab1 {
	public static void main(String[] args) {
		
		
	 Collection col= new ArrayList();//collection is interface so we cannot creating object of interface so we are using ArrayList which implement Collection interface	
	 col.add(10);
	 col.add(20.8);
	 col.add("Hello");
	
	 System.out.println(col);
	 System.out.println(col.size());// displays size 
	 System.out.println(col.isEmpty());// checks if its empty or not
	 col.remove("Hello");// removes the element we want to remove
	 System.out.println(col);
	 col.clear();// clears all the data stored
	 System.out.println(col); 
	 
	 
	 Collection <Integer> rest = new ArrayList <Integer>();
	 rest.add(89);
	 System.out.println(rest);
	 
	 Collection <String> str = new ArrayList <String>();
	 str.add("Hello");
	 System.out.println(str);
	 
	 
	 
	 

	 
	}

}
// To restrict the heterogeneous data types  we have to use generic 

// ArrayList or List can contain duplicates as well
 