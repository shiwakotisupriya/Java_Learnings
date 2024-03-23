package classesAndObjects;

public class Order {
	
	
	private int id;
	private int amount;
	private String day;
	private int costumerid;
	
	Order(int id, int amount, String day,int costumerid){
		this.id=id;
		this.amount=amount;
		this.day=day;
		this.costumerid=costumerid;
	}
	public int getId() {
		return(id);
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getAmount() {
		return(amount);
	}
	public void setAmount(int amount) {
		this.amount=amount;
	}
	public String getDay() {
		return(day);
	}
	public void setDay(String day) {
		this.day=day;
	}
	public int getCostumerid() {
		return(costumerid);
	}
	public void setCostumerid(int costumerid) {
		this.costumerid=costumerid;
	}
	
	
}
