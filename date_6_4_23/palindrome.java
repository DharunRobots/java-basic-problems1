package date_6_4_23;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String Str = sc.nextLine();
		
		StringBuffer sb1 = new StringBuffer(Str);
		//sb1 = sb1.reverse();
		System.out.println("Before :"+sb1);
		StringBuffer Str2 = sb1.reverse();
		
		System.out.println("Reverse String :"+ Str2);
		StringBuffer st=Str2;
		System.out.println(Str2);
		StringBuffer Str3 = st.reverse();
		System.out.println(Str2);
		System.out.println(Str3);

		System.out.println("Reverse String :"+ Str3);
		System.out.println("Reverse String :"+ Str2);
		
		if(Str2 == Str3) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Plaindrome");
		}
		

	}

}
