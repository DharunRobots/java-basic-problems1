package date_25_4_23;

import java.util.Scanner;

public class prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter no :");
		int n =sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
			  // System.out.println(i+" is prime number");
			   count=count+1;
			}
		}
		if(count==2) {
			System.out.println(n+"is prime");
		}
		else {
			System.out.println(n+" not prime");
		}

	}

}
