package Allinone;

public class WhileSumNaturalNumbers {
	public static void main(String[] args) {
		int s=1;
		int add=0;
		
		while(s<=10) {
			add=add+s;
			s++;
		}
		System.out.println(add+" Is the sum of first 10 natural numbers");
	}
}
