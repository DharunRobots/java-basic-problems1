package date_20_4_23;

public class fibonacci_series_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1;
		System.out.println(a);
		System.out.println(b);

		for (int i = 1; i <= 12; i++) {
			int c = a + b;
			if (c <= 1000) {
				System.out.println(c);
				a = b;
				b = c;
			}
		}

	}

}
