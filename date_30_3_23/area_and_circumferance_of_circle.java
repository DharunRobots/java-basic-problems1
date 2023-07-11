package date_30_3_23;

import java.util.Scanner;

public class area_and_circumferance_of_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the radius: ");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		
		double area = Math.PI * (radius * radius);
		System.out.println("The area of circle is: " + area);
		
		double circumference = Math.PI * 2 * radius;
		System.out.println("The circumference of the circle is:" + circumference);
		
		double int1 =Math.PI;
		System.out.println(int1);
	}

}
