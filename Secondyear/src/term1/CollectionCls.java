package term1;
import java.util.*;
public class CollectionCls {

	public static void main(String[] args) {
		

	}

}

class GloceryList{
	Collection <String>groceryList=new ArrayList<String>();
	
	
	public void addglocerylistItem() {
		String item = null;
		groceryList.add(item);
	}
	
	public void printGroceryList() {
		System.out.println("You Have"+groceryList.size()+"Items in the list");
		for (String item:groceryList) {
			System.out.println(item);
		}
	}
	
	
	public void modifyGroceryItem(int pos, String newItem) {
		
	}
}

