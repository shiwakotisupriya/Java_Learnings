/**
 * 
 */
package classesandobjects;

public class Student {
	
	
	//class variable
	static int noOfStds = 20;

	// fields/instance variables/attributes
	private int id;
	private String name;
	private String email;
	private String phone;

	Student(){
	System.out.println("inside default implicit constructor");
	}

	Student(int id){
	this.id = id;
	}

	Student(int id, String name){
	this.id = id;
	this.name = name;
	}

	Student(int id, String name, String email, String phone){
	this.id = id;
	this.name = name;
	this.email = email;
	this.phone = phone;
	}



	//getter/accessors
	public int getId(){

	return id;
	}
	//setter/mutator
	public void setId(int id){
	this.id = id;
	}

	//getter/accessors
	public String getName() {

	return name;
	}
	//setter/mutator
	public void setName(String name){
	this.name = name;
	}

	//getter/accessors
	public String getEmail() {

	return email;
	}
	//setter/mutator
	public void setEmail(String email){
	this.email = email;
	}

	//getter/accessors
	public String getPhone() {

	return phone;
	}
	//setter/mutator
	public void setPhone(String phone){
	this.phone = phone;
	}

	}



