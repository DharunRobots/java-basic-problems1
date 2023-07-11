package date_19_4_23;

import java.util.Scanner;

public class count_of_given_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		
		while(n>0) {
			n=n/10;
			i++;
		}
		System.out.println("no of digit present is : "+i);
	}

}
