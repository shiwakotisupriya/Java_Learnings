package poly;

public class Week4_Lab1 {

	public static void main(String[] args) {
		// object of pet class 
		Pet jacky= new Pet("Jacky", "Doggy", 2);
		jacky.petInfo();
		Pet zaaraa= new Pet("Zara","Cat", 1);
		zaaraa.petInfo();
		Pet chinku = new Pet("Chinku", "Mice", 1);
		chinku.petInfo();

	}

}
class Pet{
	private String name;
	private String animal;
	private int age;
	
	//constructor
	
	public Pet(String name,String animal, int age) {
		this.name=name;
		this.animal=animal;
		this.age=age;
	} 
	
	//set method
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAnimal(String animal) {
		this.animal=animal;
	}
	public void setAge(int age ){
		this.age=age;
	}
	
	//get method
	
	
	public String getName() {
		return name;
	}
	public String getAnimal() {
		return animal;
	}
	public int getAge() {
		return age;
	}
	
	public void petInfo() {
	System.out.println(getName()+ " Is A " +getAnimal()+ " Currently " +getAge()+" Years Old.");	
	}
	
	
}