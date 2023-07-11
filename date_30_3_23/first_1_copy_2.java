package date_30_3_23;

class calculator {
	int num1 [] = {1,2,34,5};
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

public class first_1_copy_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator obj = new calculator();
		int r1 = obj.add(4, 6, 8);
		System.out.println(r1);
		double r2 = obj.add(5, 5);
		System.out.println(r2);
		syso

	}

}
