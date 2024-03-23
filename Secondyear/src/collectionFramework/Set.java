package collectionFramework;
import java.util.*;
public class Set {

	public static void main(String[] args) {
//		Collection cl= new HashSet();
//		Collection cn= new HashSet();// it displays in unorder
		
	Collection cl= new ArrayList();
	Collection cn= new ArrayList();// it displays in order
	
	
		cn.add("College");
		cn.add("NAMI");
		
		cl.add(20);
     	cl.add(80);
		cl.add(10);
    	cl.add(60);
		cl.add(80);// Hashset has duplicates but set doesnot allow duplicates in a array
		cl.add(60);
		System.out.println(cl);
		
		cl.addAll(cn);// inserts all the object of cn object 
//		System.out.println(cl); 
//		cl.remove(20);
//		System.out.println(cl); 
//		cl.clear();
	
		System.out.println(cl);  // HashSet is an unordered list
		System.out.println(cl.contains("NAMI"));
		System.out.println(cl.contains("nami"));
		
		
		Collection bhh = new LinkedHashSet();
		
		bhh.add("Asdfg");
		System.out.println(bhh);
		
		
	}

}
