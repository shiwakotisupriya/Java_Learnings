
package term1;

public class InheriteArt {

	public static void main(String[] args) {
		Artwork aaa=new Artwork("Zerica", 56.44);
		aaa.callIt();
		Artwork bbb=new Artwork("Imzahin", 93.04);
		bbb.callIt();
		Sculpture sc=new Sculpture("Zoser", 33.34,"Arsenic", 8.01f);
		sc.scptl();
		Painting pntt=new Painting("Azabraka", 73.08,"Oil", 2.2f, 2.32f);
		pntt.pnt();
	}

}

class Artwork{
	private String Artist_Name;
	private double Value_in_pounds;
	
	public Artwork(String Artist_Name, double Value_in_pounds) {
		this.Artist_Name = Artist_Name;
		this.Value_in_pounds = Value_in_pounds;
	}
	public String getArtist_Name() {
		return Artist_Name;
	}
	public void setArtist_Name(String Artist_Name) {
		this.Artist_Name = Artist_Name;
	}
	public double getValue_in_pounds() {
		return Value_in_pounds;
	}
	public void setValue_in_pounds(double Value_in_pounds) {
		this.Value_in_pounds = Value_in_pounds;
	}
	void callIt() {
		System.out.println("Artist Name "+getArtist_Name()+" Its value in Pound "+getValue_in_pounds());
	}
}


class Sculpture extends Artwork{
	
	private String Material;
	private float Weight;
	
	public Sculpture(String Artist_Name, double Value_in_pounds,String Material,float Weight) {
		super(Artist_Name, Value_in_pounds);
		this.Material=Material;
		this.Weight=Weight;
	}
	
	public String getMaterial() {
		return Material;
	}
	public void setMaterial(String Material) {
		this.Material = Material;
	}
	public float getWeight() {
		return Weight;
	}
	public void setWeight(float Weight) {
		this.Weight = Weight;
	}
	void scptl() {
		System.out.println("Artist Name "+getArtist_Name()+" Its value in Pound "+getValue_in_pounds()+" Material "+getMaterial()+" Weight "+getWeight());
	}
	
}


class Painting extends Artwork{
	
	private String Paint_Type;
	private float Canvas_width;
	private float Canvas_height;
	
	public Painting(String Artist_Name, double Value_in_pounds, String Paint_Type, float Canvas_width, float Canvas_height) {
		super(Artist_Name, Value_in_pounds);
		this.Canvas_width=Canvas_width;
		this.Canvas_height=Canvas_height;
		
	}
	
	public String getPaint_Type() {
		return Paint_Type;
	}
	public void setPaint_Type(String Paint_Type) {
		this.Paint_Type = Paint_Type;
	}
	public float getCanvas_width() {
		return Canvas_width;
	}
	public void setCanvas_width(float Canvas_width) {
		this.Canvas_width = Canvas_width;
	}
	public float getCanvas_height() {
		return Canvas_height;
	}
	public void setCanvas_height(float Canvas_height) {
		this.Canvas_height = Canvas_height;
	}
	
	void pnt() {
		System.out.println("Artist Name "+getArtist_Name()+" Its value in Pound "+getValue_in_pounds()
		+" Paint_Type "+getPaint_Type()+" Canvash Width "+getCanvas_width() +" Canvas Height "+getCanvas_height());
	}
	
}

