package date_27_4_23;

import java.util.Scanner;

public class prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number that you want : ");
		int n = sc.nextInt();
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count=count+1;
			}
		}
		if(count==2) {
			System.out.println(n+" is Prime");
		}
		else {
			System.out.println(n+" is Not Prime");
		}
	}

}
