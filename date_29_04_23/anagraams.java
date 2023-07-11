package date_29_04_23;

import java.util.Scanner;

public class anagraams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String : ");
		String st1 = sc.next();
		System.out.println("Enter Second String : ");
		String st2 = sc.next();
		int found = 0;
		
		int len1=st1.length();
		int len2=st2.length();
		
		if(len1==len2) {
			int len=len1;
			for(int i=0;i<len;i++) {
				for(int j =0;j<len;j++) {
					if(st1.charAt(i)==st2.charAt(j)) {
						found=found+1;
						break;
					}
				}
			}
			if(found==len) {
				System.out.println("Given String is Anagraam");
			}
		
		else {
			System.out.println("Given String is Not Anagraam");
		}
		}
	}
}
