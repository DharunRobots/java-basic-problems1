package date_29_3_23;

import java.util.Scanner;

public class check_year_leap_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;

		boolean leap = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year :");
		year = sc.nextInt();

		if (year % 4 == 0) {
			leap = true;
		} else {
			leap = false;
		}
		if (leap == true) {
			System.out.println(year + " Leap year");
		} else {
			System.out.println(year + " not Leap year");
		}
	}

}
