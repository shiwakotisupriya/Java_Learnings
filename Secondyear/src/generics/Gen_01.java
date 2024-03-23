package generics;

public class Gen_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


// if wannna give T can be only number then   class Stud_Sub T extends number

class Stud_Sub<T>{
	T name;
	T id;
	
	public T displayDetails() {
		return id;
	}
}