package date_1_5_2023;

import java.util.Scanner;

public class revese_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String that you want : ");
		String str = sc.next();
		StringBuffer stb = new StringBuffer(str);
		stb=stb.reverse();
		System.out.println(stb);
		
		/*
		 * for(int i=0;i<str.length();i++) { StringBuffer stb = new StringBuffer(str);
		 * stb=stb.reverse(); System.out.println(stb); count++;
		 * System.out.println(count); if(stb.charAt(i)==" ") {
		 * 
		 * } }
		 */
	}

}
