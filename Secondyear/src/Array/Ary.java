package Array;

public class Ary {
	public static void main(String[] args) {
		dElements();
	}
		static void dElements() {
			int []marks = {88,77, 34, 56, 78 ,21, 82};	
			
			
			//enhanced for loop
/*		for (int nmrs:marks) {
 *				System.out.println(nmrs+" ");
			}  */
			
			
			
			//normal loop
			
			
			for(int i=0;i<marks.length;i++) {
				System.out.println(marks[i]);
			}
		}
}
	

