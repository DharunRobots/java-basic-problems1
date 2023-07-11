package date_30_3_23;

import java.lang.reflect.Array;

public class static_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {5,8,45,7,9,2,6};
		System.out.println(num[2]);
		num[2]=0;
		System.out.println(num[5]);
		System.out.println(num[2]);
		//System.out.println(num[10]);
		System.out.println(num.length);
		System.out.println("---------------------------------");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}

}
