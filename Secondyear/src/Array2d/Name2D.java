package Array2d;
import java.util.*;

public class Name2D {
	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in); 
		System.out.println("Enter the length of row:  ");
		int row=input.nextInt();
		
		System.out.println("Enter the length of Column:  ");
		int column=input.nextInt();
		
		String [][]myarr=new String[row][column];
		
		
		//for input
		System.out.println("Enter Name and Address:  ");
		int out,in;
		for(out=0;out<row-1;out++) {
			
			for(in=0;in<column;in++) {
				myarr[out][in]=input.next();
				
			}
		}
		
		
		//for output
		
		for(out=0;out<row;out++) {
			
			for(in=0;in<column;in++) {
				System.out.print(myarr[out][in]+" ");
			}
			System.out.println(" ");
		}
		
		
		
		input.close();
		
	}
}
