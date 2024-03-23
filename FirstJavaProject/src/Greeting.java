
public class Greeting {
	public static void main(String args[]) {
		System.out.println("..begin..");
		//type variable = value
		byte bLowerRange = -128;
		byte bUpperRange = 127;
		System.out.println("data-type   range");
		System.out.println("----------------------");
		System.out.println(" byte "+"  ["+ bLowerRange +"," +bUpperRange +"]");
		short sLowerRange = -32768;
		short sUpperRange = 32767;
		System.out.println(" short "+"  ["+ sLowerRange +"," +sUpperRange +"]");
		int iLowerRange = -2147483648;
		int iUpperRange = 2147483647;
		System.out.println(" in "+"  ["+ iLowerRange +"," +iUpperRange +"]");
		long lLowerRange = -9223372036854775808L;
		long lUpperRange = 9223372036854775807L;
		System.out.println(" long "+"  ["+ lLowerRange +"," +lUpperRange +"]");
		float fLowerRange = -2147483648F;
		float fUpperRange = 2147483647F;
		System.out.println(" float "+"  ["+ fLowerRange +"," +fUpperRange +"]");
		double dLowerRange = -9223372036854775808D;
		double dUpperRange = 9223372036854775807D;
		System.out.println(" double "+"  ["+ dLowerRange +"," +dUpperRange +"]");
		char ch ='a';
		System.out.println("ch:"+ ch);
		boolean flag = true;
		System.out.println(flag);
		String s ="Apple";
		System.out.println(s);
	    System.out.println("..end..");
	}
}
