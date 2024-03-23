package Pattens;

public class HalfPiramid {
	public static void main(String[] args) {
		int star=5;
		int i,j;
		
		for(i=1;i<=star;i++) {
			
			
			for(j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			
			System.out.println();
		}
	}

}
