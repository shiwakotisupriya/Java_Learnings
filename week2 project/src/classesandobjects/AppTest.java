package classesandobjects;

public class AppTest {
	public static void main(String[] args) {
		Category cat1=new Category(1, "T-shirt");
		Category cat2=new Category(2, "Shirt");
		Category cat3=new Category(3,"Skirt");
		Category cat4=new Category(4,"Pant");
		Category cat5=new Category(5,"Jacket");
		Category ctgrs[]=new Category[5];
		ctgrs[0]=cat1;
		ctgrs[1]=cat2;
		ctgrs[2]=cat3;
		ctgrs[3]=cat4;
		ctgrs[4]=cat5;
		System.out.println("Categories");
		System.out.println("Id                    Name");
		for(int u=0;u<ctgrs.length;u++) {
			System.out.println(ctgrs[u].getId()+"                    "+ctgrs[u].getName());
		}





		//Product Class
		Product p1=new Product(1, 200,"T-shirt", 1);
		Product p2=new Product(2, 444,"Shirt",   2);
		Product p3=new Product(3, 990,"Skirt",   3);
		Product p4=new Product(4, 100,"Pant",    4);
		Product p5=new Product(5, 250,"Jacket",  5);
		Product pa[]=new Product[5];
		pa[0]=p1;
		pa[1]=p2;
		pa[2]=p3;
		pa[3]=p4;
		pa[4]=p5;
		System.out.println("Products");
		System.out.println("ProductId               Price               Name                 CatagoryId");
		for(int i=0;i<pa.length;i++) {                         
			System.out.println(pa[i].getProductId()+"                       "+pa[i].getPrice()+"               "+pa[i].getName()+"                 "+pa[i].getCategoryId());
		}





		//System.out.println(" id: " + cat1.getId() + " name: " + cat1.getName());
		//System.out.println(" id: " + cat2.getId() + " name: " + cat2.getName());
		//System.out.println(" id: " + cat3.getId() + " name: " + cat3.getName());
		//System.out.println(" id: " + cat4.getId() + " name: " + cat4.getName());
		//System.out.println(" id: " + cat5.getId() + " name: " + cat5.getName());
	}
}
