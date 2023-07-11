package date_6_4_23;

import java.util.Scanner;

public class palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String Str = sc.nextLine();

		StringBuffer sb1 = new StringBuffer(Str);
		System.out.println("Before :" + sb1);
		StringBuffer Str2 = sb1.reverse();
		StringBuffer st = Str2;
		System.out.println("Reverse String :" + st);

		if (st.equals(sb1)) {
			System.out.println(" not Palindrome");
		}
		else {
			System.out.println("Plaindrome");
		}

	}

}
