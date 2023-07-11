package date_28_3_23;

import java.util.Scanner;

public class add_two_binary_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long a1,a2;
		int i=0;
		int carry=0;
		
		int[] sum = new int[15];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first No:");
		a1=sc.nextLong();
		System.out.println("Enter second No:");
		a2=sc.nextLong();
		
		while(a1 !=0||a2!=0) {
			sum[i++] = (int)((a1 % 10 + a2 % 10 + carry) % 2);
			carry = (int)((a1 % 10 + a2 % 10 + carry) / 2);
			a1 = a1 / 10;
			a2 = a2 / 10;
		}
		if (carry != 0) {
			sum[i++] = carry;
		}
		--i;
		System.out.print("Output: ");
		
		while (i >= 0) { 
			 System.out.print(sum[i--]); 
		}
		 
		System.out.print("\n");

	}

}
