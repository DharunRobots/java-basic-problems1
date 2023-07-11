package date_4_4_23;

public class mobile2 {
	
	String brand;
	static String name;
	int price;
	
	
	public void show() {
		System.out.println(brand+":"+price+":"+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mobile2 ob1 = new mobile2();
		ob1.brand = "apple";
		ob1.price = 1500;
		mobile2.name = "watch";
		
		mobile2 ob2 = new mobile2();
		ob2.brand = "samsung";
		ob2.price = 1200;
		// static method can be accessed by both object and class
		// instance variable can be accessed only by object
		mobile2.name = "mobile";
		
		
		
		ob1.show();
		ob2.show();

	}

}
