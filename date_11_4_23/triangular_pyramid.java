package date_11_4_23;

import java.util.Scanner;

public class triangular_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many Row you want :");
		int noOfRows = sc.nextInt();
		int rowcount=1;
		System.out.println("Here is Your Pyramid");
		for(int i=noOfRows;i>=1;i--) {
			for(int j= 1;j<=i*2;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=noOfRows;j++) {
				System.out.print(j+" ");
			}
			for(int j=noOfRows-1;j>=i;j--) {
				System.out.print(j+" ");
				
			}
			System.out.println();
			rowcount++;
		}
	}

}
