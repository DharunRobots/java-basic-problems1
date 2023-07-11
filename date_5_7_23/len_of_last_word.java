package date_5_7_23;

import java.util.Scanner;

public class len_of_last_word {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub String s="hello world hai"; String [] str
		 * = s.split(" "); System.out.println(str[str.length-1].length());
		 * System.out.println(str[str.length-2]);
		 * 
		 * String st = "Hai I am Dharun"; System.out.println(st.length());
		 * 
		 * StringBuilder sb = new StringBuilder(st);
		 * System.out.println(sb[sb.length-1].reverse());
		 * System.out.println(sb[sb.length-1].length);
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your passage : ");
		String st = sc.nextLine();
		
		int z=st.length();
		
		StringBuffer sb = new StringBuffer(st);
		
		for(int i=0;i<sb.length();i++) {
			int count = 0;
			
			  if(sb.charAt(i)==' ') {
			  System.out.println(i);
			  if
			  
			  }
			 
			
		}
		System.out.println(sb.charAt(2));
	}

}
