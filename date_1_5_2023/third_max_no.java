package date_1_5_2023;

import java.util.Arrays;

public class third_max_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {-67,58,45,967,-1,62,89};
		int count = 0;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("********************************************************");
		System.out.println(a[a.length-3]);
	}
}
