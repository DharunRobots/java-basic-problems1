package date_1_5_2023;

import java.util.Scanner;

public class paytern_program_1 {

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

}
