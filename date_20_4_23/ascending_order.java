package date_20_4_23;

import java.util.Arrays;
import java.util.Scanner;

public class ascending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No Of elements you want in array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		System.out.println("Elements after ascending order : ");
		for (int i = 0; i < a.length; i++)   
		{       
		System.out.print(a[i]+" ");   
		}  

	}

}
