package date_8_4_23;

import java.util.Scanner;

public class even_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		int count =0;
		int sum =0;
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
				count = count+1;
				sum=sum+i;
			}
		}
		System.out.println("Count = "+count);
		System.out.println("Sum = "+sum);
	}

}
