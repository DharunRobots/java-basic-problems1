package date_28_4_23;

public class inheritance_B extends inheritance_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritance_B obj = new inheritance_B();
		obj.car1();
		obj.car2();
		obj.method1();
		obj.method2();
		// obj.method3(); we cannot inherit because it is private

	}

	public void car1() {
		System.out.print("my car name is :");
	}

	private void car2() {
		System.out.println("Audi");
	}

}
