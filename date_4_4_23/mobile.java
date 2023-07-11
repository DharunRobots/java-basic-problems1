package date_4_4_23;

public class mobile {
	
	String brand;
	static String name;
	int price;
	
	
	public void show() {
		System.out.println(brand+":"+price+":"+name);
	}
	
	static {
		name = "phone";
		System.out.println("in static block");
	}
	public mobile(){
		brand = "";
		price = 2000;
		System.out.println("constructor block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mobile ob1 = new mobile();
		ob1.brand = "apple";
		ob1.price = 1500;
		mobile.name = "watch";
		
		mobile ob2 = new mobile();
		ob2.brand = "samsung";
		ob2.price = 1200;
		// static method can be accessed by both object and class
		// instance variable can be accessed only by object
		mobile.name = "mobile";
		
		
		
		ob1.show();
		ob2.show();

	}

}
