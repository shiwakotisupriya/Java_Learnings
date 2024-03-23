package dynamic;

public class Method_02 {
	public static void main(String[] args) {
		
		//subtraction
		Subtract remove=new Subtract();
		remove.sub(50,30);
		System.out.println("The result of class Subtraction is = "+remove.outcome);
		
		
		//multiplication
		Multiplication let=new Multiplication();
		let.multiply(10,6);
		
		
		
		//division
		Division div=new Division();
		div.dive(99.9,33.4);
		System.out.println("The result of class Division is = "+div.divide);
		
		
		
		
	}

}


class Subtract{
	
	int a,b,outcome;
	
	
	int sub(int a,int b) {
	this.a=a;
	this.b=b;
	outcome=a-b;
	return outcome;
	}
	
}




class Multiplication{
	int e,f,cross;
	void multiply(int e, int f) {
		this.e=e;
		this.f=f;
		cross=e*f;
		System.out.println("The result of class Multiplication is = "+cross);
	}
}


class Division{
	double w,z,divide;
	double dive(double w, double z) {
		this.w=w;
		this.z=z;
		divide=w/z;
		
		return divide;
		
	}
}