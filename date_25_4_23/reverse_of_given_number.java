package date_25_4_23;

import java.util.Scanner;

public class reverse_of_given_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rnum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number which you want:");
		int n = sc.nextInt();

		while (n != 0) {
			rnum = rnum*10;
			rnum = rnum+n%10;
			n=n/10;
		}
		System.out.println(rnum);
	}

}
