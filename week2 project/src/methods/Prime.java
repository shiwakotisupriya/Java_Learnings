package methods;
public class Prime {
	public static void main(String[] args) {

		int num= 100; 
		displayPrimeNumbers(num);

	}
	static boolean isPrime(int num){

		boolean flag = true;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for non prime number
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
						return true;
		}
		else {
						return false;
		}
	}

	static void displayPrimeNumbers(int num) {

		for(int i=2; i<=num; ++i) {
			if(isPrime(i)) {
				System.out.print(i+ " ");
			}
		}
	}


	static void displayFirstNPrimeNumbers(int n) {

		int count =0;
		int num=2;

		for(int i=2; i<=num; ++i) {
			if(isPrime(i)) {
				System.out.print(i+ " ");
				++count;

			}
			++num;
			if(count==n) {
				break;
			}
		}	

	}
}
