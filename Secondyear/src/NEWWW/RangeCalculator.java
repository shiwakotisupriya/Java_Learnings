/*Write a method that returns the range of an array of integers. The range is the 
difference between the highest and lowest values in the array. The signature of 
the method should be as follows. 
public static int computeRange(int[] values)*/


package NEWWW;

class Range{
	
	 public static int computeRange(int[] values) {
	        if (values == null || values.length == 0) {
	            throw new IllegalArgumentException("Array must not be empty or null.");
	        }
	        
	        int min = values[0];
	        int max = values[0];
	        
	        for (int i = 1; i < values.length; i++) {
	            if (values[i] < min) {
	                min = values[i];
	            }
	            if (values[i] > max) {
	                max = values[i];
	            }
	        }
	        
	        return max - min;
	    }
}






public class RangeCalculator{
	public static void main(String[] args) {
		 int[] values = {3, 1, 7, 5, 2, 9};
	        int range = Range.computeRange(values);
	        
	        System.out.println("Range: " + range);
		
	}
}



