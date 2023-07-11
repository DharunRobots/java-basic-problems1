package date_25_4_23;

public class max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max_min obj = new max_min();
		//obj.method1();
		//obj.method2();
		obj.method3();

	}

	public static void method1() {
		int a = 5;
		int b = 2;
		int c = 3;

		if (a > b && a > c) {
			System.out.println("A is Max" + a);
		} else if (b > a && b > c) {
			System.out.println("B is Max" + b);
		} else {
			System.out.println("C is Max" + c);
		}

	}

	public static void method2() {
		int a = 5;
		int b = 2;
		int c = 3;

		if (a < b && a < c) {
			System.out.println("A is Min" + a);
		} else if (b < a && b < c) {
			System.out.println("B is Min" + b);
		} else {
			System.out.println("C is Min" + c);
		}

	}
	public static void method3() {
		int a = 5;
		int b = 2;
		int c = 3;

		if(a > b && a > c) {
			System.out.println("A max");
			if(b>c) {
				System.out.println("C is Min");
			}
			else {
				System.out.println("B is Min");
			}
		}
		else if(b > a && b > c) {
			System.out.println("B max");
			if(a>c) {
				System.out.println("C is Min");
			}
			else {
				System.out.println("A is Min");
			}
		}
		else  {
			System.out.println("C max");
			if(a>b) {
				System.out.println("B is Min");
			}
			else {
				System.out.println("A is Min");
			}
		}

	}
}
