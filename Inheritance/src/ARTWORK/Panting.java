package ARTWORK;

public class Panting extends MainArtwork {
	
	private String panttype;
	private double canvasWidth;
	private double canvasHeight;
    Panting(String name, String artistName, double price,String panttype, double canvasWidth, double canvasHeight) {
		super(name, artistName, price);
		this.panttype=panttype;
		this.canvasWidth=canvasWidth;
		this.canvasHeight=canvasHeight;
	}
    
    public String getPanttype() {
		return(panttype);
	}
	public void setPanttype(String panttype) {
		this.panttype=panttype;
	}
	public double getCanvasWidth() {
		return(canvasWidth);
	}
	public void setCanvasWidth(double canvasWidth ) {
		this.canvasWidth=canvasWidth;
		}
	public double getCanvasHeight() {
		return(canvasHeight);
	}
	public void setCanvasHeight(double canvasHeight ) {
		this.canvasHeight=canvasHeight;
		}
	void displayDetails() {
		
		  System.out.println(name+" "+"is made by"+" "+artistName+" "+"and costs"+" "+price+
		  "panttype"+" "+panttype+"of"+" "+canvasWidth+" "+canvasHeight);
		 
	}
	

}
