package date_17_4_23;

import java.util.Scanner;

public class lowercase_to_uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Symbol or number or char :");
		char c = sc.next().charAt(0);
		
		System.out.println("Given Character is : "+c);
		String s=Character.toString(c);
		if(c>='a' && c<='z') {
		System.out.println("Given character is :"+s+" ,Upper character is :"+ s.toUpperCase());

	}
		else if (c>='A' && c<='Z') {
			System.out.println("Given character is :"+s +" ,Lower character is :"+s.toLowerCase());
		}
	}

}
