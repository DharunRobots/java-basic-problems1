package date_8_5_23;

import java.util.Arrays;

public class adding_two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];

		a[0] = 10;
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;

		int[] a1 = new int[6];

		a1[0] = 100;
		a1[1] = 202;
		a1[2] = 300;
		a1[3] = 400;
		a1[4] = 500;
		a1[5] = 600;
		// a1[6]=700;

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(a1));

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+a1[i]);

		}

	}
}
