package date_3_6_23;

import java.util.Scanner;

public class pattern_program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 int row = sc.nextInt();
		 int col = sc.nextInt();
		 
		 for(int i = 0;i<row;i++) {
			 for(int j=0;j<=i;j++) {
				 System.out.print("*");
				 
			 }
			 System.out.println();
		 }	 
	}
}
