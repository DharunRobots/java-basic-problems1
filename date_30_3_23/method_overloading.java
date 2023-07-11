package date_30_3_23;

class calculator {
	public int add(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	public int add(int n1, int n2) {
		return n1 + n2;
	}

	public double add(double n1, int n2) {
		return n1 + n2;
	}
}

public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator obj = new calculator();
		int r1 = obj.add(4, 6, 8);
		System.out.println(r1);
		double r2 = obj.add(5, 5);
		System.out.println(r2);

	}

}
