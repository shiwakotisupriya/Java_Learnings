package collectionMap;


import java.util.*;
public class MapLab1 {

	public static void main(String[] args) {
		//object.put("Key","Value");
		
		
		
		 Map c= new HashMap();
		 c.put("name", "Nisha");
		 c.put("regNo", "124");
		 c.put("name", "Supriya");
		 c.put("regNo", "14");
		 c.put("name", "pranisha");
		 c.put("regNo", "1234");
		 c.put("Number", "124");
		 System.out.println(c);
		 System.out.println(c.size());
		 
		 
		 
		 
		 Map ca= new HashMap();
		 ca.put("name", "Nisha");	 
		 c.put("regNo", "124");
		 ca.put("Email", "nisha@gmail.com");
		 //ca.put("Phone",new LONG (9867564478));
		 System.out.println(ca);
		 System.out.println(ca.containsKey("name"));
		 System.out.println(ca.containsKey("Email"));
		 System.out.println(ca.containsKey("address"));
		 
		 System.out.println(ca.containsValue("Nisha"));
		 System.out.println(ca.containsValue("Priyancy"));
		 
		 
		 
	}

}
