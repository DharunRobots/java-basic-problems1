package date_17_4_23;

public class A2 {
	int age;

	public void show() {
		System.out.println("show");
	}

	static class B {
		public void congif() {
			System.out.println("cpnfig");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A2 obj = new A2();
		obj.show();

		A2.B obj1 = new B();
		obj1.congif();
	}

}
