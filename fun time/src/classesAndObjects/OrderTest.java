package classesAndObjects;

public class OrderTest {
	public static void main(String[] args) {
		Order odd1=new Order(111, 299, "Monday", 01 );
		Order odd2=new Order(222,500,"Sunday",20);
		Order odd3=new Order(333,900,"Tuesday",03);
		Order odd4=new Order(444,880,"Saturday",06);
		Order odd5=new Order(555,500,"Friday",60);
		Order sun[]=new Order[5];
		sun[0]=odd1;
		sun[1]=odd2;
		sun[2]=odd3;
		sun[3]=odd4;
		sun[4]=odd5;
		System.out.println("                     Order                          ");
		System.out.println("Order_ID  Amount     Day      Costumer_ID");
		for(int o=0; o<sun.length;o++) {
			System.out.println(sun[o].getId()+"        " + sun[o].getAmount()+"       " + sun[o].getDay()+"        "+  sun[o].getCostumerid());
		}
		
	}
}
