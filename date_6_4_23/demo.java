package date_6_4_23;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String Str = sc.nextLine();

		StringBuffer sb1 = new StringBuffer(Str);
		System.out.println("Before :" + sb1);
		StringBuffer str4 = sb1;
		StringBuffer Str2 = sb1.reverse();
		StringBuffer st = Str2;
		System.out.println("Reverse String :" + st);
		System.out.println(str4);
		String s1 = "Palindrome";
		String s2 = "Not Palindrome";

		if (str4 == sb1) {
			System.out.println(s1);
		} else {
			System.out.println(s2);
		}
	}
}
