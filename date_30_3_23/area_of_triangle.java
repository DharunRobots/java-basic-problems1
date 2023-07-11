package date_30_3_23;

import java.util.Scanner;

public class area_of_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter basesize of triangle:");

		int base = sc.nextInt();
		
		System.out.println("Enter height of triangle:");

		int height = sc.nextInt();

		double area = (base * height) * 0.5;
		System.out.println("Area of Triangle is: " + area);

	}

}
