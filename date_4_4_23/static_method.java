package date_4_4_23;

public class static_method {

	String brand;
	static String name;
	int price;

	public void show() {
		System.out.println(brand + ":" + price + ":" + name);
	}

	public static void show1() {
		System.out.println("Static method");
	}

	public static void show2() {

		// System.out.println(brand+":"+price+":"+name); -----cannot use not static
		// variable inside the static method
	}

	public static void show3(static_method ob) {

		System.out.println(ob.brand+":"+ob.price+":"+name); //we had obj reference we can use non static variable into the static method
		
	}

	public static void main(String[] args) {
		// main is the starting point of execution , without static keyword in main method we cannot created object
		// TODO Auto-generated method stub

		static_method ob1 = new static_method();
		ob1.brand = "apple";
		ob1.price = 1500;
		static_method.name = "watch";

		static_method ob2 = new static_method();
		ob2.brand = "samsung";
		ob2.price = 1200;
		// static method can be accessed by both object and class
		// instance variable can be accessed only by object
		static_method.name = "mobile";

		ob1.show();
		ob2.show();

		// static_method.show(); ---------we cannot call not static method with class
		// name
		static_method.show1();

	}

}
