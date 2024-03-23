package HELLO;

public class Person {
	protected String name;
	protected String address;
	protected double phoneno;
	protected String email;
	public Person(String name,String address,double phoneno, String email) {
		this.name=name;
		this.address=address;
		this.phoneno=phoneno;
		this.email=email;
	}
	public String getName() {
		return(name);
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAddress() {
		return(address);
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public double getphoneno() {
		return(phoneno);
	}
	public void setEmail(String email) {
		this.email=email;
	}
	 public String toString() {
		System.out.println("Name= "+name+" Address= "+address+" Phone number"+phoneno+" Email="+email);
		return address;
	}
	
}
