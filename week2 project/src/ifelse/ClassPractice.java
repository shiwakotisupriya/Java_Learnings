package ifelse;

public class ClassPractice {
	public static void main(String[] args) {
		
		System.out.println("....begin....");

		//method invocation/call
		oddOrEven(132);

		System.out.println("....end....");
		}

		static void sayHello() {
		System.out.println("Hello");
		}

		//method declaration and definition
		static void oddOrEven(int num) {
		if (num%2==0) {
		System.out.println(num+" is even");
		} else {
		System.out.println(num+" is odd");
		}
		}

}
