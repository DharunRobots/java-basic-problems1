package date_29_3_23;

import java.util.Scanner;

public class get_no_from_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int [] {3, 8, 11, 12, 7, 99};
		int size=arr.length;
		System.out.println("size of the array :"+size);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the position no position :");
		int n=sc.nextInt();
		
		if(n>0 && n<=size) {
			n=n-1;
			System.out.println(arr[n]);
		}
		else {
			System.out.println("please provide valid no");
		}
	}

}
