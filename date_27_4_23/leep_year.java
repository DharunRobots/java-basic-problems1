package date_27_4_23;

import java.util.Scanner;

public class leep_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any no : ");
		int year = sc.nextInt();
		
		if(year%4==0) {
			System.out.println(year+" - Leep");
		}
		else {
			System.out.println(year+" - Not Leep");
		}
	}

}
