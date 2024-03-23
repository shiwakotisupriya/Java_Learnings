package inheritance;

public class Artwork {
	protected String name;
	protected String artistName;
	protected int price;
	
	public Artwork(String name, String artistName,int price) {
		this.name=name;
		this.artistName=artistName;
		this.price=price;
		}
	
	public String getName() {
		return(name);
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getArtistName() {
		return(artistName);
	}
	public void setArtistName(String artistName) {
		this.artistName=artistName;
	}
	public int getPrice() {
		return(price);
	}
	public void setprice(int price) {
		this.price=price;
	}
	
	
	void showDetails() {
		System.out.println(name+"is made by"+artistName+"and cost"+price);
	}
	
	
}
