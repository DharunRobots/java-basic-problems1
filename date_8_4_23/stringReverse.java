package date_8_4_23;

import java.util.Scanner;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String Str = sc.nextLine();

		/*
		 * for(int i=0;i<=Str.length();i++) { if((Str(i)=='t')||(Str(i)=='h')) {
		 * 
		 * } }
		 */

		StringBuffer str1 = new StringBuffer(Str);
		StringBuffer Str12 = str1.replace(3, 5,"");
		System.out.println("Reverse String  : " + Str12);

	}

}
