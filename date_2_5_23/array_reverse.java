package date_2_5_23;

import java.util.Arrays;
import java.util.Collections;

public class array_reverse {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arrray = { 68, -23, 74, 12, 92, -101, 56, -2 };
		
		Arrays.sort(arrray,Collections.reverseOrder());
		System.out.println(Arrays.toString(arrray));
		/*
		 * for(int i= 0;i<arrray.length;i++) { System.out.println(arrray); }
		 */
	}

}