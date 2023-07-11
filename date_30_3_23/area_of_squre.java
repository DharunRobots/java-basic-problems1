package date_30_3_23;

import java.util.Scanner;

public class area_of_squre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Side of Square:");

		int side = sc.nextInt();

		double area = side * side;

		System.out.println("Area of Square is: " + area);

	}

}
