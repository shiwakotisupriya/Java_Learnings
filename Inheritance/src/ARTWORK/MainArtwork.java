package ARTWORK;

public class MainArtwork {
protected String name;
protected String artistName;
protected double price;

public MainArtwork(String name, String artistName, double price) {
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
public String getrtistName() {
	return(artistName);
}
public void setArtistname(String artistName) {
	this.artistName=artistName;
}
public double getPrice() {
	return(price);
}
public void setPrice(Double price) {
	this.price=price;
}
void showDetails() {
	System.out.println(name+"is made by"+artistName+"and costs"+price);
}

}
