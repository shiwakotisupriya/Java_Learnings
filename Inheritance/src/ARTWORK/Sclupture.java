package ARTWORK;

public class Sclupture extends MainArtwork {
	private String material;
	private float weight;
	Sclupture(String name, String artistName, double price,String material, float weight){
		
		super(name,artistName,price);
		this.material=material;
		this.weight=weight;	
	}
	public String getMaterial() {
		return(material);
	}
	public void setMaterial(String material) {
		this.material=material;
	}
	public float getWeight() {
		return(weight);
	}
	public void setWeight(float weight) {
		this.weight=weight;
		}
	void showDetails(){System.out.println(name+"is made by"+artistName+"and costs"+price+
			  "material used"+material+"of"+weight); }
	
	  
	 
	
}
