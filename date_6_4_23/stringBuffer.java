package date_6_4_23;

import java.util.Scanner;

public class stringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str2 = "Hello";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String Str = sc.nextLine();
		
		StringBuffer sb1 = new StringBuffer(Str);
		sb1 = sb1.reverse();
		str2 = str2.toUpperCase();
		System.out.println("Reverse String :"+str2+" "+ sb1);
		sb1 = sb1.reverse();
		System.out.println("Reverse String :"+str2+" "+ sb1);
		

	}

}
