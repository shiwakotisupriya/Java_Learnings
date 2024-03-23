package inheritance;

public class Sculpture extends Artwork {
	private String material;
	private double weight;
	public Sculpture(String name, String artistName, int price, String material, double weight) {
	
		super(name,artistName,price);
		this.material=material;
		this.weight=weight;
		
	}
	public String getMaterial() {
		return(material);
	}
	public void  setMaterial(String material) {
		this.material=material;
	}
	public double  getWeight() {
		return(weight);
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	
	
	
	
	
}
