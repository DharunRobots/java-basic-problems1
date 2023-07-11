package date_27_4_23;

import java.util.Scanner;

public class common_divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number that you want : ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count = count + 1;
				if (count == 1) {
					System.out.println("The Common Divisors of " + n + " are");
					System.out.println();

				}
				System.out.println(count+"-"+i+" and the quosent is "+n/i);
			}
			
		}
		System.out.println();
		System.out.println();

		System.out.println("There are " + count + " Common Divisors");
	}

}
