package date_20_4_23;

public class sum_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oddsum = 0;
		int evensum = 0;

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1) {
				oddsum = oddsum+i;
			}
			if (i % 2 == 0) {
				evensum = evensum+i;
			}
		}
		System.out.println("Summ of Odd number :"+oddsum);
		System.out.println("Summ of Even number :"+evensum);
	}
}
