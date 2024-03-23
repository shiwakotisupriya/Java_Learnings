package dynamic;

public class MethodLab_01 {

	public static void main(String[] args) {
		Arthmetic one=new Arthmetic();
		one.sum(10,20);
		
		

	}

}
class Arthmetic{
	int a,b, result;
	void sum(int a, int b) {
		this.a=a;
		this.b=b;
		result=a+b;
		System.out.println(result);
		
		
		 
		
	}
}
