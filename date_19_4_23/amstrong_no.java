package date_19_4_23;

import java.util.Scanner;

public class amstrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		
		int a,i=0,j=0;
		
		a=n;
		while(a>0) {
			i=a%10;
			j=(i*i*i)+j;
			a=a/10;
		}
		if(n==j) {
			System.out.println("Amstrong");
		}else {
			System.out.println("Not Amstrong");
		}
	}

}
