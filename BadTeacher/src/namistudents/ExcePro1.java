package namistudents;

public class ExcePro1 {
	public static void main(String[] args) {
		int a, b, result = 0;
		a=10;
		b=0;
		try {
			int arr[]= new int[3];
			arr[0]=5;
			arr[1]=10;
			arr[2]=20;
			arr[3]=50;
			result=a/b;
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println("Ma garchu divide, talai k lagxa");
		}
	
		System.out.println("Division is: "+result);
		System.out.println("Hi");
		System.out.println("Hello");
	}

}
