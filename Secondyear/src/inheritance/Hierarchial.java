package inheritance;

public class Hierarchial {

	public static void main(String[] args) {
		

	}

}

class Beurocracy {
	
}
class Politics {
	
}
class policities extends Beurocracy{
	String nme="Politics";
}
class Government extends Politics{
	Politics p=new Politics();
	
}

