package Prime;
import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner pm=new Scanner(System.in);
		int e=0,flag=0;
		System.out.println("Enter A candidate Number Please");
		int p=pm.nextInt();
		e=p/2;
		if(p==0||p==1) {
			System.out.println(p+" is not prime");
		}
		else {
			for(int r=2;r<=e;r++) {
				if(p%r==0) {
					System.out.println(p+"is not prime");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(p+"is prime");
			}
		}
		pm.close();
		
	}
}
