package collectionFramework;
import java.util.*;
public class GenericLab1 {

	public static void main(String[] args) {
		Collection<Double> c=new ArrayList<Double>();  //<Double> is known as generic
		c.add(10.0);
		c.add(56.9);
		
		
		List a= new ArrayList();
		a.add(30);
		a.add(30);
		a.add(50);
		System.out.println(a);// list allows  duplicate value
		
		
		Collection cl= new HashSet();
		
		cl.add(30);
		cl.add(30);
		cl.add(50);
		System.out.println(cl);// set don't allow  duplicate value
		
		
		
		
		// combination of collection and array and printing using loop because collection is super slow
		List ab=new ArrayList();
		ab.add("Yunjo");
		ab.add("Priyancy");
		ab.add("Satakshi");
		ab.add("Supriya");
		ab.add(56);	
		Object arr[]=ab.toArray();
		
//		enhanced for loop
		for(Object l: arr ) {
			System.out.println(l);
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
		
		
		

	}

}
