package date_8_7_23;

import java.util.Arrays;

public class reverse_of_even_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] n = new int [4];
		n[0]= 1;
		n[1]=2;
		n[2]=3;
		n[3]=4;
		int [] n2 = new int[n.length];
		
		for(int i =0;i<n.length;i++) {
			if(i==n.length-1) {
				n[i]=n[i]+1;
			}
			n2[i]=n[i];
		}
		System.out.println(Arrays.toString(n2));
	}

}
