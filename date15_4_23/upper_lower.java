package date15_4_23;

import java.util.Scanner;

public class upper_lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		upper_lower obj = new upper_lower();
		obj.method1();
		obj.method2();
		
		
	}
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character :");
		char c = sc.next().charAt(0);

		if (c >= 65 && c <= 90) {
			System.out.println("Is upper : " + c);
		} else if (c >= 97 && c <= 122) {
			System.out.println("Is lower : " + c);
		}
		else {
			System.out.println("Number or Special char");
		}
	}
	public static void method2() {
		/* char c = '*'; */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Symbol or number or char :");
		char c = sc.next().charAt(0);

		if (c >= 'A' && c <= 'Z') {
			System.out.println("Is upper : " + c);
		} else if (c >= 'a' && c <= 'z') {
			System.out.println("Is lower : " + c);
		}
		else if(c>='0' && c<='9') {
			System.out.println("Number");
		}
		else {
			System.out.println("Special char");
		}
	}

}
