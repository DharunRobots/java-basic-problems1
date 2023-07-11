package date_29_3_23;

import java.util.Scanner;

public class check_given_vowles_or_consonents_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		boolean vowel = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character :");
		ch = sc.next().charAt(0);

		switch (ch) {
		case 'a':
			vowel = true;
		case 'e':
			vowel = true;
		case 'i':
			vowel = true;
		case 'o':
			vowel = true;
		case 'u':
			vowel = true;
		case 'A':
			vowel = true;
		case 'E':
			vowel = true;
		case 'I':
			vowel = true;
		case 'O':
			vowel = true;
		case 'U':
			vowel = true;

		}
		if (vowel == true) {
			System.out.println(ch + " is vowel");
		} else {
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				System.out.println(ch + " is consonent");
			} else {
				System.out.println(ch + " is Not alaphabet");
			}
		}
	}

}
