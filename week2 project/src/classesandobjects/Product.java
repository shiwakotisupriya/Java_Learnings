package classesandobjects;

public class Product {
	int productid;
	double price;
	String name;
	int categoryid;
	Product (int productid,double price,String name,int categoryid){
		this.productid=productid;
		this.price=price;
		this.name=name;
		this.categoryid=categoryid;
	}
	public int getProductId(){
		return productid;
	}
	public void setProductId(int productid) {
		this.productid= productid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price=price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getCategoryId() {
		return categoryid ;
	}
	public void setCatagoryId (int categoryid) {
		this.categoryid=categoryid;
	}
	
	
	

}
