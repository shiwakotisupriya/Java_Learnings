package generics;

public class Glab1 {

	public static void main(String[] args) {
		Employee let =new Employee();
		let.a="Satakshi";
		let.x=20;
		let.y=false;
		let.show();
		

	}

}
class Employee<T>{
	T a;
	T x;
	T y;
	void show() {
		
		System.out.println(a);
		System.out.println(x);
		System.out.println(y);
		
//		for printing datatype
		System.out.println(a.getClass().getName());
		System.out.println(x.getClass().getName());
		System.out.println(y.getClass().getName());
	}
	
}
