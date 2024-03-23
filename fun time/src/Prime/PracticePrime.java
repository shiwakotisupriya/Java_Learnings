package Prime;
import java.util.Scanner;
public class PracticePrime {
	public static void main(String[] args) {
		Scanner tp=new Scanner(System.in);
		int my=0;
		int flag=0;
		System.out.println("Enter a number:");
		int your=tp.nextInt();
		my= your/2;
		if(your==0||your==1) {
			System.out.println(your+"Is not prime number");
		}
		else {
			for(int q=2;q<=my;q++  ) {
				if(your%q==0) {
					System.out.println(your+"Is not prime number");
					flag=1;
					break;
				}
			}
				if(flag==0) {
					System.out.println(your+"Is prime number");
				}
			
		}
		tp.close();
	}
}
