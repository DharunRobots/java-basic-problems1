package date_10_4_23;

class A {
	public void show() {
		System.out.println("A Show");
	}
	public void config() {
		System.out.println("A config");
	}
}

class B extends A {
	public void show() {
		System.out.println("B Show");
	}
}

public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		A obj1 = new A();
		obj.show();
		obj.config();
	}

}
