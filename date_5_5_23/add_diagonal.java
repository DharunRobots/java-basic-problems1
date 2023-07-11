package date_5_5_23;

import java.util.Scanner;

public class add_diagonal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many rows you want : ");
		int m = sc.nextInt();
		System.out.println("how many columns you want : ");
		int n =sc.nextInt();
		int[][] array1=new int[m][n];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				array1[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}
		
	
	
	for(int k=0;k<array1.length;k++ ) {
		
	}
	

}
}
