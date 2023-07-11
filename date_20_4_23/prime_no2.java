package date_20_4_23;

import java.util.Scanner;

public class prime_no2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}

	}

}
