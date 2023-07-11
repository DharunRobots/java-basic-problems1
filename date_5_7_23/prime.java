package date_5_7_23;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n=sc.nextInt();
		
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count=count+1;
			}
		}
		if(count==2) {
			System.out.println(n+" Prime");
		}
		else {
			System.out.println(n+" not Prime");
		}
	}

}
