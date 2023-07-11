package date_30_3_23;

import java.util.Scanner;

public class area_of_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of Rectangle:");
		int length = scanner.nextInt();
		System.out.println("Enter the width of Rectangle:");
		int width = scanner.nextInt();
		
		int area = length * width;
		System.out.println("Area of Rectangle is:" + area);
	}

}
