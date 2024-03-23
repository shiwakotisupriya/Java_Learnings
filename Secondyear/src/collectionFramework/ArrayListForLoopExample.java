package collectionFramework;

import java.util.ArrayList;

public class ArrayListForLoopExample {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> stringList = new ArrayList<>();
        
        // Add elements to the ArrayList
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        
        // Use a for loop to traverse through the list and print its contents
        for (int i = 0; i < stringList.size(); i++) {
            String str = stringList.get(i);
            System.out.println(str);
        }
    }
}

