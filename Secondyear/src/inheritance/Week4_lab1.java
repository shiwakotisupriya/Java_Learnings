package inheritance;

public class Week4_lab1 {

	public static void main(String[] args) {
		
		Artwork art= new Artwork("Beauty", 6745.98);
		
		Artwork art2= new Artwork("Brass", 9875.98);
		 
		art.callIt();
		art2.callIt();
		
		

	}

}

class Artwork{
	String artistName;
	double value;
	
	public Artwork(String artistName, double value) {  //constructor is used for passing the values to the variables 
		this.artistName=artistName;
		this.value=value;
	}
	
	public void setArtistName(String artistName) {
		this.artistName=artistName;
	}

	public void setValue(double value) {
		this.value=value;
	}
	
	
	
	
	public String getArtistName() {
		return artistName;
	}
	
	public double getValue() {
		return value;
	}
	
	public void  callIt() {
		System.out.println("The name of artist is "+
		getArtistName()+ " And the price is "+ getValue());
	}
	
	
}
class Sculpture extends Artwork{
	String materials;
	float weight;
	public Sculpture(String artistName, double value,String materials,float weight ) {
		super(artistName, value);
		this.materials=materials;
		this.weight=weight;	
	}
	public void setMaterials(String materials) {
		this.materials=materials;
	}
	public void setweigth(float weight) {
		this.weight=weight;
	}
	
	public String getMaterials() {
		return materials;
	}
	
	public float getWeight() {
		return weight;
	}
	
	
}
class Painting extends Artwork{
	
	String paint;
	float c_weight;
	float c_height;
	public Painting(String artistName, double value, String paint, float c_weight, float c_height) {
		super(artistName, value);
		this.paint =paint;
		this.c_weight=c_weight;
		this.c_height=c_height;
		
	}
	
	
}
