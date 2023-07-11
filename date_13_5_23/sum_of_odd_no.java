package date_13_5_23;

public class sum_of_odd_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int n = 10;

		for (int i = 0; i <= n; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
				total = total + i;
			}
		}
		System.out.println("total = " + total);
	}

}
